package typings.reactMdUtils.useResizeObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserverElementSize extends js.Object {
  
  /**
    * The height for the element that was changed.
    */
  var height: Double = js.native
  
  /**
    * The scroll height for the element that was changed.
    */
  var scrollHeight: Double = js.native
  
  /**
    * The scroll height for the element that was changed.
    */
  var scrollWidth: Double = js.native
  
  /**
    * The width for the element that was changed.
    */
  var width: Double = js.native
}
object ResizeObserverElementSize {
  
  @scala.inline
  def apply(height: Double, scrollHeight: Double, scrollWidth: Double, width: Double): ResizeObserverElementSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverElementSize]
  }
  
  @scala.inline
  implicit class ResizeObserverElementSizeOps[Self <: ResizeObserverElementSize] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidth(value: Double): Self = this.set("scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
