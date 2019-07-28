package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerContent extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var content: js.UndefOr[ViewStyle] = js.undefined
}

object Anon_ContainerContent {
  @scala.inline
  def apply(container: ViewStyle = null, content: ViewStyle = null): Anon_ContainerContent = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerContent]
  }
}

