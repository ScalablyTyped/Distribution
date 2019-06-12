package typings
package ravenLib.ravenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "utils")
@js.native
object utilsNs extends js.Object {
  def consoleAlert(msg: java.lang.String): scala.Unit = js.native
  def parseDSN(dsn: java.lang.String): ravenLib.ravenMod.parsedDSN | ravenLib.ravenLibNumbers.`false` = js.native
  @JSName("parseDSN")
  def parseDSN_false(dsn: ravenLib.ravenLibNumbers.`false`): ravenLib.ravenMod.parsedDSN | ravenLib.ravenLibNumbers.`false` = js.native
}

