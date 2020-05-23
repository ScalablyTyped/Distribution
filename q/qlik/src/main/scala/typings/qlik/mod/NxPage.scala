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
    qHeight: js.UndefOr[Double] = js.undefined,
    qLeft: js.UndefOr[Double] = js.undefined,
    qTop: js.UndefOr[Double] = js.undefined,
    qWidth: js.UndefOr[Double] = js.undefined
  ): NxPage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(qHeight)) __obj.updateDynamic("qHeight")(qHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qLeft)) __obj.updateDynamic("qLeft")(qLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qTop)) __obj.updateDynamic("qTop")(qTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qWidth)) __obj.updateDynamic("qWidth")(qWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPage]
  }
}

