package typings.semaphore.semaphoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Semaphore extends js.Object {
  var capacity: Double = js.native
  def available(n: Double): Boolean = js.native
  def leave(): Unit = js.native
  def leave(n: Double): Unit = js.native
  def take(n: Double, task: Task): Unit = js.native
  def take(task: Task): Unit = js.native
}

