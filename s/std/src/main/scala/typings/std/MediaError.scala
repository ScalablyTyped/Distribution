package typings.std

import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError)
  */
trait MediaError extends StObject {
  
  /* standard dom */
  val MEDIA_ERR_ABORTED: `1`
  
  /* standard dom */
  val MEDIA_ERR_DECODE: `3`
  
  /* standard dom */
  val MEDIA_ERR_NETWORK: `2`
  
  /* standard dom */
  val MEDIA_ERR_SRC_NOT_SUPPORTED: `4`
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/code) */
  /* standard dom */
  val code: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/message) */
  /* standard dom */
  val message: java.lang.String
}
object MediaError {
  
  inline def apply(code: Double, message: java.lang.String): MediaError = {
    val __obj = js.Dynamic.literal(MEDIA_ERR_ABORTED = 1, MEDIA_ERR_DECODE = 3, MEDIA_ERR_NETWORK = 2, MEDIA_ERR_SRC_NOT_SUPPORTED = 4, code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMEDIA_ERR_ABORTED(value: `1`): Self = StObject.set(x, "MEDIA_ERR_ABORTED", value.asInstanceOf[js.Any])
    
    inline def setMEDIA_ERR_DECODE(value: `3`): Self = StObject.set(x, "MEDIA_ERR_DECODE", value.asInstanceOf[js.Any])
    
    inline def setMEDIA_ERR_NETWORK(value: `2`): Self = StObject.set(x, "MEDIA_ERR_NETWORK", value.asInstanceOf[js.Any])
    
    inline def setMEDIA_ERR_SRC_NOT_SUPPORTED(value: `4`): Self = StObject.set(x, "MEDIA_ERR_SRC_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
