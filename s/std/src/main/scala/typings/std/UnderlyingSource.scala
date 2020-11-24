package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlyingSource[R] extends js.Object {
  
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.native
  
  var pull: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.native
  
  var start: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.native
  
  var `type`: js.UndefOr[scala.Nothing] = js.native
}
object UnderlyingSource {
  
  @scala.inline
  def apply[R](): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
  
  @scala.inline
  implicit class UnderlyingSourceOps[Self <: UnderlyingSource[_], R] (val x: Self with UnderlyingSource[R]) extends AnyVal {
    
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
    def setCancel(value: /* reason */ js.Any => Unit | js.Thenable[Unit]): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setPull(value: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit]): Self = this.set("pull", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    
    @scala.inline
    def setStart(value: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit]): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
