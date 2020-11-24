package typings.reactOverlays.modalMod

import typings.react.mod.CSSProperties
import typings.react.mod.RefCallback
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderModalDialogProps extends js.Object {
  
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var ref: RefCallback[Element] = js.native
  
  var role: String = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabIndex: Double = js.native
}
object RenderModalDialogProps {
  
  @scala.inline
  def apply(ref: /* instance */ Element | Null => Unit, role: String, tabIndex: Double): RenderModalDialogProps = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref), role = role.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderModalDialogProps]
  }
  
  @scala.inline
  implicit class RenderModalDialogPropsOps[Self <: RenderModalDialogProps] (val x: Self) extends AnyVal {
    
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
    def setRef(value: /* instance */ Element | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
