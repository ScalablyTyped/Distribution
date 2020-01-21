package typings.statMode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends js.Object {
  var group: Permissions = js.native
  var others: Permissions = js.native
  var owner: Permissions = js.native
  var setgid: Boolean = js.native
  var setuid: Boolean = js.native
  var sticky: Boolean = js.native
  def isBlockDevice(): Boolean = js.native
  def isBlockDevice(isBlockDevice: Boolean): Boolean = js.native
  def isCharacterDevice(): Boolean = js.native
  def isCharacterDevice(isCharacterDevice: Boolean): Boolean = js.native
  def isDirectory(): Boolean = js.native
  def isDirectory(isDirectory: Boolean): Boolean = js.native
  def isFIFO(): Boolean = js.native
  def isFIFO(isFIFO: Boolean): Boolean = js.native
  def isFile(): Boolean = js.native
  def isFile(isFile: Boolean): Boolean = js.native
  def isSocket(): Boolean = js.native
  def isSocket(isSocket: Boolean): Boolean = js.native
  def isSymbolicLink(): Boolean = js.native
  def isSymbolicLink(isSymbolicLink: Boolean): Boolean = js.native
  def toOctal(): String = js.native
}

