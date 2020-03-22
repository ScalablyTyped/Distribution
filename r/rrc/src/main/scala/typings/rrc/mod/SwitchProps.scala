package typings.rrc.mod

import typings.rrc.LocationDescriptorObjectL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var location: LocationDescriptorObjectL
  var routes: js.Array[RouteConfiguration]
}

object SwitchProps {
  @scala.inline
  def apply(location: LocationDescriptorObjectL, routes: js.Array[RouteConfiguration]): SwitchProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SwitchProps]
  }
}

