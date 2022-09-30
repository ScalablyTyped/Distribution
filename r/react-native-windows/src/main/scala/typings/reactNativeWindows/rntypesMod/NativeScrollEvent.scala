package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeScrollEvent extends StObject {
  
  var contentInset: NativeScrollRectangle
  
  var contentOffset: NativeScrollPoint
  
  var contentSize: NativeScrollSize
  
  var layoutMeasurement: NativeScrollSize
  
  /**
    * @platform ios
    */
  var targetContentOffset: js.UndefOr[NativeScrollPoint] = js.undefined
  
  var velocity: js.UndefOr[NativeScrollVelocity] = js.undefined
  
  var zoomScale: Double
}
object NativeScrollEvent {
  
  inline def apply(
    contentInset: NativeScrollRectangle,
    contentOffset: NativeScrollPoint,
    contentSize: NativeScrollSize,
    layoutMeasurement: NativeScrollSize,
    zoomScale: Double
  ): NativeScrollEvent = {
    val __obj = js.Dynamic.literal(contentInset = contentInset.asInstanceOf[js.Any], contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], layoutMeasurement = layoutMeasurement.asInstanceOf[js.Any], zoomScale = zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeScrollEvent]
  }
  
  extension [Self <: NativeScrollEvent](x: Self) {
    
    inline def setContentInset(value: NativeScrollRectangle): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentOffset(value: NativeScrollPoint): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    inline def setContentSize(value: NativeScrollSize): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    inline def setLayoutMeasurement(value: NativeScrollSize): Self = StObject.set(x, "layoutMeasurement", value.asInstanceOf[js.Any])
    
    inline def setTargetContentOffset(value: NativeScrollPoint): Self = StObject.set(x, "targetContentOffset", value.asInstanceOf[js.Any])
    
    inline def setTargetContentOffsetUndefined: Self = StObject.set(x, "targetContentOffset", js.undefined)
    
    inline def setVelocity(value: NativeScrollVelocity): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    
    inline def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
  }
}
