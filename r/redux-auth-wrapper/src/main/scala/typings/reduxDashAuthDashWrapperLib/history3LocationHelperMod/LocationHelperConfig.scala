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

