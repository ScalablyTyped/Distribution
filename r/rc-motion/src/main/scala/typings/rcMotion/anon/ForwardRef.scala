package typings.rcMotion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardRef extends js.Object {
  
  /** @deprecated, no need this anymore since `rc-motion` only support latest react */
  var forwardRef: js.UndefOr[Boolean] = js.native
  
  var transitionSupport: js.UndefOr[Boolean] = js.native
}
object ForwardRef {
  
  @scala.inline
  def apply(): ForwardRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardRef]
  }
  
  @scala.inline
  implicit class ForwardRefOps[Self <: ForwardRef] (val x: Self) extends AnyVal {
    
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
    def setForwardRef(value: Boolean): Self = this.set("forwardRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardRef: Self = this.set("forwardRef", js.undefined)
    
    @scala.inline
    def setTransitionSupport(value: Boolean): Self = this.set("transitionSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionSupport: Self = this.set("transitionSupport", js.undefined)
  }
}
