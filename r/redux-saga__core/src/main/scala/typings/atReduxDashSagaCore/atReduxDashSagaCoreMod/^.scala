package typings.atReduxDashSagaCore.atReduxDashSagaCoreMod

import typings.atReduxDashSagaCore.effectsMod.ForkEffect
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Buffer
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Channel
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Saga
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Task
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CANCEL: String = js.native
  val END: typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.END = js.native
  def channel[T](): Channel[T] = js.native
  def channel[T](buffer: Buffer[T]): Channel[T] = js.native
  def default[C /* <: js.Object */](): SagaMiddleware[C] = js.native
  def default[C /* <: js.Object */](options: SagaMiddlewareOptions[C]): SagaMiddleware[C] = js.native
  def detach(forkEffect: ForkEffect): ForkEffect = js.native
  def eventChannel[T](subscribe: Subscribe[T]): EventChannel[T] = js.native
  def eventChannel[T](subscribe: Subscribe[T], buffer: Buffer[T]): EventChannel[T] = js.native
  def multicastChannel[T](): MulticastChannel[T] = js.native
  def runSaga[Action, State, S /* <: Saga[js.Array[_]] */](
    options: RunSagaOptions[Action, State],
    saga: S,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: Parameters[S]
  ): Task = js.native
  def stdChannel[T](): MulticastChannel[T] = js.native
}

