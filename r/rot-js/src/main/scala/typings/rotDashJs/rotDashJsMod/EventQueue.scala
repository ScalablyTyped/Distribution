package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "EventQueue")
@js.native
class EventQueue[T] () extends js.Object {
  def add(event: T, time: Double): Unit = js.native
  def clear(): Unit = js.native
  def get(): T = js.native
  def getEventTime(event: T): Double = js.native
  def getTime(): Double = js.native
  def remove(event: T): Boolean = js.native
  def remove(index: Double): Boolean = js.native
}

