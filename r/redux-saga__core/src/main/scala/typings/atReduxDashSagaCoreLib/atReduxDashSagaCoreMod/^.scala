package typings
package atReduxDashSagaCoreLib.atReduxDashSagaCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CANCEL: java.lang.String = js.native
  val END: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.END = js.native
  val buffers: atReduxDashSagaCoreLib.Anon_Dropping = js.native
  def channel[T](): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Channel[T] = js.native
  def channel[T](buffer: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T]): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Channel[T] = js.native
  def default[C /* <: js.Object */](): SagaMiddleware[C] = js.native
  def default[C /* <: js.Object */](options: SagaMiddlewareOptions[C]): SagaMiddleware[C] = js.native
  def detach(forkEffect: atReduxDashSagaCoreLib.effectsMod.ForkEffect): atReduxDashSagaCoreLib.effectsMod.ForkEffect = js.native
  def eventChannel[T](subscribe: Subscribe[T]): EventChannel[T] = js.native
  def eventChannel[T](subscribe: Subscribe[T], buffer: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T]): EventChannel[T] = js.native
  def multicastChannel[T](): MulticastChannel[T] = js.native
  def runSaga[Action, State, S /* <: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Saga[js.Array[_]] */](
    options: RunSagaOptions[Action, State],
    saga: S,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: stdLib.Parameters[S]
  ): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Task = js.native
  def stdChannel[T](): MulticastChannel[T] = js.native
}

