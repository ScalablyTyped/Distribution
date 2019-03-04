package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainersStyle extends js.Object {
  var DefaultStyle: reactLib.reactMod.ReactNs.CSSProperties
  var bc: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var bl: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var br: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tc: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tl: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tr: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ContainersStyle {
  @scala.inline
  def apply(
    DefaultStyle: reactLib.reactMod.ReactNs.CSSProperties,
    bc: reactLib.reactMod.ReactNs.CSSProperties = null,
    bl: reactLib.reactMod.ReactNs.CSSProperties = null,
    br: reactLib.reactMod.ReactNs.CSSProperties = null,
    tc: reactLib.reactMod.ReactNs.CSSProperties = null,
    tl: reactLib.reactMod.ReactNs.CSSProperties = null,
    tr: reactLib.reactMod.ReactNs.CSSProperties = null
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

