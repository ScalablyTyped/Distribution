package typings.relayCompiler.consoleReporterMod

import typings.relayCompiler.reporterMod.Reporter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleReporter extends Reporter

object ConsoleReporter {
  @scala.inline
  def apply(
    reportError: (String, Error) => Unit,
    reportMessage: String => Unit,
    reportTime: (String, Double) => Unit
  ): ConsoleReporter = {
    val __obj = js.Dynamic.literal(reportError = js.Any.fromFunction2(reportError), reportMessage = js.Any.fromFunction1(reportMessage), reportTime = js.Any.fromFunction2(reportTime))
    __obj.asInstanceOf[ConsoleReporter]
  }
}

