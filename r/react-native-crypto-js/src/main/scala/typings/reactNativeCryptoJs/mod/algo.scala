package typings.reactNativeCryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Algorithm namespace.
  */
object algo {
  
  /**
    * AES block cipher algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.AES")
  @js.native
  val AES: CipherStatic = js.native
  
  /**
    * DES block cipher algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.DES")
  @js.native
  val DES: CipherStatic = js.native
  
  /**
    * This key derivation function is meant to conform with EVP_BytesToKey.
    * www.openssl.org/docs/crypto/EVP_BytesToKey.html
    */
  @JSImport("react-native-crypto-js", "algo.EvpKDF")
  @js.native
  abstract class EvpKDF ()
    extends typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.EvpKDF
  object EvpKDF {
    
    @JSImport("react-native-crypto-js", "algo.EvpKDF")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initializes a newly created key derivation function.
      *
      * @param cfg (Optional) The configuration options to use for the derivation.
      *
      * @example
      *
      *     var kdf = RNCryptoJS.algo.EvpKDF.create();
      *     var kdf = RNCryptoJS.algo.EvpKDF.create({ keySize: 8 });
      *     var kdf = RNCryptoJS.algo.EvpKDF.create({ keySize: 8, iterations: 1000 });
      */
    /* static member */
    inline def create(): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.EvpKDF = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.EvpKDF]
    inline def create(cfg: typings.reactNativeCryptoJs.anon.Hasher): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.EvpKDF = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cfg.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.EvpKDF]
  }
  
  /**
    * HMAC algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.HMAC")
  @js.native
  abstract class HMAC ()
    extends typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.HMAC
  object HMAC {
    
    @JSImport("react-native-crypto-js", "algo.HMAC")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(hasher: HasherStatic, key: String): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.HMAC = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hasher.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.HMAC]
    /**
      * Initializes a newly created HMAC.
      *
      * @param hasher The hash algorithm to use.
      * @param key The secret key.
      *
      * @example
      *
      *     var hmacHasher = RNCryptoJS.algo.HMAC.create(RNCryptoJS.algo.SHA256, key);
      */
    /* static member */
    inline def create(hasher: HasherStatic, key: WordArray): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.HMAC = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(hasher.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.HMAC]
  }
  
  /**
    * MD5 hash algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.MD5")
  @js.native
  val MD5: HasherStatic = js.native
  
  /**
    * Password-Based Key Derivation Function 2 algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.PBKDF2")
  @js.native
  abstract class PBKDF2 ()
    extends typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.PBKDF2
  object PBKDF2 {
    
    @JSImport("react-native-crypto-js", "algo.PBKDF2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initializes a newly created key derivation function.
      *
      * @param cfg (Optional) The configuration options to use for the derivation.
      *
      * @example
      *
      *     var kdf = RNCryptoJS.algo.PBKDF2.create();
      *     var kdf = RNCryptoJS.algo.PBKDF2.create({ keySize: 8 });
      *     var kdf = RNCryptoJS.algo.PBKDF2.create({ keySize: 8, iterations: 1000 });
      */
    /* static member */
    inline def create(): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.PBKDF2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.PBKDF2]
    inline def create(cfg: KDFOption): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.PBKDF2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cfg.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.PBKDF2]
  }
  
  /**
    * RC4 stream cipher algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.RC4")
  @js.native
  val RC4: CipherStatic = js.native
  
  /**
    * Modified RC4 stream cipher algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.RC4Drop")
  @js.native
  val RC4Drop: CipherStatic = js.native
  
  /**
    * RIPEMD160 hash algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.RIPEMD160")
  @js.native
  val RIPEMD160: HasherStatic = js.native
  
  /**
    * Rabbit stream cipher algorithm
    */
  @JSImport("react-native-crypto-js", "algo.Rabbit")
  @js.native
  val Rabbit: CipherStatic = js.native
  
  /**
    * Rabbit stream cipher algorithm.
    *
    * This is a legacy version that neglected to convert the key to little-endian.
    * This error doesn't affect the cipher's security,
    * but it does affect its compatibility with other implementations.
    */
  @JSImport("react-native-crypto-js", "algo.RabbitLegacy")
  @js.native
  val RabbitLegacy: CipherStatic = js.native
  
  /**
    * SHA-1 hash algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.SHA1")
  @js.native
  val SHA1: HasherStatic = js.native
  
  /**
    * SHA-224 hash algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.SHA224")
  @js.native
  val SHA224: HasherStatic = js.native
  
  /**
    * SHA-256 hash algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.SHA256")
  @js.native
  val SHA256: HasherStatic = js.native
  
  /**
    * SHA-3 hash algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.SHA3")
  @js.native
  val SHA3: HasherStatic = js.native
  
  /**
    * SHA-384 hash algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.SHA384")
  @js.native
  val SHA384: HasherStatic = js.native
  
  /**
    * SHA-512 hash algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.SHA512")
  @js.native
  val SHA512: HasherStatic = js.native
  
  /**
    * Triple-DES block cipher algorithm.
    */
  @JSImport("react-native-crypto-js", "algo.TripleDES")
  @js.native
  val TripleDES: CipherStatic = js.native
}
