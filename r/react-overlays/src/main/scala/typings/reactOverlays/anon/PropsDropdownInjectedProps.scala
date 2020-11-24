package typings.reactOverlays.anon

import typings.reactOverlays.esmDropdownMod.DropdownInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsDropdownInjectedProps extends js.Object {
  
  var props: DropdownInjectedProps = js.native
}
object PropsDropdownInjectedProps {
  
  @scala.inline
  def apply(props: DropdownInjectedProps): PropsDropdownInjectedProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsDropdownInjectedProps]
  }
  
  @scala.inline
  implicit class PropsDropdownInjectedPropsOps[Self <: PropsDropdownInjectedProps] (val x: Self) extends AnyVal {
    
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
    def setProps(value: DropdownInjectedProps): Self = this.set("props", value.asInstanceOf[js.Any])
  }
}
