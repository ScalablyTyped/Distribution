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
    isBlockDevice: () => scala.Boolean,
    isCharacterDevice: () => scala.Boolean,
    isDirectory: () => scala.Boolean,
    isFIFO: () => scala.Boolean,
    isFile: () => scala.Boolean,
    isSocket: () => scala.Boolean,
    isSymbolicLink: () => scala.Boolean,
    mode: scala.Double,
    mtime: scala.Double,
    size: scala.Double,
    uid: scala.Double
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime, gid = gid, isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode, mtime = mtime, size = size, uid = uid)
  
    __obj.asInstanceOf[Stats]
  }
}

