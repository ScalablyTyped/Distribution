package typings.relayCompiler.multiReporterMod

import typings.relayCompiler.reporterMod.Reporter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiReporter extends Reporter

object MultiReporter {
  @scala.inline
  def apply(
    reportError: (String, Error) => Unit,
    reportMessage: String => Unit,
    reportTime: (String, Double) => Unit
  ): MultiReporter = {
    val __obj = js.Dynamic.literal(reportError = js.Any.fromFunction2(reportError), reportMessage = js.Any.fromFunction1(reportMessage), reportTime = js.Any.fromFunction2(reportTime))
    __obj.asInstanceOf[MultiReporter]
  }
}

