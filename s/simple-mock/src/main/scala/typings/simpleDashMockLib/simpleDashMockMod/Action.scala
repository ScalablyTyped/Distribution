package typings
package simpleDashMockLib.simpleDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[T] extends js.Object {
  /**
    * arguments to call back with
    */
  var cbArgs: stdLib.ArrayLike[_]
  var returnValue: T
  var throwError: stdLib.Error
}

object Action {
  @scala.inline
  def apply[T](cbArgs: stdLib.ArrayLike[_], returnValue: T, throwError: stdLib.Error): Action[T] = {
    val __obj = js.Dynamic.literal(cbArgs = cbArgs, returnValue = returnValue.asInstanceOf[js.Any], throwError = throwError)
  
    __obj.asInstanceOf[Action[T]]
  }
}

