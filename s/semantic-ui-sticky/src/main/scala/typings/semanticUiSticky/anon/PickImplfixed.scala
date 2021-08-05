package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'fixed'> */
trait PickImplfixed extends StObject {
  
  var fixed: String
}
object PickImplfixed {
  
  inline def apply(fixed: String): PickImplfixed = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfixed]
  }
  
  extension [Self <: PickImplfixed](x: Self) {
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
  }
}
