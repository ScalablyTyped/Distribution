package typings.reactNativeCryptoJs

import typings.reactNativeCryptoJs.anon.Hasher
import typings.reactNativeCryptoJs.anon.PartialCipherParams
import typings.reactNativeCryptoJs.mod.BlockCipherMode
import typings.reactNativeCryptoJs.mod.CipherHelper
import typings.reactNativeCryptoJs.mod.CipherOption
import typings.reactNativeCryptoJs.mod.CipherParams
import typings.reactNativeCryptoJs.mod.CipherStatic
import typings.reactNativeCryptoJs.mod.Encoder
import typings.reactNativeCryptoJs.mod.Format_
import typings.reactNativeCryptoJs.mod.HasherHelper
import typings.reactNativeCryptoJs.mod.HasherStatic
import typings.reactNativeCryptoJs.mod.HmacHasherHelper
import typings.reactNativeCryptoJs.mod.KDFOption
import typings.reactNativeCryptoJs.mod.Padding
import typings.reactNativeCryptoJs.mod.WordArray
import typings.reactNativeCryptoJs.mod.X64Word
import typings.reactNativeCryptoJs.mod.X64WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("react-native-crypto-js/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Shortcut functions to the cipher's object interface.
    *
    * @example
    *
    *     var ciphertext = RNCryptoJS.AES.encrypt(message, key, cfg);
    *     var plaintext  = RNCryptoJS.AES.decrypt(ciphertext, key, cfg);
    */
  @JSImport("react-native-crypto-js/core", "AES")
  @js.native
  val AES: CipherHelper = js.native
  
  /**
    * Shortcut functions to the cipher's object interface.
    *
    * @example
    *
    *     var ciphertext = RNCryptoJS.DES.encrypt(message, key, cfg);
    *     var plaintext  = RNCryptoJS.DES.decrypt(ciphertext, key, cfg);
    */
  @JSImport("react-native-crypto-js/core", "DES")
  @js.native
  val DES: CipherHelper = js.native
  
  inline def EvpKDF(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: String, salt: String, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: String, salt: WordArray, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: WordArray, salt: String, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  /**
    * Derives a key from a password.
    *
    * @param password The password.
    * @param salt A salt.
    * @param cfg (Optional) The configuration options to use for this computation.
    *
    * @return The derived key.
    *
    * @example
    *
    *     var key = RNCryptoJS.EvpKDF(password, salt);
    *     var key = RNCryptoJS.EvpKDF(password, salt, { keySize: 8 });
    *     var key = RNCryptoJS.EvpKDF(password, salt, { keySize: 8, iterations: 1000 });
    */
  inline def EvpKDF(password: WordArray, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def EvpKDF(password: WordArray, salt: WordArray, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  
  /**
    * Shortcut function to the HMAC's object interface.
    *
    * @param message The message to hash.
    * @param key The secret key.
    *
    * @return The HMA'C.
    *
    * @example
    *
    *     var hmac = RNCryptoJS.HmacMD5(message, key);
    */
  @JSImport("react-native-crypto-js/core", "HmacMD5")
  @js.native
  val HmacMD5: HmacHasherHelper = js.native
  
  /**
    * Shortcut function to the HMAC's object interface.
    *
    * @param message The message to hash.
    * @param key The secret key.
    *
    * @return The HMAC.
    *
    * @example
    *
    *     var hmac = RNCryptoJS.HmacRIPEMD160(message, key);
    */
  @JSImport("react-native-crypto-js/core", "HmacRIPEMD160")
  @js.native
  val HmacRIPEMD160: HmacHasherHelper = js.native
  
  /**
    * Shortcut function to the HMAC's object interface.
    *
    * @param message The message to hash.
    * @param key The secret key.
    *
    * @return The HMAC.
    *
    * @example
    *
    *     var hmac = RNCryptoJS.HmacSHA1(message, key);
    */
  @JSImport("react-native-crypto-js/core", "HmacSHA1")
  @js.native
  val HmacSHA1: HmacHasherHelper = js.native
  
  /**
    * Shortcut function to the HMAC's object interface.
    *
    * @param message The message to hash.
    * @param key The secret key.
    *
    * @return The HMAC.
    *
    * @example
    *
    *     var hmac = RNCryptoJS.HmacSHA224(message, key);
    */
  @JSImport("react-native-crypto-js/core", "HmacSHA224")
  @js.native
  val HmacSHA224: HmacHasherHelper = js.native
  
  /**
    * Shortcut function to the HMAC's object interface.
    *
    * @param message The message to hash.
    * @param key The secret key.
    *
    * @return The HMAC.
    *
    * @example
    *
    *     var hmac = RNCryptoJS.HmacSHA256(message, key);
    */
  @JSImport("react-native-crypto-js/core", "HmacSHA256")
  @js.native
  val HmacSHA256: HmacHasherHelper = js.native
  
  /**
    * Shortcut function to the HMAC's object interface.
    *
    * @param message The message to hash.
    * @param key The secret key.
    *
    * @return The HMAC.
    *
    * @example
    *
    *     var hmac = RNCryptoJS.HmacSHA3(message, key);
    */
  @JSImport("react-native-crypto-js/core", "HmacSHA3")
  @js.native
  val HmacSHA3: HmacHasherHelper = js.native
  
  /**
    * Shortcut function to the HMAC's object interface.
    *
    * @param message The message to hash.
    * @param key The secret key.
    *
    * @return The HMAC.
    *
    * @example
    *
    *     var hmac = RNCryptoJS.HmacSHA384(message, key);
    */
  @JSImport("react-native-crypto-js/core", "HmacSHA384")
  @js.native
  val HmacSHA384: HmacHasherHelper = js.native
  
  /**
    * Shortcut function to the HMAC's object interface.
    *
    * @param message The message to hash.
    * @param key The secret key.
    *
    * @return The HMAC.
    *
    * @example
    *
    *     var hmac = RNCryptoJS.HmacSHA512(message, key);
    */
  @JSImport("react-native-crypto-js/core", "HmacSHA512")
  @js.native
  val HmacSHA512: HmacHasherHelper = js.native
  
  /**
    * Shortcut function to the hasher's object interface.
    *
    * @param message The message to hash.
    *
    * @return The hash.
    *
    * @example
    *
    *     var hash = RNCryptoJS.MD5('message');
    *     var hash = RNCryptoJS.MD5(wordArray);
    */
  @JSImport("react-native-crypto-js/core", "MD5")
  @js.native
  val MD5: HasherHelper = js.native
  
  inline def PBKDF2(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: String, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: String, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: WordArray, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  /**
    * Computes the Password-Based Key Derivation Function 2.
    *
    * @param password The password.
    * @param salt A salt.
    * @param cfg (Optional) The configuration options to use for this computation.
    *
    * @return The derived key.
    *
    * @example
    *
    *     var key = RNCryptoJS.PBKDF2(password, salt);
    *     var key = RNCryptoJS.PBKDF2(password, salt, { keySize: 8 });
    *     var key = RNCryptoJS.PBKDF2(password, salt, { keySize: 8, iterations: 1000 });
    */
  inline def PBKDF2(password: WordArray, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def PBKDF2(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  
  /**
    * Shortcut functions to the cipher's object interface.
    *
    * @example
    *
    *     var ciphertext = RNCryptoJS.RC4.encrypt(message, key, cfg);
    *     var plaintext  = RNCryptoJS.RC4.decrypt(ciphertext, key, cfg);
    */
  @JSImport("react-native-crypto-js/core", "RC4")
  @js.native
  val RC4: CipherHelper = js.native
  
  /**
    * Shortcut functions to the cipher's object interface.
    *
    * @example
    *
    *     var ciphertext = RNCryptoJS.RC4Drop.encrypt(message, key, cfg);
    *     var plaintext  = RNCryptoJS.RC4Drop.decrypt(ciphertext, key, cfg);
    */
  @JSImport("react-native-crypto-js/core", "RC4Drop")
  @js.native
  val RC4Drop: CipherHelper = js.native
  
  /**
    * Shortcut function to the hasher's object interface.
    *
    * @param message The message to hash.
    *
    * @return The hash.
    *
    * @example
    *
    *     var hash = RNCryptoJS.RIPEMD160('message');
    *     var hash = RNCryptoJS.RIPEMD160(wordArray);
    */
  @JSImport("react-native-crypto-js/core", "RIPEMD160")
  @js.native
  val RIPEMD160: HasherHelper = js.native
  
  /**
    * Shortcut functions to the cipher's object interface.
    *
    * @example
    *
    *     var ciphertext = RNCryptoJS.Rabbit.encrypt(message, key, cfg);
    *     var plaintext  = RNCryptoJS.Rabbit.decrypt(ciphertext, key, cfg);
    */
  @JSImport("react-native-crypto-js/core", "Rabbit")
  @js.native
  val Rabbit: CipherHelper = js.native
  
  /**
    * Shortcut functions to the cipher's object interface.
    *
    * @example
    *
    *     var ciphertext = RNCryptoJS.RabbitLegacy.encrypt(message, key, cfg);
    *     var plaintext  = RNCryptoJS.RabbitLegacy.decrypt(ciphertext, key, cfg);
    */
  @JSImport("react-native-crypto-js/core", "RabbitLegacy")
  @js.native
  val RabbitLegacy: CipherHelper = js.native
  
  /**
    * Shortcut function to the hasher's object interface.
    *
    * @param message The message to hash.
    *
    * @return The hash.
    *
    * @example
    *
    *     var hash = RNCryptoJS.SHA1('message');
    *     var hash = RNCryptoJS.SHA1(wordArray);
    */
  @JSImport("react-native-crypto-js/core", "SHA1")
  @js.native
  val SHA1: HasherHelper = js.native
  
  /**
    * Shortcut function to the hasher's object interface.
    *
    * @param message The message to hash.
    *
    * @return The hash.
    *
    * @example
    *
    *     var hash = RNCryptoJS.SHA224('message');
    *     var hash = RNCryptoJS.SHA224(wordArray);
    */
  @JSImport("react-native-crypto-js/core", "SHA224")
  @js.native
  val SHA224: HasherHelper = js.native
  
  /**
    * Shortcut function to the hasher's object interface.
    *
    * @param message The message to hash.
    *
    * @return The hash.
    *
    * @example
    *
    *     var hash = RNCryptoJS.SHA256('message');
    *     var hash = RNCryptoJS.SHA256(wordArray);
    */
  @JSImport("react-native-crypto-js/core", "SHA256")
  @js.native
  val SHA256: HasherHelper = js.native
  
  /**
    * Shortcut function to the hasher's object interface.
    *
    * @param message The message to hash.
    *
    * @return The hash.
    *
    * @example
    *
    *     var hash = RNCryptoJS.SHA3('message');
    *     var hash = RNCryptoJS.SHA3(wordArray);
    */
  @JSImport("react-native-crypto-js/core", "SHA3")
  @js.native
  val SHA3: HasherHelper = js.native
  
  /**
    * Shortcut function to the hasher's object interface.
    *
    * @param message The message to hash.
    *
    * @return The hash.
    *
    * @example
    *
    *     var hash = RNCryptoJS.SHA384('message');
    *     var hash = RNCryptoJS.SHA384(wordArray);
    */
  @JSImport("react-native-crypto-js/core", "SHA384")
  @js.native
  val SHA384: HasherHelper = js.native
  
  /**
    * Shortcut function to the hasher's object interface.
    *
    * @param message The message to hash.
    *
    * @return The hash.
    *
    * @example
    *
    *     var hash = RNCryptoJS.SHA512('message');
    *     var hash = RNCryptoJS.SHA512(wordArray);
    */
  @JSImport("react-native-crypto-js/core", "SHA512")
  @js.native
  val SHA512: HasherHelper = js.native
  
  /**
    * Shortcut functions to the cipher's object interface.
    *
    * @example
    *
    *     var ciphertext = RNCryptoJS.TripleDES.encrypt(message, key, cfg);
    *     var plaintext  = RNCryptoJS.TripleDES.decrypt(ciphertext, key, cfg);
    */
  @JSImport("react-native-crypto-js/core", "TripleDES")
  @js.native
  val TripleDES: CipherHelper = js.native
  
  /**
    * Algorithm namespace.
    */
  object algo {
    
    /**
      * AES block cipher algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.AES")
    @js.native
    val AES: CipherStatic = js.native
    
    /**
      * DES block cipher algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.DES")
    @js.native
    val DES: CipherStatic = js.native
    
    /**
      * This key derivation function is meant to conform with EVP_BytesToKey.
      * www.openssl.org/docs/crypto/EVP_BytesToKey.html
      */
    @JSImport("react-native-crypto-js/core", "algo.EvpKDF")
    @js.native
    abstract class EvpKDF ()
      extends typings.reactNativeCryptoJs.mod.algo.EvpKDF
    object EvpKDF {
      
      @JSImport("react-native-crypto-js/core", "algo.EvpKDF")
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
      inline def create(cfg: Hasher): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.EvpKDF = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cfg.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.algo.EvpKDF]
    }
    
    /**
      * HMAC algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.HMAC")
    @js.native
    abstract class HMAC ()
      extends typings.reactNativeCryptoJs.mod.algo.HMAC
    object HMAC {
      
      @JSImport("react-native-crypto-js/core", "algo.HMAC")
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
    @JSImport("react-native-crypto-js/core", "algo.MD5")
    @js.native
    val MD5: HasherStatic = js.native
    
    /**
      * Password-Based Key Derivation Function 2 algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.PBKDF2")
    @js.native
    abstract class PBKDF2 ()
      extends typings.reactNativeCryptoJs.mod.algo.PBKDF2
    object PBKDF2 {
      
      @JSImport("react-native-crypto-js/core", "algo.PBKDF2")
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
    @JSImport("react-native-crypto-js/core", "algo.RC4")
    @js.native
    val RC4: CipherStatic = js.native
    
    /**
      * Modified RC4 stream cipher algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.RC4Drop")
    @js.native
    val RC4Drop: CipherStatic = js.native
    
    /**
      * RIPEMD160 hash algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.RIPEMD160")
    @js.native
    val RIPEMD160: HasherStatic = js.native
    
    /**
      * Rabbit stream cipher algorithm
      */
    @JSImport("react-native-crypto-js/core", "algo.Rabbit")
    @js.native
    val Rabbit: CipherStatic = js.native
    
    /**
      * Rabbit stream cipher algorithm.
      *
      * This is a legacy version that neglected to convert the key to little-endian.
      * This error doesn't affect the cipher's security,
      * but it does affect its compatibility with other implementations.
      */
    @JSImport("react-native-crypto-js/core", "algo.RabbitLegacy")
    @js.native
    val RabbitLegacy: CipherStatic = js.native
    
    /**
      * SHA-1 hash algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.SHA1")
    @js.native
    val SHA1: HasherStatic = js.native
    
    /**
      * SHA-224 hash algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.SHA224")
    @js.native
    val SHA224: HasherStatic = js.native
    
    /**
      * SHA-256 hash algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.SHA256")
    @js.native
    val SHA256: HasherStatic = js.native
    
    /**
      * SHA-3 hash algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.SHA3")
    @js.native
    val SHA3: HasherStatic = js.native
    
    /**
      * SHA-384 hash algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.SHA384")
    @js.native
    val SHA384: HasherStatic = js.native
    
    /**
      * SHA-512 hash algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.SHA512")
    @js.native
    val SHA512: HasherStatic = js.native
    
    /**
      * Triple-DES block cipher algorithm.
      */
    @JSImport("react-native-crypto-js/core", "algo.TripleDES")
    @js.native
    val TripleDES: CipherStatic = js.native
  }
  
  /**
    * Encoder namespace.
    */
  object enc {
    
    /**
      * Base64 encoding strategy.
      */
    @JSImport("react-native-crypto-js/core", "enc.Base64")
    @js.native
    val Base64: Encoder = js.native
    
    /**
      * Base64url encoding strategy.
      */
    @JSImport("react-native-crypto-js/core", "enc.Base64url")
    @js.native
    val Base64url: Encoder = js.native
    
    /**
      * Hex encoding strategy.
      */
    @JSImport("react-native-crypto-js/core", "enc.Hex")
    @js.native
    val Hex: Encoder = js.native
    
    /**
      * Latin1 encoding strategy.
      */
    @JSImport("react-native-crypto-js/core", "enc.Latin1")
    @js.native
    val Latin1: Encoder = js.native
    
    /**
      * UTF-16 BE encoding strategy.
      */
    @JSImport("react-native-crypto-js/core", "enc.Utf16")
    @js.native
    val Utf16: Encoder = js.native
    
    @JSImport("react-native-crypto-js/core", "enc.Utf16BE")
    @js.native
    val Utf16BE: Encoder = js.native
    
    /**
      * UTF-16 LE encoding strategy.
      */
    @JSImport("react-native-crypto-js/core", "enc.Utf16LE")
    @js.native
    val Utf16LE: Encoder = js.native
    
    /**
      * UTF-8 encoding strategy.
      */
    @JSImport("react-native-crypto-js/core", "enc.Utf8")
    @js.native
    val Utf8: Encoder = js.native
  }
  
  /**
    * Format namespace.
    */
  object format {
    
    @JSImport("react-native-crypto-js/core", "format.Hex")
    @js.native
    val Hex: Format_ = js.native
    
    /**
      * OpenSSL formatting strategy.
      */
    @JSImport("react-native-crypto-js/core", "format.OpenSSL")
    @js.native
    val OpenSSL: Format_ = js.native
  }
  
  /**
    * Key derivation function namespace.
    */
  object kdf {
    
    /**
      * OpenSSL key derivation function.
      */
    object OpenSSL {
      
      @JSImport("react-native-crypto-js/core", "kdf.OpenSSL")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Derives a key and IV from a password.
        *
        * @param password The password to derive from.
        * @param keySize The size in words of the key to generate.
        * @param ivSize The size in words of the IV to generate.
        * @param salt (Optional) A 64-bit salt to use. If omitted, a salt will be generated randomly.
        *
        * @return A cipher params object with the key, IV, and salt.
        *
        * @example
        *
        *     var derivedParams = RNCryptoJS.kdf.OpenSSL.execute('Password', 256/32, 128/32);
        *     var derivedParams = RNCryptoJS.kdf.OpenSSL.execute('Password', 256/32, 128/32, 'saltsalt');
        */
      inline def execute(password: String, keySize: Double, ivSize: Double): CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(password.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any])).asInstanceOf[CipherParams]
      inline def execute(password: String, keySize: Double, ivSize: Double, salt: String): CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(password.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[CipherParams]
      inline def execute(password: String, keySize: Double, ivSize: Double, salt: WordArray): CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(password.asInstanceOf[js.Any], keySize.asInstanceOf[js.Any], ivSize.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[CipherParams]
    }
  }
  
  /**
    * Library namespace.
    */
  object lib {
    
    /**
      * Base object for prototypal inheritance.
      */
    object Base {
      
      @JSImport("react-native-crypto-js/core", "lib.Base")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Extends this object and runs the init method.
        * Arguments to create() will be passed to init().
        *
        * @return The new object.
        *
        * @example
        *
        *     var instance = MyType.create();
        */
      inline def create(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      /**
        * Creates a new object that inherits from this object.
        *
        * @param overrides Properties to copy into the new object.
        *
        * @return The new object.
        *
        * @example
        *
        *     var MyType = RNCryptoJS.lib.Base.extend({
        *         field: 'value',
        *
        *         method: function () {
        *         }
        *     });
        */
      inline def extend(overrides: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(overrides.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /**
        * Copies properties into this object.
        *
        * @param properties The properties to mix in.
        *
        * @example
        *
        *     MyType.mixIn({
        *         field: 'value'
        *     });
        */
      inline def mixIn(properties: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixIn")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
    
    /**
      * Abstract base block cipher mode template.
      */
    @JSImport("react-native-crypto-js/core", "lib.BlockCipherMode")
    @js.native
    val BlockCipherMode: Any = js.native
    
    @JSImport("react-native-crypto-js/core", "lib.BufferedBlockAlgorithm")
    @js.native
    val BufferedBlockAlgorithm: Any = js.native
    
    object Cipher {
      
      @JSImport("react-native-crypto-js/core", "lib.Cipher")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates shortcut functions to a cipher's object interface.
        *
        * @param cipher The cipher to create a helper for.
        *
        * @return An object with encrypt and decrypt shortcut functions.
        *
        * @example
        *
        *     var AES = RNCryptoJS.lib.Cipher._createHelper(RNCryptoJS.algo.AES);
        */
      inline def createHelper(cipher: typings.reactNativeCryptoJs.mod.Cipher): CipherHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("_createHelper")(cipher.asInstanceOf[js.Any]).asInstanceOf[CipherHelper]
    }
    
    object CipherParams {
      
      @JSImport("react-native-crypto-js/core", "lib.CipherParams")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initializes a newly created cipher params object.
        *
        * @param cipherParams An object with any of the possible cipher parameters.
        *
        * @example
        *
        *     var cipherParams = RNCryptoJS.lib.CipherParams.create({
        *         ciphertext: ciphertextWordArray,
        *         key: keyWordArray,
        *         iv: ivWordArray,
        *         salt: saltWordArray,
        *         algorithm: RNCryptoJS.algo.AES,
        *         mode: RNCryptoJS.mode.CBC,
        *         padding: RNCryptoJS.pad.PKCS7,
        *         blockSize: 4,
        *         formatter: RNCryptoJS.format.OpenSSL
        *     });
        */
      inline def create(cipherParams: PartialCipherParams): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(cipherParams.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
    }
    
    object Hasher {
      
      @JSImport("react-native-crypto-js/core", "lib.Hasher")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a shortcut function to a hasher's object interface.
        *
        * @param hasher The hasher to create a helper for.
        *
        * @return The shortcut function.
        *
        * @example
        *
        *     var SHA256 = RNCryptoJS.lib.Hasher._createHelper(RNCryptoJS.algo.SHA256);
        */
      inline def createHelper(hasher: HasherStatic): HasherHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("_createHelper")(hasher.asInstanceOf[js.Any]).asInstanceOf[HasherHelper]
      
      /**
        * Creates a shortcut function to the HMAC's object interface.
        *
        * @param hasher The hasher to use in this HMAC helper.
        *
        * @return The shortcut function.
        *
        * @example
        *
        *     var HmacSHA256 = RNCryptoJS.lib.Hasher._createHmacHelper(RNCryptoJS.algo.SHA256);
        */
      inline def createHmacHelper(hasher: HasherStatic): HmacHasherHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("_createHmacHelper")(hasher.asInstanceOf[js.Any]).asInstanceOf[HmacHasherHelper]
    }
    
    /**
      * A serializable cipher wrapper that derives the key from a password,
      * and returns ciphertext as a serializable cipher params object.
      */
    object PasswordBasedCipher {
      
      @JSImport("react-native-crypto-js/core", "lib.PasswordBasedCipher")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decrypt(cipher: CipherStatic, ciphertext: String, password: String): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray]
      inline def decrypt(cipher: CipherStatic, ciphertext: String, password: String, cfg: CipherOption): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], password.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray]
      /**
        * Decrypts serialized ciphertext using a password.
        *
        * @param cipher The cipher algorithm to use.
        * @param ciphertext The ciphertext to decrypt.
        * @param password The password.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return The plaintext.
        *
        * @example
        *
        *     var plaintext = RNCryptoJS.lib.PasswordBasedCipher.decrypt(RNCryptoJS.algo.AES, formattedCiphertext, 'password', { format: RNCryptoJS.format.OpenSSL });
        *     var plaintext = RNCryptoJS.lib.PasswordBasedCipher.decrypt(RNCryptoJS.algo.AES, ciphertextParams, 'password', { format: RNCryptoJS.format.OpenSSL });
        */
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams,
        password: String
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray]
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams,
        password: String,
        cfg: CipherOption
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], password.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray]
      
      inline def encrypt(cipher: CipherStatic, message: String, password: String): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      inline def encrypt(cipher: CipherStatic, message: String, password: String, cfg: CipherOption): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], password.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      /**
        * Encrypts a message using a password.
        *
        * @param cipher The cipher algorithm to use.
        * @param message The message to encrypt.
        * @param password The password.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return A cipher params object.
        *
        * @example
        *
        *     var ciphertextParams = RNCryptoJS.lib.PasswordBasedCipher.encrypt(RNCryptoJS.algo.AES, message, 'password');
        *     var ciphertextParams = RNCryptoJS.lib.PasswordBasedCipher.encrypt(RNCryptoJS.algo.AES, message, 'password', { format: RNCryptoJS.format.OpenSSL });
        */
      inline def encrypt(
        cipher: CipherStatic,
        message: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        password: String
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      inline def encrypt(
        cipher: CipherStatic,
        message: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        password: String,
        cfg: CipherOption
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], password.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
    }
    
    /**
      * A cipher wrapper that returns ciphertext as a serializable cipher params object.
      */
    object SerializableCipher {
      
      @JSImport("react-native-crypto-js/core", "lib.SerializableCipher")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: String,
        key: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: String,
        key: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      /**
        * Decrypts serialized ciphertext.
        *
        * @param cipher The cipher algorithm to use.
        * @param ciphertext The ciphertext to decrypt.
        * @param key The key.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return The plaintext.
        *
        * @example
        *
        *     var plaintext = RNCryptoJS.lib.SerializableCipher.decrypt(RNCryptoJS.algo.AES, formattedCiphertext, key, { iv: iv, format: RNCryptoJS.format.OpenSSL });
        *     var plaintext = RNCryptoJS.lib.SerializableCipher.decrypt(RNCryptoJS.algo.AES, ciphertextParams, key, { iv: iv, format: RNCryptoJS.format.OpenSSL });
        */
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        key: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      inline def decrypt(
        cipher: CipherStatic,
        ciphertext: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        key: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      
      inline def encrypt(
        cipher: CipherStatic,
        message: String,
        key: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      inline def encrypt(
        cipher: CipherStatic,
        message: String,
        key: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      /**
        * Encrypts a message.
        *
        * @param cipher The cipher algorithm to use.
        * @param message The message to encrypt.
        * @param key The key.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return A cipher params object.
        *
        * @example
        *
        *     var ciphertextParams = RNCryptoJS.lib.SerializableCipher.encrypt(RNCryptoJS.algo.AES, message, key);
        *     var ciphertextParams = RNCryptoJS.lib.SerializableCipher.encrypt(RNCryptoJS.algo.AES, message, key, { iv: iv });
        *     var ciphertextParams = RNCryptoJS.lib.SerializableCipher.encrypt(RNCryptoJS.algo.AES, message, key, { iv: iv, format: RNCryptoJS.format.OpenSSL });
        */
      inline def encrypt(
        cipher: CipherStatic,
        message: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        key: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      inline def encrypt(
        cipher: CipherStatic,
        message: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        key: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cipher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      
      inline def parse(ciphertext: String, format: Format_): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("_parse")(ciphertext.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
      /**
        * Converts serialized ciphertext to CipherParams,
        * else assumed CipherParams already and returns ciphertext unchanged.
        *
        * @param ciphertext The ciphertext.
        * @param format The formatting strategy to use to parse serialized ciphertext.
        *
        * @return The unserialized ciphertext.
        *
        * @example
        *
        *     var ciphertextParams = RNCryptoJS.lib.SerializableCipher._parse(ciphertextStringOrParams, format);
        */
      inline def parse(ciphertext: typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams, format: Format_): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams = (^.asInstanceOf[js.Dynamic].applyDynamic("_parse")(ciphertext.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams]
    }
    
    object WordArray {
      
      @JSImport("react-native-crypto-js/core", "lib.WordArray")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initializes a newly created word array.
        *
        * @param words (Optional) An array of 32-bit words.
        * @param sigBytes (Optional) The number of significant bytes in the words.
        *
        * @example
        *
        *     var wordArray = RNCryptoJS.lib.WordArray.create();
        *     var wordArray = RNCryptoJS.lib.WordArray.create([0x00010203, 0x04050607]);
        *     var wordArray = RNCryptoJS.lib.WordArray.create([0x00010203, 0x04050607], 6);
        */
      inline def create(): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray]
      inline def create(words: js.Array[Double]): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray]
      inline def create(words: js.Array[Double], sigBytes: Double): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray]
      inline def create(words: Unit, sigBytes: Double): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray]
      
      /**
        * Creates a word array filled with random bytes.
        *
        * @param nBytes The number of random bytes to generate.
        *
        * @return The random word array.
        *
        * @example
        *
        *     var wordArray = RNCryptoJS.lib.WordArray.random(16);
        */
      inline def random(nBytes: Double): typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(nBytes.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray]
    }
  }
  
  /**
    * Mode namespace.
    */
  object mode {
    
    /**
      * Cipher Block Chaining mode.
      */
    @JSImport("react-native-crypto-js/core", "mode.CBC")
    @js.native
    val CBC: BlockCipherMode = js.native
    
    /**
      * Cipher Feedback block mode.
      */
    @JSImport("react-native-crypto-js/core", "mode.CFB")
    @js.native
    val CFB: BlockCipherMode = js.native
    
    /**
      * Counter block mode.
      */
    @JSImport("react-native-crypto-js/core", "mode.CTR")
    @js.native
    val CTR: BlockCipherMode = js.native
    
    /**
      * @preserve
      * Counter block mode compatible with  Dr Brian Gladman fileenc.c
      * derived from RNCryptoJS.mode.CTR
      * Jan Hruby jhruby.web@gmail.com
      */
    @JSImport("react-native-crypto-js/core", "mode.CTRGladman")
    @js.native
    val CTRGladman: BlockCipherMode = js.native
    
    /**
      * Electronic Codebook block mode.
      */
    @JSImport("react-native-crypto-js/core", "mode.ECB")
    @js.native
    val ECB: BlockCipherMode = js.native
    
    /**
      * Output Feedback block mode.
      */
    @JSImport("react-native-crypto-js/core", "mode.OFB")
    @js.native
    val OFB: BlockCipherMode = js.native
  }
  
  /**
    * Padding namespace.
    */
  object pad {
    
    /**
      * ANSI X.923 padding strategy.
      */
    @JSImport("react-native-crypto-js/core", "pad.AnsiX923")
    @js.native
    val AnsiX923: Padding = js.native
    
    /**
      * ISO 10126 padding strategy.
      */
    @JSImport("react-native-crypto-js/core", "pad.Iso10126")
    @js.native
    val Iso10126: Padding = js.native
    
    /**
      * ISO/IEC 9797-1 Padding Method 2.
      */
    @JSImport("react-native-crypto-js/core", "pad.Iso97971")
    @js.native
    val Iso97971: Padding = js.native
    
    /**
      * A noop padding strategy.
      */
    @JSImport("react-native-crypto-js/core", "pad.NoPadding")
    @js.native
    val NoPadding: Padding = js.native
    
    /**
      * PKCS #5/7 padding strategy.
      */
    @JSImport("react-native-crypto-js/core", "pad.Pkcs7")
    @js.native
    val Pkcs7: Padding = js.native
    
    /**
      * Zero padding strategy.
      */
    @JSImport("react-native-crypto-js/core", "pad.ZeroPadding")
    @js.native
    val ZeroPadding: Padding = js.native
  }
  
  /**
    * x64 namespace.
    */
  object x64 {
    
    object Word {
      
      @JSImport("react-native-crypto-js/core", "x64.Word")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initializes a newly created 64-bit word.
        *
        * @param high The high 32 bits.
        * @param low The low 32 bits.
        *
        * @example
        *
        *     var x64Word = RNCryptoJS.x64.Word.create(0x00010203, 0x04050607);
        */
      inline def create(high: Double, low: Double): X64Word = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(high.asInstanceOf[js.Any], low.asInstanceOf[js.Any])).asInstanceOf[X64Word]
    }
    
    /**
      * Initializes a newly created word array.
      *
      * @param words (Optional) An array of RNCryptoJS.x64.Word objects.
      * @param sigBytes (Optional) The number of significant bytes in the words.
      *
      * @example
      *
      *     var wordArray = RNCryptoJS.x64.WordArray.create();
      *
      *     var wordArray = RNCryptoJS.x64.WordArray.create([
      *         RNCryptoJS.x64.Word.create(0x00010203, 0x04050607),
      *         RNCryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
      *     ]);
      *
      *     var wordArray = RNCryptoJS.x64.WordArray.create([
      *         RNCryptoJS.x64.Word.create(0x00010203, 0x04050607),
      *         RNCryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
      *     ], 10);
      */
    object WordArray {
      
      @JSImport("react-native-crypto-js/core", "x64.WordArray")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(): X64WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[X64WordArray]
      inline def create(words: js.Array[X64WordArray]): X64WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any]).asInstanceOf[X64WordArray]
      inline def create(words: js.Array[X64WordArray], sigBytes: Double): X64WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[X64WordArray]
      inline def create(words: Unit, sigBytes: Double): X64WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[X64WordArray]
    }
  }
}
