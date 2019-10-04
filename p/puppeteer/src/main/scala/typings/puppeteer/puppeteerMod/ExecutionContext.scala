package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionContext
  extends JSEvalable[js.Any] {
  def queryObjects(prototypeHandle: JSHandle[_]): JSHandle[_]
}

object ExecutionContext {
  @scala.inline
  def apply(
    evaluate: (js.Any, /* repeated */ SerializableOrJSHandle) => js.Promise[EvaluateFnReturnType[js.Any]],
    evaluateHandle: (js.Function2[js.Any, /* repeated */ js.Any, _], /* repeated */ SerializableOrJSHandle) => js.Promise[JSHandle[_]],
    queryObjects: JSHandle[_] => JSHandle[_]
  ): ExecutionContext = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), evaluateHandle = js.Any.fromFunction2(evaluateHandle), queryObjects = js.Any.fromFunction1(queryObjects))
  
    __obj.asInstanceOf[ExecutionContext]
  }
}

