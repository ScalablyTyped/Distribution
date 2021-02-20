package typings.serverless.awsProviderMod

import typings.serverless.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends StObject {
  
  var Condition: js.UndefOr[js.Any] = js.native
  
  var Description: js.UndefOr[String] = js.native
  
  var Export: js.UndefOr[Name] = js.native
  
  var Value: js.Any = js.native
}
object Output {
  
  @scala.inline
  def apply(Value: js.Any): Output = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: js.Any): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExport(value: Name): Self = StObject.set(x, "Export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportUndefined: Self = StObject.set(x, "Export", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
