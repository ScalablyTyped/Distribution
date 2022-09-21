package typings.secretBlob

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secret-blob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("secret-blob", "HEADERBYTES")
  @js.native
  val HEADERBYTES: Double = js.native
  
  @JSImport("secret-blob", "KEYBYTES")
  @js.native
  val KEYBYTES: Double = js.native
  
  inline def decrypt[TBuf /* <: Buffer */](ciphertext: Buffer, key: Buffer): TBuf = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[TBuf]
  inline def decrypt[TBuf /* <: Buffer */](ciphertext: Buffer, key: Buffer, plaintext: TBuf): TBuf = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], plaintext.asInstanceOf[js.Any])).asInstanceOf[TBuf]
  
  inline def decryptLength(ciphertext: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptLength")(ciphertext.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def encrypt(plaintext: Buffer, key: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(plaintext.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encrypt(plaintext: Buffer, key: Buffer, ciphertext: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(plaintext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encryptLength(plaintext: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptLength")(plaintext.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def keygen[TBuf /* <: Buffer */](): TBuf = ^.asInstanceOf[js.Dynamic].applyDynamic("keygen")().asInstanceOf[TBuf]
  inline def keygen[TBuf /* <: Buffer */](key: TBuf): TBuf = ^.asInstanceOf[js.Dynamic].applyDynamic("keygen")(key.asInstanceOf[js.Any]).asInstanceOf[TBuf]
}
