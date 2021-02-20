package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// fire
@js.native
trait FireParameters extends StObject {
  
  var channel: String = js.native
  
  var message: js.Any = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  var sendByPost: js.UndefOr[Boolean] = js.native
}
object FireParameters {
  
  @scala.inline
  def apply(channel: String, message: js.Any): FireParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FireParameters]
  }
  
  @scala.inline
  implicit class FireParametersMutableBuilder[Self <: FireParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setSendByPost(value: Boolean): Self = StObject.set(x, "sendByPost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendByPostUndefined: Self = StObject.set(x, "sendByPost", js.undefined)
  }
}
