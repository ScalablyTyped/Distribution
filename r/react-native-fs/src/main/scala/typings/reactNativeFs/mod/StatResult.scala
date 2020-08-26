package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatResult extends js.Object {
  // UNIX file mode
  var ctime: Double = js.native
  // Size in bytes
  var mode: Double = js.native
  // Created date
  var mtime: Double = js.native
  var name: js.UndefOr[String] = js.native
  // Last modified date
  var originalFilepath: String = js.native
  // The name of the item TODO: why is this not documented?
  var path: String = js.native
  // The absolute path to the item
  var size: String = js.native
  // Is the file just a file?
  def isDirectory(): Boolean = js.native
  // In case of content uri this is the pointed file path, otherwise is the same as path
  def isFile(): Boolean = js.native
}

object StatResult {
  @scala.inline
  def apply(
    ctime: Double,
    isDirectory: () => Boolean,
    isFile: () => Boolean,
    mode: Double,
    mtime: Double,
    originalFilepath: String,
    path: String,
    size: String
  ): StatResult = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], originalFilepath = originalFilepath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatResult]
  }
  @scala.inline
  implicit class StatResultOps[Self <: StatResult] (val x: Self) extends AnyVal {
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
    def setCtime(value: Double): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = this.set("isDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFile(value: () => Boolean): Self = this.set("isFile", js.Any.fromFunction0(value))
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: Double): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalFilepath(value: String): Self = this.set("originalFilepath", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

