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
    atEnd: () => scala.Boolean,
    expand: () => scala.Unit,
    readBuffer: () => nodeLib.Buffer,
    readChar: () => java.lang.String,
    readInt: () => scala.Double,
    readInt64: () => nodeLib.Buffer,
    readPart: () => SSHPart,
    readString: () => java.lang.String,
    remainder: () => nodeLib.Buffer,
    skip: scala.Double => scala.Unit,
    toBuffer: () => nodeLib.Buffer,
    write: nodeLib.Buffer => scala.Unit,
    writeBuffer: nodeLib.Buffer => scala.Unit,
    writeCString: java.lang.String => scala.Unit,
    writeChar: java.lang.String => scala.Unit,
    writeInt: scala.Double => scala.Unit,
    writeInt64: nodeLib.Buffer => scala.Unit,
    writePart: SSHPart => scala.Unit,
    writeString: java.lang.String => scala.Unit
  ): SSHBuffer = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), expand = js.Any.fromFunction0(expand), readBuffer = js.Any.fromFunction0(readBuffer), readChar = js.Any.fromFunction0(readChar), readInt = js.Any.fromFunction0(readInt), readInt64 = js.Any.fromFunction0(readInt64), readPart = js.Any.fromFunction0(readPart), readString = js.Any.fromFunction0(readString), remainder = js.Any.fromFunction0(remainder), skip = js.Any.fromFunction1(skip), toBuffer = js.Any.fromFunction0(toBuffer), write = js.Any.fromFunction1(write), writeBuffer = js.Any.fromFunction1(writeBuffer), writeCString = js.Any.fromFunction1(writeCString), writeChar = js.Any.fromFunction1(writeChar), writeInt = js.Any.fromFunction1(writeInt), writeInt64 = js.Any.fromFunction1(writeInt64), writePart = js.Any.fromFunction1(writePart), writeString = js.Any.fromFunction1(writeString))
  
    __obj.asInstanceOf[SSHBuffer]
  }
}

