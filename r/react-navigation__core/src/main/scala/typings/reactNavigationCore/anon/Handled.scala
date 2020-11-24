package typings.reactNavigationCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handled[T] extends js.Object {
  
  var handled: Boolean = js.native
  
  var result: T = js.native
}
object Handled {
  
  @scala.inline
  def apply[T](handled: Boolean, result: T): Handled[T] = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handled[T]]
  }
  
  @scala.inline
  implicit class HandledOps[Self <: Handled[_], T] (val x: Self with Handled[T]) extends AnyVal {
    
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
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: T): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
