package typings.storybookComponents.zoomIFrameMod

import typings.react.mod.MutableRefObject
import typings.react.mod.ReactElement
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IZoomIFrameProps extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var children: ReactElement = js.native
  
  var iFrameRef: MutableRefObject[HTMLIFrameElement] = js.native
  
  var scale: Double = js.native
}
object IZoomIFrameProps {
  
  @scala.inline
  def apply(children: ReactElement, iFrameRef: MutableRefObject[HTMLIFrameElement], scale: Double): IZoomIFrameProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], iFrameRef = iFrameRef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IZoomIFrameProps]
  }
  
  @scala.inline
  implicit class IZoomIFramePropsOps[Self <: IZoomIFrameProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIFrameRef(value: MutableRefObject[HTMLIFrameElement]): Self = this.set("iFrameRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
  }
}
