package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FillProps {
  @scala.inline
  def apply(className: String = null, style: CSSProperties = null): FillProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FillProps]
  }
}

