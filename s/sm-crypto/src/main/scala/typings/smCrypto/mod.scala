package typings.smCrypto

import typings.smCrypto.anon.Der
import typings.smCrypto.anon.Hash
import typings.smCrypto.smCryptoStrings.array
import typings.smCrypto.smCryptoStrings.cbc
import typings.smCrypto.smCryptoStrings.none
import typings.smCrypto.smCryptoStrings.pkcsNumbersign5
import typings.smCrypto.smCryptoStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sm-crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object sm2 {
    
    @JSImport("sm-crypto", "sm2")
    @js.native
    val ^ : js.Any = js.native
    
    inline def doDecrypt(encryptData: String, privateKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("doDecrypt")(encryptData.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def doDecrypt(encryptData: String, privateKey: String, cipherMode: CipherMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("doDecrypt")(encryptData.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], cipherMode.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def doEncrypt(msg: String, publicKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("doEncrypt")(msg.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def doEncrypt(msg: String, publicKey: String, cipherMode: CipherMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("doEncrypt")(msg.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], cipherMode.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def doSignature(msg: String, privateKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("doSignature")(msg.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def doSignature(msg: String, privateKey: String, options: Der): String = (^.asInstanceOf[js.Dynamic].applyDynamic("doSignature")(msg.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def doVerifySignature(msg: String, signHex: String, publicKey: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doVerifySignature")(msg.asInstanceOf[js.Any], signHex.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def doVerifySignature(msg: String, signHex: String, publicKey: String, options: Hash): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doVerifySignature")(msg.asInstanceOf[js.Any], signHex.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def generateKeyPairHex(): KeyPairHex = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairHex")().asInstanceOf[KeyPairHex]
    
    inline def getPoint(): KeyPairPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("getPoint")().asInstanceOf[KeyPairPoint]
  }
  
  inline def sm3(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sm3")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object sm4 {
    
    @JSImport("sm-crypto", "sm4")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(inArray: js.Array[Double], key: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: js.Array[Double], key: js.Array[Double], mode: SM4ModeArrayOutput): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def decrypt(inArray: js.Array[Double], key: js.Array[Double], mode: SM4ModeBase): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: js.Array[Double], key: js.Array[Double], mode: SM4ModeStringOutput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: js.Array[Double], key: HexString): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: js.Array[Double], key: HexString, mode: SM4ModeArrayOutput): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def decrypt(inArray: js.Array[Double], key: HexString, mode: SM4ModeBase): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: js.Array[Double], key: HexString, mode: SM4ModeStringOutput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: HexString, key: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: HexString, key: js.Array[Double], mode: SM4ModeArrayOutput): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def decrypt(inArray: HexString, key: js.Array[Double], mode: SM4ModeBase): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: HexString, key: js.Array[Double], mode: SM4ModeStringOutput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: HexString, key: HexString): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: HexString, key: HexString, mode: SM4ModeArrayOutput): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def decrypt(inArray: HexString, key: HexString, mode: SM4ModeBase): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def decrypt(inArray: HexString, key: HexString, mode: SM4ModeStringOutput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def encrypt(inArray: js.Array[Double], key: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: js.Array[Double], key: js.Array[Double], mode: SM4ModeArrayOutput): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def encrypt(inArray: js.Array[Double], key: js.Array[Double], mode: SM4ModeBase): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: js.Array[Double], key: js.Array[Double], mode: SM4ModeStringOutput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: js.Array[Double], key: HexString): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: js.Array[Double], key: HexString, mode: SM4ModeArrayOutput): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def encrypt(inArray: js.Array[Double], key: HexString, mode: SM4ModeBase): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: js.Array[Double], key: HexString, mode: SM4ModeStringOutput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: UTF8String, key: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: UTF8String, key: js.Array[Double], mode: SM4ModeArrayOutput): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def encrypt(inArray: UTF8String, key: js.Array[Double], mode: SM4ModeBase): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: UTF8String, key: js.Array[Double], mode: SM4ModeStringOutput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: UTF8String, key: HexString): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: UTF8String, key: HexString, mode: SM4ModeArrayOutput): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def encrypt(inArray: UTF8String, key: HexString, mode: SM4ModeBase): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encrypt(inArray: UTF8String, key: HexString, mode: SM4ModeStringOutput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(inArray.asInstanceOf[js.Any], key.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smCrypto.smCryptoNumbers.`0`
    - typings.smCrypto.smCryptoNumbers.`1`
  */
  trait CipherMode extends StObject
  object CipherMode {
    
    inline def `0`: typings.smCrypto.smCryptoNumbers.`0` = 0.asInstanceOf[typings.smCrypto.smCryptoNumbers.`0`]
    
    inline def `1`: typings.smCrypto.smCryptoNumbers.`1` = 1.asInstanceOf[typings.smCrypto.smCryptoNumbers.`1`]
  }
  
  type HexString = String
  
  trait KeyPairHex extends StObject {
    
    var privateKey: String
    
    var publicKey: String
  }
  object KeyPairHex {
    
    inline def apply(privateKey: String, publicKey: String): KeyPairHex = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPairHex]
    }
    
    extension [Self <: KeyPairHex](x: Self) {
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyPairPoint
    extends StObject
       with KeyPairHex {
    
    var k: typings.bigi.mod.^
    
    var x1: typings.bigi.mod.^
  }
  object KeyPairPoint {
    
    inline def apply(k: typings.bigi.mod.^, privateKey: String, publicKey: String, x1: typings.bigi.mod.^): KeyPairPoint = {
      val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPairPoint]
    }
    
    extension [Self <: KeyPairPoint](x: Self) {
      
      inline def setK(value: typings.bigi.mod.^): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setX1(value: typings.bigi.mod.^): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    }
  }
  
  trait SM4ModeArrayOutput
    extends StObject
       with SM4ModeBase {
    
    var output: array
  }
  object SM4ModeArrayOutput {
    
    inline def apply(): SM4ModeArrayOutput = {
      val __obj = js.Dynamic.literal(output = "array")
      __obj.asInstanceOf[SM4ModeArrayOutput]
    }
    
    extension [Self <: SM4ModeArrayOutput](x: Self) {
      
      inline def setOutput(value: array): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait SM4ModeBase extends StObject {
    
    var iv: js.UndefOr[js.Array[Double] | HexString] = js.undefined
    
    var mode: js.UndefOr[cbc] = js.undefined
    
    var padding: js.UndefOr[none | pkcsNumbersign5] = js.undefined
  }
  object SM4ModeBase {
    
    inline def apply(): SM4ModeBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SM4ModeBase]
    }
    
    extension [Self <: SM4ModeBase](x: Self) {
      
      inline def setIv(value: js.Array[Double] | HexString): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setIvVarargs(value: Double*): Self = StObject.set(x, "iv", js.Array(value*))
      
      inline def setMode(value: cbc): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPadding(value: none | pkcsNumbersign5): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  trait SM4ModeStringOutput
    extends StObject
       with SM4ModeBase {
    
    var output: string
  }
  object SM4ModeStringOutput {
    
    inline def apply(): SM4ModeStringOutput = {
      val __obj = js.Dynamic.literal(output = "string")
      __obj.asInstanceOf[SM4ModeStringOutput]
    }
    
    extension [Self <: SM4ModeStringOutput](x: Self) {
      
      inline def setOutput(value: string): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  type UTF8String = String
}
