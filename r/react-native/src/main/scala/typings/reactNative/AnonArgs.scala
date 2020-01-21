package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgs extends js.Object {
  def cancel(): Unit = js.native
  def done(args: js.Any*): js.Any = js.native
  def `then`(): js.Promise[_] = js.native
  def `then`(onfulfilled: js.Function0[_]): js.Promise[_] = js.native
  def `then`(onfulfilled: js.Function0[_], onrejected: js.Function0[_]): js.Promise[_] = js.native
}

