package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionContextType extends js.Object {
  /**
    * Unique connection ID
    */
  var connectionId: java.lang.String = js.native
  var connectionType: ConnectionTypeType = js.native
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
    * Instance of Roarr logger with bound connection context parameters
    */
  def log(args: java.lang.String*): scala.Nothing = js.native
}

