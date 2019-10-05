package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DoReloadExParams...
  */
trait IDoReloadExParams extends js.Object {
  /**
    * Set to true if debug breakpoints are to be honored.
    * The execution of the script will be in debug mode.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qDebug: js.UndefOr[Boolean] = js.undefined
  /**
    * Error handling mode
    * One of:
    *    0: for default mode
    *    1: for ABEND; the reload of the script ends if an error occurs.
    *    2: for ignore; the reload of the script continues even if an error is detected in the script.
    * >> This parameter is optional.
    */
  var qMode: js.UndefOr[Double] = js.undefined
  /**
    * Set to true for partial reload
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qPartial: js.UndefOr[Boolean] = js.undefined
}

object IDoReloadExParams {
  @scala.inline
  def apply(
    qDebug: js.UndefOr[Boolean] = js.undefined,
    qMode: Int | Double = null,
    qPartial: js.UndefOr[Boolean] = js.undefined
  ): IDoReloadExParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(qDebug)) __obj.updateDynamic("qDebug")(qDebug)
    if (qMode != null) __obj.updateDynamic("qMode")(qMode.asInstanceOf[js.Any])
    if (!js.isUndefined(qPartial)) __obj.updateDynamic("qPartial")(qPartial)
    __obj.asInstanceOf[IDoReloadExParams]
  }
}

