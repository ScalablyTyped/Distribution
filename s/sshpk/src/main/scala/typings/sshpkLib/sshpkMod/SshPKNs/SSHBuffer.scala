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

