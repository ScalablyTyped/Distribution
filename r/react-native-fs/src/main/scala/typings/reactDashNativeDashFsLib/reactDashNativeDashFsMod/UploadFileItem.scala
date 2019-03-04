package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileItem extends js.Object {
  // Name of file
  var filename: java.lang.String
  // Path to file
  var filepath: java.lang.String
  // The mimetype of the file to be uploaded, if not defined it will get mimetype from `filepath` extension
  var filetype: java.lang.String
  // Name of the file, if not defined then filename is used
  var name: java.lang.String
}

object UploadFileItem {
  @scala.inline
  def apply(
    filename: java.lang.String,
    filepath: java.lang.String,
    filetype: java.lang.String,
    name: java.lang.String
  ): UploadFileItem = {
    val __obj = js.Dynamic.literal(filename = filename, filepath = filepath, filetype = filetype, name = name)
  
    __obj.asInstanceOf[UploadFileItem]
  }
}

