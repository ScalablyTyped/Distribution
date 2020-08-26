package typings.socketIoFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileInfo extends js.Object {
  var data: js.Array[_] = js.native
  var estimated: Double = js.native
  var mime: String = js.native
  var name: String = js.native
  var originalFileName: String = js.native
  var path: String = js.native
  var size: Double = js.native
  var uploadDir: String = js.native
  var uploadId: String = js.native
  var wrote: Double = js.native
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
  @scala.inline
  implicit class FileInfoOps[Self <: FileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEstimated(value: Double): Self = this.set("estimated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalFileName(value: String): Self = this.set("originalFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadDir(value: String): Self = this.set("uploadDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrote(value: Double): Self = this.set("wrote", value.asInstanceOf[js.Any])
  }
  
}

