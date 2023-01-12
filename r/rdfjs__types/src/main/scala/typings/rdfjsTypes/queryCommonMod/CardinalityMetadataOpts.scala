package typings.rdfjsTypes.queryCommonMod

import typings.rdfjsTypes.rdfjsTypesStrings.estimate
import typings.rdfjsTypes.rdfjsTypesStrings.exact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardinalityMetadataOpts extends StObject {
  
  var cardinality: estimate | exact
}
object CardinalityMetadataOpts {
  
  inline def apply(cardinality: estimate | exact): CardinalityMetadataOpts = {
    val __obj = js.Dynamic.literal(cardinality = cardinality.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardinalityMetadataOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardinalityMetadataOpts] (val x: Self) extends AnyVal {
    
    inline def setCardinality(value: estimate | exact): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
  }
}
