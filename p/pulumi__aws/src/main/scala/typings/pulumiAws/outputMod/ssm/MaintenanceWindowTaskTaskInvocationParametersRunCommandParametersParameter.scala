package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter extends StObject {
  
  /**
    * The parameter name.
    */
  var name: String = js.native
  
  /**
    * The array of strings.
    */
  var values: js.Array[String] = js.native
}
object MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
