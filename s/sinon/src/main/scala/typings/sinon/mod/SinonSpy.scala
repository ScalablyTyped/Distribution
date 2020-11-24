package typings.sinon.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<sinon.sinon.SinonSpyCallApi<TArgs, TReturnValue>, std.Exclude<keyof sinon.sinon.SinonSpyCallApi<TArgs, TReturnValue>, 'args'>> */
@js.native
trait SinonSpy[TArgs /* <: js.Array[_] */, TReturnValue] extends js.Object {
  
  // Methods
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): TReturnValue = js.native
  
  /**
    * Returns true if the spy was always called with @param obj as this.
    * @param obj
    */
  def alwaysCalledOn(obj: js.Any): Boolean = js.native
  
  /**
    * Returns true if spy was always called with the provided arguments (and possibly others).
    */
  def alwaysCalledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  
  /**
    * Returns true if spy was always called with the exact provided arguments.
    * @param args
    */
  def alwaysCalledWithExactly(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  
  /**
    * Returns true if spy was always called with matching arguments (and possibly others).
    * This behaves the same as spy.alwaysCalledWith(sinon.match(arg1), sinon.match(arg2), ...).
    * @param args
    */
  def alwaysCalledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
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
  var args: js.Array[TArgs] = js.native
  
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
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  
  def calledOnceWithExactly(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  @JSName("calledOnceWithExactly")
  var calledOnceWithExactly_Original: js.Function1[/* args */ MatchArguments[TArgs], Boolean] = js.native
  
  @JSName("calledOnceWith")
  var calledOnceWith_Original: js.Function1[/* args */ MatchArguments[TArgs], Boolean] = js.native
  
  /**
    * true if the spy was called exactly thrice
    */
  var calledThrice: Boolean = js.native
  
  /**
    * true if the spy was called exactly twice
    */
  var calledTwice: Boolean = js.native
  
  def calledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Partial<MatchArguments<TArgs>> is not an array type */ args: Partial[MatchArguments[TArgs]]
  ): Boolean = js.native
  
  def calledWithExactly(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  @JSName("calledWithExactly")
  var calledWithExactly_Original: js.Function1[/* args */ MatchArguments[TArgs], Boolean] = js.native
  
  def calledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Boolean = js.native
  @JSName("calledWithMatch")
  var calledWithMatch_Original: js.Function1[/* args */ TArgs, Boolean] = js.native
  
  def calledWithNew(): Boolean = js.native
  @JSName("calledWithNew")
  var calledWithNew_Original: js.Function0[Boolean] = js.native
  
  @JSName("calledWith")
  var calledWith_Original: js.Function1[/* args */ Partial[MatchArguments[TArgs]], Boolean] = js.native
  
  /**
    * Array of exception objects thrown, spy.exceptions[0] is the exception thrown by the first call.
    * If the call did not throw an error, the value at the call’s location in .exceptions will be undefined.
    */
  var exceptions: js.Array[_] = js.native
  
  /**
    * The first call
    */
  var firstCall: SinonSpyCall[TArgs, TReturnValue] = js.native
  
  /**
    * Returns the nth call.
    * Accessing individual calls helps with more detailed behavior verification when the spy is called more than once.
    * @param n Zero based index of the spy call.
    */
  def getCall(n: Double): SinonSpyCall[TArgs, TReturnValue] = js.native
  
  /**
    * Returns an Array of all calls recorded by the spy.
    */
  def getCalls(): js.Array[SinonSpyCall[TArgs, TReturnValue]] = js.native
  
  /**
    * Invoke callbacks passed to the stub with the given arguments.
    * If the stub was never called with a function argument, yield throws an error.
    * Returns an Array with all callbacks return values in the order they were called, if no error is thrown.
    */
  def invokeCallback(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Unit = js.native
  
  /**
    * The last call
    */
  var lastCall: SinonSpyCall[TArgs, TReturnValue] = js.native
  
  /**
    * Set the displayName of the spy or stub.
    * @param name
    */
  def named(name: String): SinonSpy[TArgs, TReturnValue] = js.native
  
  /**
    * Returns true if the spy/stub was never called with the provided arguments.
    * @param args
    */
  def neverCalledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  
  /**
    * Returns true if the spy/stub was never called with matching arguments.
    * This behaves the same as spy.neverCalledWith(sinon.match(arg1), sinon.match(arg2), ...).
    * @param args
    */
  def neverCalledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Boolean = js.native
  
  /**
    * true if the spy was not called
    */
  var notCalled: Boolean = js.native
  
  def notCalledWith(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Boolean = js.native
  
  def notCalledWithMatch(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Boolean = js.native
  @JSName("notCalledWithMatch")
  var notCalledWithMatch_Original: js.Function1[/* args */ TArgs, Boolean] = js.native
  
  @JSName("notCalledWith")
  var notCalledWith_Original: js.Function1[/* args */ MatchArguments[TArgs], Boolean] = js.native
  
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
    * Resets the state of a spy.
    */
  def resetHistory(): Unit = js.native
  
  /**
    * Replaces the spy with the original method. Only available if the spy replaced an existing method.
    */
  def restore(): Unit = js.native
  
  /**
    * Array of return values, spy.returnValues[0] is the return value of the first call.
    * If the call did not explicitly return a value, the value at the call’s location in .returnValues will be undefined.
    */
  var returnValues: js.Array[TReturnValue] = js.native
  
  def returned(value: TReturnValue): Boolean = js.native
  def returned(value: SinonMatcher): Boolean = js.native
  @JSName("returned")
  var returned_Original: js.Function1[/* value */ TReturnValue | SinonMatcher, Boolean] = js.native
  
  /**
    * The second call
    */
  var secondCall: SinonSpyCall[TArgs, TReturnValue] = js.native
  
  /**
    * The third call
    */
  var thirdCall: SinonSpyCall[TArgs, TReturnValue] = js.native
  
  /**
    * Array of this objects, spy.thisValues[0] is the this object for the first call.
    */
  var thisValues: js.Array[_] = js.native
  
  def threw(): Boolean = js.native
  @JSName("threw")
  var threw_Original: js.Function0[Boolean] = js.native
  
  /**
    * Creates a spy that only records calls when the received arguments match those passed to withArgs.
    * This is useful to be more expressive in your assertions, where you can access the spy with the same call.
    * @param args Expected args
    */
  def withArgs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): SinonSpy[TArgs, TReturnValue] = js.native
  
  /**
    * Holds a reference to the original method/function this stub has wrapped.
    */
  def wrappedMethod(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): TReturnValue = js.native
  
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
}
