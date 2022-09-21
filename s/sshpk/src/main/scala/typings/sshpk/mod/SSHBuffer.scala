package typings.sshpk.mod

import typings.sshpk.anon.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "SSHBuffer")
@js.native
open class SSHBuffer protected () extends StObject {
  def this(opts: Buffer) = this()
  
  def atEnd(): Boolean = js.native
  
  def expand(): Unit = js.native
  
  def readBuffer(): typings.node.bufferMod.global.Buffer = js.native
  
  def readCString(): String = js.native
  
  def readChar(): String = js.native
  
  def readInt(): Double = js.native
  
  def readInt64(): typings.node.bufferMod.global.Buffer = js.native
  
  def readPart(): SSHPart = js.native
  
  def readString(): String = js.native
  
  def remainder(): typings.node.bufferMod.global.Buffer = js.native
  
  def skip(n: Double): Unit = js.native
  
  def toBuffer(): typings.node.bufferMod.global.Buffer = js.native
  
  def write(buf: typings.node.bufferMod.global.Buffer): Unit = js.native
  
  def writeBuffer(buf: typings.node.bufferMod.global.Buffer): Unit = js.native
  
  def writeCString(buf: String): Unit = js.native
  
  def writeChar(buf: String): Unit = js.native
  
  def writeInt(buf: Double): Unit = js.native
  
  def writeInt64(buf: typings.node.bufferMod.global.Buffer): Unit = js.native
  
  def writePart(buf: SSHPart): Unit = js.native
  
  def writeString(buf: String): Unit = js.native
}
