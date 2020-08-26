package typings.stormReactDiagrams.portWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortProps extends BaseWidgetProps {
  var name: String = js.native
  var node: NodeModel = js.native
}

object PortProps {
  @scala.inline
  def apply(name: String, node: NodeModel): PortProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortProps]
  }
  @scala.inline
  implicit class PortPropsOps[Self <: PortProps] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: NodeModel): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

