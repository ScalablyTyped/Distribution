package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameEbsKey extends js.Object {
  var deviceName: java.lang.String
  var ebs: org.scalablytyped.runtime.StringDictionary[js.Any]
  var noDevice: java.lang.String
  var virtualName: java.lang.String
}

object Anon_DeviceNameEbsKey {
  @scala.inline
  def apply(
    deviceName: java.lang.String,
    ebs: org.scalablytyped.runtime.StringDictionary[js.Any],
    noDevice: java.lang.String,
    virtualName: java.lang.String
  ): Anon_DeviceNameEbsKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceName")(deviceName)
    __obj.updateDynamic("ebs")(ebs)
    __obj.updateDynamic("noDevice")(noDevice)
    __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[Anon_DeviceNameEbsKey]
  }
}

