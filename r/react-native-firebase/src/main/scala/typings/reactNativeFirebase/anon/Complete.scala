package typings.reactNativeFirebase.anon

import typings.reactNativeFirebase.mod.RNFirebase.ErrorHandler
import typings.reactNativeFirebase.mod.RNFirebase.Handler
import typings.reactNativeFirebase.mod.RNFirebase.RnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complete[T] extends js.Object {
  
  var complete: js.UndefOr[Handler[T]] = js.native
  
  var error: js.UndefOr[ErrorHandler] = js.native
  
  var next: js.UndefOr[Handler[T]] = js.native
}
object Complete {
  
  @scala.inline
  def apply[T](): Complete[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete[T]]
  }
  
  @scala.inline
  implicit class CompleteOps[Self <: Complete[_], T] (val x: Self with Complete[T]) extends AnyVal {
    
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
    def setComplete(value: T => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setError(value: RnError => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setNext(value: T => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
}
