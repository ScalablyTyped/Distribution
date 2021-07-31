package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionContextType extends StObject {
  
  /**
    * Unique connection ID
    */
  var connectionId: String
  
  var connectionType: ConnectionTypeType
  
  /**
    * Instance of Roarr logger with bound connection context parameters
    */
  def log(args: String*): scala.Nothing
  /**
    * Instance of Roarr logger with bound connection context parameters
    */
  @JSName("log")
  var log_Original: LoggerType
  
  /**
    * Unique connection pool ID
    */
  var poolId: String
}
object ConnectionContextType {
  
  @scala.inline
  def apply(connectionId: String, connectionType: ConnectionTypeType, log: LoggerType, poolId: String): ConnectionContextType = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionContextType]
  }
  
  @scala.inline
  implicit class ConnectionContextTypeMutableBuilder[Self <: ConnectionContextType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionType(value: ConnectionTypeType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: LoggerType): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolId(value: String): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
  }
}
