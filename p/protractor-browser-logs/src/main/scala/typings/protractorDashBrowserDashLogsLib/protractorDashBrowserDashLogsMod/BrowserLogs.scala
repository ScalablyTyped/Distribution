package typings
package protractorDashBrowserDashLogsLib.protractorDashBrowserDashLogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserLogs extends js.Object {
  @JSName("DEBUG")
  var DEBUG_Original: matchPredicateFunction = js.native
  @JSName("ERROR")
  var ERROR_Original: matchPredicateFunction = js.native
  @JSName("INFO")
  var INFO_Original: matchPredicateFunction = js.native
  @JSName("LOG")
  var LOG_Original: matchPredicateFunction = js.native
  @JSName("WARNING")
  var WARNING_Original: matchPredicateFunction = js.native
  def DEBUG(entry: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry): scala.Boolean = js.native
  def ERROR(entry: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry): scala.Boolean = js.native
  def INFO(entry: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry): scala.Boolean = js.native
  def LOG(entry: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry): scala.Boolean = js.native
  def WARNING(entry: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry): scala.Boolean = js.native
  def and(a: matchPredicateFunction, b: matchPredicateFunction): matchPredicateFunction = js.native
  def expect(matches: matchPredicate*): js.Array[matchPredicateFunction] = js.native
  def ignore(matches: matchPredicate*): js.Array[matchPredicateFunction] = js.native
  def logs(): js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry] = js.native
  def or(a: matchPredicateFunction, b: matchPredicateFunction): matchPredicateFunction = js.native
  def reset(): scala.Unit = js.native
  def verify(): scala.Unit = js.native
}

