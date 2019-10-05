package typings.semaphore

import typings.semaphore.semaphoreMod.Semaphore
import typings.semaphore.semaphoreMod.Task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semaphore", JSImport.Namespace)
@js.native
object semaphoreMod extends js.Object {
  @js.native
  trait Semaphore extends js.Object {
    var capacity: Double = js.native
    def available(n: Double): Boolean = js.native
    def leave(): Unit = js.native
    def leave(n: Double): Unit = js.native
    def take(n: Double, task: Task): Unit = js.native
    def take(task: Task): Unit = js.native
  }
  
  def apply(): Semaphore = js.native
  def apply(capacity: Double): Semaphore = js.native
  type Task = js.Function0[Unit]
}

