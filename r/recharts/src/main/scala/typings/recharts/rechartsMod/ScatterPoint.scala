package typings.recharts.rechartsMod

import typings.recharts.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPoint extends js.Object {
  var cx: js.UndefOr[Double] = js.undefined
  var cy: js.UndefOr[Double] = js.undefined
  var node: js.UndefOr[Anon_X] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object ScatterPoint {
  @scala.inline
  def apply(
    cx: Int | Double = null,
    cy: Int | Double = null,
    node: Anon_X = null,
    payload: js.Any = null,
    size: Int | Double = null
  ): ScatterPoint = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterPoint]
  }
}

