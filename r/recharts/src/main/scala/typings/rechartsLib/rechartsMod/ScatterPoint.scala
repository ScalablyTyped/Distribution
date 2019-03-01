package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPoint extends js.Object {
  var cx: js.UndefOr[scala.Double] = js.undefined
  var cy: js.UndefOr[scala.Double] = js.undefined
  var node: js.UndefOr[rechartsLib.Anon_X] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object ScatterPoint {
  @scala.inline
  def apply(
    cx: scala.Int | scala.Double = null,
    cy: scala.Int | scala.Double = null,
    node: rechartsLib.Anon_X = null,
    payload: js.Any = null,
    size: scala.Int | scala.Double = null
  ): ScatterPoint = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterPoint]
  }
}

