package typings.promiseTheWorld

import typings.promiseTheWorld.anon.FnCall
import typings.promiseTheWorld.deferMod.Deferred
import typings.promiseTheWorld.mutexMod.Mutex
import typings.promiseTheWorld.queueMod.Queue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-the-world", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defer[T](): Deferred[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Deferred[T]]
  @JSImport("promise-the-world", "defer")
  @js.native
  def defer_Fmod: FnCall = js.native
  
  @scala.inline
  def defer_Fmod_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defer")(x.asInstanceOf[js.Any])
  
  @JSImport("promise-the-world", "delay")
  @js.native
  def delay: js.Function1[/* ms */ Double, js.Promise[Unit]] = js.native
  @scala.inline
  def delay(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def delay_=(x: js.Function1[/* ms */ Double, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def mutex(): Mutex = ^.asInstanceOf[js.Dynamic].applyDynamic("mutex")().asInstanceOf[Mutex]
  @JSImport("promise-the-world", "mutex")
  @js.native
  def mutex_Fmod: js.Function0[Mutex] = js.native
  
  @scala.inline
  def mutex_Fmod_=(x: js.Function0[Mutex]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mutex")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def queue(): Queue = ^.asInstanceOf[js.Dynamic].applyDynamic("queue")().asInstanceOf[Queue]
  @scala.inline
  def queue(maxPending: Double): Queue = ^.asInstanceOf[js.Dynamic].applyDynamic("queue")(maxPending.asInstanceOf[js.Any]).asInstanceOf[Queue]
  @scala.inline
  def queue(maxPending: Double, maxQueued: Double): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("queue")(maxPending.asInstanceOf[js.Any], maxQueued.asInstanceOf[js.Any])).asInstanceOf[Queue]
  @scala.inline
  def queue(maxPending: Unit, maxQueued: Double): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("queue")(maxPending.asInstanceOf[js.Any], maxQueued.asInstanceOf[js.Any])).asInstanceOf[Queue]
  @JSImport("promise-the-world", "queue")
  @js.native
  def queue_Fmod: js.Function2[/* maxPending */ js.UndefOr[Double], /* maxQueued */ js.UndefOr[Double], Queue] = js.native
  
  @scala.inline
  def queue_Fmod_=(x: js.Function2[/* maxPending */ js.UndefOr[Double], /* maxQueued */ js.UndefOr[Double], Queue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queue")(x.asInstanceOf[js.Any])
}
