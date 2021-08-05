package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'initialCheck'> */
trait PickImplinitialCheck extends StObject {
  
  var initialCheck: Boolean
}
object PickImplinitialCheck {
  
  inline def apply(initialCheck: Boolean): PickImplinitialCheck = {
    val __obj = js.Dynamic.literal(initialCheck = initialCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinitialCheck]
  }
  
  extension [Self <: PickImplinitialCheck](x: Self) {
    
    inline def setInitialCheck(value: Boolean): Self = StObject.set(x, "initialCheck", value.asInstanceOf[js.Any])
  }
}
