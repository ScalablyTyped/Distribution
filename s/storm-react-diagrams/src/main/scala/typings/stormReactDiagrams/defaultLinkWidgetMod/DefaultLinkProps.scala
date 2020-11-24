package typings.stormReactDiagrams.defaultLinkWidgetMod

import typings.std.MouseEvent
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.pointModelMod.PointModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultLinkProps extends BaseWidgetProps {
  
  var color: js.UndefOr[String] = js.native
  
  var diagramEngine: DiagramEngine = js.native
  
  var link: DefaultLinkModel = js.native
  
  var pointAdded: js.UndefOr[js.Function2[/* point */ PointModel, /* event */ MouseEvent, _]] = js.native
  
  var smooth: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DefaultLinkProps {
  
  @scala.inline
  def apply(diagramEngine: DiagramEngine, link: DefaultLinkModel): DefaultLinkProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLinkProps]
  }
  
  @scala.inline
  implicit class DefaultLinkPropsOps[Self <: DefaultLinkProps] (val x: Self) extends AnyVal {
    
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
    def setLink(value: DefaultLinkModel): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setPointAdded(value: (/* point */ PointModel, /* event */ MouseEvent) => _): Self = this.set("pointAdded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePointAdded: Self = this.set("pointAdded", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
