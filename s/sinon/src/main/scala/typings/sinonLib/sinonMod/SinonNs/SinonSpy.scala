package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonSpy extends SinonSpyCallApi {
  /**
    * Array of arguments received, spy.args[0] is an array of arguments received in the first call.
    */
  @JSName("args")
  var args_SinonSpy: js.Array[js.Array[_]] = js.native
  // Properties
  /**
    * The number of recorded calls.
    */
  var callCount: scala.Double = js.native
  /**
    * true if the spy was called at least once
    */
  var called: scala.Boolean = js.native
  /**
    * true if spy was called exactly once
    */
  var calledOnce: scala.Boolean = js.native
  /**
    * true if the spy was called exactly thrice
    */
  var calledThrice: scala.Boolean = js.native
  /**
    * true if the spy was called exactly twice
    */
  var calledTwice: scala.Boolean = js.native
  /**
    * Array of exception objects thrown, spy.exceptions[0] is the exception thrown by the first call.
    * If the call did not throw an error, the value at the call’s location in .exceptions will be undefined.
    */
  var exceptions: js.Array[_] = js.native
  /**
    * The first call
    */
  var firstCall: SinonSpyCall = js.native
  /**
    * The last call
    */
  var lastCall: SinonSpyCall = js.native
  /**
    * true if the spy was not called
    */
  var notCalled: scala.Boolean = js.native
  /**
    * Array of return values, spy.returnValues[0] is the return value of the first call.
    * If the call did not explicitly return a value, the value at the call’s location in .returnValues will be undefined.
    */
  var returnValues: js.Array[_] = js.native
  /**
    * The second call
    */
  var secondCall: SinonSpyCall = js.native
  /**
    * The third call
    */
  var thirdCall: SinonSpyCall = js.native
  /**
    * Array of this objects, spy.thisValues[0] is the this object for the first call.
    */
  var thisValues: js.Array[_] = js.native
  // Methods
  def apply(args: js.Any*): js.Any = js.native
  /**
    * Returns true if the spy was always called with @param obj as this.
    * @param obj
    */
  def alwaysCalledOn(obj: js.Any): scala.Boolean = js.native
  /**
    * Returns true if spy was always called with the provided arguments (and possibly others).
    */
  def alwaysCalledWith(args: js.Any*): scala.Boolean = js.native
  /**
    * Returns true if spy was always called with the exact provided arguments.
    * @param args
    */
  def alwaysCalledWithExactly(args: js.Any*): scala.Boolean = js.native
  /**
    * Returns true if spy was always called with matching arguments (and possibly others).
    * This behaves the same as spy.alwaysCalledWith(sinon.match(arg1), sinon.match(arg2), ...).
    * @param args
    */
  def alwaysCalledWithMatch(args: js.Any*): scala.Boolean = js.native
  /**
    * Returns true if spy always returned the provided value.
    * @param obj
    */
  def alwaysReturned(obj: js.Any): scala.Boolean = js.native
  /**
    * Returns true if spy always threw an exception.
    */
  def alwaysThrew(): scala.Boolean = js.native
  /**
    * Returns true if spy always threw the provided exception object.
    */
  def alwaysThrew(obj: js.Any): scala.Boolean = js.native
  /**
    * Returns true if spy always threw an exception of the provided type.
    */
  def alwaysThrew(`type`: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if the spy was called after @param anotherSpy
    * @param anotherSpy
    */
  def calledAfter(anotherSpy: SinonSpy): scala.Boolean = js.native
  /**
    * Returns true if the spy was called before @param anotherSpy
    * @param anotherSpy
    */
  def calledBefore(anotherSpy: SinonSpy): scala.Boolean = js.native
  /**
    * Returns true if spy was called after @param anotherSpy, and no spy calls occurred between @param anotherSpy and spy.
    * @param anotherSpy
    */
  def calledImmediatelyAfter(anotherSpy: SinonSpy): scala.Boolean = js.native
  /**
    * Returns true if spy was called before @param anotherSpy, and no spy calls occurred between spy and @param anotherSpy.
    * @param anotherSpy
    */
  def calledImmediatelyBefore(anotherSpy: SinonSpy): scala.Boolean = js.native
  /**
    * Returns the nth call.
    * Accessing individual calls helps with more detailed behavior verification when the spy is called more than once.
    * @param n
    */
  def getCall(n: scala.Double): SinonSpyCall = js.native
  /**
    * Returns an Array of all calls recorded by the spy.
    */
  def getCalls(): js.Array[SinonSpyCall] = js.native
  /**
    * Invoke callbacks passed to the stub with the given arguments.
    * If the stub was never called with a function argument, yield throws an error.
    * Returns an Array with all callbacks return values in the order they were called, if no error is thrown.
    */
  def invokeCallback(args: js.Any*): scala.Unit = js.native
  /**
    * Set the displayName of the spy or stub.
    * @param name
    */
  def named(name: java.lang.String): SinonSpy = js.native
  /**
    * Returns true if the spy/stub was never called with the provided arguments.
    * @param args
    */
  def neverCalledWith(args: js.Any*): scala.Boolean = js.native
  /**
    * Returns true if the spy/stub was never called with matching arguments.
    * This behaves the same as spy.neverCalledWith(sinon.match(arg1), sinon.match(arg2), ...).
    * @param args
    */
  def neverCalledWithMatch(args: js.Any*): scala.Boolean = js.native
  /**
    * Returns the passed format string with the following replacements performed:
    * * %n - the name of the spy "spy" by default)
    * * %c - the number of times the spy was called, in words ("once", "twice", etc.)
    * * %C - a list of string representations of the calls to the spy, with each call prefixed by a newline and four spaces
    * * %t - a comma-delimited list of this values the spy was called on
    * * %n - the formatted value of the nth argument passed to printf
    * * %* - a comma-delimited list of the (non-format string) arguments passed to printf
    * * %D - a multi-line list of the arguments received by all calls to the spy
    * @param format
    * @param args
    */
  def printf(format: java.lang.String, args: js.Any*): java.lang.String = js.native
  /**
    * Resets the state of a spy.
    */
  def resetHistory(): scala.Unit = js.native
  /**
    * Replaces the spy with the original method. Only available if the spy replaced an existing method.
    */
  def restore(): scala.Unit = js.native
  /**
    * Creates a spy that only records calls when the received arguments match those passed to withArgs.
    * This is useful to be more expressive in your assertions, where you can access the spy with the same call.
    * @param args Expected args
    */
  def withArgs(args: js.Any*): SinonSpy = js.native
}

