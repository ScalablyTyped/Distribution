package typings.reactOverlays.esmDropdownToggleMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseDropdownToggleProps extends js.Object {
  
  var `aria-expanded`: Boolean = js.native
  
  var `aria-haspopup`: Boolean = js.native
  
  var ref: js.Function1[/* ref */ HTMLElement | Null, Unit] = js.native
}
object UseDropdownToggleProps {
  
  @scala.inline
  def apply(`aria-expanded`: Boolean, `aria-haspopup`: Boolean, ref: /* ref */ HTMLElement | Null => Unit): UseDropdownToggleProps = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseDropdownToggleProps]
  }
  
  @scala.inline
  implicit class UseDropdownTogglePropsOps[Self <: UseDropdownToggleProps] (val x: Self) extends AnyVal {
    
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
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-haspopup`(value: Boolean): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: /* ref */ HTMLElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
  }
}
