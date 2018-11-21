package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def callArg(pos: scala.Double): scala.Unit = js.native
  def callArgOn(pos: scala.Double, obj: js.Any, args: js.Any*): scala.Unit = js.native
  def callArgOnWith(pos: scala.Double, obj: js.Any, args: js.Any*): scala.Unit = js.native
  /**
           * Like callArg, but with arguments.
           */
  def callArgWith(pos: scala.Double, args: js.Any*): scala.Unit = js.native
  // Methods
  /**
           * Returns true if the spy was called at least once with @param obj as this.
           * calledOn also accepts a matcher spyCall.calledOn(sinon.match(fn)) (see matchers).
           * @param obj
           */
  def calledOn(obj: js.Any): scala.Boolean = js.native
  /**
           * Returns true if spy was called at exactly once with the provided arguments.
           * @param args
           */
  def calledOnceWith(
    /* import warning: Dropping repeated marker of param TsIdentSimple(args) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(TArgs))),List())) is not an array type */args: TArgs
  ): scala.Boolean = js.native
  def calledOnceWithExactly(
    /* import warning: Dropping repeated marker of param TsIdentSimple(args) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(TArgs))),List())) is not an array type */args: TArgs
  ): scala.Boolean = js.native
  /**
           * Returns true if spy was called at least once with the provided arguments.
           * Can be used for partial matching, Sinon only checks the provided arguments against actual arguments,
           * so a call that received the provided arguments (in the same spots) and possibly others as well will return true.
           * @param args
           */
  def calledWith(
    /* import warning: Dropping repeated marker of param TsIdentSimple(args) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(TArgs))),List())) is not an array type */args: TArgs
  ): scala.Boolean = js.native
  /**
           * Returns true if spy was called at least once with the provided arguments and no others.
           */
  def calledWithExactly(
    /* import warning: Dropping repeated marker of param TsIdentSimple(args) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(TArgs))),List())) is not an array type */args: TArgs
  ): scala.Boolean = js.native
  /**
           * Returns true if spy was called with matching arguments (and possibly others).
           * This behaves the same as spy.calledWith(sinon.match(arg1), sinon.match(arg2), ...).
           * @param args
           */
  def calledWithMatch(
    /* import warning: Dropping repeated marker of param TsIdentSimple(args) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(TArgs))),List())) is not an array type */args: TArgs
  ): scala.Boolean = js.native
  /**
           * Returns true if spy/stub was called the new operator.
           * Beware that this is inferred based on the value of the this object and the spy function’s prototype,
           * so it may give false positives if you actively return the right kind of object.
           */
  def calledWithNew(): scala.Boolean = js.native
  /**
           * Returns true if call did not receive provided arguments.
           * @param args
           */
  def notCalledWith(
    /* import warning: Dropping repeated marker of param TsIdentSimple(args) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(TArgs))),List())) is not an array type */args: TArgs
  ): scala.Boolean = js.native
  /**
           * Returns true if call did not receive matching arguments.
           * This behaves the same as spyCall.notCalledWith(sinon.match(arg1), sinon.match(arg2), ...).
           * @param args
           */
  def notCalledWithMatch(
    /* import warning: Dropping repeated marker of param TsIdentSimple(args) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(TArgs))),List())) is not an array type */args: TArgs
  ): scala.Boolean = js.native
  /**
           * Returns true if spy returned the provided value at least once.
           * Uses deep comparison for objects and arrays. Use spy.returned(sinon.match.same(obj)) for strict comparison (see matchers).
           * @param value
           */
  def returned(value: TReturnValue): scala.Boolean = js.native
  /**
           * Returns true if spy threw an exception at least once.
           */
  def threw(): scala.Boolean = js.native
  /**
           * Returns true if spy threw the provided exception object at least once.
           */
  def threw(obj: js.Any): scala.Boolean = js.native
  /**
           * Returns true if spy threw an exception of the provided type at least once.
           */
  def threw(`type`: java.lang.String): scala.Boolean = js.native
  /**
           * Invoke callbacks passed to the stub with the given arguments.
           * If the stub was never called with a function argument, yield throws an error.
           * Returns an Array with all callbacks return values in the order they were called, if no error is thrown.
           * Also aliased as invokeCallback.
           */
  def `yield`(args: js.Any*): scala.Unit = js.native
  def yieldOn(obj: js.Any, args: js.Any*): scala.Unit = js.native
  /**
           * Invokes callbacks passed as a property of an object to the stub.
           * Like yield, yieldTo grabs the first matching argument, finds the callback and calls it with the (optional) arguments.
           */
  def yieldTo(property: java.lang.String, args: js.Any*): scala.Unit = js.native
  def yieldToOn(property: java.lang.String, obj: js.Any, args: js.Any*): scala.Unit = js.native
}

