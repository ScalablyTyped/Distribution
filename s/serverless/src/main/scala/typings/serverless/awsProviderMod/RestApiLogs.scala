package typings.serverless.awsProviderMod

import typings.serverless.serverlessStrings.ERROR
import typings.serverless.serverlessStrings.INFO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestApiLogs extends StObject {
  
  var accessLogging: js.UndefOr[Boolean] = js.undefined
  
  var executionLogging: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var fullExecutionData: js.UndefOr[Boolean] = js.undefined
  
  var level: js.UndefOr[INFO | ERROR] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var roleManagedExternally: js.UndefOr[Boolean] = js.undefined
}
object RestApiLogs {
  
  inline def apply(): RestApiLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApiLogs]
  }
  
  extension [Self <: RestApiLogs](x: Self) {
    
    inline def setAccessLogging(value: Boolean): Self = StObject.set(x, "accessLogging", value.asInstanceOf[js.Any])
    
    inline def setAccessLoggingUndefined: Self = StObject.set(x, "accessLogging", js.undefined)
    
    inline def setExecutionLogging(value: Boolean): Self = StObject.set(x, "executionLogging", value.asInstanceOf[js.Any])
    
    inline def setExecutionLoggingUndefined: Self = StObject.set(x, "executionLogging", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFullExecutionData(value: Boolean): Self = StObject.set(x, "fullExecutionData", value.asInstanceOf[js.Any])
    
    inline def setFullExecutionDataUndefined: Self = StObject.set(x, "fullExecutionData", js.undefined)
    
    inline def setLevel(value: INFO | ERROR): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleManagedExternally(value: Boolean): Self = StObject.set(x, "roleManagedExternally", value.asInstanceOf[js.Any])
    
    inline def setRoleManagedExternallyUndefined: Self = StObject.set(x, "roleManagedExternally", js.undefined)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
