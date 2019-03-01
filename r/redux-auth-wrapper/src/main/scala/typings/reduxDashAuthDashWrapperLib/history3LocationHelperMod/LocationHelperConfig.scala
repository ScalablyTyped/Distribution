package typings
package reduxDashAuthDashWrapperLib.history3LocationHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationHelperConfig[Props] extends js.Object {
  var locationSelector: js.UndefOr[
    js.Function1[
      /* props */ Props, 
      historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState]
    ]
  ] = js.undefined
  var redirectQueryParamName: js.UndefOr[java.lang.String] = js.undefined
}

object LocationHelperConfig {
  @scala.inline
  def apply[Props](
    locationSelector: js.Function1[
      /* props */ Props, 
      historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState]
    ] = null,
    redirectQueryParamName: java.lang.String = null
  ): LocationHelperConfig[Props] = {
    val __obj = js.Dynamic.literal()
    if (locationSelector != null) __obj.updateDynamic("locationSelector")(locationSelector)
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName)
    __obj.asInstanceOf[LocationHelperConfig[Props]]
  }
}

