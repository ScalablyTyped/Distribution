package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var resizeMode: ResizeMode
  var source: js.UndefOr[ImageSource] = js.undefined
  var style: js.UndefOr[Style | StyleReference] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    resizeMode: ResizeMode,
    children: js.Any = null,
    source: ImageSource = null,
    style: Style | StyleReference = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resizeMode")(resizeMode)
    if (children != null) __obj.updateDynamic("children")(children)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

