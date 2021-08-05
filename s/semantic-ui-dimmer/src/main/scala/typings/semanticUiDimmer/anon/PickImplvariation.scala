package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'variation'> */
trait PickImplvariation extends StObject {
  
  var variation: `false` | String
}
object PickImplvariation {
  
  inline def apply(variation: `false` | String): PickImplvariation = {
    val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvariation]
  }
  
  extension [Self <: PickImplvariation](x: Self) {
    
    inline def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
  }
}
