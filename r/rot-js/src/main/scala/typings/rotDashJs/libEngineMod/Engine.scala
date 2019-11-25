package typings.rotDashJs.libEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  var _lock: Double
  var _scheduler: typings.rotDashJs.libSchedulerSchedulerMod.default[_]
  /**
    * Interrupt the engine by an asynchronous action
    */
  def lock(): this.type
  /**
    * Start the main loop. When this call returns, the loop is locked.
    */
  def start(): this.type
  /**
    * Resume execution (paused by a previous lock)
    */
  def unlock(): this.type
}

object Engine {
  @scala.inline
  def apply(
    _lock: Double,
    _scheduler: typings.rotDashJs.libSchedulerSchedulerMod.default[_],
    lock: () => Engine,
    start: () => Engine,
    unlock: () => Engine
  ): Engine = {
    val __obj = js.Dynamic.literal(_lock = _lock.asInstanceOf[js.Any], _scheduler = _scheduler.asInstanceOf[js.Any], lock = js.Any.fromFunction0(lock), start = js.Any.fromFunction0(start), unlock = js.Any.fromFunction0(unlock))
  
    __obj.asInstanceOf[Engine]
  }
}

