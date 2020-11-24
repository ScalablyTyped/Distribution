package typings.reactBootstrap.navbarMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavbarTextProps
  extends AllHTMLAttributes[NavbarText]
     with ClassAttributes[NavbarText] {
  
  var pullRight: js.UndefOr[Boolean] = js.native
}
object NavbarTextProps {
  
  @scala.inline
  def apply(): NavbarTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarTextProps]
  }
  
  @scala.inline
  implicit class NavbarTextPropsOps[Self <: NavbarTextProps] (val x: Self) extends AnyVal {
    
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
    def setPullRight(value: Boolean): Self = this.set("pullRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRight: Self = this.set("pullRight", js.undefined)
  }
}
