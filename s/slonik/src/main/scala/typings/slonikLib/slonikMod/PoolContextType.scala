package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolContextType extends js.Object {
  /**
    * Instance of Roarr logger with bound connection context parameters
    */
  @JSName("log")
  var log_Original: LoggerType = js.native
  /**
    * Unique connection pool ID
    */
  var poolId: java.lang.String = js.native
  /**
    * The query that is initiating the connection
    */
  var query: TaggedTemplateLiteralInvocationType | scala.Null = js.native
  /**
    * Instance of Roarr logger with bound connection context parameters
    */
  def log(args: java.lang.String*): scala.Nothing = js.native
}

