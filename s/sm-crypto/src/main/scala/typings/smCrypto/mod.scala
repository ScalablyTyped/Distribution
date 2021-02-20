package typings.smCrypto

import typings.bigi.mod.^
import typings.smCrypto.anon.Der
import typings.smCrypto.anon.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object sm2 {
    
    @JSImport("sm-crypto", "sm2.doDecrypt")
    @js.native
    def doDecrypt(encryptData: String, privateKey: String): String = js.native
    @JSImport("sm-crypto", "sm2.doDecrypt")
    @js.native
    def doDecrypt(encryptData: String, privateKey: String, cipherMode: CipherMode): String = js.native
    
    @JSImport("sm-crypto", "sm2.doEncrypt")
    @js.native
    def doEncrypt(msg: String, publicKey: String): String = js.native
    @JSImport("sm-crypto", "sm2.doEncrypt")
    @js.native
    def doEncrypt(msg: String, publicKey: String, cipherMode: CipherMode): String = js.native
    
    @JSImport("sm-crypto", "sm2.doSignature")
    @js.native
    def doSignature(msg: String, privateKey: String): String = js.native
    @JSImport("sm-crypto", "sm2.doSignature")
    @js.native
    def doSignature(msg: String, privateKey: String, options: Der): String = js.native
    
    @JSImport("sm-crypto", "sm2.doVerifySignature")
    @js.native
    def doVerifySignature(msg: String, signHex: String, publicKey: String): Boolean = js.native
    @JSImport("sm-crypto", "sm2.doVerifySignature")
    @js.native
    def doVerifySignature(msg: String, signHex: String, publicKey: String, options: Hash): Boolean = js.native
    
    @JSImport("sm-crypto", "sm2.generateKeyPairHex")
    @js.native
    def generateKeyPairHex(): KeyPairHex = js.native
    
    @JSImport("sm-crypto", "sm2.getPoint")
    @js.native
    def getPoint(): KeyPairPoint = js.native
  }
  
  @JSImport("sm-crypto", "sm3")
  @js.native
  def sm3(str: String): String = js.native
  
  object sm4 {
    
    @JSImport("sm-crypto", "sm4.decrypt")
    @js.native
    def decrypt(inArray: js.Array[Double], key: js.Array[Double]): js.Array[Double] = js.native
    
    @JSImport("sm-crypto", "sm4.encrypt")
    @js.native
    def encrypt(inArray: js.Array[Double], key: js.Array[Double]): js.Array[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smCrypto.smCryptoNumbers.`0`
    - typings.smCrypto.smCryptoNumbers.`1`
  */
  trait CipherMode extends StObject
  object CipherMode {
    
    @scala.inline
    def `0`: typings.smCrypto.smCryptoNumbers.`0` = 0.asInstanceOf[typings.smCrypto.smCryptoNumbers.`0`]
    
    @scala.inline
    def `1`: typings.smCrypto.smCryptoNumbers.`1` = 1.asInstanceOf[typings.smCrypto.smCryptoNumbers.`1`]
  }
  
  @js.native
  trait KeyPairHex extends StObject {
    
    var privateKey: String = js.native
    
    var publicKey: String = js.native
  }
  object KeyPairHex {
    
    @scala.inline
    def apply(privateKey: String, publicKey: String): KeyPairHex = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPairHex]
    }
    
    @scala.inline
    implicit class KeyPairHexMutableBuilder[Self <: KeyPairHex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyPairPoint extends KeyPairHex {
    
    var k: ^ = js.native
    
    var x1: ^ = js.native
  }
  object KeyPairPoint {
    
    @scala.inline
    def apply(k: ^, privateKey: String, publicKey: String, x1: ^): KeyPairPoint = {
      val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPairPoint]
    }
    
    @scala.inline
    implicit class KeyPairPointMutableBuilder[Self <: KeyPairPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setK(value: ^): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: ^): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    }
  }
}
