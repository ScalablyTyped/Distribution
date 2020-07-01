package typings.reactPortalTooltip.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowStyle extends js.Object {
  var arrowStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ArrowStyle {
  @scala.inline
  def apply(arrowStyle: CSSProperties = null, style: CSSProperties = null): ArrowStyle = {
    val __obj = js.Dynamic.literal()
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowStyle]
  }
}

