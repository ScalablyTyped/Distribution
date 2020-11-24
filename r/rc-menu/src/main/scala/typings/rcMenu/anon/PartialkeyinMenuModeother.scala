package typings.rcMenu.anon

import typings.rcMotion.cssmotionMod.CSSMotionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{[ key in rc-menu.rc-menu/es/interface.MenuMode | 'other' ]: rc-motion.rc-motion.CSSMotionProps}> */
@js.native
trait PartialkeyinMenuModeother extends js.Object {
  
  var horizontal: js.UndefOr[CSSMotionProps] = js.native
  
  var `inline`: js.UndefOr[CSSMotionProps] = js.native
  
  var other: js.UndefOr[CSSMotionProps] = js.native
  
  var vertical: js.UndefOr[CSSMotionProps] = js.native
  
  var `vertical-left`: js.UndefOr[CSSMotionProps] = js.native
  
  var `vertical-right`: js.UndefOr[CSSMotionProps] = js.native
}
object PartialkeyinMenuModeother {
  
  @scala.inline
  def apply(): PartialkeyinMenuModeother = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialkeyinMenuModeother]
  }
  
  @scala.inline
  implicit class PartialkeyinMenuModeotherOps[Self <: PartialkeyinMenuModeother] (val x: Self) extends AnyVal {
    
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
    def setHorizontal(value: CSSMotionProps): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setInline(value: CSSMotionProps): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setOther(value: CSSMotionProps): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    
    @scala.inline
    def setVertical(value: CSSMotionProps): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def `setVertical-left`(value: CSSMotionProps): Self = this.set("vertical-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteVertical-left`: Self = this.set("vertical-left", js.undefined)
    
    @scala.inline
    def `setVertical-right`(value: CSSMotionProps): Self = this.set("vertical-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteVertical-right`: Self = this.set("vertical-right", js.undefined)
  }
}
