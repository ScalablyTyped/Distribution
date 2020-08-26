package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DoReloadExParams...
  */
@js.native
trait IDoReloadExParams extends js.Object {
  /**
    * Set to true if debug breakpoints are to be honored.
    * The execution of the script will be in debug mode.
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qDebug: js.UndefOr[Boolean] = js.native
  /**
    * Error handling mode
    * One of:
    *    0: for default mode
    *    1: for ABEND; the reload of the script ends if an error occurs.
    *    2: for ignore; the reload of the script continues even if an error is detected in the script.
    * >> This parameter is optional.
    */
  var qMode: js.UndefOr[Double] = js.native
  /**
    * Set to true for partial reload
    * >> This parameter is optional.
    * >> The default value is false.
    */
  var qPartial: js.UndefOr[Boolean] = js.native
}

object IDoReloadExParams {
  @scala.inline
  def apply(): IDoReloadExParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDoReloadExParams]
  }
  @scala.inline
  implicit class IDoReloadExParamsOps[Self <: IDoReloadExParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQDebug(value: Boolean): Self = this.set("qDebug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQDebug: Self = this.set("qDebug", js.undefined)
    @scala.inline
    def setQMode(value: Double): Self = this.set("qMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQMode: Self = this.set("qMode", js.undefined)
    @scala.inline
    def setQPartial(value: Boolean): Self = this.set("qPartial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQPartial: Self = this.set("qPartial", js.undefined)
  }
  
}

