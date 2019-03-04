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
    val __obj = js.Dynamic.literal(fileName = fileName, fileSize = fileSize, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Result]
  }
}

