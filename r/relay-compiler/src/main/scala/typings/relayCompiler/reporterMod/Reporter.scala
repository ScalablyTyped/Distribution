package typings.relayCompiler.reporterMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter extends js.Object {
  def reportError(caughtLocation: String, error: Error): Unit = js.native
  def reportMessage(message: String): Unit = js.native
  def reportTime(name: String, ms: Double): Unit = js.native
}

object Reporter {
  @scala.inline
  def apply(
    reportError: (String, Error) => Unit,
    reportMessage: String => Unit,
    reportTime: (String, Double) => Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(reportError = js.Any.fromFunction2(reportError), reportMessage = js.Any.fromFunction1(reportMessage), reportTime = js.Any.fromFunction2(reportTime))
    __obj.asInstanceOf[Reporter]
  }
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReportError(value: (String, Error) => Unit): Self = this.set("reportError", js.Any.fromFunction2(value))
    @scala.inline
    def setReportMessage(value: String => Unit): Self = this.set("reportMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setReportTime(value: (String, Double) => Unit): Self = this.set("reportTime", js.Any.fromFunction2(value))
  }
  
}

