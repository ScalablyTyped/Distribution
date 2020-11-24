package typings.storybookRouter.routerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteProps extends js.Object {
  
  var children: ReactNode = js.native
  
  var hideOnly: js.UndefOr[Boolean] = js.native
  
  var path: String = js.native
  
  var startsWith: js.UndefOr[Boolean] = js.native
}
object RouteProps {
  
  @scala.inline
  def apply(path: String): RouteProps = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps]
  }
  
  @scala.inline
  implicit class RoutePropsOps[Self <: RouteProps] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHideOnly(value: Boolean): Self = this.set("hideOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnly: Self = this.set("hideOnly", js.undefined)
    
    @scala.inline
    def setStartsWith(value: Boolean): Self = this.set("startsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartsWith: Self = this.set("startsWith", js.undefined)
  }
}
