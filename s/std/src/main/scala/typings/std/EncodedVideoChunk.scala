package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk) */
trait EncodedVideoChunk extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/byteLength) */
  /* standard dom */
  val byteLength: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/copyTo) */
  /* standard dom */
  def copyTo(destination: BufferSource): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/duration) */
  /* standard dom */
  val duration: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/timestamp) */
  /* standard dom */
  val timestamp: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedVideoChunk/type) */
  /* standard dom */
  val `type`: EncodedVideoChunkType
}
object EncodedVideoChunk {
  
  inline def apply(byteLength: Double, copyTo: BufferSource => Unit, timestamp: Double, `type`: EncodedVideoChunkType): EncodedVideoChunk = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], copyTo = js.Any.fromFunction1(copyTo), timestamp = timestamp.asInstanceOf[js.Any], duration = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedVideoChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedVideoChunk] (val x: Self) extends AnyVal {
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setCopyTo(value: BufferSource => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: EncodedVideoChunkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
