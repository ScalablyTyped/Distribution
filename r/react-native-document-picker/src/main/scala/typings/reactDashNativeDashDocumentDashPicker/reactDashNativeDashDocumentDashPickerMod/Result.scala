package typings.reactDashNativeDashDocumentDashPicker.reactDashNativeDashDocumentDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var fileName: String
  var fileSize: Double
  var `type`: String
  var uri: String
}

object Result {
  @scala.inline
  def apply(fileName: String, fileSize: Double, `type`: String, uri: String): Result = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

