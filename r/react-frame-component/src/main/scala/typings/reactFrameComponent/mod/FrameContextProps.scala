package typings.reactFrameComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameContextProps extends js.Object {
  var document: js.UndefOr[js.Any] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object FrameContextProps {
  @scala.inline
  def apply(document: js.Any = null, window: js.Any = null): FrameContextProps = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameContextProps]
  }
}

