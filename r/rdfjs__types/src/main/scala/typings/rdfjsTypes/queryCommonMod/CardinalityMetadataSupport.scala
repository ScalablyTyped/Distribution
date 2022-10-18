package typings.rdfjsTypes.queryCommonMod

import typings.rdfjsTypes.rdfjsTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardinalityMetadataSupport extends StObject {
  
  var cardinality: `true`
}
object CardinalityMetadataSupport {
  
  inline def apply(): CardinalityMetadataSupport = {
    val __obj = js.Dynamic.literal(cardinality = true)
    __obj.asInstanceOf[CardinalityMetadataSupport]
  }
  
  extension [Self <: CardinalityMetadataSupport](x: Self) {
    
    inline def setCardinality(value: `true`): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
  }
}
