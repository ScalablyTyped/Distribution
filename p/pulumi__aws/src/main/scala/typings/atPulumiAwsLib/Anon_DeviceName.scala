package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceName extends js.Object {
  var deviceName: java.lang.String
  var virtualName: java.lang.String
}

object Anon_DeviceName {
  @scala.inline
  def apply(deviceName: java.lang.String, virtualName: java.lang.String): Anon_DeviceName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceName")(deviceName)
    __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[Anon_DeviceName]
  }
}

