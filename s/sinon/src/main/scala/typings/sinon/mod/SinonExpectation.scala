package typings.sinon.mod

import typings.sinon.anon.MatchArgumentsArrayany
import typings.sinon.anon.PartialMatchArgumentsArra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent sinon.sinon.SinonStub<std.Array<any>, any> */
@js.native
trait SinonExpectation extends js.Object {
  
  // Methods
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
  ): js.Any = js.native
  
  /**
    * Returns true if the spy was always called with @param obj as this.
    * @param obj
    */
  def alwaysCalledOn(obj: js.Any): Boolean = js.native
  
  /**
    * Returns true if spy was always called with the provided arguments (and possibly others).
    */
  def alwaysCalledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArgumentsArrayany
  ): Boolean = js.native
  
  /**
    * Returns true if spy was always called with the exact provided arguments.
    * @param args
    */
  def alwaysCalledWithExactly(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArgumentsArrayany
  ): Boolean = js.native
  
  /**
    * Returns true if spy was always called with matching arguments (and possibly others).
    * This behaves the same as spy.alwaysCalledWith(sinon.match(arg1), sinon.match(arg2), ...).
    * @param args
    */
  def alwaysCalledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
  ): Boolean = js.native
  
  /**
    * Returns true if spy always returned the provided value.
    * @param obj
    */
  def alwaysReturned(obj: js.Any): Boolean = js.native
  
  /**
    * Returns true if spy always threw an exception.
    */
  def alwaysThrew(): Boolean = js.native
  /**
    * Returns true if spy always threw the provided exception object.
    */
  def alwaysThrew(obj: js.Any): Boolean = js.native
  /**
    * Returns true if spy always threw an exception of the provided type.
    */
  def alwaysThrew(`type`: String): Boolean = js.native
  
  /**
    * Array of arguments received, spy.args[0] is an array of arguments received in the first call.
    */
  var args: js.Array[js.Array[_]] = js.native
  
  /**
    * Specify the minimum amount of calls expected.
    */
  def atLeast(n: Double): SinonExpectation = js.native
  
  /**
    * Specify the maximum amount of calls expected.
    * @param n
    */
  def atMost(n: Double): SinonExpectation = js.native
  
  def callArg(pos: Double): Unit = js.native
  
  def callArgOn(pos: Double, obj: js.Any, args: js.Any*): Unit = js.native
  
  def callArgOnWith(pos: Double, obj: js.Any, args: js.Any*): Unit = js.native
  @JSName("callArgOnWith")
  var callArgOnWith_Original: js.Function3[/* pos */ Double, /* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
  
  @JSName("callArgOn")
  var callArgOn_Original: js.Function3[/* pos */ Double, /* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
  
  def callArgWith(pos: Double, args: js.Any*): Unit = js.native
  @JSName("callArgWith")
  var callArgWith_Original: js.Function2[/* pos */ Double, /* repeated */ js.Any, Unit] = js.native
  
  @JSName("callArg")
  var callArg_Original: js.Function1[/* pos */ Double, Unit] = js.native
  
  // Properties
  /**
    * The number of recorded calls.
    */
  var callCount: Double = js.native
  
  /**
    * Causes the original method wrapped into the stub to be called when none of the conditional stubs are matched.
    */
  def callThrough(): SinonStub[js.Array[_], _] = js.native
  
  /**
    * true if the spy was called at least once
    */
  var called: Boolean = js.native
  
  /**
    * Returns true if the spy was called after @param anotherSpy
    * @param anotherSpy
    */
  def calledAfter(anotherSpy: SinonSpy[_, _]): Boolean = js.native
  
  /**
    * Returns true if the spy was called before @param anotherSpy
    * @param anotherSpy
    */
  def calledBefore(anotherSpy: SinonSpy[_, _]): Boolean = js.native
  
  /**
    * Returns true if spy was called after @param anotherSpy, and no spy calls occurred between @param anotherSpy and spy.
    * @param anotherSpy
    */
  def calledImmediatelyAfter(anotherSpy: SinonSpy[_, _]): Boolean = js.native
  
  /**
    * Returns true if spy was called before @param anotherSpy, and no spy calls occurred between spy and @param anotherSpy.
    * @param anotherSpy
    */
  def calledImmediatelyBefore(anotherSpy: SinonSpy[_, _]): Boolean = js.native
  
  def calledOn(obj: js.Any): Boolean = js.native
  @JSName("calledOn")
  var calledOn_Original: js.Function1[/* obj */ js.Any, Boolean] = js.native
  
  /**
    * true if spy was called exactly once
    */
  var calledOnce: Boolean = js.native
  
  def calledOnceWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArgumentsArrayany
  ): Boolean = js.native
  
  def calledOnceWithExactly(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArgumentsArrayany
  ): Boolean = js.native
  @JSName("calledOnceWithExactly")
  var calledOnceWithExactly_Original: js.Function1[/* args */ MatchArgumentsArrayany, Boolean] = js.native
  
  @JSName("calledOnceWith")
  var calledOnceWith_Original: js.Function1[/* args */ MatchArgumentsArrayany, Boolean] = js.native
  
  /**
    * true if the spy was called exactly thrice
    */
  var calledThrice: Boolean = js.native
  
  /**
    * true if the spy was called exactly twice
    */
  var calledTwice: Boolean = js.native
  
  def calledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Partial<MatchArguments<TArgs>> is not an array type */ args: PartialMatchArgumentsArra
  ): Boolean = js.native
  
  def calledWithExactly(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArgumentsArrayany
  ): Boolean = js.native
  @JSName("calledWithExactly")
  var calledWithExactly_Original: js.Function1[/* args */ MatchArgumentsArrayany, Boolean] = js.native
  
  def calledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
  ): Boolean = js.native
  @JSName("calledWithMatch")
  var calledWithMatch_Original: js.Function1[/* args */ js.Array[_], Boolean] = js.native
  
  def calledWithNew(): Boolean = js.native
  @JSName("calledWithNew")
  var calledWithNew_Original: js.Function0[Boolean] = js.native
  
  @JSName("calledWith")
  var calledWith_Original: js.Function1[/* args */ PartialMatchArgumentsArra, Boolean] = js.native
  
  /**
    * Causes the stub to call the argument at the provided index as a callback function.
    * stub.callsArg(0); causes the stub to call the first argument as a callback.
    * If the argument at the provided index is not available or is not a function, a TypeError will be thrown.
    */
  def callsArg(index: Double): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param index
    */
  def callsArgAsync(index: Double): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Like stub.callsArg(index); but with an additional parameter to pass the this context.
    * @param index
    * @param context
    */
  def callsArgOn(index: Double, context: js.Any): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param index
    * @param context
    */
  def callsArgOnAsync(index: Double, context: js.Any): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Like above but with an additional parameter to pass the this context.
    * @param index
    * @param context
    * @param args
    */
  def callsArgOnWith(index: Double, context: js.Any, args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    */
  def callsArgOnWithAsync(index: Double, context: js.Any, args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Like callsArg, but with arguments to pass to the callback.
    * @param index
    * @param args
    */
  def callsArgWith(index: Double, args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    */
  def callsArgWithAsync(index: Double, args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Makes the stub call the provided @param func when invoked.
    * @param func
    */
  def callsFake(func: js.Function1[/* args */ js.Array[_], _]): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Expect the method to be called exactly @param n times.
    */
  def exactly(n: Double): SinonExpectation = js.native
  
  /**
    * Array of exception objects thrown, spy.exceptions[0] is the exception thrown by the first call.
    * If the call did not throw an error, the value at the call’s location in .exceptions will be undefined.
    */
  var exceptions: js.Array[_] = js.native
  
  /**
    * The first call
    */
  var firstCall: SinonSpyCall[js.Array[_], _] = js.native
  
  /**
    * Replaces a new getter for this stub.
    */
  def get(func: js.Function0[_]): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Returns the nth call.
    * Accessing individual calls helps with more detailed behavior verification when the spy is called more than once.
    * @param n Zero based index of the spy call.
    */
  def getCall(n: Double): SinonSpyCall[js.Array[_], _] = js.native
  
  /**
    * Returns an Array of all calls recorded by the spy.
    */
  def getCalls(): js.Array[SinonSpyCall[js.Array[_], _]] = js.native
  
  /**
    * Invoke callbacks passed to the stub with the given arguments.
    * If the stub was never called with a function argument, yield throws an error.
    * Returns an Array with all callbacks return values in the order they were called, if no error is thrown.
    */
  def invokeCallback(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
  ): Unit = js.native
  
  /**
    * The last call
    */
  var lastCall: SinonSpyCall[js.Array[_], _] = js.native
  
  /**
    * Set the displayName of the spy or stub.
    * @param name
    */
  def named(name: String): SinonSpy[js.Array[_], _] = js.native
  /**
    * Set the displayName of the spy or stub.
    * @param name
    */
  @JSName("named")
  def named_SinonStub(name: String): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Expect the method to never be called.
    */
  def never(): SinonExpectation = js.native
  
  /**
    * Returns true if the spy/stub was never called with the provided arguments.
    * @param args
    */
  def neverCalledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArgumentsArrayany
  ): Boolean = js.native
  
  /**
    * Returns true if the spy/stub was never called with matching arguments.
    * This behaves the same as spy.neverCalledWith(sinon.match(arg1), sinon.match(arg2), ...).
    * @param args
    */
  def neverCalledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
  ): Boolean = js.native
  
  /**
    * true if the spy was not called
    */
  var notCalled: Boolean = js.native
  
  def notCalledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArgumentsArrayany
  ): Boolean = js.native
  
  def notCalledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
  ): Boolean = js.native
  @JSName("notCalledWithMatch")
  var notCalledWithMatch_Original: js.Function1[/* args */ js.Array[_], Boolean] = js.native
  
  @JSName("notCalledWith")
  var notCalledWith_Original: js.Function1[/* args */ MatchArgumentsArrayany, Boolean] = js.native
  
  def on(obj: js.Any): SinonExpectation = js.native
  
  /**
    * Defines the behavior of the stub on the @param n call. Useful for testing sequential interactions.
    * There are methods onFirstCall, onSecondCall,onThirdCall to make stub definitions read more naturally.
    * onCall can be combined with all of the behavior defining methods in this section. In particular, it can be used together with withArgs.
    * @param n
    */
  def onCall(n: Double): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Alias for stub.onCall(0);
    */
  def onFirstCall(): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Alias for stub.onCall(1);
    */
  def onSecondCall(): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Alias for stub.onCall(2);
    */
  def onThirdCall(): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Expect the method to be called exactly once.
    */
  def once(): SinonExpectation = js.native
  
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
  def printf(format: String, args: js.Any*): String = js.native
  
  /**
    * Causes the stub to return a Promise which rejects with an exception (Error).
    * When constructing the Promise, sinon uses the Promise.reject method.
    * You are responsible for providing a polyfill in environments which do not provide Promise.
    * The Promise library can be overwritten using the usingPromise method.
    * Since sinon@2.0.0
    */
  def rejects(): SinonStub[js.Array[_], _] = js.native
  /**
    * Causes the stub to return a Promise which rejects with an exception of the provided type.
    * Since sinon@2.0.0
    */
  def rejects(errorType: String): SinonStub[js.Array[_], _] = js.native
  /**
    * Causes the stub to return a Promise which rejects with the provided exception object.
    * Since sinon@2.0.0
    */
  def rejects(value: js.Any): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Resets both behaviour and history of the stub.
    * This is equivalent to calling both stub.resetBehavior() and stub.resetHistory()
    * Updated in sinon@2.0.0
    * Since sinon@5.0.0
    * As a convenience, you can apply stub.reset() to all stubs using sinon.reset()
    */
  def reset(): Unit = js.native
  
  /**
    * Resets the stub’s behaviour to the default behaviour
    * You can reset behaviour of all stubs using sinon.resetBehavior()
    */
  def resetBehavior(): Unit = js.native
  
  /**
    * Resets the state of a spy.
    */
  def resetHistory(): Unit = js.native
  
  /**
    * Causes the stub to return a Promise which resolves to the provided value.
    * When constructing the Promise, sinon uses the Promise.resolve method.
    * You are responsible for providing a polyfill in environments which do not provide Promise.
    * The Promise library can be overwritten using the usingPromise method.
    * Since sinon@2.0.0
    */
  def resolves(): SinonStub[js.Array[_], _] = js.native
  def resolves(value: js.Any): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Causes the stub to return a Promise which resolves to the argument at the provided index.
    * stub.resolvesArg(0); causes the stub to return a Promise which resolves to the first argument.
    * If the argument at the provided index is not available, a TypeError will be thrown.
    */
  def resolvesArg(index: Double): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Causes the stub to return a Promise which resolves to its this value.
    */
  def resolvesThis(): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Restores all mocked methods.
    */
  def restore(): Unit = js.native
  
  /**
    * Array of return values, spy.returnValues[0] is the return value of the first call.
    * If the call did not explicitly return a value, the value at the call’s location in .returnValues will be undefined.
    */
  var returnValues: js.Array[_] = js.native
  
  def returned(value: js.Any): Boolean = js.native
  def returned(value: SinonMatcher): Boolean = js.native
  @JSName("returned")
  var returned_Original: js.Function1[/* value */ js.Any | SinonMatcher, Boolean] = js.native
  
  /**
    * Makes the stub return the provided @param obj value.
    * @param obj
    */
  def returns(obj: js.Any): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Causes the stub to return the argument at the provided @param index.
    * stub.returnsArg(0); causes the stub to return the first argument.
    * If the argument at the provided index is not available, prior to sinon@6.1.2, an undefined value will be returned;
    * starting from sinon@6.1.2, a TypeError will be thrown.
    * @param index
    */
  def returnsArg(index: Double): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Causes the stub to return its this value.
    * Useful for stubbing jQuery-style fluent APIs.
    */
  def returnsThis(): SinonStub[js.Array[_], _] = js.native
  
  /**
    * The second call
    */
  var secondCall: SinonSpyCall[js.Array[_], _] = js.native
  
  /**
    * Defines a new setter for this stub.
    * @param func
    */
  def set(func: js.Function1[/* v */ js.Any, Unit]): SinonStub[js.Array[_], _] = js.native
  
  /**
    * The third call
    */
  var thirdCall: SinonSpyCall[js.Array[_], _] = js.native
  
  /**
    * Array of this objects, spy.thisValues[0] is the this object for the first call.
    */
  var thisValues: js.Array[_] = js.native
  
  def threw(): Boolean = js.native
  @JSName("threw")
  var threw_Original: js.Function0[Boolean] = js.native
  
  /**
    * Expect the method to be called exactly thrice.
    */
  def thrice(): SinonExpectation = js.native
  
  /**
    * Causes the stub to throw an exception (Error).
    * @param type
    */
  def throws(): SinonStub[js.Array[_], _] = js.native
  /**
    * Causes the stub to throw the provided exception object.
    */
  def throws(obj: js.Any): SinonStub[js.Array[_], _] = js.native
  def throws(`type`: String): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Causes the stub to throw the argument at the provided index.
    * stub.throwsArg(0); causes the stub to throw the first argument as the exception.
    * If the argument at the provided index is not available, a TypeError will be thrown.
    * Since sinon@2.3.0
    * @param index
    */
  def throwsArg(index: Double): SinonStub[js.Array[_], _] = js.native
  
  def throwsException(): SinonStub[js.Array[_], _] = js.native
  def throwsException(obj: js.Any): SinonStub[js.Array[_], _] = js.native
  def throwsException(`type`: String): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Expect the method to be called exactly twice.
    */
  def twice(): SinonExpectation = js.native
  
  /**
    * Causes the stub to return promises using a specific Promise library instead of the global one when using stub.rejects or stub.resolves.
    * Returns the stub to allow chaining.
    */
  def usingPromise(promiseLibrary: js.Any): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Defines a new value for this stub.
    * @param val
    */
  def value(`val`: js.Any): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Verifies all expectations on the mock.
    * If any expectation is not satisfied, an exception is thrown.
    * Also restores the mocked methods.
    */
  def verify(): SinonExpectation = js.native
  
  /**
    * Expect the method to be called with the provided arguments and possibly others.
    * An expectation instance only holds onto a single set of arguments specified with withArgs.
    * Subsequent calls will overwrite the previously-specified set of arguments (even if they are different),
    * so it is generally not intended that this method be invoked more than once per test case.
    * @param args
    */
  def withArgs(args: js.Any*): SinonExpectation = js.native
  /**
    * Creates a spy that only records calls when the received arguments match those passed to withArgs.
    * This is useful to be more expressive in your assertions, where you can access the spy with the same call.
    * @param args Expected args
    */
  def withArgs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArgumentsArrayany
  ): SinonSpy[js.Array[_], _] = js.native
  /**
    * Stubs the method only for the provided arguments.
    * This is useful to be more expressive in your assertions, where you can access the spy with the same call.
    * It is also useful to create a stub that can act differently in response to different arguments.
    * @param args
    */
  @JSName("withArgs")
  def withArgs_SinonStub(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArgumentsArrayany
  ): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Expect the method to be called with the provided arguments and no others.
    * An expectation instance only holds onto a single set of arguments specified with withExactArgs.
    * Subsequent calls will overwrite the previously-specified set of arguments (even if they are different),
    * so it is generally not intended that this method be invoked more than once per test case.
    * @param args
    */
  def withExactArgs(args: js.Any*): SinonExpectation = js.native
  
  /**
    * Holds a reference to the original method/function this stub has wrapped.
    */
  def wrappedMethod(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
  ): js.Any = js.native
  
  def `yield`(args: js.Any*): Unit = js.native
  
  def yieldOn(obj: js.Any, args: js.Any*): Unit = js.native
  @JSName("yieldOn")
  var yieldOn_Original: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
  
  def yieldTo(property: String, args: js.Any*): Unit = js.native
  
  def yieldToOn(property: String, obj: js.Any, args: js.Any*): Unit = js.native
  @JSName("yieldToOn")
  var yieldToOn_Original: js.Function3[/* property */ String, /* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
  
  @JSName("yieldTo")
  var yieldTo_Original: js.Function2[/* property */ String, /* repeated */ js.Any, Unit] = js.native
  
  @JSName("yield")
  var yield_Original: js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  /**
    * Similar to callsArg.
    * Causes the stub to call the first callback it receives with the provided arguments (if any).
    * If a method accepts more than one callback, you need to use callsArg to have the stub invoke other callbacks than the first one.
    */
  def yields(args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param args
    */
  def yieldsAsync(args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Like above but with an additional parameter to pass the this context.
    */
  def yieldsOn(context: js.Any, args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param context
    * @param args
    */
  def yieldsOnAsync(context: js.Any, args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  def yieldsRight(args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Causes the spy to invoke a callback passed as a property of an object to the spy.
    * Like yields, yieldsTo grabs the first matching argument, finds the callback and calls it with the (optional) arguments.
    * @param property
    * @param args
    */
  def yieldsTo(property: String, args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param property
    * @param args
    */
  def yieldsToAsync(property: String, args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Like above but with an additional parameter to pass the this context.
    */
  def yieldsToOn(property: String, context: js.Any, args: js.Any*): SinonStub[js.Array[_], _] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param property
    * @param context
    * @param args
    */
  def yieldsToOnAsync(property: String, context: js.Any, args: js.Any*): SinonStub[js.Array[_], _] = js.native
}
