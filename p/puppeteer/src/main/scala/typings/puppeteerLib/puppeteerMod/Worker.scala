package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Worker extends JSEvalable {
  def executionContext(): js.Promise[ExecutionContext]
  def url(): java.lang.String
}

object Worker {
  @scala.inline
  def apply(
    evaluate: (js.Any, /* repeated */ SerializableOrJSHandle) => js.Promise[EvaluateFnReturnType[js.Any]],
    evaluateHandle: (js.Function1[/* repeated */ js.Any, _], /* repeated */ SerializableOrJSHandle) => js.Promise[JSHandle],
    executionContext: () => js.Promise[ExecutionContext],
    url: () => java.lang.String
  ): Worker = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), evaluateHandle = js.Any.fromFunction2(evaluateHandle), executionContext = js.Any.fromFunction0(executionContext), url = js.Any.fromFunction0(url))
  
    __obj.asInstanceOf[Worker]
  }
}

