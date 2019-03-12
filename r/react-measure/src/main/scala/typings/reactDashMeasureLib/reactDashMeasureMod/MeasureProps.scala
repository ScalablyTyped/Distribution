package typings
package reactDashMeasureLib.reactDashMeasureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureProps extends js.Object {
  var bounds: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.SFC[MeasuredComponentProps]] = js.undefined
  var client: js.UndefOr[scala.Boolean] = js.undefined
  var innerRef: js.UndefOr[js.Function1[/* ref */ stdLib.Element | scala.Null, scala.Unit]] = js.undefined
  var margin: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Boolean] = js.undefined
  var onResize: js.UndefOr[js.Function1[/* contentRect */ ContentRect, scala.Unit]] = js.undefined
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
}

object MeasureProps {
  @scala.inline
  def apply(
    bounds: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.SFC[MeasuredComponentProps] = null,
    client: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: /* ref */ stdLib.Element | scala.Null => scala.Unit = null,
    margin: js.UndefOr[scala.Boolean] = js.undefined,
    offset: js.UndefOr[scala.Boolean] = js.undefined,
    onResize: /* contentRect */ ContentRect => scala.Unit = null,
    scroll: js.UndefOr[scala.Boolean] = js.undefined
  ): MeasureProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounds)) __obj.updateDynamic("bounds")(bounds)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client)
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin)
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset)
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    __obj.asInstanceOf[MeasureProps]
  }
}

