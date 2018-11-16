package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.LogLevel")
@js.native
class LogLevel () extends js.Object

@JSGlobal("SFS2X.LogLevel")
@js.native
object LogLevel extends js.Object {
  /** @type {number} A DEBUG message is a fine-grained information on the client activity. */
  var DEBUG: scala.Double = js.native
  /** @type {number} An ERROR message contains informations on a problem that occurred during the client activities. Client operations might be compromised when an error is raised. */
  var ERROR: scala.Double = js.native
  /** @type {number} An INFO message contains informations on the standard client activities. */
  var INFO: scala.Double = js.native
  /** @type {number} A WARN message is a warning caused by an unexpected behavior of the client. Client operations are not compromised when a warning is raised. */
  var WARN: scala.Double = js.native
}

