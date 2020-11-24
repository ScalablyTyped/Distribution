package typings.reactCustomScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomScrollProps extends js.Object {
  
  var addScrolledClass: js.UndefOr[Boolean] = js.native
  
  var allowOuterScroll: js.UndefOr[Boolean] = js.native
  
  var flex: js.UndefOr[Double | String] = js.native
  
  var freezePosition: js.UndefOr[Boolean] = js.native
  
  var heightRelativeToParent: js.UndefOr[String] = js.native
  
  var keepAtBottom: js.UndefOr[Boolean] = js.native
  
  var minScrollHandleHeight: js.UndefOr[Double] = js.native
  
  var onScoll: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], _]] = js.native
  
  var rtl: js.UndefOr[Boolean] = js.native
  
  var scrollTo: js.UndefOr[Double] = js.native
}
object CustomScrollProps {
  
  @scala.inline
  def apply(): CustomScrollProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomScrollProps]
  }
  
  @scala.inline
  implicit class CustomScrollPropsOps[Self <: CustomScrollProps] (val x: Self) extends AnyVal {
    
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
    def setAddScrolledClass(value: Boolean): Self = this.set("addScrolledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddScrolledClass: Self = this.set("addScrolledClass", js.undefined)
    
    @scala.inline
    def setAllowOuterScroll(value: Boolean): Self = this.set("allowOuterScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOuterScroll: Self = this.set("allowOuterScroll", js.undefined)
    
    @scala.inline
    def setFlex(value: Double | String): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    
    @scala.inline
    def setFreezePosition(value: Boolean): Self = this.set("freezePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreezePosition: Self = this.set("freezePosition", js.undefined)
    
    @scala.inline
    def setHeightRelativeToParent(value: String): Self = this.set("heightRelativeToParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightRelativeToParent: Self = this.set("heightRelativeToParent", js.undefined)
    
    @scala.inline
    def setKeepAtBottom(value: Boolean): Self = this.set("keepAtBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAtBottom: Self = this.set("keepAtBottom", js.undefined)
    
    @scala.inline
    def setMinScrollHandleHeight(value: Double): Self = this.set("minScrollHandleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScrollHandleHeight: Self = this.set("minScrollHandleHeight", js.undefined)
    
    @scala.inline
    def setOnScoll(value: /* e */ js.UndefOr[js.Any] => _): Self = this.set("onScoll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScoll: Self = this.set("onScoll", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setScrollTo(value: Double): Self = this.set("scrollTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
  }
}
