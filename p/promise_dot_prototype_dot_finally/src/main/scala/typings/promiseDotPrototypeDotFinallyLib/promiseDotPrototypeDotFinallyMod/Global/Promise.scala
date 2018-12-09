package typings
package promiseDotPrototypeDotFinallyLib.promiseDotPrototypeDotFinallyMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  def `finally`[U](): Promise[T] = js.native
  def `finally`[U](onFinally: js.Function0[U | js.Thenable[U]]): Promise[T] = js.native
}

