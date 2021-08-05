package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, 'disabled'> */
trait PickImpldisabled extends StObject {
  
  var disabled: String
}
object PickImpldisabled {
  
  inline def apply(disabled: String): PickImpldisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisabled]
  }
  
  extension [Self <: PickImpldisabled](x: Self) {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
  }
}
