package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonAssert extends js.Object {
  // Properties
  /**
           * Defaults to AssertError.
           */
  var failException: java.lang.String = js.native
  /**
           * Passes if spy was always called with obj as its this value.
           */
  def alwaysCalledOn(spy: SinonSpy[js.Array[_], _], obj: js.Any): scala.Unit = js.native
  /**
           * Passes if spy was always called with the provided arguments.
           * @param spy
           * @param args
           */
  def alwaysCalledWith(spy: SinonSpy[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Passes if spy was always called with the provided arguments and no others.
           */
  def alwaysCalledWithExactly(spy: SinonSpy[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Passes if spy was always called with matching arguments.
           * This behaves the same way as sinon.assert.alwaysCalledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
           */
  def alwaysCalledWithMatch(spy: SinonSpy[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Like threw, only required for all calls to the spy.
           */
  def alwaysThrew(spy: SinonSpy[js.Array[_], _]): scala.Unit = js.native
  /**
           * Like threw, only required for all calls to the spy.
           */
  def alwaysThrew(spy: SinonSpy[js.Array[_], _], exception: java.lang.String): scala.Unit = js.native
  /**
           * Like threw, only required for all calls to the spy.
           */
  def alwaysThrew(spy: SinonSpy[js.Array[_], _], exception: js.Any): scala.Unit = js.native
  /**
           * Passes if spy was called exactly num times.
           */
  def callCount(spy: SinonSpy[js.Array[_], _], count: scala.Double): scala.Unit = js.native
  /**
           * Passes if provided spies were called in the specified order.
           * @param spies
           */
  def callOrder(spies: (SinonSpy[js.Array[_], _])*): scala.Unit = js.native
  /**
           * Passes if spy was called at least once.
           */
  def called(spy: SinonSpy[js.Array[_], _]): scala.Unit = js.native
  /**
           * Passes if spy was ever called with obj as its this value.
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledOn(spy.firstCall, arg1, arg2, ...);.
           */
  def calledOn(spyOrSpyCall: SinonSpyCall[js.Array[_], _], obj: js.Any): scala.Unit = js.native
  /**
           * Passes if spy was ever called with obj as its this value.
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledOn(spy.firstCall, arg1, arg2, ...);.
           */
  def calledOn(spyOrSpyCall: SinonSpy[js.Array[_], _], obj: js.Any): scala.Unit = js.native
  /**
           * Passes if spy was called once and only once.
           */
  def calledOnce(spy: SinonSpy[js.Array[_], _]): scala.Unit = js.native
  /**
           * Passes if spy was called exactly three times.
           */
  def calledThrice(spy: SinonSpy[js.Array[_], _]): scala.Unit = js.native
  /**
           * Passes if spy was called exactly twice.
           */
  def calledTwice(spy: SinonSpy[js.Array[_], _]): scala.Unit = js.native
  /**
           * Passes if spy was called with the provided arguments.
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledWith(spy.firstCall, arg1, arg2, ...);.
           * @param spyOrSpyCall
           * @param args
           */
  def calledWith(spyOrSpyCall: SinonSpyCall[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Passes if spy was called with the provided arguments.
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledWith(spy.firstCall, arg1, arg2, ...);.
           * @param spyOrSpyCall
           * @param args
           */
  def calledWith(spyOrSpyCall: SinonSpy[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Passes if spy was called with the provided arguments and no others.
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithExactly(spy.getCall(1), arg1, arg2, ...);.
           * @param spyOrSpyCall
           * @param args
           */
  def calledWithExactly(spyOrSpyCall: SinonSpyCall[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Passes if spy was called with the provided arguments and no others.
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithExactly(spy.getCall(1), arg1, arg2, ...);.
           * @param spyOrSpyCall
           * @param args
           */
  def calledWithExactly(spyOrSpyCall: SinonSpy[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Passes if spy was called with matching arguments.
           * This behaves the same way as sinon.assert.calledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithMatch(spy.secondCall, arg1, arg2, ...);.
           */
  def calledWithMatch(spyOrSpyCall: SinonSpyCall[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Passes if spy was called with matching arguments.
           * This behaves the same way as sinon.assert.calledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithMatch(spy.secondCall, arg1, arg2, ...);.
           */
  def calledWithMatch(spyOrSpyCall: SinonSpy[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Passes if spy was called with the new operator.
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithNew(spy.secondCall, arg1, arg2, ...);.
           * @param spyOrSpyCall
           */
  def calledWithNew(spyOrSpyCall: SinonSpy[js.Array[_], _]): scala.Unit = js.native
  /**
           * Passes if spy was called with the new operator.
           * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithNew(spy.secondCall, arg1, arg2, ...);.
           * @param spyOrSpyCall
           */
  def calledWithNew(spyOrSpyCall: SinonSpyCall[js.Array[_], _]): scala.Unit = js.native
  /**
           * Exposes assertions into another object, to better integrate with the test framework.
           * For instance, JsTestDriver uses global assertions, and to make Sinon.JS assertions appear alongside them, you can do.
           * @example sinon.assert.expose(this);
           * This will give you assertCalled(spy),assertCallOrder(spy1, spy2, ...) and so on.
           * The method accepts an optional options object with two options.
           */
  def expose(obj: js.Any): scala.Unit = js.native
  /**
           * Exposes assertions into another object, to better integrate with the test framework.
           * For instance, JsTestDriver uses global assertions, and to make Sinon.JS assertions appear alongside them, you can do.
           * @example sinon.assert.expose(this);
           * This will give you assertCalled(spy),assertCallOrder(spy1, spy2, ...) and so on.
           * The method accepts an optional options object with two options.
           */
  def expose(obj: js.Any, options: stdLib.Partial[SinonExposeOptions]): scala.Unit = js.native
  /**
           * Every assertion fails by calling this method.
           * By default it throws an error of type sinon.assert.failException.
           * If the test framework looks for assertion errors by checking for a specific exception, you can simply override the kind of exception thrown.
           * If that does not fit with your testing framework of choice, override the fail method to do the right thing.
           */
  def fail(): scala.Unit = js.native
  /**
           * Every assertion fails by calling this method.
           * By default it throws an error of type sinon.assert.failException.
           * If the test framework looks for assertion errors by checking for a specific exception, you can simply override the kind of exception thrown.
           * If that does not fit with your testing framework of choice, override the fail method to do the right thing.
           */
  def fail(message: java.lang.String): scala.Unit = js.native
  /**
           * Uses sinon.match to test if the arguments can be considered a match.
           */
  def `match`(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
           * Passes if spy was never called with the provided arguments.
           * @param spy
           * @param args
           */
  def neverCalledWith(spy: SinonSpy[js.Array[_], _], args: js.Any*): scala.Unit = js.native
  /**
           * Passes if spy was never called with matching arguments.
           * This behaves the same way as sinon.assert.neverCalledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
           * @param spy
           * @param args
           */
  def neverCalledWithMatch(spy: SinonSpy[js.Array[_], _], args: js.Any*): scala.Unit = js.native
   // Overridable
  // Methods
  /**
           * Passes if spy was never called
           * @param spy
           */
  def notCalled(spy: SinonSpy[js.Array[_], _]): scala.Unit = js.native
   // Overridable
  /**
           * Called every time assertion passes.
           * Default implementation does nothing.
           */
  def pass(assertion: js.Any): scala.Unit = js.native
  /**
           * Passes if spy threw any exception.
           */
  def threw(spyOrSpyCall: SinonSpy[js.Array[_], _]): scala.Unit = js.native
  /**
           * Passes if spy threw any exception.
           */
  def threw(spyOrSpyCall: SinonSpyCall[js.Array[_], _]): scala.Unit = js.native
  /**
           * Passes if spy threw the given exception.
           * The exception is an actual object.
           * It’s possible to assert on a dedicated spy call: sinon.assert.threw(spy.thirdCall, exception);.
           */
  def threw(spyOrSpyCall: SinonSpyCall[js.Array[_], _], exception: java.lang.String): scala.Unit = js.native
  /**
           * Passes if spy threw the given exception.
           * The exception is a String denoting its type.
           * It’s possible to assert on a dedicated spy call: sinon.assert.threw(spy.thirdCall, exception);.
           */
  def threw(spyOrSpyCall: SinonSpyCall[js.Array[_], _], exception: js.Any): scala.Unit = js.native
  /**
           * Passes if spy threw the given exception.
           * The exception is an actual object.
           * It’s possible to assert on a dedicated spy call: sinon.assert.threw(spy.thirdCall, exception);.
           */
  def threw(spyOrSpyCall: SinonSpy[js.Array[_], _], exception: java.lang.String): scala.Unit = js.native
  /**
           * Passes if spy threw the given exception.
           * The exception is a String denoting its type.
           * It’s possible to assert on a dedicated spy call: sinon.assert.threw(spy.thirdCall, exception);.
           */
  def threw(spyOrSpyCall: SinonSpy[js.Array[_], _], exception: js.Any): scala.Unit = js.native
}

