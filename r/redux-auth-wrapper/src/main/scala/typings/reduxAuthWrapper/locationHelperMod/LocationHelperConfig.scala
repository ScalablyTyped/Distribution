package typings.reduxAuthWrapper.locationHelperMod

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationHelperConfig[Props] extends js.Object {
  var locationSelector: js.UndefOr[js.Function1[/* props */ Props, LocationDescriptorObject[LocationState]]] = js.undefined
  var redirectQueryParamName: js.UndefOr[String] = js.undefined
}

object LocationHelperConfig {
  @scala.inline
  def apply[Props](
    locationSelector: /* props */ Props => LocationDescriptorObject[LocationState] = null,
    redirectQueryParamName: String = null
  ): LocationHelperConfig[Props] = {
    val __obj = js.Dynamic.literal()
    if (locationSelector != null) __obj.updateDynamic("locationSelector")(js.Any.fromFunction1(locationSelector))
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationHelperConfig[Props]]
  }
}

