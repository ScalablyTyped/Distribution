package typings.promiseTheWorld

import typings.promiseTheWorld.anon.Call
import typings.promiseTheWorld.anon.Typeofmutex
import typings.promiseTheWorld.anon.Typeofqueue
import typings.promiseTheWorld.deferMod.Deferred
import typings.promiseTheWorld.mutexMod.Mutex
import typings.promiseTheWorld.queueMod.Queue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-the-world", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def defer[T](): Deferred[T] = js.native
  @JSName("defer")
  var defer_Original: Call = js.native
  
  def delay(ms: Double): js.Promise[Unit] = js.native
  @JSName("delay")
  var delay_Original: js.Function1[/* ms */ Double, js.Promise[Unit]] = js.native
  
  def mutex(): Mutex = js.native
  @JSName("mutex")
  var mutex_Original: js.Function0[Mutex] with Typeofmutex = js.native
  
  def queue(): Queue = js.native
  def queue(maxPending: js.UndefOr[scala.Nothing], maxQueued: Double): Queue = js.native
  def queue(maxPending: Double): Queue = js.native
  def queue(maxPending: Double, maxQueued: Double): Queue = js.native
  @JSName("queue")
  var queue_Original: (js.Function2[/* maxPending */ js.UndefOr[Double], /* maxQueued */ js.UndefOr[Double], Queue]) with Typeofqueue = js.native
}
