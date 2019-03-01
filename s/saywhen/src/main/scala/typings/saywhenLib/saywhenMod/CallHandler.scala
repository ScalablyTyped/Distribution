package typings
package saywhenLib.saywhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHandler[T /* <: saywhenLib.Func */] extends js.Object {
  val isCalled: Proxy[T]
  def isCalledWith(args: js.Any*): Proxy[T]
}

object CallHandler {
  @scala.inline
  def apply[T /* <: saywhenLib.Func */](isCalled: Proxy[T], isCalledWith: js.Function1[/* repeated */ js.Any, Proxy[T]]): CallHandler[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCalled")(isCalled)
    __obj.updateDynamic("isCalledWith")(isCalledWith)
    __obj.asInstanceOf[CallHandler[T]]
  }
}

