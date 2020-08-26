package typings.rrc.mod

import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouter.mod.`match`
import typings.rrc.anon.LocationDescriptorObjectL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapSwitchProps[Params] extends SwitchProps {
  var getKey: js.UndefOr[GetKeyFunction[Params]] = js.native
}

object WrapSwitchProps {
  @scala.inline
  def apply[Params](location: LocationDescriptorObjectL, routes: js.Array[RouteConfiguration]): WrapSwitchProps[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapSwitchProps[Params]]
  }
  @scala.inline
  implicit class WrapSwitchPropsOps[Self <: WrapSwitchProps[_], Params] (val x: Self with WrapSwitchProps[Params]) extends AnyVal {
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
    def setGetKey(
      value: (/* match */ `match`[Params], /* route */ RouteConfiguration, /* location */ Location[LocationState]) => String
    ): Self = this.set("getKey", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetKey: Self = this.set("getKey", js.undefined)
  }
  
}

