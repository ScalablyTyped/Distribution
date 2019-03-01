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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atime")(atime)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("isBlockDevice")(isBlockDevice)
    __obj.updateDynamic("isCharacterDevice")(isCharacterDevice)
    __obj.updateDynamic("isDirectory")(isDirectory)
    __obj.updateDynamic("isFIFO")(isFIFO)
    __obj.updateDynamic("isFile")(isFile)
    __obj.updateDynamic("isSocket")(isSocket)
    __obj.updateDynamic("isSymbolicLink")(isSymbolicLink)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[Stats]
  }
}

