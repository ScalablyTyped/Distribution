package typings.semanticUiForm.anon

import typings.semanticUiForm.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, 'error'> */
trait PickImplerrorError extends StObject {
  
  def error(errors: js.Array[String]): JQuery
  @JSName("error")
  var error_Original: js.Function1[/* errors */ js.Array[String], JQuery]
}
object PickImplerrorError {
  
  inline def apply(error: /* errors */ js.Array[String] => JQuery): PickImplerrorError = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[PickImplerrorError]
  }
  
  extension [Self <: PickImplerrorError](x: Self) {
    
    inline def setError(value: /* errors */ js.Array[String] => JQuery): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
  }
}
