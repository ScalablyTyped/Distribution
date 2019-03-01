package typings
package reactDashNativeDashDocumentDashPickerLib.reactDashNativeDashDocumentDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var fileName: java.lang.String
  var fileSize: scala.Double
  var `type`: java.lang.String
  var uri: java.lang.String
}

object Result {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    fileSize: scala.Double,
    `type`: java.lang.String,
    uri: java.lang.String
  ): Result = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("fileSize")(fileSize)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Result]
  }
}

