package typings.reactNativeCryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Formatting strategy.
  */
trait Format_ extends StObject {
  
  /**
    * Converts an OpenSSL-compatible string to a cipher params object.
    *
    * @param openSSLStr The OpenSSL-compatible string.
    *
    * @return The cipher params object.
    *
    * @example
    *
    *     var cipherParams = RNCryptoJS.format.OpenSSL.parse(openSSLString);
    */
  def parse(str: String): CipherParams
  
  /**
    * Converts a cipher params object to an OpenSSL-compatible string.
    *
    * @param cipherParams The cipher params object.
    *
    * @return The OpenSSL-compatible string.
    *
    * @example
    *
    *     var openSSLString = RNCryptoJS.format.OpenSSL.stringify(cipherParams);
    */
  def stringify(cipherParams: CipherParams): String
}
object Format_ {
  
  inline def apply(parse: String => CipherParams, stringify: CipherParams => String): Format_ = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Format_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format_] (val x: Self) extends AnyVal {
    
    inline def setParse(value: String => CipherParams): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setStringify(value: CipherParams => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
