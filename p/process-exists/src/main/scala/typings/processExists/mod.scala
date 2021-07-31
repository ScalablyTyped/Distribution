package typings.processExists

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  /**
  	Check if a process exists.
  	@param input - Process ID or name to check.
  	@returns Whether the process exists.
  	*/
  @scala.inline
  def apply(input: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("process-exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Check multiple processes if they exist.
  	@param input - Process IDs or names to check.
  	@returns A map with the process name/ID as key and the status as a boolean value.
  	*/
  @scala.inline
  def all(input: js.Array[Double | String]): js.Promise[Map[Double | String, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[Double | String, Boolean]]]
  
  /**
  	Filter for processes that exist.
  	@param input - Process IDs or names to check.
  	@returns The processes that exist.
  	*/
  @scala.inline
  def filterExists(input: js.Array[Double | String]): js.Array[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterExists")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | String]]
}
