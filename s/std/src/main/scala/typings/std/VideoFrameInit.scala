package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFrameInit extends StObject {
  
  /* standard dom */
  var alpha: js.UndefOr[AlphaOption] = js.undefined
  
  /* standard dom */
  var displayHeight: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var displayWidth: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var duration: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var timestamp: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var visibleRect: js.UndefOr[DOMRectInit] = js.undefined
}
object VideoFrameInit {
  
  inline def apply(): VideoFrameInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFrameInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoFrameInit] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: AlphaOption): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setDisplayHeight(value: Double): Self = StObject.set(x, "displayHeight", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeightUndefined: Self = StObject.set(x, "displayHeight", js.undefined)
    
    inline def setDisplayWidth(value: Double): Self = StObject.set(x, "displayWidth", value.asInstanceOf[js.Any])
    
    inline def setDisplayWidthUndefined: Self = StObject.set(x, "displayWidth", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVisibleRect(value: DOMRectInit): Self = StObject.set(x, "visibleRect", value.asInstanceOf[js.Any])
    
    inline def setVisibleRectUndefined: Self = StObject.set(x, "visibleRect", js.undefined)
  }
}
