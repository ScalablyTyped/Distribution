package typings.reactNativeCryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherHelper extends StObject {
  
  def decrypt(ciphertext: String, key: String): WordArray = js.native
  def decrypt(ciphertext: String, key: String, cfg: CipherOption): WordArray = js.native
  def decrypt(ciphertext: String, key: WordArray): WordArray = js.native
  def decrypt(ciphertext: String, key: WordArray, cfg: CipherOption): WordArray = js.native
  def decrypt(ciphertext: CipherParams, key: String): WordArray = js.native
  def decrypt(ciphertext: CipherParams, key: String, cfg: CipherOption): WordArray = js.native
  def decrypt(ciphertext: CipherParams, key: WordArray): WordArray = js.native
  def decrypt(ciphertext: CipherParams, key: WordArray, cfg: CipherOption): WordArray = js.native
  
  def encrypt(message: String, key: String): CipherParams = js.native
  def encrypt(message: String, key: String, cfg: CipherOption): CipherParams = js.native
  def encrypt(message: String, key: WordArray): CipherParams = js.native
  def encrypt(message: String, key: WordArray, cfg: CipherOption): CipherParams = js.native
  def encrypt(message: WordArray, key: String): CipherParams = js.native
  def encrypt(message: WordArray, key: String, cfg: CipherOption): CipherParams = js.native
  def encrypt(message: WordArray, key: WordArray): CipherParams = js.native
  def encrypt(message: WordArray, key: WordArray, cfg: CipherOption): CipherParams = js.native
}
