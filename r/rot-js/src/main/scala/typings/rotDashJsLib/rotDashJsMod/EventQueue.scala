package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "EventQueue")
@js.native
class EventQueue[T] () extends js.Object {
  def add(event: T, time: scala.Double): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def get(): T = js.native
  def getEventTime(event: T): scala.Double = js.native
  def getTime(): scala.Double = js.native
  def remove(event: T): scala.Boolean = js.native
  def remove(index: scala.Double): scala.Boolean = js.native
}

