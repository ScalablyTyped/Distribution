package typings.qiniuJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtentInfo extends /* key */ StringDictionary[ExtentInfoValue] {
  var DateTime: ExtentInfoValue = js.native
  var ExposureBiasValue: ExtentInfoValue = js.native
  var ExposureTime: ExtentInfoValue = js.native
  var ISOSpeedRatings: ExtentInfoValue = js.native
  var Model: ExtentInfoValue = js.native
  var ResolutionUnit: ExtentInfoValue = js.native
}

object ExtentInfo {
  @scala.inline
  def apply(
    DateTime: ExtentInfoValue,
    ExposureBiasValue: ExtentInfoValue,
    ExposureTime: ExtentInfoValue,
    ISOSpeedRatings: ExtentInfoValue,
    Model: ExtentInfoValue,
    ResolutionUnit: ExtentInfoValue
  ): ExtentInfo = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], ExposureBiasValue = ExposureBiasValue.asInstanceOf[js.Any], ExposureTime = ExposureTime.asInstanceOf[js.Any], ISOSpeedRatings = ISOSpeedRatings.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ResolutionUnit = ResolutionUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentInfo]
  }
  @scala.inline
  implicit class ExtentInfoOps[Self <: ExtentInfo] (val x: Self) extends AnyVal {
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
    def setDateTime(value: ExtentInfoValue): Self = this.set("DateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposureBiasValue(value: ExtentInfoValue): Self = this.set("ExposureBiasValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposureTime(value: ExtentInfoValue): Self = this.set("ExposureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setISOSpeedRatings(value: ExtentInfoValue): Self = this.set("ISOSpeedRatings", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: ExtentInfoValue): Self = this.set("Model", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolutionUnit(value: ExtentInfoValue): Self = this.set("ResolutionUnit", value.asInstanceOf[js.Any])
  }
  
}

