package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Scheduler")
@js.native
class Scheduler () extends js.Object {
  def add(item: js.Any, repeat: Boolean): Scheduler = js.native
  def add(item: js.Any, repeat: Boolean, time: Double): Scheduler = js.native
  def clear(): Scheduler = js.native
  def getTime(): Double = js.native
  def getTimeOf(item: js.Any): Double = js.native
  def next(): js.Any = js.native
  def remove(item: js.Any): js.Any = js.native
}

