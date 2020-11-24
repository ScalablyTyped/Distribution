package typings.rcTrigger.interfaceMod

import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileConfig extends js.Object {
  
  var popupClassName: js.UndefOr[String] = js.native
  
  /** Set popup motion. You can ref `rc-motion` for more info. */
  var popupMotion: js.UndefOr[CSSMotionProps] = js.native
  
  var popupRender: js.UndefOr[js.Function1[/* originNode */ ReactNode, ReactNode]] = js.native
  
  var popupStyle: js.UndefOr[CSSProperties] = js.native
}
object MobileConfig {
  
  @scala.inline
  def apply(): MobileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileConfig]
  }
  
  @scala.inline
  implicit class MobileConfigOps[Self <: MobileConfig] (val x: Self) extends AnyVal {
    
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
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupClassName: Self = this.set("popupClassName", js.undefined)
    
    @scala.inline
    def setPopupMotion(value: CSSMotionProps): Self = this.set("popupMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupMotion: Self = this.set("popupMotion", js.undefined)
    
    @scala.inline
    def setPopupRender(value: /* originNode */ ReactNode => ReactNode): Self = this.set("popupRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePopupRender: Self = this.set("popupRender", js.undefined)
    
    @scala.inline
    def setPopupStyle(value: CSSProperties): Self = this.set("popupStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupStyle: Self = this.set("popupStyle", js.undefined)
  }
}
