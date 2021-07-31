package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineMod {
  
  @JSImport("rot-js/lib/engine", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Engine {
    def this(scheduler: typings.rotJs.schedulerSchedulerMod.default[js.Any]) = this()
    
    /* CompleteClass */
    var _lock: Double = js.native
    
    /* CompleteClass */
    var _scheduler: typings.rotJs.schedulerSchedulerMod.default[js.Any] = js.native
    
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
  
  trait Engine extends StObject {
    
    var _lock: Double
    
    var _scheduler: typings.rotJs.schedulerSchedulerMod.default[js.Any]
    
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
      _scheduler: typings.rotJs.schedulerSchedulerMod.default[js.Any],
      lock: () => Engine,
      start: () => Engine,
      unlock: () => Engine
    ): Engine = {
      val __obj = js.Dynamic.literal(_lock = _lock.asInstanceOf[js.Any], _scheduler = _scheduler.asInstanceOf[js.Any], lock = js.Any.fromFunction0(lock), start = js.Any.fromFunction0(start), unlock = js.Any.fromFunction0(unlock))
      __obj.asInstanceOf[Engine]
    }
    
    @scala.inline
    implicit class EngineMutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLock(value: () => Engine): Self = StObject.set(x, "lock", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Engine): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnlock(value: () => Engine): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_lock(value: Double): Self = StObject.set(x, "_lock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_scheduler(value: typings.rotJs.schedulerSchedulerMod.default[js.Any]): Self = StObject.set(x, "_scheduler", value.asInstanceOf[js.Any])
    }
  }
}
