package typings.semanticUiApi.anon

import typings.semanticUiApi.SemanticUI.Api.RegExpSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, 'optional'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl>> */
trait PickImploptionalPartialPi
  extends StObject
     with Param {
  
  var optional: js.RegExp & js.UndefOr[js.RegExp]
  
  var required: js.UndefOr[js.RegExp] = js.undefined
}
object PickImploptionalPartialPi {
  
  inline def apply(optional: js.RegExp & js.UndefOr[js.RegExp]): PickImploptionalPartialPi = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploptionalPartialPi]
  }
  
  extension [Self <: PickImploptionalPartialPi](x: Self) {
    
    inline def setOptional(value: js.RegExp & js.UndefOr[js.RegExp]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: js.RegExp): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
