package typings.processExists

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("process-exists", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Promise[Boolean] = js.native
  /**
  	Check if a process exists.
  	@param input - Process ID or name to check.
  	@returns Whether the process exists.
  	*/
  @JSImport("process-exists", JSImport.Namespace)
  @js.native
  def apply(input: Double): js.Promise[Boolean] = js.native
  
  /**
  	Check multiple processes if they exist.
  	@param input - Process IDs or names to check.
  	@returns A map with the process name/ID as key and the status as a boolean value.
  	*/
  @JSImport("process-exists", "all")
  @js.native
  def all(input: js.Array[Double | String]): js.Promise[Map[Double | String, Boolean]] = js.native
  
  /**
  	Filter for processes that exist.
  	@param input - Process IDs or names to check.
  	@returns The processes that exist.
  	*/
  @JSImport("process-exists", "filterExists")
  @js.native
  def filterExists(input: js.Array[Double | String]): js.Array[Double | String] = js.native
}
