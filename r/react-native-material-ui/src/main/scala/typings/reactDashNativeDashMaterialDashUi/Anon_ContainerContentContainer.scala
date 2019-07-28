package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerContentContainer extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var contentContainer: js.UndefOr[ViewStyle] = js.undefined
}

object Anon_ContainerContentContainer {
  @scala.inline
  def apply(container: ViewStyle = null, contentContainer: ViewStyle = null): Anon_ContainerContentContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (contentContainer != null) __obj.updateDynamic("contentContainer")(contentContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerContentContainer]
  }
}

