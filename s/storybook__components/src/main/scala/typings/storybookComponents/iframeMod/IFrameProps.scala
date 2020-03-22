package typings.storybookComponents.iframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFrameProps extends js.Object {
  var allowFullScreen: Boolean = js.native
  var id: String = js.native
  var key: js.UndefOr[String] = js.native
  var scale: Double = js.native
  var src: String = js.native
  var style: js.UndefOr[js.Any] = js.native
  var title: String = js.native
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
    val __obj = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFrameProps]
  }
}

