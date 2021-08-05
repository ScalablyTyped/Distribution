package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codec extends StObject {
  
  var codec: String
  
  var encoding: js.UndefOr[Double] = js.undefined
  
  var payload: Double
  
  var rate: js.UndefOr[Double] = js.undefined
}
object Codec {
  
  inline def apply(codec: String, payload: Double): Codec = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
  
  extension [Self <: Codec](x: Self) {
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: Double): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setPayload(value: Double): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
  }
}
