package typings.reactNativeCryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mode namespace.
  */
object mode {
  
  /**
    * Cipher Block Chaining mode.
    */
  @JSImport("react-native-crypto-js", "mode.CBC")
  @js.native
  val CBC: BlockCipherMode = js.native
  
  /**
    * Cipher Feedback block mode.
    */
  @JSImport("react-native-crypto-js", "mode.CFB")
  @js.native
  val CFB: BlockCipherMode = js.native
  
  /**
    * Counter block mode.
    */
  @JSImport("react-native-crypto-js", "mode.CTR")
  @js.native
  val CTR: BlockCipherMode = js.native
  
  /**
    * @preserve
    * Counter block mode compatible with  Dr Brian Gladman fileenc.c
    * derived from RNCryptoJS.mode.CTR
    * Jan Hruby jhruby.web@gmail.com
    */
  @JSImport("react-native-crypto-js", "mode.CTRGladman")
  @js.native
  val CTRGladman: BlockCipherMode = js.native
  
  /**
    * Electronic Codebook block mode.
    */
  @JSImport("react-native-crypto-js", "mode.ECB")
  @js.native
  val ECB: BlockCipherMode = js.native
  
  /**
    * Output Feedback block mode.
    */
  @JSImport("react-native-crypto-js", "mode.OFB")
  @js.native
  val OFB: BlockCipherMode = js.native
}
