package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'throttleFirstRequest'> */
@js.native
trait PickImplthrottleFirstRequ extends StObject {
  
  var throttleFirstRequest: Boolean = js.native
}
object PickImplthrottleFirstRequ {
  
  @scala.inline
  def apply(throttleFirstRequest: Boolean): PickImplthrottleFirstRequ = {
    val __obj = js.Dynamic.literal(throttleFirstRequest = throttleFirstRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplthrottleFirstRequ]
  }
  
  @scala.inline
  implicit class PickImplthrottleFirstRequMutableBuilder[Self <: PickImplthrottleFirstRequ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThrottleFirstRequest(value: Boolean): Self = StObject.set(x, "throttleFirstRequest", value.asInstanceOf[js.Any])
  }
}
