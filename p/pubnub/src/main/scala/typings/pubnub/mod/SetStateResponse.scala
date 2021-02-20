package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetStateResponse extends StObject {
  
  var state: js.Any = js.native
}
object SetStateResponse {
  
  @scala.inline
  def apply(state: js.Any): SetStateResponse = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStateResponse]
  }
  
  @scala.inline
  implicit class SetStateResponseMutableBuilder[Self <: SetStateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
