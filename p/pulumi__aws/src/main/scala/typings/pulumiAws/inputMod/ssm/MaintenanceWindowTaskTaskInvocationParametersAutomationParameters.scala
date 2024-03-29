package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersAutomationParameters extends StObject {
  
  /**
    * The version of an Automation document to use during task execution.
    */
  var documentVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
      ]
    ]
  ] = js.undefined
}
object MaintenanceWindowTaskTaskInvocationParametersAutomationParameters {
  
  inline def apply(): MaintenanceWindowTaskTaskInvocationParametersAutomationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]
  }
  
  extension [Self <: MaintenanceWindowTaskTaskInvocationParametersAutomationParameters](x: Self) {
    
    inline def setDocumentVersion(value: Input[String]): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
    
    inline def setParameters(
      value: Input[
          js.Array[
            Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
          ]
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: Input[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
