package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestApiLogs extends js.Object {
  
  var accessLogging: js.UndefOr[Boolean] = js.native
  
  var executionLogging: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var fullExecutionData: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var roleManagedExternally: js.UndefOr[Boolean] = js.native
}
object RestApiLogs {
  
  @scala.inline
  def apply(): RestApiLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApiLogs]
  }
  
  @scala.inline
  implicit class RestApiLogsOps[Self <: RestApiLogs] (val x: Self) extends AnyVal {
    
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
    def setAccessLogging(value: Boolean): Self = this.set("accessLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLogging: Self = this.set("accessLogging", js.undefined)
    
    @scala.inline
    def setExecutionLogging(value: Boolean): Self = this.set("executionLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionLogging: Self = this.set("executionLogging", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFullExecutionData(value: Boolean): Self = this.set("fullExecutionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullExecutionData: Self = this.set("fullExecutionData", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRoleManagedExternally(value: Boolean): Self = this.set("roleManagedExternally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleManagedExternally: Self = this.set("roleManagedExternally", js.undefined)
  }
}
