package typings.reduxDashSaga

import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.EventChannel
import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.MulticastChannel
import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.RunSagaOptions
import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.SagaMiddleware
import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.SagaMiddlewareOptions
import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.Subscribe
import typings.atReduxDashSagaCore.effectsMod.ForkEffect
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Buffer
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Channel
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Saga
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Task
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga", JSImport.Namespace)
@js.native
object reduxDashSagaMod extends js.Object {
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
  @js.native
  object buffers extends js.Object {
    /**
      * Same as `fixed` but Overflow will silently drop the messages.
      */
    def dropping[T](): Buffer[T] = js.native
    def dropping[T](limit: Double): Buffer[T] = js.native
    /**
      * Like `fixed` but Overflow will cause the buffer to expand dynamically.
      */
    def expanding[T](): Buffer[T] = js.native
    def expanding[T](limit: Double): Buffer[T] = js.native
    /**
      * New messages will be buffered up to `limit`. Overflow will raise an Error.
      * Omitting a `limit` value will result in a limit of 10.
      */
    def fixed[T](): Buffer[T] = js.native
    def fixed[T](limit: Double): Buffer[T] = js.native
    /**
      * No buffering, new messages will be lost if there are no pending takers
      */
    def none[T](): Buffer[T] = js.native
    /**
      * Same as `fixed` but Overflow will insert the new message at the end and
      * drop the oldest message in the buffer.
      */
    def sliding[T](): Buffer[T] = js.native
    def sliding[T](limit: Double): Buffer[T] = js.native
  }
  
}

