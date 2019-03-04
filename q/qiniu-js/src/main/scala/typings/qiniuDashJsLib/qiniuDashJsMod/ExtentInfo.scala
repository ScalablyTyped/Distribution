package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentInfo
  extends /* key */ org.scalablytyped.runtime.StringDictionary[ExtentInfoValue] {
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
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[ExtentInfoValue] = null
  ): ExtentInfo = {
    val __obj = js.Dynamic.literal(DateTime = DateTime, ExposureBiasValue = ExposureBiasValue, ExposureTime = ExposureTime, ISOSpeedRatings = ISOSpeedRatings, Model = Model, ResolutionUnit = ResolutionUnit)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ExtentInfo]
  }
}

