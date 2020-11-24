package typings.smoothScrollbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollIntoViewOptions> */
@js.native
trait PartialScrollIntoViewOpti extends js.Object {
  
  var alignToTop: js.UndefOr[Boolean] = js.native
  
  var offsetBottom: js.UndefOr[Double] = js.native
  
  var offsetLeft: js.UndefOr[Double] = js.native
  
  var offsetTop: js.UndefOr[Double] = js.native
  
  var onlyScrollIfNeeded: js.UndefOr[Boolean] = js.native
}
object PartialScrollIntoViewOpti {
  
  @scala.inline
  def apply(): PartialScrollIntoViewOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollIntoViewOpti]
  }
  
  @scala.inline
  implicit class PartialScrollIntoViewOptiOps[Self <: PartialScrollIntoViewOpti] (val x: Self) extends AnyVal {
    
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
    def setAlignToTop(value: Boolean): Self = this.set("alignToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignToTop: Self = this.set("alignToTop", js.undefined)
    
    @scala.inline
    def setOffsetBottom(value: Double): Self = this.set("offsetBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetBottom: Self = this.set("offsetBottom", js.undefined)
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetLeft: Self = this.set("offsetLeft", js.undefined)
    
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    
    @scala.inline
    def setOnlyScrollIfNeeded(value: Boolean): Self = this.set("onlyScrollIfNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyScrollIfNeeded: Self = this.set("onlyScrollIfNeeded", js.undefined)
  }
}
