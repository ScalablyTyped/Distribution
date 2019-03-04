package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends Attributes {
  def isBlockDevice(): scala.Boolean
  def isCharacterDevice(): scala.Boolean
  def isDirectory(): scala.Boolean
  def isFIFO(): scala.Boolean
  def isFile(): scala.Boolean
  def isSocket(): scala.Boolean
  def isSymbolicLink(): scala.Boolean
}

object Stats {
  @scala.inline
  def apply(
    atime: scala.Double,
    gid: scala.Double,
    isBlockDevice: js.Function0[scala.Boolean],
    isCharacterDevice: js.Function0[scala.Boolean],
    isDirectory: js.Function0[scala.Boolean],
    isFIFO: js.Function0[scala.Boolean],
    isFile: js.Function0[scala.Boolean],
    isSocket: js.Function0[scala.Boolean],
    isSymbolicLink: js.Function0[scala.Boolean],
    mode: scala.Double,
    mtime: scala.Double,
    size: scala.Double,
    uid: scala.Double
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime, gid = gid, isBlockDevice = isBlockDevice, isCharacterDevice = isCharacterDevice, isDirectory = isDirectory, isFIFO = isFIFO, isFile = isFile, isSocket = isSocket, isSymbolicLink = isSymbolicLink, mode = mode, mtime = mtime, size = size, uid = uid)
  
    __obj.asInstanceOf[Stats]
  }
}

