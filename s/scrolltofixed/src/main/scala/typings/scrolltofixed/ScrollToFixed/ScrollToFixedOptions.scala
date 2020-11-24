package typings.scrolltofixed.ScrollToFixed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollToFixedOptions extends js.Object {
  
  var baseClassName: js.UndefOr[String] = js.native
  
  var bottom: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var dontCheckForPositionFixedSupport: js.UndefOr[Boolean] = js.native
  
  var dontSetWidth: js.UndefOr[Boolean] = js.native
  
  var fixed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var limit: js.UndefOr[Double | js.Function0[Double]] = js.native
  
  var marginTop: js.UndefOr[Double | js.Function0[Double]] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var offsets: js.UndefOr[Boolean] = js.native
  
  var postAbsolute: js.UndefOr[js.Function0[Unit]] = js.native
  
  var postFixed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var postUnfixed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var preAbsolute: js.UndefOr[js.Function0[Unit]] = js.native
  
  var preFixed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var preUnfixed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removeOffsets: js.UndefOr[Boolean] = js.native
  
  var spacerClass: js.UndefOr[String] = js.native
  
  var unfixed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object ScrollToFixedOptions {
  
  @scala.inline
  def apply(): ScrollToFixedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToFixedOptions]
  }
  
  @scala.inline
  implicit class ScrollToFixedOptionsOps[Self <: ScrollToFixedOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseClassName(value: String): Self = this.set("baseClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseClassName: Self = this.set("baseClassName", js.undefined)
    
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDontCheckForPositionFixedSupport(value: Boolean): Self = this.set("dontCheckForPositionFixedSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontCheckForPositionFixedSupport: Self = this.set("dontCheckForPositionFixedSupport", js.undefined)
    
    @scala.inline
    def setDontSetWidth(value: Boolean): Self = this.set("dontSetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontSetWidth: Self = this.set("dontSetWidth", js.undefined)
    
    @scala.inline
    def setFixed(value: () => Unit): Self = this.set("fixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setLimitFunction0(value: () => Double): Self = this.set("limit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLimit(value: Double | js.Function0[Double]): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMarginTopFunction0(value: () => Double): Self = this.set("marginTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarginTop(value: Double | js.Function0[Double]): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setOffsets(value: Boolean): Self = this.set("offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsets: Self = this.set("offsets", js.undefined)
    
    @scala.inline
    def setPostAbsolute(value: () => Unit): Self = this.set("postAbsolute", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePostAbsolute: Self = this.set("postAbsolute", js.undefined)
    
    @scala.inline
    def setPostFixed(value: () => Unit): Self = this.set("postFixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePostFixed: Self = this.set("postFixed", js.undefined)
    
    @scala.inline
    def setPostUnfixed(value: () => Unit): Self = this.set("postUnfixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePostUnfixed: Self = this.set("postUnfixed", js.undefined)
    
    @scala.inline
    def setPreAbsolute(value: () => Unit): Self = this.set("preAbsolute", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePreAbsolute: Self = this.set("preAbsolute", js.undefined)
    
    @scala.inline
    def setPreFixed(value: () => Unit): Self = this.set("preFixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePreFixed: Self = this.set("preFixed", js.undefined)
    
    @scala.inline
    def setPreUnfixed(value: () => Unit): Self = this.set("preUnfixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePreUnfixed: Self = this.set("preUnfixed", js.undefined)
    
    @scala.inline
    def setRemoveOffsets(value: Boolean): Self = this.set("removeOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveOffsets: Self = this.set("removeOffsets", js.undefined)
    
    @scala.inline
    def setSpacerClass(value: String): Self = this.set("spacerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacerClass: Self = this.set("spacerClass", js.undefined)
    
    @scala.inline
    def setUnfixed(value: () => Unit): Self = this.set("unfixed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnfixed: Self = this.set("unfixed", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
