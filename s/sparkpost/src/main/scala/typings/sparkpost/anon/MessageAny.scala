package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageAny extends StObject {
  
  var message: js.Any = js.native
}
object MessageAny {
  
  @scala.inline
  def apply(message: js.Any): MessageAny = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAny]
  }
  
  @scala.inline
  implicit class MessageAnyMutableBuilder[Self <: MessageAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
