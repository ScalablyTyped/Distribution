package typings.storybookUi.anon

import typings.storybookUi.mobileMod.MobileProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsMobileProps extends js.Object {
  
  var props: MobileProps = js.native
}
object PropsMobileProps {
  
  @scala.inline
  def apply(props: MobileProps): PropsMobileProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsMobileProps]
  }
  
  @scala.inline
  implicit class PropsMobilePropsOps[Self <: PropsMobileProps] (val x: Self) extends AnyVal {
    
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
    def setProps(value: MobileProps): Self = this.set("props", value.asInstanceOf[js.Any])
  }
}
