package typings.reactIntl.anon

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardedRef extends js.Object {
  
  var forwardedRef: js.UndefOr[Ref[_]] = js.native
}
object ForwardedRef {
  
  @scala.inline
  def apply(): ForwardedRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedRef]
  }
  
  @scala.inline
  implicit class ForwardedRefOps[Self <: ForwardedRef] (val x: Self) extends AnyVal {
    
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
    def setForwardedRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("forwardedRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForwardedRef(value: Ref[_]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
    
    @scala.inline
    def setForwardedRefNull: Self = this.set("forwardedRef", null)
  }
}
