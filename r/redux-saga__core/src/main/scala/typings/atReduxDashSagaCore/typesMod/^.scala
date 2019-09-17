package typings.atReduxDashSagaCore.typesMod

import typings.atReduxDashSagaCore.typesEffectsMod.ForkEffect
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CANCEL: String = js.native
  val END: typings.atReduxDashSagaCore.typesMod.END = js.native
  def channel[T](): js.Any = js.native
  def channel[T](buffer: typings.node.Buffer): js.Any = js.native
  def default[C /* <: js.Object */](): SagaMiddleware[C] = js.native
  def default[C /* <: js.Object */](options: SagaMiddlewareOptions[C]): SagaMiddleware[C] = js.native
  def detach(forkEffect: ForkEffect): ForkEffect = js.native
  def eventChannel[T](subscribe: Subscribe[T]): EventChannel[T] = js.native
  def eventChannel[T](subscribe: Subscribe[T], buffer: typings.node.Buffer): EventChannel[T] = js.native
  def multicastChannel[T](): MulticastChannel[T] = js.native
  def runSaga[Action, State, S /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Saga */ js.Any */](
    options: RunSagaOptions[Action, State],
    saga: S,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: Parameters[S]
  ): js.Any = js.native
  def stdChannel[T](): MulticastChannel[T] = js.native
}

