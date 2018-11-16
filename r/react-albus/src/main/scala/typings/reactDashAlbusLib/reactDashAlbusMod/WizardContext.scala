package typings
package reactDashAlbusLib.reactDashAlbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WizardContext extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState] = js.native
  var step: WizardStepObject = js.native
  var steps: js.Array[WizardStepObject] = js.native
  def go(n: scala.Double): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def previous(): scala.Unit = js.native
  def push(): scala.Unit = js.native
  def push(id: java.lang.String): scala.Unit = js.native
  def replace(): scala.Unit = js.native
  def replace(id: java.lang.String): scala.Unit = js.native
}

