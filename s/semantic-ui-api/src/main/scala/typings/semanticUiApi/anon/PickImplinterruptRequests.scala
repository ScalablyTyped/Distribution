package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'interruptRequests'> */
@js.native
trait PickImplinterruptRequests extends StObject {
  
  var interruptRequests: Boolean = js.native
}
object PickImplinterruptRequests {
  
  @scala.inline
  def apply(interruptRequests: Boolean): PickImplinterruptRequests = {
    val __obj = js.Dynamic.literal(interruptRequests = interruptRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinterruptRequests]
  }
  
  @scala.inline
  implicit class PickImplinterruptRequestsMutableBuilder[Self <: PickImplinterruptRequests] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterruptRequests(value: Boolean): Self = StObject.set(x, "interruptRequests", value.asInstanceOf[js.Any])
  }
}
