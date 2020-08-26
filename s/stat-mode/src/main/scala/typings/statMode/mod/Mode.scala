package typings.statMode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stat-mode", "Mode")
@js.native
class Mode () extends js.Object {
  def this(stat: Double) = this()
  def this(stat: StatsMode) = this()
  var checkModeProperty: js.Any = js.native
  var group: Group = js.native
  var others: Others = js.native
  var owner: Owner = js.native
  var stat: js.Any = js.native
  def isBlockDevice(): Boolean = js.native
  def isBlockDevice(v: Boolean): Boolean = js.native
  def isCharacterDevice(): Boolean = js.native
  def isCharacterDevice(v: Boolean): Boolean = js.native
  def isDirectory(): Boolean = js.native
  def isDirectory(v: Boolean): Boolean = js.native
  def isFIFO(): Boolean = js.native
  def isFIFO(v: Boolean): Boolean = js.native
  def isFile(): Boolean = js.native
  def isFile(v: Boolean): Boolean = js.native
  def isSocket(): Boolean = js.native
  def isSocket(v: Boolean): Boolean = js.native
  def isSymbolicLink(): Boolean = js.native
  def isSymbolicLink(v: Boolean): Boolean = js.native
  def setgid: Boolean = js.native
  def setgid_=(v: Boolean): Unit = js.native
  def setuid: Boolean = js.native
  def setuid_=(v: Boolean): Unit = js.native
  def sticky: Boolean = js.native
  def sticky_=(v: Boolean): Unit = js.native
  /**
    * Returns an octal representation of the `mode`, eg. "0754".
    *
    * http://en.wikipedia.org/wiki/File_system_permissions#Numeric_notation
    *
    * @return {String}
    * @api public
    */
  def toOctal(): String = js.native
}

