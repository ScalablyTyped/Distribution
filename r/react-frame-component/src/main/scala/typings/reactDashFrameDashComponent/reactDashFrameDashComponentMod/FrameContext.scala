package typings.reactDashFrameDashComponent.reactDashFrameDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameContext extends js.Object {
  var document: js.UndefOr[js.Any] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object FrameContext {
  @scala.inline
  def apply(document: js.Any = null, window: js.Any = null): FrameContext = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[FrameContext]
  }
}

