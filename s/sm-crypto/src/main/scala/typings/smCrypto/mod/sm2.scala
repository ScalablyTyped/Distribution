package typings.smCrypto.mod

import typings.smCrypto.anon.Der
import typings.smCrypto.anon.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sm-crypto", "sm2")
@js.native
object sm2 extends js.Object {
  
  def doDecrypt(encryptData: String, privateKey: String): String = js.native
  def doDecrypt(encryptData: String, privateKey: String, cipherMode: CipherMode): String = js.native
  
  def doEncrypt(msg: String, publicKey: String): String = js.native
  def doEncrypt(msg: String, publicKey: String, cipherMode: CipherMode): String = js.native
  
  def doSignature(msg: String, privateKey: String): String = js.native
  def doSignature(msg: String, privateKey: String, options: Der): String = js.native
  
  def doVerifySignature(msg: String, signHex: String, publicKey: String): Boolean = js.native
  def doVerifySignature(msg: String, signHex: String, publicKey: String, options: Hash): Boolean = js.native
  
  def generateKeyPairHex(): KeyPairHex = js.native
  
  def getPoint(): KeyPairPoint = js.native
}
