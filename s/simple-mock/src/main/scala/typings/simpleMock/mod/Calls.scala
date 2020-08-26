package typings.simpleMock.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calls[T] extends js.Object {
  /**
    * first argument
    */
  var arg: js.Any = js.native
  /**
    * an array of arguments received on the call
    */
  var args: js.Array[_] = js.native
  /**
    * the context (this) of the call
    */
  var context: js.Any = js.native
  /**
    * autoincrementing number, can be compared to evaluate call order
    */
  var k: Double = js.native
  /**
    * the value returned by the wrapped function
    */
  var returned: T = js.native
  /**
    * the error thrown by the wrapped function
    */
  var threw: Error = js.native
}

object Calls {
  @scala.inline
  def apply[T](arg: js.Any, args: js.Array[_], context: js.Any, k: Double, returned: T, threw: Error): Calls[T] = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], returned = returned.asInstanceOf[js.Any], threw = threw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calls[T]]
  }
  @scala.inline
  implicit class CallsOps[Self <: Calls[_], T] (val x: Self with Calls[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArg(value: js.Any): Self = this.set("arg", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setK(value: Double): Self = this.set("k", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturned(value: T): Self = this.set("returned", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrew(value: Error): Self = this.set("threw", value.asInstanceOf[js.Any])
  }
  
}

