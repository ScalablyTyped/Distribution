package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExecutionContext extends js.Object {
  def evaluate(fn: EvaluateFn, args: js.Any*): stdLib.Promise[_]
  def evaluateHandle(fn: EvaluateFn, args: js.Any*): stdLib.Promise[JSHandle]
  def queryObjects(prototypeHandle: JSHandle): JSHandle
}

