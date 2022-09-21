package typings.reactNativeCryptoJs.mod

import typings.reactNativeCryptoJs.mod.^
import typings.reactNativeCryptoJs.mod.global.RNCryptoJS.x64.Word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Shortcut functions to the cipher's object interface.
  *
  * @example
  *
  *     var ciphertext = RNCryptoJS.AES.encrypt(message, key, cfg);
  *     var plaintext  = RNCryptoJS.AES.decrypt(ciphertext, key, cfg);
  */
inline def AES: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("AES").asInstanceOf[CipherHelper]

/**
  * Shortcut functions to the cipher's object interface.
  *
  * @example
  *
  *     var ciphertext = RNCryptoJS.DES.encrypt(message, key, cfg);
  *     var plaintext  = RNCryptoJS.DES.decrypt(ciphertext, key, cfg);
  */
inline def DES: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("DES").asInstanceOf[CipherHelper]

inline def EvpKDF(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: String, salt: String, cfg: typings.reactNativeCryptoJs.anon.Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: String, salt: WordArray, cfg: typings.reactNativeCryptoJs.anon.Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
inline def EvpKDF(password: WordArray, salt: String, cfg: typings.reactNativeCryptoJs.anon.Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
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
inline def EvpKDF(password: WordArray, salt: WordArray, cfg: typings.reactNativeCryptoJs.anon.Hasher): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]

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
inline def HmacMD5: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacMD5").asInstanceOf[HmacHasherHelper]

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
inline def HmacRIPEMD160: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacRIPEMD160").asInstanceOf[HmacHasherHelper]

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
inline def HmacSHA1: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA1").asInstanceOf[HmacHasherHelper]

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
inline def HmacSHA224: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA224").asInstanceOf[HmacHasherHelper]

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
inline def HmacSHA256: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA256").asInstanceOf[HmacHasherHelper]

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
inline def HmacSHA3: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA3").asInstanceOf[HmacHasherHelper]

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
inline def HmacSHA384: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA384").asInstanceOf[HmacHasherHelper]

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
inline def HmacSHA512: HmacHasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA512").asInstanceOf[HmacHasherHelper]

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
inline def MD5: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("MD5").asInstanceOf[HasherHelper]

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
inline def RC4: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("RC4").asInstanceOf[CipherHelper]

/**
  * Shortcut functions to the cipher's object interface.
  *
  * @example
  *
  *     var ciphertext = RNCryptoJS.RC4Drop.encrypt(message, key, cfg);
  *     var plaintext  = RNCryptoJS.RC4Drop.decrypt(ciphertext, key, cfg);
  */
inline def RC4Drop: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("RC4Drop").asInstanceOf[CipherHelper]

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
inline def RIPEMD160: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("RIPEMD160").asInstanceOf[HasherHelper]

/**
  * Shortcut functions to the cipher's object interface.
  *
  * @example
  *
  *     var ciphertext = RNCryptoJS.Rabbit.encrypt(message, key, cfg);
  *     var plaintext  = RNCryptoJS.Rabbit.decrypt(ciphertext, key, cfg);
  */
inline def Rabbit: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("Rabbit").asInstanceOf[CipherHelper]

/**
  * Shortcut functions to the cipher's object interface.
  *
  * @example
  *
  *     var ciphertext = RNCryptoJS.RabbitLegacy.encrypt(message, key, cfg);
  *     var plaintext  = RNCryptoJS.RabbitLegacy.decrypt(ciphertext, key, cfg);
  */
inline def RabbitLegacy: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("RabbitLegacy").asInstanceOf[CipherHelper]

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
inline def SHA1: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA1").asInstanceOf[HasherHelper]

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
inline def SHA224: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA224").asInstanceOf[HasherHelper]

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
inline def SHA256: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA256").asInstanceOf[HasherHelper]

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
inline def SHA3: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA3").asInstanceOf[HasherHelper]

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
inline def SHA384: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA384").asInstanceOf[HasherHelper]

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
inline def SHA512: HasherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("SHA512").asInstanceOf[HasherHelper]

/**
  * Shortcut functions to the cipher's object interface.
  *
  * @example
  *
  *     var ciphertext = RNCryptoJS.TripleDES.encrypt(message, key, cfg);
  *     var plaintext  = RNCryptoJS.TripleDES.decrypt(ciphertext, key, cfg);
  */
inline def TripleDES: CipherHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("TripleDES").asInstanceOf[CipherHelper]

type CipherParams = typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.CipherParams

type HasherHelper = js.Function2[/* message */ WordArray | String, /* cfg */ js.UndefOr[js.Object], WordArray]

type HmacHasherHelper = js.Function2[/* message */ WordArray | String, /* key */ WordArray | String, WordArray]

type WordArray = typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray

type X64Word = Word
