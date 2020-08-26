package typings.reduxAuthWrapper.locationHelperMod

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationHelperConfig[Props] extends js.Object {
  var locationSelector: js.UndefOr[js.Function1[/* props */ Props, LocationDescriptorObject[LocationState]]] = js.native
  var redirectQueryParamName: js.UndefOr[String] = js.native
}

object LocationHelperConfig {
  @scala.inline
  def apply[Props](): LocationHelperConfig[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationHelperConfig[Props]]
  }
  @scala.inline
  implicit class LocationHelperConfigOps[Self <: LocationHelperConfig[_], Props] (val x: Self with LocationHelperConfig[Props]) extends AnyVal {
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
    def setLocationSelector(value: /* props */ Props => LocationDescriptorObject[LocationState]): Self = this.set("locationSelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLocationSelector: Self = this.set("locationSelector", js.undefined)
    @scala.inline
    def setRedirectQueryParamName(value: String): Self = this.set("redirectQueryParamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectQueryParamName: Self = this.set("redirectQueryParamName", js.undefined)
  }
  
}

