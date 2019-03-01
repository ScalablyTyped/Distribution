package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxPage extends js.Object {
  var qHeight: js.UndefOr[scala.Double] = js.undefined
  var qLeft: js.UndefOr[scala.Double] = js.undefined
  var qTop: js.UndefOr[scala.Double] = js.undefined
  var qWidth: js.UndefOr[scala.Double] = js.undefined
}

object NxPage {
  @scala.inline
  def apply(
    qHeight: scala.Int | scala.Double = null,
    qLeft: scala.Int | scala.Double = null,
    qTop: scala.Int | scala.Double = null,
    qWidth: scala.Int | scala.Double = null
  ): NxPage = {
    val __obj = js.Dynamic.literal()
    if (qHeight != null) __obj.updateDynamic("qHeight")(qHeight.asInstanceOf[js.Any])
    if (qLeft != null) __obj.updateDynamic("qLeft")(qLeft.asInstanceOf[js.Any])
    if (qTop != null) __obj.updateDynamic("qTop")(qTop.asInstanceOf[js.Any])
    if (qWidth != null) __obj.updateDynamic("qWidth")(qWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPage]
  }
}

