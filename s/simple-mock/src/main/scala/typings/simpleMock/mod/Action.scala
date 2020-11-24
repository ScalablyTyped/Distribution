package typings.simpleMock.mod

import typings.std.ArrayLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action[T] extends js.Object {
  
  /**
    * arguments to call back with
    */
  var cbArgs: ArrayLike[_] = js.native
  
  var returnValue: T = js.native
  
  var throwError: Error = js.native
}
object Action {
  
  @scala.inline
  def apply[T](cbArgs: ArrayLike[_], returnValue: T, throwError: Error): Action[T] = {
    val __obj = js.Dynamic.literal(cbArgs = cbArgs.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], throwError = throwError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
  
  @scala.inline
  implicit class ActionOps[Self <: Action[_], T] (val x: Self with Action[T]) extends AnyVal {
    
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
    def setCbArgs(value: ArrayLike[_]): Self = this.set("cbArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: T): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowError(value: Error): Self = this.set("throwError", value.asInstanceOf[js.Any])
  }
}
