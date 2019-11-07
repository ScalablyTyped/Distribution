package typings.socketDotIoDashFile.socketDotIoDashFileMod

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
    val __obj = js.Dynamic.literal(data = data, estimated = estimated, mime = mime, name = name, originalFileName = originalFileName, path = path, size = size, uploadDir = uploadDir, uploadId = uploadId, wrote = wrote)
  
    __obj.asInstanceOf[FileInfo]
  }
}

