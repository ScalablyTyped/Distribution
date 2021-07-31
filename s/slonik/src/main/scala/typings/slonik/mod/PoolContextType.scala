package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolContextType extends StObject {
  
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
  
  /**
    * The query that is initiating the connection
    */
  var query: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]] | Null
}
object PoolContextType {
  
  @scala.inline
  def apply(log: LoggerType, poolId: String): PoolContextType = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], query = null)
    __obj.asInstanceOf[PoolContextType]
  }
  
  @scala.inline
  implicit class PoolContextTypeMutableBuilder[Self <: PoolContextType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog(value: LoggerType): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolId(value: String): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryNull: Self = StObject.set(x, "query", null)
  }
}
