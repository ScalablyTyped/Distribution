package typings
package rrcLib.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapSwitchProps[Params] extends SwitchProps {
  var getKey: js.UndefOr[GetKeyFunction[Params]] = js.undefined
}

object WrapSwitchProps {
  @scala.inline
  def apply[Params](
    location: historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] with rrcLib.Anon_Pathname,
    routes: js.Array[RouteConfiguration],
    getKey: GetKeyFunction[Params] = null
  ): WrapSwitchProps[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("routes")(routes)
    if (getKey != null) __obj.updateDynamic("getKey")(getKey)
    __obj.asInstanceOf[WrapSwitchProps[Params]]
  }
}

