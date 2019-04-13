package typings
package statDashModeLib.statDashModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends js.Object {
  var group: Permissions = js.native
  var others: Permissions = js.native
  var owner: Permissions = js.native
  var setgid: scala.Boolean = js.native
  var setuid: scala.Boolean = js.native
  var sticky: scala.Boolean = js.native
  def isBlockDevice(): scala.Boolean = js.native
  def isBlockDevice(isBlockDevice: scala.Boolean): scala.Boolean = js.native
  def isCharacterDevice(): scala.Boolean = js.native
  def isCharacterDevice(isCharacterDevice: scala.Boolean): scala.Boolean = js.native
  def isDirectory(): scala.Boolean = js.native
  def isDirectory(isDirectory: scala.Boolean): scala.Boolean = js.native
  def isFIFO(): scala.Boolean = js.native
  def isFIFO(isFIFO: scala.Boolean): scala.Boolean = js.native
  def isFile(): scala.Boolean = js.native
  def isFile(isFile: scala.Boolean): scala.Boolean = js.native
  def isSocket(): scala.Boolean = js.native
  def isSocket(isSocket: scala.Boolean): scala.Boolean = js.native
  def isSymbolicLink(): scala.Boolean = js.native
  def isSymbolicLink(isSymbolicLink: scala.Boolean): scala.Boolean = js.native
  def toOctal(): java.lang.String = js.native
}

