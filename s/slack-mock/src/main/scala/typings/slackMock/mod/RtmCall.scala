package typings.slackMock.mod

import typings.node.Buffer
import typings.ws.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RtmCall[T] extends StObject {
  
  var message: T = js.native
  
  var rawMessage: Data = js.native
  
  var token: String = js.native
}
object RtmCall {
  
  @scala.inline
  def apply[T](message: T, rawMessage: Data, token: String): RtmCall[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtmCall[T]]
  }
  
  @scala.inline
  implicit class RtmCallMutableBuilder[Self <: RtmCall[_], T] (val x: Self with RtmCall[T]) extends AnyVal {
    
    @scala.inline
    def setMessage(value: T): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawMessage(value: Data): Self = StObject.set(x, "rawMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawMessageVarargs(value: Buffer*): Self = StObject.set(x, "rawMessage", js.Array(value :_*))
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
