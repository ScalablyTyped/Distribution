package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContextType extends js.Object {
  /**
    * Unique connection ID
    */
  var connectionId: java.lang.String = js.native
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
  var poolId: java.lang.String = js.native
  /**
    * Unique query ID
    */
  var queryId: QueryIdType = js.native
  /**
    * `process.hrtime.bigint()` for when query was received.
    */
  var queryInputTime: scala.Double = js.native
  var stackTrace: js.Array[CallSiteType] | scala.Null = js.native
  /**
    * Unique transaction ID
    */
  var transactionId: js.UndefOr[java.lang.String] = js.native
  /**
    * Instance of Roarr logger with bound query context parameters
    */
  def log(args: java.lang.String*): scala.Nothing = js.native
}

