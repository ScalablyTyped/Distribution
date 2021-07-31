package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeScrollEvent extends StObject {
  
  var contentInset: NativeScrollRectangle
  
  var contentOffset: NativeScrollPoint
  
  var contentSize: NativeScrollSize
  
  var layoutMeasurement: NativeScrollSize
  
  var velocity: js.UndefOr[NativeScrollVelocity] = js.undefined
  
  var zoomScale: Double
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
  implicit class NativeScrollEventMutableBuilder[Self <: NativeScrollEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentInset(value: NativeScrollRectangle): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOffset(value: NativeScrollPoint): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSize(value: NativeScrollSize): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutMeasurement(value: NativeScrollSize): Self = StObject.set(x, "layoutMeasurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: NativeScrollVelocity): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    
    @scala.inline
    def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
  }
}
