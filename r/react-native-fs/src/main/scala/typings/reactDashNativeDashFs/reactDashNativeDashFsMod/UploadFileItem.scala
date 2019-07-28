package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileItem extends js.Object {
  // Name of file
  var filename: String
  // Path to file
  var filepath: String
  // The mimetype of the file to be uploaded, if not defined it will get mimetype from `filepath` extension
  var filetype: String
  // Name of the file, if not defined then filename is used
  var name: String
}

object UploadFileItem {
  @scala.inline
  def apply(filename: String, filepath: String, filetype: String, name: String): UploadFileItem = {
    val __obj = js.Dynamic.literal(filename = filename, filepath = filepath, filetype = filetype, name = name)
  
    __obj.asInstanceOf[UploadFileItem]
  }
}

