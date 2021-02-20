package typings.screepsProfiler

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("screeps-profiler", JSImport.Namespace)
  @js.native
  val ^ : ScreepsProfilerStatic = js.native
  
  object global {
    
    /**
      * screeps-profiler extends the Game interface with itself
      * @see http://docs.screeps.com/api/#Game
      */
    @js.native
    trait Game extends StObject {
      
      var profiler: ScreepsGameProfiler = js.native
    }
    object Game {
      
      @JSGlobal("Game")
      @js.native
      val ^ : Game = js.native
      
      @scala.inline
      implicit class GameMutableBuilder[Self <: Game] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProfiler(value: ScreepsGameProfiler): Self = StObject.set(x, "profiler", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait ScreepsGameProfiler extends StObject {
    
    /**
      * This will run indefinitely, and will only output data when the output console command is run.
      * Very useful for long running profiles with lots of function calls.
      *
      * @param [functionFilter] - parameter will limit the scope of the profiler to a specific function name
      */
    def background(): Unit = js.native
    def background(functionFilter: String): Unit = js.native
    
    /**
      * This will run for the given number of ticks, and will email the output to your registered
      * Screeps email address. Very useful for long running profiles.
      *
      * @param ticks - controls how long the profiler should run before stopping
      * @param [functionFilter] - parameter will limit the scope of the profiler to a specific function name
      */
    def email(ticks: Double): Unit = js.native
    def email(ticks: Double, functionFilter: String): Unit = js.native
    
    /**
      * Print a report based on the current tick. The profiler will continue to operate normally.
      * This is currently the only way to get data from the background profile.
      *
      * @param [lineCount=20] the number of lines to output
      */
    def output(): Unit = js.native
    def output(lineCount: Double): Unit = js.native
    
    /**
      * Will run for the given number of ticks then will output the gathered information to the console.
      *
      * @param ticks - controls how long the profiler should run before stopping
      * @param [functionFilter] - parameter will limit the scope of the profiler to a specific function name
      */
    def profile(ticks: Double): Unit = js.native
    def profile(ticks: Double, functionFilter: String): Unit = js.native
    
    /**
      * Stops the profiler and resets its memory. This is currently the only way to stop a background profile.
      */
    def reset(): Unit = js.native
    
    /**
      *  Restarts the profiler using the same options previously used to start it.
      */
    def restart(): Unit = js.native
    
    /**
      * Will run for the given number of ticks, and will output the gathered information each tick to
      * the console. The can sometimes be useful for seeing spikes in performance.
      *
      * @param ticks - controls how long the profiler should run before stopping
      * @param [functionFilter] - parameter will limit the scope of the profiler to a specific function name
      */
    def stream(ticks: Double): Unit = js.native
    def stream(ticks: Double, functionFilter: String): Unit = js.native
  }
  
  @js.native
  trait ScreepsProfilerStatic extends StObject {
    
    /**
      * This line monkey patches the global prototypes. Should be called before and outside your main loop.
      */
    def enable(): Unit = js.native
    
    /**
      * Register a class to be profiled. Each of the functions on this class will be replaced with
      * a profiler wrapper
      * @param  clazz constructor
      * @param className - The name of the class, a label used in output
      */
    // tslint:disable-next-line ban-types
    def registerClass(constructor: js.Function, className: String): Unit = js.native
    
    /**
      * Wraps a function for profiling, returns the wrapped function.
      *
      * Be sure to reassign the function, we can't alter functions that are passed.
      *
      * The second param is optional if you pass a named function function x() {}, but required if
      * you pass an anonymous function var x = function(){}.
      *
      * @param [fnName] - Name of the function, used as a label in output
      * @return the original function wrapped for profiling
      */
    // tslint:disable-next-line ban-types
    def registerFN(fn: js.Function): js.Function = js.native
    def registerFN(fn: js.Function, fnName: String): js.Function = js.native
    
    /**
      * Each of the functions on this object will be replaced with a profiler wrapper.
      * @param objectName - Name of the object, a label used in output
      */
    def registerObject(`object`: js.Any, objectName: String): Unit = js.native
    
    /**
      * Wrap your main loop with this function.
      *
      * @param callback - your main loop function
      */
    // tslint:disable-next-line ban-types
    def wrap(callback: js.Function): js.Function = js.native
  }
  
  type _To = ScreepsProfilerStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ScreepsProfilerStatic = ^
}
