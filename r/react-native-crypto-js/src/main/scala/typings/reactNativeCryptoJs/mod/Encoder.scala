package typings.reactNativeCryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encoding strategy.
  */
trait Encoder extends StObject {
  
  /**
    * Converts a hex string to a word array.
    *
    * @param hexStr The hex string.
    *
    * @return The word array.
    *
    * @example
    *
    *     var wordArray = RNCryptoJS.enc.Hex.parse(hexString);
    */
  def parse(str: String): WordArray
  
  /**
    * Converts a word array to a hex string.
    *
    * @param wordArray The word array.
    *
    * @return The hex string.
    *
    * @example
    *
    *     var hexString = RNCryptoJS.enc.Hex.stringify(wordArray);
    */
  def stringify(wordArray: WordArray): String
}
object Encoder {
  
  inline def apply(parse: String => WordArray, stringify: WordArray => String): Encoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Encoder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encoder] (val x: Self) extends AnyVal {
    
    inline def setParse(value: String => WordArray): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setStringify(value: WordArray => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
