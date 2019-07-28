package typings.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainersStyle extends js.Object {
  var DefaultStyle: CSSProperties
  var bc: js.UndefOr[CSSProperties] = js.undefined
  var bl: js.UndefOr[CSSProperties] = js.undefined
  var br: js.UndefOr[CSSProperties] = js.undefined
  var tc: js.UndefOr[CSSProperties] = js.undefined
  var tl: js.UndefOr[CSSProperties] = js.undefined
  var tr: js.UndefOr[CSSProperties] = js.undefined
}

object ContainersStyle {
  @scala.inline
  def apply(
    DefaultStyle: CSSProperties,
    bc: CSSProperties = null,
    bl: CSSProperties = null,
    br: CSSProperties = null,
    tc: CSSProperties = null,
    tl: CSSProperties = null,
    tr: CSSProperties = null
  ): ContainersStyle = {
    val __obj = js.Dynamic.literal(DefaultStyle = DefaultStyle)
    if (bc != null) __obj.updateDynamic("bc")(bc)
    if (bl != null) __obj.updateDynamic("bl")(bl)
    if (br != null) __obj.updateDynamic("br")(br)
    if (tc != null) __obj.updateDynamic("tc")(tc)
    if (tl != null) __obj.updateDynamic("tl")(tl)
    if (tr != null) __obj.updateDynamic("tr")(tr)
    __obj.asInstanceOf[ContainersStyle]
  }
}

