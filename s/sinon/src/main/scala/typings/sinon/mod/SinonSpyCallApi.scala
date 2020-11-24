package typings.sinon.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonSpyCallApi[TArgs /* <: js.Array[_] */, TReturnValue] extends js.Object {
  
  // Properties
  /**
    * Array of received arguments.
    */
  var args: TArgs = js.native
  
  /**
    * Like yield, but with an explicit argument number specifying which callback to call.
    * Useful if a function is called with more than one callback, and simply calling the first callback is not desired.
    * @param pos
    */
  def callArg(pos: Double): Unit = js.native
  
  def callArgOn(pos: Double, obj: js.Any, args: js.Any*): Unit = js.native
  
  def callArgOnWith(pos: Double, obj: js.Any, args: js.Any*): Unit = js.native
  
  /**
    * Like callArg, but with arguments.
    */
  def callArgWith(pos: Double, args: js.Any*): Unit = js.native
  
  // Methods
  /**
    * Returns true if the spy was called at least once with @param obj as this.
    * calledOn also accepts a matcher spyCall.calledOn(sinon.match(fn)) (see matchers).
    * @param obj
    */
  def calledOn(obj: js.Any): Boolean = js.native
  
  /**
    * Returns true if spy was called at exactly once with the provided arguments.
    * @param args
    */
  def calledOnceWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  
  def calledOnceWithExactly(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  
  /**
    * Returns true if spy was called at least once with the provided arguments.
    * Can be used for partial matching, Sinon only checks the provided arguments against actual arguments,
    * so a call that received the provided arguments (in the same spots) and possibly others as well will return true.
    * @param args
    */
  def calledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Partial<MatchArguments<TArgs>> is not an array type */ args: Partial[MatchArguments[TArgs]]
  ): Boolean = js.native
  
  /**
    * Returns true if spy was called at least once with the provided arguments and no others.
    */
  def calledWithExactly(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  
  /**
    * Returns true if spy was called with matching arguments (and possibly others).
    * This behaves the same as spy.calledWith(sinon.match(arg1), sinon.match(arg2), ...).
    * @param args
    */
  def calledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Boolean = js.native
  
  /**
    * Returns true if spy/stub was called the new operator.
    * Beware that this is inferred based on the value of the this object and the spy function’s prototype,
    * so it may give false positives if you actively return the right kind of object.
    */
  def calledWithNew(): Boolean = js.native
  
  /**
    * Returns true if call did not receive provided arguments.
    * @param args
    */
  def notCalledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  
  /**
    * Returns true if call did not receive matching arguments.
    * This behaves the same as spyCall.notCalledWith(sinon.match(arg1), sinon.match(arg2), ...).
    * @param args
    */
  def notCalledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Boolean = js.native
  
  /**
    * Returns true if spy returned the provided value at least once.
    * Uses deep comparison for objects and arrays. Use spy.returned(sinon.match.same(obj)) for strict comparison (see matchers).
    * @param value
    */
  def returned(value: TReturnValue): Boolean = js.native
  def returned(value: SinonMatcher): Boolean = js.native
  
  /**
    * Returns true if spy threw an exception at least once.
    */
  def threw(): Boolean = js.native
  /**
    * Returns true if spy threw the provided exception object at least once.
    */
  def threw(obj: js.Any): Boolean = js.native
  /**
    * Returns true if spy threw an exception of the provided type at least once.
    */
  def threw(`type`: String): Boolean = js.native
  
  /**
    * Invoke callbacks passed to the stub with the given arguments.
    * If the stub was never called with a function argument, yield throws an error.
    * Returns an Array with all callbacks return values in the order they were called, if no error is thrown.
    * Also aliased as invokeCallback.
    */
  def `yield`(args: js.Any*): Unit = js.native
  
  def yieldOn(obj: js.Any, args: js.Any*): Unit = js.native
  
  /**
    * Invokes callbacks passed as a property of an object to the stub.
    * Like yield, yieldTo grabs the first matching argument, finds the callback and calls it with the (optional) arguments.
    */
  def yieldTo(property: String, args: js.Any*): Unit = js.native
  
  def yieldToOn(property: String, obj: js.Any, args: js.Any*): Unit = js.native
}
