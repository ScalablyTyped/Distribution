package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvChannelRequest extends ChannelRequest {
  
  var key: String = js.native
  
  var recipient: Double = js.native
  
  var request: env = js.native
  
  var `val`: String = js.native
  
  var wantReply: Boolean = js.native
}
object EnvChannelRequest {
  
  @scala.inline
  def apply(key: String, recipient: Double, request: env, `val`: String, wantReply: Boolean): EnvChannelRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvChannelRequest]
  }
  
  @scala.inline
  implicit class EnvChannelRequestMutableBuilder[Self <: EnvChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: env): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
