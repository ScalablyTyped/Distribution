package typings
package reduxDashSagaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga", JSImport.Namespace)
@js.native
object reduxDashSagaMod extends js.Object {
  val CANCEL: java.lang.String = js.native
  val END: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.END = js.native
  val buffers: atReduxDashSagaCoreLib.Anon_Dropping = js.native
  def channel[T](): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Channel[T] = js.native
  def channel[T](buffer: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T]): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Channel[T] = js.native
  def default[C /* <: js.Object */](): atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.SagaMiddleware[C] = js.native
  def default[C /* <: js.Object */](options: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.SagaMiddlewareOptions[C]): atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.SagaMiddleware[C] = js.native
  def detach(forkEffect: atReduxDashSagaCoreLib.effectsMod.ForkEffect): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def eventChannel[T](subscribe: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.Subscribe[T]): atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.EventChannel[T] = js.native
  def eventChannel[T](
    subscribe: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.Subscribe[T],
    buffer: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T]
  ): atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.EventChannel[T] = js.native
  def eventChannel[T](
    subscribe: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.Subscribe[T],
    buffer: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T],
    matcher: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Predicate[T]
  ): atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.EventChannel[T] = js.native
  def multicastChannel[T](): atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.MulticastChannel[T] = js.native
  def runSaga[Action, State, S /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Saga[js.Array[_]] */](
    options: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.RunSagaOptions[Action, State],
    saga: S,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: stdLib.Parameters[S]
  ): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task = js.native
  def stdChannel[T](): atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.MulticastChannel[T] = js.native
}

