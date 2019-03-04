package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionContext extends js.Object {
  def evaluate[F /* <: EvaluateFn */](fn: F, args: SerializableOrJSHandle*): js.Promise[EvaluateFnReturnType[F]]
  def evaluateHandle(fn: EvaluateFn, args: SerializableOrJSHandle*): js.Promise[JSHandle]
  def queryObjects(prototypeHandle: JSHandle): JSHandle
}

object ExecutionContext {
  @scala.inline
  def apply(
    evaluate: js.Function2[
      js.Any, 
      /* repeated */ SerializableOrJSHandle, 
      js.Promise[EvaluateFnReturnType[js.Any]]
    ],
    evaluateHandle: js.Function2[EvaluateFn, /* repeated */ SerializableOrJSHandle, js.Promise[JSHandle]],
    queryObjects: js.Function1[JSHandle, JSHandle]
  ): ExecutionContext = {
    val __obj = js.Dynamic.literal(evaluate = evaluate, evaluateHandle = evaluateHandle, queryObjects = queryObjects)
  
    __obj.asInstanceOf[ExecutionContext]
  }
}

