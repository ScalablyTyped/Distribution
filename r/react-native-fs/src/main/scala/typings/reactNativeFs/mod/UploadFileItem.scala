package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileItem extends js.Object {
  // Name of the file, if not defined then filename is used
  var filename: String
  // Name of file
  var filepath: String
  // Path to file
  var filetype: String
  var name: String
}

object UploadFileItem {
  @scala.inline
  def apply(filename: String, filepath: String, filetype: String, name: String): UploadFileItem = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], filetype = filetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileItem]
  }
}

