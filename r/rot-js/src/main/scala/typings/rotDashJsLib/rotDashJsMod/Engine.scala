package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Engine")
@js.native
class Engine protected () extends js.Object {
  def this(scheduler: Scheduler) = this()
  def lock(): Engine = js.native
  def start(): Engine = js.native
  def unlock(): Engine = js.native
}

