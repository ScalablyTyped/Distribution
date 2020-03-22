package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/image/image.js
trait ImageModifierProps extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var fallback: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[ImageSize] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object ImageModifierProps {
  @scala.inline
  def apply(alt: String = null, fallback: String = null, size: ImageSize = null, src: String = null): ImageModifierProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageModifierProps]
  }
}

