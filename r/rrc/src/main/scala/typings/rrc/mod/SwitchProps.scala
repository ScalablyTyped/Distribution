package typings.rrc.mod

import typings.rrc.anon.LocationDescriptorObjectL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchProps extends js.Object {
  
  var location: LocationDescriptorObjectL = js.native
  
  var routes: js.Array[RouteConfiguration] = js.native
}
object SwitchProps {
  
  @scala.inline
  def apply(location: LocationDescriptorObjectL, routes: js.Array[RouteConfiguration]): SwitchProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
  
  @scala.inline
  implicit class SwitchPropsOps[Self <: SwitchProps] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: LocationDescriptorObjectL): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: RouteConfiguration*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[RouteConfiguration]): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
}
