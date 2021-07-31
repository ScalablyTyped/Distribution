package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestApiLogs extends StObject {
  
  var accessLogging: js.UndefOr[Boolean] = js.undefined
  
  var executionLogging: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var fullExecutionData: js.UndefOr[Boolean] = js.undefined
  
  var level: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var roleManagedExternally: js.UndefOr[Boolean] = js.undefined
}
object RestApiLogs {
  
  @scala.inline
  def apply(): RestApiLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApiLogs]
  }
  
  @scala.inline
  implicit class RestApiLogsMutableBuilder[Self <: RestApiLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLogging(value: Boolean): Self = StObject.set(x, "accessLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLoggingUndefined: Self = StObject.set(x, "accessLogging", js.undefined)
    
    @scala.inline
    def setExecutionLogging(value: Boolean): Self = StObject.set(x, "executionLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionLoggingUndefined: Self = StObject.set(x, "executionLogging", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFullExecutionData(value: Boolean): Self = StObject.set(x, "fullExecutionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullExecutionDataUndefined: Self = StObject.set(x, "fullExecutionData", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleManagedExternally(value: Boolean): Self = StObject.set(x, "roleManagedExternally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleManagedExternallyUndefined: Self = StObject.set(x, "roleManagedExternally", js.undefined)
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
