package typings.reactMeasure.mod

import typings.react.mod.Ref
import typings.react.mod.SFC
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureProps extends js.Object {
  var bounds: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[SFC[MeasuredComponentProps]] = js.undefined
  var client: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[Element]] = js.undefined
  var margin: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Boolean] = js.undefined
  var onResize: js.UndefOr[js.Function1[/* contentRect */ ContentRect, Unit]] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
}

object MeasureProps {
  @scala.inline
  def apply(
    bounds: js.UndefOr[Boolean] = js.undefined,
    children: SFC[MeasuredComponentProps] = null,
    client: js.UndefOr[Boolean] = js.undefined,
    innerRef: js.UndefOr[Null | Ref[Element]] = js.undefined,
    margin: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Boolean] = js.undefined,
    onResize: /* contentRect */ ContentRect => Unit = null,
    scroll: js.UndefOr[Boolean] = js.undefined
  ): MeasureProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bounds)) __obj.updateDynamic("bounds")(bounds.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureProps]
  }
}

