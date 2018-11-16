package typings
package reduxDashSagaLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockTask
  extends reduxDashSagaLib.reduxDashSagaMod.Task {
  def setError(error: js.Any): scala.Unit = js.native
  def setResult(result: js.Any): scala.Unit = js.native
  def setRunning(running: scala.Boolean): scala.Unit = js.native
}

