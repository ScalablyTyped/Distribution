package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>. */
trait MediaError extends StObject {
  
  /* standard dom */
  val MEDIA_ERR_ABORTED: Double
  
  /* standard dom */
  val MEDIA_ERR_DECODE: Double
  
  /* standard dom */
  val MEDIA_ERR_NETWORK: Double
  
  /* standard dom */
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Double
  
  /* standard dom */
  val code: Double
  
  /* standard dom */
  val message: java.lang.String
}
object MediaError {
  
  inline def apply(
    MEDIA_ERR_ABORTED: Double,
    MEDIA_ERR_DECODE: Double,
    MEDIA_ERR_NETWORK: Double,
    MEDIA_ERR_SRC_NOT_SUPPORTED: Double,
    code: Double,
    message: java.lang.String
  ): MediaError = {
    val __obj = js.Dynamic.literal(MEDIA_ERR_ABORTED = MEDIA_ERR_ABORTED.asInstanceOf[js.Any], MEDIA_ERR_DECODE = MEDIA_ERR_DECODE.asInstanceOf[js.Any], MEDIA_ERR_NETWORK = MEDIA_ERR_NETWORK.asInstanceOf[js.Any], MEDIA_ERR_SRC_NOT_SUPPORTED = MEDIA_ERR_SRC_NOT_SUPPORTED.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMEDIA_ERR_ABORTED(value: Double): Self = StObject.set(x, "MEDIA_ERR_ABORTED", value.asInstanceOf[js.Any])
    
    inline def setMEDIA_ERR_DECODE(value: Double): Self = StObject.set(x, "MEDIA_ERR_DECODE", value.asInstanceOf[js.Any])
    
    inline def setMEDIA_ERR_NETWORK(value: Double): Self = StObject.set(x, "MEDIA_ERR_NETWORK", value.asInstanceOf[js.Any])
    
    inline def setMEDIA_ERR_SRC_NOT_SUPPORTED(value: Double): Self = StObject.set(x, "MEDIA_ERR_SRC_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
