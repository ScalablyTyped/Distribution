package typings.reactNativeCryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * x64 namespace.
  */
object x64 {
  
  object Word {
    
    @JSImport("react-native-crypto-js", "x64.Word")
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
    
    @JSImport("react-native-crypto-js", "x64.WordArray")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): X64WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[X64WordArray]
    inline def create(words: js.Array[X64WordArray]): X64WordArray = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any]).asInstanceOf[X64WordArray]
    inline def create(words: js.Array[X64WordArray], sigBytes: Double): X64WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[X64WordArray]
    inline def create(words: Unit, sigBytes: Double): X64WordArray = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(words.asInstanceOf[js.Any], sigBytes.asInstanceOf[js.Any])).asInstanceOf[X64WordArray]
  }
}
