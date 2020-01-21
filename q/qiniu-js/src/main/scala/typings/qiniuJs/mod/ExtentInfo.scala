package typings.qiniuJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentInfo extends /* key */ StringDictionary[ExtentInfoValue] {
  var DateTime: ExtentInfoValue
  var ExposureBiasValue: ExtentInfoValue
  var ExposureTime: ExtentInfoValue
  var ISOSpeedRatings: ExtentInfoValue
  var Model: ExtentInfoValue
  var ResolutionUnit: ExtentInfoValue
}

object ExtentInfo {
  @scala.inline
  def apply(
    DateTime: ExtentInfoValue,
    ExposureBiasValue: ExtentInfoValue,
    ExposureTime: ExtentInfoValue,
    ISOSpeedRatings: ExtentInfoValue,
    Model: ExtentInfoValue,
    ResolutionUnit: ExtentInfoValue,
    StringDictionary: /* key */ StringDictionary[ExtentInfoValue] = null
  ): ExtentInfo = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], ExposureBiasValue = ExposureBiasValue.asInstanceOf[js.Any], ExposureTime = ExposureTime.asInstanceOf[js.Any], ISOSpeedRatings = ISOSpeedRatings.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ResolutionUnit = ResolutionUnit.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ExtentInfo]
  }
}

