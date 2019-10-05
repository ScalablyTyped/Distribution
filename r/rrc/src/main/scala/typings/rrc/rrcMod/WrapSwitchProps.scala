package typings.rrc.rrcMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationDescriptorObject
import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.`match`
import typings.rrc.Anon_Pathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapSwitchProps[Params] extends SwitchProps {
  var getKey: js.UndefOr[GetKeyFunction[Params]] = js.undefined
}

object WrapSwitchProps {
  @scala.inline
  def apply[Params](
    location: LocationDescriptorObject[LocationState] with Anon_Pathname,
    routes: js.Array[RouteConfiguration],
    getKey: (/* match */ `match`[Params], /* route */ RouteConfiguration, /* location */ Location[LocationState]) => String = null
  ): WrapSwitchProps[Params] = {
    val __obj = js.Dynamic.literal(location = location, routes = routes)
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction3(getKey))
    __obj.asInstanceOf[WrapSwitchProps[Params]]
  }
}

