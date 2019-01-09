package typings
package reduxDashSagaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arg extends js.Object {
  @JSName("array")
  var array_Original: reduxDashSagaLib.utilsMod.GuardPredicate[js.Array[_]] = js.native
  @JSName("buffer")
  var buffer_Original: reduxDashSagaLib.utilsMod.GuardPredicate[reduxDashSagaLib.reduxDashSagaMod.Buffer[_]] = js.native
  @JSName("channel")
  var channel_Original: reduxDashSagaLib.utilsMod.GuardPredicate[reduxDashSagaLib.reduxDashSagaMod.Channel[_]] = js.native
  @JSName("func")
  var func_Original: reduxDashSagaLib.utilsMod.GuardPredicate[js.Function] = js.native
  @JSName("helper")
  var helper_Original: reduxDashSagaLib.utilsMod.GuardPredicate[reduxDashSagaLib.reduxDashSagaMod.SagaIterator] = js.native
  @JSName("iterable")
  var iterable_Original: reduxDashSagaLib.utilsMod.GuardPredicate[nodeLib.Iterable[_]] = js.native
  @JSName("iterator")
  var iterator_Original: reduxDashSagaLib.utilsMod.GuardPredicate[nodeLib.Iterator[_]] = js.native
  @JSName("notUndef")
  var notUndef_Original: reduxDashSagaLib.utilsMod.GuardPredicate[_] = js.native
  @JSName("number")
  var number_Original: reduxDashSagaLib.utilsMod.GuardPredicate[scala.Double] = js.native
  @JSName("object")
  var object_Original: reduxDashSagaLib.utilsMod.GuardPredicate[js.Object] = js.native
  @JSName("observable")
  var observable_Original: reduxDashSagaLib.utilsMod.GuardPredicate[Anon_Subscribe] = js.native
  @JSName("pattern")
  var pattern_Original: reduxDashSagaLib.utilsMod.GuardPredicate[reduxDashSagaLib.effectsMod.Pattern] = js.native
  @JSName("promise")
  var promise_Original: reduxDashSagaLib.utilsMod.GuardPredicate[js.Promise[_]] = js.native
  @JSName("string")
  var string_Original: reduxDashSagaLib.utilsMod.GuardPredicate[java.lang.String] = js.native
  @JSName("stringableFunc")
  var stringableFunc_Original: reduxDashSagaLib.utilsMod.GuardPredicate[js.Function] = js.native
  @JSName("task")
  var task_Original: reduxDashSagaLib.utilsMod.GuardPredicate[reduxDashSagaLib.reduxDashSagaMod.Task] = js.native
  @JSName("undef")
  var undef_Original: reduxDashSagaLib.utilsMod.GuardPredicate[js.UndefOr[scala.Nothing]] = js.native
  def array(arg: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def buffer(arg: js.Any): /* is redux-saga.redux-saga.Buffer<any> */ scala.Boolean = js.native
  def channel(arg: js.Any): /* is redux-saga.redux-saga.Channel<any> */ scala.Boolean = js.native
  def func(arg: js.Any): /* is std.Function */ scala.Boolean = js.native
  def helper(arg: js.Any): /* is redux-saga.redux-saga.SagaIterator */ scala.Boolean = js.native
  def iterable(arg: js.Any): /* is node.Iterable<any> */ scala.Boolean = js.native
  def iterator(arg: js.Any): /* is node.Iterator<any> */ scala.Boolean = js.native
  def notUndef(arg: js.Any): /* is any */ scala.Boolean = js.native
  def number(arg: js.Any): /* is number */ scala.Boolean = js.native
  def `object`(arg: js.Any): /* is object */ scala.Boolean = js.native
  def observable(arg: js.Any): /* is redux-saga.Anon_Subscribe */ scala.Boolean = js.native
  def pattern(arg: js.Any): /* is redux-saga.redux-saga/effects.Pattern */ scala.Boolean = js.native
  def promise(arg: js.Any): /* is std.Promise<any> */ scala.Boolean = js.native
  def string(arg: js.Any): /* is string */ scala.Boolean = js.native
  def stringableFunc(arg: js.Any): /* is std.Function */ scala.Boolean = js.native
  def task(arg: js.Any): /* is redux-saga.redux-saga.Task */ scala.Boolean = js.native
  def undef(arg: js.Any): /* is undefined */ scala.Boolean = js.native
}

