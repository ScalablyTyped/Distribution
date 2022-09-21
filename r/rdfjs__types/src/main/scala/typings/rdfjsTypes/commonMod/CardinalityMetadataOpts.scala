package typings.rdfjsTypes.commonMod

import typings.rdfjsTypes.rdfjsTypesStrings.estimate
import typings.rdfjsTypes.rdfjsTypesStrings.exact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardinalityMetadataOpts
  extends StObject
     with _MetadataOpts[Any] {
  
  var cardinality: estimate | exact
}
object CardinalityMetadataOpts {
  
  inline def apply(cardinality: estimate | exact): CardinalityMetadataOpts = {
    val __obj = js.Dynamic.literal(cardinality = cardinality.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardinalityMetadataOpts]
  }
  
  extension [Self <: CardinalityMetadataOpts](x: Self) {
    
    inline def setCardinality(value: estimate | exact): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
  }
}
