package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "SSHBuffer")
@js.native
class SSHBuffer protected ()
  extends sshpkLib.sshpkMod.SshPKNs.SSHBuffer {
  def this(opts: js.Any) = this()
  /* CompleteClass */
  override def atEnd(): scala.Boolean = js.native
  /* CompleteClass */
  override def expand(): scala.Unit = js.native
  /* CompleteClass */
  override def readBuffer(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def readChar(): java.lang.String = js.native
  /* CompleteClass */
  override def readInt(): scala.Double = js.native
  /* CompleteClass */
  override def readInt64(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def readPart(): sshpkLib.sshpkMod.SshPKNs.SSHPart = js.native
  /* CompleteClass */
  override def readString(): java.lang.String = js.native
  /* CompleteClass */
  override def remainder(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def skip(n: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def toBuffer(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def write(buf: nodeLib.Buffer): scala.Unit = js.native
  /* CompleteClass */
  override def writeBuffer(buf: nodeLib.Buffer): scala.Unit = js.native
  /* CompleteClass */
  override def writeCString(buf: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def writeChar(buf: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def writeInt(buf: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def writeInt64(buf: nodeLib.Buffer): scala.Unit = js.native
  /* CompleteClass */
  override def writePart(buf: sshpkLib.sshpkMod.SshPKNs.SSHPart): scala.Unit = js.native
  /* CompleteClass */
  override def writeString(buf: java.lang.String): scala.Unit = js.native
}

