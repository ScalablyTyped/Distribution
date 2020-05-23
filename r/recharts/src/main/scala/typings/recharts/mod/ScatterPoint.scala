package typings.recharts.mod

import typings.recharts.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPoint extends js.Object {
  var cx: js.UndefOr[Double] = js.undefined
  var cy: js.UndefOr[Double] = js.undefined
  var node: js.UndefOr[X] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object ScatterPoint {
  @scala.inline
  def apply(
    cx: js.UndefOr[Double] = js.undefined,
    cy: js.UndefOr[Double] = js.undefined,
    node: X = null,
    payload: js.Any = null,
    size: js.UndefOr[Double] = js.undefined
  ): ScatterPoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cx)) __obj.updateDynamic("cx")(cx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cy)) __obj.updateDynamic("cy")(cy.get.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterPoint]
  }
}

