package typings.simpleMock.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calls[T] extends js.Object {
  /**
    * first argument
    */
  var arg: js.Any
  /**
    * an array of arguments received on the call
    */
  var args: js.Array[_]
  /**
    * the context (this) of the call
    */
  var context: js.Any
  /**
    * autoincrementing number, can be compared to evaluate call order
    */
  var k: Double
  /**
    * the value returned by the wrapped function
    */
  var returned: T
  /**
    * the error thrown by the wrapped function
    */
  var threw: Error
}

object Calls {
  @scala.inline
  def apply[T](arg: js.Any, args: js.Array[_], context: js.Any, k: Double, returned: T, threw: Error): Calls[T] = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], returned = returned.asInstanceOf[js.Any], threw = threw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calls[T]]
  }
}

