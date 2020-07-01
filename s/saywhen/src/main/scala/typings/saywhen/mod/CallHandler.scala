package typings.saywhen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHandler[T /* <: Func */] extends js.Object {
  val isCalled: Proxy[T]
  def isCalledWith(args: js.Any*): Proxy[T]
}

object CallHandler {
  @scala.inline
  def apply[/* <: typings.saywhen.mod.Func */ T](isCalled: Proxy[T], isCalledWith: /* repeated */ js.Any => Proxy[T]): CallHandler[T] = {
    val __obj = js.Dynamic.literal(isCalled = isCalled.asInstanceOf[js.Any], isCalledWith = js.Any.fromFunction1(isCalledWith))
    __obj.asInstanceOf[CallHandler[T]]
  }
}

