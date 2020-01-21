package typings.rrc.mod

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import typings.rrc.AnonPathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var location: LocationDescriptorObject[LocationState] with AnonPathname
  var routes: js.Array[RouteConfiguration]
}

object SwitchProps {
  @scala.inline
  def apply(
    location: LocationDescriptorObject[LocationState] with AnonPathname,
    routes: js.Array[RouteConfiguration]
  ): SwitchProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SwitchProps]
  }
}

