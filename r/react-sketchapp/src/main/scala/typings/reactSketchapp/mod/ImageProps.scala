package typings.reactSketchapp.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var resizeMode: ResizeMode
  var source: js.UndefOr[ImageSource] = js.undefined
  var style: js.UndefOr[Style | StyleReference] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    resizeMode: ResizeMode,
    children: js.Array[ReactNode] | ReactNode = null,
    source: ImageSource = null,
    style: Style | StyleReference = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal(resizeMode = resizeMode.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

