package typings.atStorybookComponents.distBlocksIFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrameProps extends js.Object {
  var allowFullScreen: Boolean
  var id: String
  var key: js.UndefOr[String] = js.undefined
  var scale: Double
  var src: String
  var style: js.UndefOr[js.Any] = js.undefined
  var title: String
}

object IFrameProps {
  @scala.inline
  def apply(
    allowFullScreen: Boolean,
    id: String,
    scale: Double,
    src: String,
    title: String,
    key: String = null,
    style: js.Any = null
  ): IFrameProps = {
    val __obj = js.Dynamic.literal(allowFullScreen = allowFullScreen, id = id, scale = scale, src = src, title = title)
    if (key != null) __obj.updateDynamic("key")(key)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IFrameProps]
  }
}

