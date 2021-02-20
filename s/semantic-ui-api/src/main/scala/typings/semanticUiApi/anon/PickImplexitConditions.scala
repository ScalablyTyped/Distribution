package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'exitConditions'> */
@js.native
trait PickImplexitConditions extends StObject {
  
  var exitConditions: String = js.native
}
object PickImplexitConditions {
  
  @scala.inline
  def apply(exitConditions: String): PickImplexitConditions = {
    val __obj = js.Dynamic.literal(exitConditions = exitConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexitConditions]
  }
  
  @scala.inline
  implicit class PickImplexitConditionsMutableBuilder[Self <: PickImplexitConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExitConditions(value: String): Self = StObject.set(x, "exitConditions", value.asInstanceOf[js.Any])
  }
}
