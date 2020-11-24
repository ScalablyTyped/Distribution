package typings.rcTooltip.contentMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentProps extends js.Object {
  
  var id: String = js.native
  
  var overlay: js.Function0[ReactNode] | ReactNode = js.native
  
  var overlayInnerStyle: js.UndefOr[CSSProperties] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
}
object ContentProps {
  
  @scala.inline
  def apply(id: String): ContentProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentProps]
  }
  
  @scala.inline
  implicit class ContentPropsOps[Self <: ContentProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayFunction0(value: () => ReactNode): Self = this.set("overlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverlay(value: js.Function0[ReactNode] | ReactNode): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setOverlayInnerStyle(value: CSSProperties): Self = this.set("overlayInnerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayInnerStyle: Self = this.set("overlayInnerStyle", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
}
