package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentContainer extends js.Object {
  var contentContainer: js.UndefOr[ViewStyle] = js.undefined
}

object ContentContainer {
  @scala.inline
  def apply(contentContainer: js.UndefOr[Null | ViewStyle] = js.undefined): ContentContainer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentContainer)) __obj.updateDynamic("contentContainer")(contentContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentContainer]
  }
}

