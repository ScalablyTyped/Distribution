package typings.rrc.rrcMod

import typings.history.historyMod.LocationDescriptorObject
import typings.history.historyMod.LocationState
import typings.rrc.Anon_Pathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var location: LocationDescriptorObject[LocationState] with Anon_Pathname
  var routes: js.Array[RouteConfiguration]
}

object SwitchProps {
  @scala.inline
  def apply(
    location: LocationDescriptorObject[LocationState] with Anon_Pathname,
    routes: js.Array[RouteConfiguration]
  ): SwitchProps = {
    val __obj = js.Dynamic.literal(location = location, routes = routes)
  
    __obj.asInstanceOf[SwitchProps]
  }
}

