package typings.semanticUiApi.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl>> */
trait PartialPickImplkeyofImplOptional extends StObject {
  
  var optional: js.UndefOr[RegExp] = js.undefined
  
  var required: js.UndefOr[RegExp] = js.undefined
}
object PartialPickImplkeyofImplOptional {
  
  inline def apply(): PartialPickImplkeyofImplOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplOptional]
  }
  
  extension [Self <: PartialPickImplkeyofImplOptional](x: Self) {
    
    inline def setOptional(value: RegExp): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setRequired(value: RegExp): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
