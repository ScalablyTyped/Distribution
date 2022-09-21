package typings.reactNativeCryptoJs

import typings.reactNativeCryptoJs.mod.KDFOption
import typings.reactNativeCryptoJs.mod.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2Mod {
  
  inline def apply(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: String, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: String, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: WordArray, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
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
  inline def apply(password: WordArray, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  
  @JSImport("react-native-crypto-js/pbkdf2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
