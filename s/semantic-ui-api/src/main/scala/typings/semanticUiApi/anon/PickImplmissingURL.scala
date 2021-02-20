package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'missingURL'> */
@js.native
trait PickImplmissingURL extends StObject {
  
  var missingURL: String = js.native
}
object PickImplmissingURL {
  
  @scala.inline
  def apply(missingURL: String): PickImplmissingURL = {
    val __obj = js.Dynamic.literal(missingURL = missingURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingURL]
  }
  
  @scala.inline
  implicit class PickImplmissingURLMutableBuilder[Self <: PickImplmissingURL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingURL(value: String): Self = StObject.set(x, "missingURL", value.asInstanceOf[js.Any])
  }
}
