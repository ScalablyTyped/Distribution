package typings
package reactDashNativeDashMaterialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentContainer extends js.Object {
  var contentContainer: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle
  ] = js.undefined
}

object Anon_ContentContainer {
  @scala.inline
  def apply(
    contentContainer: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod.ViewStyle = null
  ): Anon_ContentContainer = {
    val __obj = js.Dynamic.literal()
    if (contentContainer != null) __obj.updateDynamic("contentContainer")(contentContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContentContainer]
  }
}

