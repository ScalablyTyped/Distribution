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
    val __obj = js.Dynamic.literal(accessTime = accessTime, gid = gid, isBlockDevice = isBlockDevice, isCharacterDevice = isCharacterDevice, isDirectory = isDirectory, isFIFO = isFIFO, isFile = isFile, isSocket = isSocket, isSymbolicLink = isSymbolicLink, mode = mode, modifyTime = modifyTime, size = size, uid = uid)
  
    __obj.asInstanceOf[FileStats]
  }
}

