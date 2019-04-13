package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "SSHBuffer")
@js.native
class SSHBuffer protected () extends js.Object {
  def this(opts: js.Any) = this()
  def atEnd(): scala.Boolean = js.native
  def expand(): scala.Unit = js.native
  def readBuffer(): nodeLib.Buffer = js.native
  def readChar(): java.lang.String = js.native
  def readInt(): scala.Double = js.native
  def readInt64(): nodeLib.Buffer = js.native
  def readPart(): SSHPart = js.native
  def readString(): java.lang.String = js.native
  def remainder(): nodeLib.Buffer = js.native
  def skip(n: scala.Double): scala.Unit = js.native
  def toBuffer(): nodeLib.Buffer = js.native
  def write(buf: nodeLib.Buffer): scala.Unit = js.native
  def writeBuffer(buf: nodeLib.Buffer): scala.Unit = js.native
  def writeCString(buf: java.lang.String): scala.Unit = js.native
  def writeChar(buf: java.lang.String): scala.Unit = js.native
  def writeInt(buf: scala.Double): scala.Unit = js.native
  def writeInt64(buf: nodeLib.Buffer): scala.Unit = js.native
  def writePart(buf: SSHPart): scala.Unit = js.native
  def writeString(buf: java.lang.String): scala.Unit = js.native
}

