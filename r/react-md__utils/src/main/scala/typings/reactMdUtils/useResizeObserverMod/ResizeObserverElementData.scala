package typings.reactMdUtils.useResizeObserverMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserverElementData[E /* <: HTMLElement */] extends ResizeObserverElementSize {
  
  /**
    * The element that changed due to the resize observer.
    */
  var element: E = js.native
}
object ResizeObserverElementData {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](element: E, height: Double, scrollHeight: Double, scrollWidth: Double, width: Double): ResizeObserverElementData[E] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverElementData[E]]
  }
  
  @scala.inline
  implicit class ResizeObserverElementDataOps[Self <: ResizeObserverElementData[_], E /* <: HTMLElement */] (val x: Self with ResizeObserverElementData[E]) extends AnyVal {
    
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
    def setElement(value: E): Self = this.set("element", value.asInstanceOf[js.Any])
  }
}
