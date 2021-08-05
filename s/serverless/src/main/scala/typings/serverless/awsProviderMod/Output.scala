package typings.serverless.awsProviderMod

import typings.serverless.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  var Condition: js.UndefOr[js.Any] = js.undefined
  
  var Description: js.UndefOr[String] = js.undefined
  
  var Export: js.UndefOr[Name] = js.undefined
  
  var Value: js.Any
}
object Output {
  
  inline def apply(Value: js.Any): Output = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  extension [Self <: Output](x: Self) {
    
    inline def setCondition(value: js.Any): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExport(value: Name): Self = StObject.set(x, "Export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "Export", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
