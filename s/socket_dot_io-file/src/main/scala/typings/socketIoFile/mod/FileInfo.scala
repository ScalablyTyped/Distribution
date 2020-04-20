package typings.socketIoFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  var data: js.Array[_]
  var estimated: Double
  var mime: String
  var name: String
  var originalFileName: String
  var path: String
  var size: Double
  var uploadDir: String
  var uploadId: String
  var wrote: Double
}

object FileInfo {
  @scala.inline
  def apply(
    data: js.Array[_],
    estimated: Double,
    mime: String,
    name: String,
    originalFileName: String,
    path: String,
    size: Double,
    uploadDir: String,
    uploadId: String,
    wrote: Double
  ): FileInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], estimated = estimated.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalFileName = originalFileName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadDir = uploadDir.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], wrote = wrote.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
}

