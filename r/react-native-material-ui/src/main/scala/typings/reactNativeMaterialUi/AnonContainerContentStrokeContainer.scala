package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerContentStrokeContainer extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var content: js.UndefOr[ViewStyle] = js.undefined
  var strokeContainer: js.UndefOr[ViewStyle] = js.undefined
}

object AnonContainerContentStrokeContainer {
  @scala.inline
  def apply(container: ViewStyle = null, content: ViewStyle = null, strokeContainer: ViewStyle = null): AnonContainerContentStrokeContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (strokeContainer != null) __obj.updateDynamic("strokeContainer")(strokeContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerContentStrokeContainer]
  }
}

