package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'dimmerName'> */
trait PickImpldimmerName extends StObject {
  
  var dimmerName: `false` | String
}
object PickImpldimmerName {
  
  inline def apply(dimmerName: `false` | String): PickImpldimmerName = {
    val __obj = js.Dynamic.literal(dimmerName = dimmerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmerName]
  }
  
  extension [Self <: PickImpldimmerName](x: Self) {
    
    inline def setDimmerName(value: `false` | String): Self = StObject.set(x, "dimmerName", value.asInstanceOf[js.Any])
  }
}
