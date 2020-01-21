package typings.slonik.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContextType extends js.Object {
  /**
    * Unique connection ID
    */
  var connectionId: String = js.native
  /**
    * Instance of Roarr logger with bound query context parameters
    */
  @JSName("log")
  var log_Original: LoggerType = js.native
  /**
    * A copy of the query before `transformQuery` middleware
    */
  var originalQuery: QueryType = js.native
  /**
    * Unique connection pool ID
    */
  var poolId: String = js.native
  /**
    * Unique query ID
    */
  var queryId: QueryIdType = js.native
  /**
    * `process.hrtime.bigint()` for when query was received.
    */
  var queryInputTime: Double = js.native
  /** Object used by interceptors to assign interceptor-specific, query-specific context. */
  var sandbox: Record[String, _] = js.native
  var stackTrace: js.Array[CallSiteType] | Null = js.native
  /**
    * Unique transaction ID
    */
  var transactionId: js.UndefOr[String] = js.native
  /**
    * Instance of Roarr logger with bound query context parameters
    */
  def log(args: String*): scala.Nothing = js.native
}

