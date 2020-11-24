package typings.raven.mod

import typings.raven.ravenBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raven", "utils")
@js.native
object utils extends js.Object {
  
  def consoleAlert(msg: String): Unit = js.native
  
  def parseDSN(dsn: String): parsedDSN | `false` = js.native
  @JSName("parseDSN")
  def parseDSN_false(dsn: `false`): parsedDSN | `false` = js.native
}
