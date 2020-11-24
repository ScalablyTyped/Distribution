package typings.ssh2SftpClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileStats extends js.Object {
  
  var accessTime: Double = js.native
  
  var gid: Double = js.native
  
  var isBlockDevice: Boolean = js.native
  
  var isCharacterDevice: Boolean = js.native
  
  var isDirectory: Boolean = js.native
  
  var isFIFO: Boolean = js.native
  
  var isFile: Boolean = js.native
  
  var isSocket: Boolean = js.native
  
  var isSymbolicLink: Boolean = js.native
  
  var mode: Double = js.native
  
  var modifyTime: Double = js.native
  
  var size: Double = js.native
  
  var uid: Double = js.native
}
object FileStats {
  
  @scala.inline
  def apply(
    accessTime: Double,
    gid: Double,
    isBlockDevice: Boolean,
    isCharacterDevice: Boolean,
    isDirectory: Boolean,
    isFIFO: Boolean,
    isFile: Boolean,
    isSocket: Boolean,
    isSymbolicLink: Boolean,
    mode: Double,
    modifyTime: Double,
    size: Double,
    uid: Double
  ): FileStats = {
    val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], isBlockDevice = isBlockDevice.asInstanceOf[js.Any], isCharacterDevice = isCharacterDevice.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFIFO = isFIFO.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isSocket = isSocket.asInstanceOf[js.Any], isSymbolicLink = isSymbolicLink.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], modifyTime = modifyTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStats]
  }
  
  @scala.inline
  implicit class FileStatsOps[Self <: FileStats] (val x: Self) extends AnyVal {
    
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
    def setAccessTime(value: Double): Self = this.set("accessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlockDevice(value: Boolean): Self = this.set("isBlockDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCharacterDevice(value: Boolean): Self = this.set("isCharacterDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirectory(value: Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFIFO(value: Boolean): Self = this.set("isFIFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFile(value: Boolean): Self = this.set("isFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSocket(value: Boolean): Self = this.set("isSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSymbolicLink(value: Boolean): Self = this.set("isSymbolicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyTime(value: Double): Self = this.set("modifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
}
