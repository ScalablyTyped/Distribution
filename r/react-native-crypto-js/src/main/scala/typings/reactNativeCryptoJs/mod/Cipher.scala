package typings.reactNativeCryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstract base cipher template.
  */
@js.native
trait Cipher extends StObject {
  
  /**
    * A constant representing decryption mode.
    */
  val _DEV_XFORM_MODE: Double = js.native
  
  /**
    * A constant representing encryption mode.
    */
  val _ENC_XFORM_MODE: Double = js.native
  
  def finalize(dataUpdate: String): WordArray = js.native
  def finalize(dataUpdate: WordArray): WordArray = js.native
  
  /**
    * This cipher's IV size. Default: 4 (128 bits)
    */
  var ivSize: Double = js.native
  
  /**
    * This cipher's key size. Default: 4 (128 bits)
    */
  var keySize: Double = js.native
  
  def process(dataUpdate: String): WordArray = js.native
  /**
    * Adds data to be encrypted or decrypted.
    *
    * @param dataUpdate The data to encrypt or decrypt.
    *
    * @return The data after processing.
    *
    * @example
    *
    *     var encrypted = cipher.process('data');
    *     var encrypted = cipher.process(wordArray);
    */
  def process(dataUpdate: WordArray): WordArray = js.native
  
  /**
    * Resets this cipher to its initial state.
    *
    * @example
    *
    *     cipher.reset();
    */
  def reset(): Unit = js.native
}
