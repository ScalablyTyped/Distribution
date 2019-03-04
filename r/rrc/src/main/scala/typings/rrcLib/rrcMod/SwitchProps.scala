package typings
package rrcLib.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var location: historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] with rrcLib.Anon_Pathname
  var routes: js.Array[RouteConfiguration]
}

object SwitchProps {
  @scala.inline
  def apply(
    location: historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] with rrcLib.Anon_Pathname,
    routes: js.Array[RouteConfiguration]
  ): SwitchProps = {
    val __obj = js.Dynamic.literal(location = location, routes = routes)
  
    __obj.asInstanceOf[SwitchProps]
  }
}

