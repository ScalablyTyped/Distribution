package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFilterData
  extends StObject
     with FilterValue {
  
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.TextFilter
  
  var value: String
}
object TextFilterData {
  
  inline def apply(value: String): TextFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TextFilter")
    __obj.asInstanceOf[TextFilterData]
  }
  
  extension [Self <: TextFilterData](x: Self) {
    
    inline def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.TextFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
