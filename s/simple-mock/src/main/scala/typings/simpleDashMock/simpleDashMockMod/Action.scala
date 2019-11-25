package typings.simpleDashMock.simpleDashMockMod

import typings.std.ArrayLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T] extends js.Object {
  /**
    * arguments to call back with
    */
  var cbArgs: ArrayLike[_]
  var returnValue: T
  var throwError: Error
}

object Action {
  @scala.inline
  def apply[T](cbArgs: ArrayLike[_], returnValue: T, throwError: Error): Action[T] = {
    val __obj = js.Dynamic.literal(cbArgs = cbArgs.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], throwError = throwError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Action[T]]
  }
}

