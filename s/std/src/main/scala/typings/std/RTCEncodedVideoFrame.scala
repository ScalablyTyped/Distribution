package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCEncodedVideoFrame extends StObject {
  
  /* standard dom */
  var data: js.typedarray.ArrayBuffer
  
  /* standard dom */
  def getMetadata(): RTCEncodedVideoFrameMetadata
  
  /* standard dom */
  val timestamp: Double
  
  /* standard dom */
  val `type`: RTCEncodedVideoFrameType
}
object RTCEncodedVideoFrame {
  
  inline def apply(
    data: js.typedarray.ArrayBuffer,
    getMetadata: () => RTCEncodedVideoFrameMetadata,
    timestamp: Double,
    `type`: RTCEncodedVideoFrameType
  ): RTCEncodedVideoFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getMetadata = js.Any.fromFunction0(getMetadata), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCEncodedVideoFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCEncodedVideoFrame] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetMetadata(value: () => RTCEncodedVideoFrameMetadata): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: RTCEncodedVideoFrameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
