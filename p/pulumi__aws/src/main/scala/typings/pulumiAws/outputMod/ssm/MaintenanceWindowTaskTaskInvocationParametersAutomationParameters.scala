package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersAutomationParameters extends StObject {
  
  /**
    * The version of an Automation document to use during task execution.
    */
  var documentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    js.Array[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
  ] = js.undefined
}
object MaintenanceWindowTaskTaskInvocationParametersAutomationParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersAutomationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersMutableBuilder[Self <: MaintenanceWindowTaskTaskInvocationParametersAutomationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentVersion(value: String): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
