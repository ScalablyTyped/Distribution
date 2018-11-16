package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Scheduler")
@js.native
class Scheduler () extends js.Object {
  def add(item: js.Any, repeat: scala.Boolean): Scheduler = js.native
  def add(item: js.Any, repeat: scala.Boolean, time: scala.Double): Scheduler = js.native
  def clear(): Scheduler = js.native
  def getTime(): scala.Double = js.native
  def getTimeOf(item: js.Any): scala.Double = js.native
  def next(): js.Any = js.native
  def remove(item: js.Any): js.Any = js.native
}

