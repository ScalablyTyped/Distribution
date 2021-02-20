package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Codec extends StObject {
  
  var codec: String = js.native
  
  var encoding: js.UndefOr[Double] = js.native
  
  var payload: Double = js.native
  
  var rate: js.UndefOr[Double] = js.native
}
object Codec {
  
  @scala.inline
  def apply(codec: String, payload: Double): Codec = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
  
  @scala.inline
  implicit class CodecMutableBuilder[Self <: Codec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: Double): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setPayload(value: Double): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
  }
}
