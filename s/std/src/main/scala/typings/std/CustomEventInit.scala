package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventInit[T] extends EventInit {
  
  var detail: js.UndefOr[T] = js.native
}
object CustomEventInit {
  
  @scala.inline
  def apply[T](): CustomEventInit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventInit[T]]
  }
  
  @scala.inline
  implicit class CustomEventInitOps[Self <: CustomEventInit[_], T] (val x: Self with CustomEventInit[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetail(value: T): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
  }
}
