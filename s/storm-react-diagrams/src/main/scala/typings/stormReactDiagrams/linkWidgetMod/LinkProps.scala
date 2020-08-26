package typings.stormReactDiagrams.linkWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.linkModelMod.LinkModel
import typings.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps extends BaseWidgetProps {
  var children: js.UndefOr[js.Any] = js.native
  var diagramEngine: DiagramEngine = js.native
  var link: LinkModel[LinkModelListener] = js.native
}

object LinkProps {
  @scala.inline
  def apply(diagramEngine: DiagramEngine, link: LinkModel[LinkModelListener]): LinkProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiagramEngine(value: DiagramEngine): Self = this.set("diagramEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: LinkModel[LinkModelListener]): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

