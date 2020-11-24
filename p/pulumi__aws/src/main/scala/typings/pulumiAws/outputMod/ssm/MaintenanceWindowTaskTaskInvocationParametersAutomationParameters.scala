package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersAutomationParameters extends js.Object {
  
  /**
    * The version of an Automation document to use during task execution.
    */
  var documentVersion: js.UndefOr[String] = js.native
  
  /**
    * The parameters for the RUN_COMMAND task execution. Documented below.
    */
  var parameters: js.UndefOr[
    js.Array[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]
  ] = js.native
}
object MaintenanceWindowTaskTaskInvocationParametersAutomationParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersAutomationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersAutomationParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersOps[Self <: MaintenanceWindowTaskTaskInvocationParametersAutomationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentVersion(value: String): Self = this.set("documentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVersion: Self = this.set("documentVersion", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
