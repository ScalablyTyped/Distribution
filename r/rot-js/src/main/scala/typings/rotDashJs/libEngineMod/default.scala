package typings.rotDashJs.libEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/engine", JSImport.Default)
@js.native
class default protected () extends Engine {
  def this(scheduler: typings.rotDashJs.libSchedulerSchedulerMod.default[_]) = this()
  /* CompleteClass */
  override var _lock: Double = js.native
  /* CompleteClass */
  override var _scheduler: typings.rotDashJs.libSchedulerSchedulerMod.default[_] = js.native
  /**
    * Interrupt the engine by an asynchronous action
    */
  /* CompleteClass */
  override def lock(): this.type = js.native
  /**
    * Start the main loop. When this call returns, the loop is locked.
    */
  /* CompleteClass */
  override def start(): this.type = js.native
  /**
    * Resume execution (paused by a previous lock)
    */
  /* CompleteClass */
  override def unlock(): this.type = js.native
}

