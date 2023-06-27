package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFrameBufferInit extends StObject {
  
  /* standard dom */
  var codedHeight: Double
  
  /* standard dom */
  var codedWidth: Double
  
  /* standard dom */
  var colorSpace: js.UndefOr[VideoColorSpaceInit] = js.undefined
  
  /* standard dom */
  var displayHeight: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var displayWidth: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var duration: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var format: VideoPixelFormat
  
  /* standard dom */
  var layout: js.UndefOr[js.Array[PlaneLayout]] = js.undefined
  
  /* standard dom */
  var timestamp: Double
  
  /* standard dom */
  var visibleRect: js.UndefOr[DOMRectInit] = js.undefined
}
object VideoFrameBufferInit {
  
  inline def apply(codedHeight: Double, codedWidth: Double, format: VideoPixelFormat, timestamp: Double): VideoFrameBufferInit = {
    val __obj = js.Dynamic.literal(codedHeight = codedHeight.asInstanceOf[js.Any], codedWidth = codedWidth.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFrameBufferInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoFrameBufferInit] (val x: Self) extends AnyVal {
    
    inline def setCodedHeight(value: Double): Self = StObject.set(x, "codedHeight", value.asInstanceOf[js.Any])
    
    inline def setCodedWidth(value: Double): Self = StObject.set(x, "codedWidth", value.asInstanceOf[js.Any])
    
    inline def setColorSpace(value: VideoColorSpaceInit): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setDisplayHeight(value: Double): Self = StObject.set(x, "displayHeight", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeightUndefined: Self = StObject.set(x, "displayHeight", js.undefined)
    
    inline def setDisplayWidth(value: Double): Self = StObject.set(x, "displayWidth", value.asInstanceOf[js.Any])
    
    inline def setDisplayWidthUndefined: Self = StObject.set(x, "displayWidth", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFormat(value: VideoPixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: js.Array[PlaneLayout]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLayoutVarargs(value: PlaneLayout*): Self = StObject.set(x, "layout", js.Array(value*))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setVisibleRect(value: DOMRectInit): Self = StObject.set(x, "visibleRect", value.asInstanceOf[js.Any])
    
    inline def setVisibleRectUndefined: Self = StObject.set(x, "visibleRect", js.undefined)
  }
}
