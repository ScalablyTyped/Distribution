package typings.semanticUiCheckbox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'fireOnInit'> */
trait PickImplfireOnInit extends StObject {
  
  var fireOnInit: Boolean
}
object PickImplfireOnInit {
  
  inline def apply(fireOnInit: Boolean): PickImplfireOnInit = {
    val __obj = js.Dynamic.literal(fireOnInit = fireOnInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfireOnInit]
  }
  
  extension [Self <: PickImplfireOnInit](x: Self) {
    
    inline def setFireOnInit(value: Boolean): Self = StObject.set(x, "fireOnInit", value.asInstanceOf[js.Any])
  }
}
