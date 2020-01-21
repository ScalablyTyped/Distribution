package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxPage extends js.Object {
  var qHeight: js.UndefOr[Double] = js.undefined
  var qLeft: js.UndefOr[Double] = js.undefined
  var qTop: js.UndefOr[Double] = js.undefined
  var qWidth: js.UndefOr[Double] = js.undefined
}

object NxPage {
  @scala.inline
  def apply(
    qHeight: Int | Double = null,
    qLeft: Int | Double = null,
    qTop: Int | Double = null,
    qWidth: Int | Double = null
  ): NxPage = {
    val __obj = js.Dynamic.literal()
    if (qHeight != null) __obj.updateDynamic("qHeight")(qHeight.asInstanceOf[js.Any])
    if (qLeft != null) __obj.updateDynamic("qLeft")(qLeft.asInstanceOf[js.Any])
    if (qTop != null) __obj.updateDynamic("qTop")(qTop.asInstanceOf[js.Any])
    if (qWidth != null) __obj.updateDynamic("qWidth")(qWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPage]
  }
}

