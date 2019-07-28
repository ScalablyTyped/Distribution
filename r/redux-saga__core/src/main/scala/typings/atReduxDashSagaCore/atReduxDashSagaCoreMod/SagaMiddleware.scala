package typings.atReduxDashSagaCore.atReduxDashSagaCoreMod

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Saga
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Task
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.std.Parameters
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SagaMiddleware[C /* <: js.Object */]
  extends Middleware[js.Object, js.Any, Dispatch[AnyAction]] {
  /**
    * Dynamically run `saga`. Can be used to run Sagas **only after** the
    * `applyMiddleware` phase.
    *
    * The method returns a `Task` descriptor.
    *
    * #### Notes
    *
    * `saga` must be a function which returns a [Generator
    * Object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Generator).
    * The middleware will then iterate over the Generator and execute all yielded
    * Effects.
    *
    * `saga` may also start other sagas using the various Effects provided by the
    * library. The iteration process described below is also applied to all child
    * sagas.
    *
    * In the first iteration, the middleware invokes the `next()` method to
    * retrieve the next Effect. The middleware then executes the yielded Effect
    * as specified by the Effects API below. Meanwhile, the Generator will be
    * suspended until the effect execution terminates. Upon receiving the result
    * of the execution, the middleware calls `next(result)` on the Generator
    * passing it the retrieved result as an argument. This process is repeated
    * until the Generator terminates normally or by throwing some error.
    *
    * If the execution results in an error (as specified by each Effect creator)
    * then the `throw(error)` method of the Generator is called instead. If the
    * Generator function defines a `try/catch` surrounding the current yield
    * instruction, then the `catch` block will be invoked by the underlying
    * Generator runtime. The runtime will also invoke any corresponding finally
    * block.
    *
    * In the case a Saga is cancelled (either manually or using the provided
    * Effects), the middleware will invoke `return()` method of the Generator.
    * This will cause the Generator to skip directly to the finally block.
    *
    * @param saga a Generator function
    * @param args arguments to be provided to `saga`
    */
  def run[S /* <: Saga[js.Array[_]] */](
    saga: S,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<S> is not an array type */ args: Parameters[S]
  ): Task = js.native
  def setContext(props: Partial[C]): Unit = js.native
}

