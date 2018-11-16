package typings
package semaphoreLib.semaphoreMod.semaphoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Semaphore extends js.Object {
  var capacity: scala.Double = js.native
  def available(n: scala.Double): scala.Boolean = js.native
  def leave(): scala.Unit = js.native
  def leave(n: scala.Double): scala.Unit = js.native
  def take(n: scala.Double, task: Task): scala.Unit = js.native
  def take(task: Task): scala.Unit = js.native
}

