package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerContentStrokeContainer extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var content: js.UndefOr[ViewStyle] = js.undefined
  var strokeContainer: js.UndefOr[ViewStyle] = js.undefined
}

object Anon_ContainerContentStrokeContainer {
  @scala.inline
  def apply(container: ViewStyle = null, content: ViewStyle = null, strokeContainer: ViewStyle = null): Anon_ContainerContentStrokeContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (strokeContainer != null) __obj.updateDynamic("strokeContainer")(strokeContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerContentStrokeContainer]
  }
}

