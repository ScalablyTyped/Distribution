package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipPathProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object ClipPathProps {
  @scala.inline
  def apply(id: String = null): ClipPathProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipPathProps]
  }
}

