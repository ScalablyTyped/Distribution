package typings.reactDashAlbus.reactDashAlbusMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WizardContext extends js.Object {
  var history: History[LocationState] = js.native
  var step: StepObject = js.native
  var steps: js.Array[StepObject] = js.native
  def go(n: Double): Unit = js.native
  def next(): Unit = js.native
  def previous(): Unit = js.native
  def push(): Unit = js.native
  def push(id: String): Unit = js.native
  def replace(): Unit = js.native
  def replace(id: String): Unit = js.native
}

