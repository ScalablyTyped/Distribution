package typings.rotJs.engineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Engine extends js.Object {
  
  var _lock: Double = js.native
  
  var _scheduler: typings.rotJs.schedulerSchedulerMod.default[_] = js.native
  
  /**
    * Interrupt the engine by an asynchronous action
    */
  def lock(): this.type = js.native
  
  /**
    * Start the main loop. When this call returns, the loop is locked.
    */
  def start(): this.type = js.native
  
  /**
    * Resume execution (paused by a previous lock)
    */
  def unlock(): this.type = js.native
}
object Engine {
  
  @scala.inline
  def apply(
    _lock: Double,
    _scheduler: typings.rotJs.schedulerSchedulerMod.default[_],
    lock: () => Engine,
    start: () => Engine,
    unlock: () => Engine
  ): Engine = {
    val __obj = js.Dynamic.literal(_lock = _lock.asInstanceOf[js.Any], _scheduler = _scheduler.asInstanceOf[js.Any], lock = js.Any.fromFunction0(lock), start = js.Any.fromFunction0(start), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[Engine]
  }
  
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_lock(value: Double): Self = this.set("_lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scheduler(value: typings.rotJs.schedulerSchedulerMod.default[_]): Self = this.set("_scheduler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock(value: () => Engine): Self = this.set("lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Engine): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlock(value: () => Engine): Self = this.set("unlock", js.Any.fromFunction0(value))
  }
}
