package typings.semanticUiApi.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplOptional extends StObject {
  
  var optional: js.UndefOr[RegExp] = js.native
  
  var required: js.UndefOr[RegExp] = js.native
}
object PartialPickImplkeyofImplOptional {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplOptional]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplOptionalMutableBuilder[Self <: PartialPickImplkeyofImplOptional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptional(value: RegExp): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setRequired(value: RegExp): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
