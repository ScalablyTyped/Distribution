package typings.ssh2DashSftpDashClient.ssh2DashSftpDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStats extends js.Object {
  var accessTime: Double
  var gid: Double
  var isBlockDevice: Boolean
  var isCharacterDevice: Boolean
  var isDirectory: Boolean
  var isFIFO: Boolean
  var isFile: Boolean
  var isSocket: Boolean
  var isSymbolicLink: Boolean
  var mode: Double
  var modifyTime: Double
  var size: Double
  var uid: Double
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
}

