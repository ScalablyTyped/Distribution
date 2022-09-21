package typings.reactNativeCryptoJs.mod

import typings.reactNativeCryptoJs.anon.PartialCipherParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Library namespace.
  */
object lib {
  
  /**
    * Base object for prototypal inheritance.
    */
  object Base {
    
    @JSImport("react-native-crypto-js", "lib.Base")
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
  @JSImport("react-native-crypto-js", "lib.BlockCipherMode")
  @js.native
  val BlockCipherMode: Any = js.native
  
  @JSImport("react-native-crypto-js", "lib.BufferedBlockAlgorithm")
  @js.native
  val BufferedBlockAlgorithm: Any = js.native
  
  object Cipher {
    
    @JSImport("react-native-crypto-js", "lib.Cipher")
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
    
    @JSImport("react-native-crypto-js", "lib.CipherParams")
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
    
    @JSImport("react-native-crypto-js", "lib.Hasher")
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
    
    @JSImport("react-native-crypto-js", "lib.PasswordBasedCipher")
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
    
    @JSImport("react-native-crypto-js", "lib.SerializableCipher")
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
    
    @JSImport("react-native-crypto-js", "lib.WordArray")
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
