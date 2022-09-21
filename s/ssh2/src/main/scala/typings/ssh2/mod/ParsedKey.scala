package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedKey extends StObject {
  
  var comment: String = js.native
  
  def equals(key: String): Boolean = js.native
  def equals(key: Buffer): Boolean = js.native
  def equals(key: ParsedKey): Boolean = js.native
  
  def getPrivatePEM(): String = js.native
  
  def getPublicPEM(): String = js.native
  
  def getPublicSSH(): Buffer = js.native
  
  def isPrivateKey(): Boolean = js.native
  
  def sign(data: String): Buffer = js.native
  def sign(data: String, algo: String): Buffer = js.native
  def sign(data: Buffer): Buffer = js.native
  def sign(data: Buffer, algo: String): Buffer = js.native
  
  var `type`: KeyType = js.native
  
  def verify(data: String, signature: Buffer): Boolean = js.native
  def verify(data: String, signature: Buffer, algo: String): Boolean = js.native
  def verify(data: Buffer, signature: Buffer): Boolean = js.native
  def verify(data: Buffer, signature: Buffer, algo: String): Boolean = js.native
}
