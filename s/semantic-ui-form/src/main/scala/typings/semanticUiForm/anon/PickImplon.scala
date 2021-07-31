package typings.semanticUiForm.anon

import typings.semanticUiForm.semanticUiFormStrings.blur
import typings.semanticUiForm.semanticUiFormStrings.change
import typings.semanticUiForm.semanticUiFormStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'on'> */
trait PickImplon extends StObject {
  
  var on: submit | blur | change
}
object PickImplon {
  
  @scala.inline
  def apply(on: submit | blur | change): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplon]
  }
  
  @scala.inline
  implicit class PickImplonMutableBuilder[Self <: PickImplon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOn(value: submit | blur | change): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
