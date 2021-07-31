package typings.semanticUiApi.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, 'required'> */
trait PickImplrequired extends StObject {
  
  var required: RegExp
}
object PickImplrequired {
  
  @scala.inline
  def apply(required: RegExp): PickImplrequired = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrequired]
  }
  
  @scala.inline
  implicit class PickImplrequiredMutableBuilder[Self <: PickImplrequired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequired(value: RegExp): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
