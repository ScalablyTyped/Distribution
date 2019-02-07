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

