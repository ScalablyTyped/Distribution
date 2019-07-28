package typings.semanticDashUiDashReact.distCommonjsGenericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictHtmlIframeProps extends js.Object {
  var src: js.UndefOr[String] = js.undefined
}

object StrictHtmlIframeProps {
  @scala.inline
  def apply(src: String = null): StrictHtmlIframeProps = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[StrictHtmlIframeProps]
  }
}

