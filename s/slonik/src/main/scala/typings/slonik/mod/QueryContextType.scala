package typings.slonik.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryContextType extends StObject {
  
  /**
    * Unique connection ID
    */
  var connectionId: String
  
  /**
    * Instance of Roarr logger with bound query context parameters
    */
  def log(args: String*): scala.Nothing
  /**
    * Instance of Roarr logger with bound query context parameters
    */
  @JSName("log")
  var log_Original: LoggerType
  
  /**
    * A copy of the query before `transformQuery` middleware
    */
  var originalQuery: QueryType
  
  /**
    * Unique connection pool ID
    */
  var poolId: String
  
  /**
    * Unique query ID
    */
  var queryId: QueryIdType
  
  /**
    * `process.hrtime.bigint()` for when query was received.
    */
  var queryInputTime: Double
  
  /** Object used by interceptors to assign interceptor-specific, query-specific context. */
  var sandbox: Record[String, Any]
  
  var stackTrace: js.Array[CallSiteType] | Null
  
  /**
    * Unique transaction ID
    */
  var transactionId: js.UndefOr[String] = js.undefined
}
object QueryContextType {
  
  inline def apply(
    connectionId: String,
    log: LoggerType,
    originalQuery: QueryType,
    poolId: String,
    queryId: QueryIdType,
    queryInputTime: Double,
    sandbox: Record[String, Any]
  ): QueryContextType = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], originalQuery = originalQuery.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], queryId = queryId.asInstanceOf[js.Any], queryInputTime = queryInputTime.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any], stackTrace = null)
    __obj.asInstanceOf[QueryContextType]
  }
  
  extension [Self <: QueryContextType](x: Self) {
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setLog(value: LoggerType): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setOriginalQuery(value: QueryType): Self = StObject.set(x, "originalQuery", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: String): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    inline def setQueryId(value: QueryIdType): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryInputTime(value: Double): Self = StObject.set(x, "queryInputTime", value.asInstanceOf[js.Any])
    
    inline def setSandbox(value: Record[String, Any]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setStackTrace(value: js.Array[CallSiteType]): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceNull: Self = StObject.set(x, "stackTrace", null)
    
    inline def setStackTraceVarargs(value: CallSiteType*): Self = StObject.set(x, "stackTrace", js.Array(value*))
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
