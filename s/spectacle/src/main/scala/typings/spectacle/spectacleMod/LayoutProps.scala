package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LayoutProps {
  @scala.inline
  def apply(style: CSSProperties = null): LayoutProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutProps]
  }
}

