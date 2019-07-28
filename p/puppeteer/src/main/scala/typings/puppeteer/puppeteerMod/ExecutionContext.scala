package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionContext extends JSEvalable {
  def queryObjects(prototypeHandle: JSHandle): JSHandle
}

object ExecutionContext {
  @scala.inline
  def apply(
    evaluate: (js.Any, /* repeated */ SerializableOrJSHandle) => js.Promise[EvaluateFnReturnType[js.Any]],
    evaluateHandle: (js.Function1[/* repeated */ js.Any, _], /* repeated */ SerializableOrJSHandle) => js.Promise[JSHandle],
    queryObjects: JSHandle => JSHandle
  ): ExecutionContext = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), evaluateHandle = js.Any.fromFunction2(evaluateHandle), queryObjects = js.Any.fromFunction1(queryObjects))
  
    __obj.asInstanceOf[ExecutionContext]
  }
}

