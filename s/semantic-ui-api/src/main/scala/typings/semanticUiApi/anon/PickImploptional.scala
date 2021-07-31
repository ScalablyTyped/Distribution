package typings.semanticUiApi.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, 'optional'> */
trait PickImploptional extends StObject {
  
  var optional: RegExp
}
object PickImploptional {
  
  @scala.inline
  def apply(optional: RegExp): PickImploptional = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploptional]
  }
  
  @scala.inline
  implicit class PickImploptionalMutableBuilder[Self <: PickImploptional] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptional(value: RegExp): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
