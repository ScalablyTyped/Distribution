package typings.simpleUrlCache.mod

import typings.simpleUrlCache.mod.privateN.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileStorageConfig extends StorageConfig {
  var dir: String = js.native
}

object FileStorageConfig {
  @scala.inline
  def apply(dir: String, `type`: String): FileStorageConfig = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStorageConfig]
  }
  @scala.inline
  implicit class FileStorageConfigOps[Self <: FileStorageConfig] (val x: Self) extends AnyVal {
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
  }
  
}

