package typings
package primereactLib.componentsGrowlGrowlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrowlProps extends js.Object {
  var baseZIndex: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* message */ GrowlMessage, scala.Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* message */ GrowlMessage, scala.Unit]] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object GrowlProps {
  @scala.inline
  def apply(
    baseZIndex: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    id: java.lang.String = null,
    onClick: /* message */ GrowlMessage => scala.Unit = null,
    onClose: /* message */ GrowlMessage => scala.Unit = null,
    position: java.lang.String = null,
    style: js.Object = null
  ): GrowlProps = {
    val __obj = js.Dynamic.literal()
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (position != null) __obj.updateDynamic("position")(position)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GrowlProps]
  }
}

