package typings.rbx.imageImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageModifierProps extends js.Object {
  var rounded: js.UndefOr[Boolean] = js.undefined
}

object ImageModifierProps {
  @scala.inline
  def apply(rounded: js.UndefOr[Boolean] = js.undefined): ImageModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageModifierProps]
  }
}

