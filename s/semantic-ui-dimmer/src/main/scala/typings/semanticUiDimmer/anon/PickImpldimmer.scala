package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, 'dimmer'> */
trait PickImpldimmer extends StObject {
  
  var dimmer: String
}
object PickImpldimmer {
  
  inline def apply(dimmer: String): PickImpldimmer = {
    val __obj = js.Dynamic.literal(dimmer = dimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmer]
  }
  
  extension [Self <: PickImpldimmer](x: Self) {
    
    inline def setDimmer(value: String): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
  }
}
