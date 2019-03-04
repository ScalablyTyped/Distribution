package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSHBuffer extends js.Object {
  def atEnd(): scala.Boolean
  def expand(): scala.Unit
  def readBuffer(): nodeLib.Buffer
  def readChar(): java.lang.String
  def readInt(): scala.Double
  def readInt64(): nodeLib.Buffer
  def readPart(): SSHPart
  def readString(): java.lang.String
  def remainder(): nodeLib.Buffer
  def skip(n: scala.Double): scala.Unit
  def toBuffer(): nodeLib.Buffer
  def write(buf: nodeLib.Buffer): scala.Unit
  def writeBuffer(buf: nodeLib.Buffer): scala.Unit
  def writeCString(buf: java.lang.String): scala.Unit
  def writeChar(buf: java.lang.String): scala.Unit
  def writeInt(buf: scala.Double): scala.Unit
  def writeInt64(buf: nodeLib.Buffer): scala.Unit
  def writePart(buf: SSHPart): scala.Unit
  def writeString(buf: java.lang.String): scala.Unit
}

object SSHBuffer {
  @scala.inline
  def apply(
    atEnd: js.Function0[scala.Boolean],
    expand: js.Function0[scala.Unit],
    readBuffer: js.Function0[nodeLib.Buffer],
    readChar: js.Function0[java.lang.String],
    readInt: js.Function0[scala.Double],
    readInt64: js.Function0[nodeLib.Buffer],
    readPart: js.Function0[SSHPart],
    readString: js.Function0[java.lang.String],
    remainder: js.Function0[nodeLib.Buffer],
    skip: js.Function1[scala.Double, scala.Unit],
    toBuffer: js.Function0[nodeLib.Buffer],
    write: js.Function1[nodeLib.Buffer, scala.Unit],
    writeBuffer: js.Function1[nodeLib.Buffer, scala.Unit],
    writeCString: js.Function1[java.lang.String, scala.Unit],
    writeChar: js.Function1[java.lang.String, scala.Unit],
    writeInt: js.Function1[scala.Double, scala.Unit],
    writeInt64: js.Function1[nodeLib.Buffer, scala.Unit],
    writePart: js.Function1[SSHPart, scala.Unit],
    writeString: js.Function1[java.lang.String, scala.Unit]
  ): SSHBuffer = {
    val __obj = js.Dynamic.literal(atEnd = atEnd, expand = expand, readBuffer = readBuffer, readChar = readChar, readInt = readInt, readInt64 = readInt64, readPart = readPart, readString = readString, remainder = remainder, skip = skip, toBuffer = toBuffer, write = write, writeBuffer = writeBuffer, writeCString = writeCString, writeChar = writeChar, writeInt = writeInt, writeInt64 = writeInt64, writePart = writePart, writeString = writeString)
  
    __obj.asInstanceOf[SSHBuffer]
  }
}

