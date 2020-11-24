package typings.screepsProfiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreepsGameProfiler extends js.Object {
  
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
