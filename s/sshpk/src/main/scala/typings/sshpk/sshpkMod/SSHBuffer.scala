package typings.sshpk.sshpkMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "SSHBuffer")
@js.native
class SSHBuffer protected () extends js.Object {
  def this(opts: js.Any) = this()
  def atEnd(): Boolean = js.native
  def expand(): Unit = js.native
  def readBuffer(): Buffer = js.native
  def readChar(): String = js.native
  def readInt(): Double = js.native
  def readInt64(): Buffer = js.native
  def readPart(): SSHPart = js.native
  def readString(): String = js.native
  def remainder(): Buffer = js.native
  def skip(n: Double): Unit = js.native
  def toBuffer(): Buffer = js.native
  def write(buf: Buffer): Unit = js.native
  def writeBuffer(buf: Buffer): Unit = js.native
  def writeCString(buf: String): Unit = js.native
  def writeChar(buf: String): Unit = js.native
  def writeInt(buf: Double): Unit = js.native
  def writeInt64(buf: Buffer): Unit = js.native
  def writePart(buf: SSHPart): Unit = js.native
  def writeString(buf: String): Unit = js.native
}

