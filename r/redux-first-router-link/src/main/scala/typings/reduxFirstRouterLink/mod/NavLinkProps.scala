package typings.reduxFirstRouterLink.mod

import typings.react.mod.CSSProperties
import typings.reduxFirstRouter.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavLinkProps extends LinkProps {
  
  var activeClassName: js.UndefOr[String] = js.native
  
  var activeStyle: js.UndefOr[CSSProperties] = js.native
  
  var ariaCurrent: js.UndefOr[String] = js.native
  
  var exact: js.UndefOr[Boolean] = js.native
  
  var isActive: js.UndefOr[js.Function2[/* match */ Match[js.Object], /* location */ Location, Boolean]] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object NavLinkProps {
  
  @scala.inline
  def apply(to: To): NavLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavLinkProps]
  }
  
  @scala.inline
  implicit class NavLinkPropsOps[Self <: NavLinkProps] (val x: Self) extends AnyVal {
    
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
    def setActiveClassName(value: String): Self = this.set("activeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClassName: Self = this.set("activeClassName", js.undefined)
    
    @scala.inline
    def setActiveStyle(value: CSSProperties): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    
    @scala.inline
    def setAriaCurrent(value: String): Self = this.set("ariaCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaCurrent: Self = this.set("ariaCurrent", js.undefined)
    
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setIsActive(value: (/* match */ Match[js.Object], /* location */ Location) => Boolean): Self = this.set("isActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
