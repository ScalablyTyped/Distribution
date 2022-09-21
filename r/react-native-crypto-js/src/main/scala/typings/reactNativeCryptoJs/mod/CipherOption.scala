package typings.reactNativeCryptoJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options.
  */
trait CipherOption
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var format: js.UndefOr[Format_] = js.undefined
  
  /**
    * The IV to use for this operation.
    */
  var iv: js.UndefOr[WordArray] = js.undefined
}
object CipherOption {
  
  inline def apply(): CipherOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CipherOption]
  }
  
  extension [Self <: CipherOption](x: Self) {
    
    inline def setFormat(value: Format_): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIv(value: WordArray): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
  }
}
