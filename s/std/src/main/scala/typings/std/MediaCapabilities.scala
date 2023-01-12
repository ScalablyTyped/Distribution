package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaCapabilities extends StObject {
  
  /* standard dom */
  def decodingInfo(configuration: MediaDecodingConfiguration): js.Promise[MediaCapabilitiesDecodingInfo]
  
  /* standard dom */
  def encodingInfo(configuration: MediaEncodingConfiguration): js.Promise[MediaCapabilitiesEncodingInfo]
}
object MediaCapabilities {
  
  inline def apply(
    decodingInfo: MediaDecodingConfiguration => js.Promise[MediaCapabilitiesDecodingInfo],
    encodingInfo: MediaEncodingConfiguration => js.Promise[MediaCapabilitiesEncodingInfo]
  ): MediaCapabilities = {
    val __obj = js.Dynamic.literal(decodingInfo = js.Any.fromFunction1(decodingInfo), encodingInfo = js.Any.fromFunction1(encodingInfo))
    __obj.asInstanceOf[MediaCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaCapabilities] (val x: Self) extends AnyVal {
    
    inline def setDecodingInfo(value: MediaDecodingConfiguration => js.Promise[MediaCapabilitiesDecodingInfo]): Self = StObject.set(x, "decodingInfo", js.Any.fromFunction1(value))
    
    inline def setEncodingInfo(value: MediaEncodingConfiguration => js.Promise[MediaCapabilitiesEncodingInfo]): Self = StObject.set(x, "encodingInfo", js.Any.fromFunction1(value))
  }
}
