package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'length'> */
trait PickImpllength extends StObject {
  
  var length: String
}
object PickImpllength {
  
  @scala.inline
  def apply(length: String): PickImpllength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllength]
  }
  
  @scala.inline
  implicit class PickImpllengthMutableBuilder[Self <: PickImpllength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
