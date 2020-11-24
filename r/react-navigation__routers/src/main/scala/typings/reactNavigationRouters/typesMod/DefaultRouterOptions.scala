package typings.reactNavigationRouters.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRouterOptions[RouteName /* <: String */] extends js.Object {
  
  /**
    * Name of the route to focus by on initial render.
    * If not specified, usually the first route is used.
    */
  var initialRouteName: js.UndefOr[RouteName] = js.native
}
object DefaultRouterOptions {
  
  @scala.inline
  def apply[RouteName /* <: String */](): DefaultRouterOptions[RouteName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRouterOptions[RouteName]]
  }
  
  @scala.inline
  implicit class DefaultRouterOptionsOps[Self <: DefaultRouterOptions[_], RouteName /* <: String */] (val x: Self with DefaultRouterOptions[RouteName]) extends AnyVal {
    
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
    def setInitialRouteName(value: RouteName): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
  }
}
