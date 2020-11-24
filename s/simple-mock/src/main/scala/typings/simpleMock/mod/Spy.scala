package typings.simpleMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spy[T] extends js.Object {
  
  def apply(args: js.Any*): T = js.native
  
  /**
    * Number of times the function was called.
    */
  var callCount: Double = js.native
  
  var called: Boolean = js.native
  
  var calls: js.Array[Calls[T]] = js.native
  
  var firstCall: Calls[T] = js.native
  
  /**
    * The last call object. (This is often also the first and only call.)
    */
  var lastCall: Calls[T] = js.native
  
  /**
    * Resets all counts and properties to the original state.
    */
  def reset(): Unit = js.native
}
