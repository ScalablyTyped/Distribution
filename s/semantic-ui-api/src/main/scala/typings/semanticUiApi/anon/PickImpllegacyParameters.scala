package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'legacyParameters'> */
@js.native
trait PickImpllegacyParameters extends StObject {
  
  var legacyParameters: String = js.native
}
object PickImpllegacyParameters {
  
  @scala.inline
  def apply(legacyParameters: String): PickImpllegacyParameters = {
    val __obj = js.Dynamic.literal(legacyParameters = legacyParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllegacyParameters]
  }
  
  @scala.inline
  implicit class PickImpllegacyParametersMutableBuilder[Self <: PickImpllegacyParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegacyParameters(value: String): Self = StObject.set(x, "legacyParameters", value.asInstanceOf[js.Any])
  }
}
