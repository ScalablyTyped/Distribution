package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.Api.RegExpSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, 'required'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl>> */
trait PickImplrequiredPartialPi
  extends StObject
     with Param {
  
  var optional: js.UndefOr[js.RegExp] = js.undefined
  
  var required: js.RegExp & js.UndefOr[js.RegExp]
}
object PickImplrequiredPartialPi {
  
  inline def apply(required: js.RegExp & js.UndefOr[js.RegExp]): PickImplrequiredPartialPi = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrequiredPartialPi]
  }
  
  extension [Self <: PickImplrequiredPartialPi](x: Self) {
    
    inline def setOptional(value: js.RegExp): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setRequired(value: js.RegExp & js.UndefOr[js.RegExp]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
