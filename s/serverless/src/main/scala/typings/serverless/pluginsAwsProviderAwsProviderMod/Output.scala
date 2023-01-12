package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  var Condition: js.UndefOr[Any] = js.undefined
  
  var Description: js.UndefOr[String] = js.undefined
  
  var Export: js.UndefOr[Name] = js.undefined
  
  var Value: js.UndefOr[Any] = js.undefined
}
object Output {
  
  inline def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Any): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExport(value: Name): Self = StObject.set(x, "Export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "Export", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
