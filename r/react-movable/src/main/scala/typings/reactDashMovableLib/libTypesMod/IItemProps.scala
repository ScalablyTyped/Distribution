package typings
package reactDashMovableLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemProps extends js.Object {
  var `aria-roledescription`: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[scala.Double] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.KeyboardEvent[reactLib.Element], scala.Unit]
  ] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* e */ reactLib.reactMod.WheelEvent[reactLib.Element], scala.Unit]] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.RefObject[_]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
}

object IItemProps {
  @scala.inline
  def apply(
    `aria-roledescription`: java.lang.String = null,
    key: scala.Int | scala.Double = null,
    onKeyDown: /* e */ reactLib.reactMod.KeyboardEvent[reactLib.Element] => scala.Unit = null,
    onWheel: /* e */ reactLib.reactMod.WheelEvent[reactLib.Element] => scala.Unit = null,
    ref: reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null
  ): IItemProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemProps]
  }
}

