package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeScrollEvent extends js.Object {
  
  var contentInset: NativeScrollRectangle = js.native
  
  var contentOffset: NativeScrollPoint = js.native
  
  var contentSize: NativeScrollSize = js.native
  
  var layoutMeasurement: NativeScrollSize = js.native
  
  var velocity: js.UndefOr[NativeScrollVelocity] = js.native
  
  var zoomScale: Double = js.native
}
object NativeScrollEvent {
  
  @scala.inline
  def apply(
    contentInset: NativeScrollRectangle,
    contentOffset: NativeScrollPoint,
    contentSize: NativeScrollSize,
    layoutMeasurement: NativeScrollSize,
    zoomScale: Double
  ): NativeScrollEvent = {
    val __obj = js.Dynamic.literal(contentInset = contentInset.asInstanceOf[js.Any], contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], layoutMeasurement = layoutMeasurement.asInstanceOf[js.Any], zoomScale = zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeScrollEvent]
  }
  
  @scala.inline
  implicit class NativeScrollEventOps[Self <: NativeScrollEvent] (val x: Self) extends AnyVal {
    
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
    def setContentInset(value: NativeScrollRectangle): Self = this.set("contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOffset(value: NativeScrollPoint): Self = this.set("contentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSize(value: NativeScrollSize): Self = this.set("contentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutMeasurement(value: NativeScrollSize): Self = this.set("layoutMeasurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomScale(value: Double): Self = this.set("zoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: NativeScrollVelocity): Self = this.set("velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
}
