package typings.semanticDashUiDashReact.srcGenericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictHtmlImageProps extends js.Object {
  var src: js.UndefOr[String] = js.undefined
}

object StrictHtmlImageProps {
  @scala.inline
  def apply(src: String = null): StrictHtmlImageProps = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[StrictHtmlImageProps]
  }
}

