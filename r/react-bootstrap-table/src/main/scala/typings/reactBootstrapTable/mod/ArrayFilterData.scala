package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.reactBootstrapTableStrings.ArrayFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayFilterData
  extends StObject
     with FilterValue {
  
  var `type`: ArrayFilter
  
  var value: js.Array[Double | String]
}
object ArrayFilterData {
  
  inline def apply(value: js.Array[Double | String]): ArrayFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayFilter")
    __obj.asInstanceOf[ArrayFilterData]
  }
  
  extension [Self <: ArrayFilterData](x: Self) {
    
    inline def setType(value: ArrayFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Double | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
