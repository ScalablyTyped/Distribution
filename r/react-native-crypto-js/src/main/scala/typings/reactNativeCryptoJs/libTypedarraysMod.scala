package typings.reactNativeCryptoJs

import typings.reactNativeCryptoJs.mod.global.RNCryptoJS.lib.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypedarraysMod {
  
  @JSImport("react-native-crypto-js/lib-typedarrays", JSImport.Namespace)
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
  inline def create(): WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[WordArray]
  inline def create(words: js.Array[Double]): WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any]).asInstanceOf[WordArray]
  inline def create(words: js.Array[Double], sigBytes: Double): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def create(words: Unit, sigBytes: Double): WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  
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
  inline def random(nBytes: Double): WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(nBytes.asInstanceOf[js.Any]).asInstanceOf[WordArray]
}
