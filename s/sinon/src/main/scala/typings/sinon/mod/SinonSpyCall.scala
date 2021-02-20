package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonSpyCall[TArgs /* <: js.Array[_] */, TReturnValue] extends SinonSpyCallApi[TArgs, TReturnValue] {
  
  /**
    * This property is a convenience for a call’s callback.
    * When the last argument in a call is a Function, then callback will reference that. Otherwise it will be undefined.
    */
  var callback: js.UndefOr[js.Function] = js.native
  
  /**
    * Returns true if the spy call occurred after another spy call.
    * @param call
    */
  def calledAfter(call: SinonSpyCall[_, _]): Boolean = js.native
  
  /**
    * Returns true if the spy call occurred before another spy call.
    * @param call
    *
    */
  def calledBefore(call: SinonSpyCall[_, _]): Boolean = js.native
  
  /**
    * Exception thrown, if any.
    */
  var exception: js.Any = js.native
  
  /**
    * This property is a convenience for the first argument of the call.
    */
  var firstArg: js.Any = js.native
  
  /**
    * This property is a convenience for the last argument of the call.
    */
  var lastArg: js.Any = js.native
  
  /**
    * Return value.
    */
  var returnValue: TReturnValue = js.native
  
  /**
    * The call’s this value.
    */
  var thisValue: js.Any = js.native
}
