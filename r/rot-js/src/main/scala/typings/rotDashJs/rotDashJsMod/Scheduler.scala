package typings.rotDashJs.rotDashJsMod

import typings.rotDashJs.rotDashJsMod.Scheduler.Action
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

@JSImport("rot-js", "Scheduler")
@js.native
object Scheduler extends js.Object {
  @js.native
  class Action () extends Scheduler {
    def setDuration(time: Double): Action = js.native
  }
  
  @js.native
  class Simple () extends Scheduler
  
  @js.native
  class Speed () extends Scheduler
  
}

