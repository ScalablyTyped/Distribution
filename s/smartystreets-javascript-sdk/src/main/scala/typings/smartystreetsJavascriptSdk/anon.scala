package typings.smartystreetsJavascriptSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddressCount extends StObject {
    
    var addressCount: Double
    
    var bytes: Double
    
    var characterCount: Double
    
    var lines: js.Any
    
    var unicode: js.Any
    
    var verifiedCount: Double
  }
  object AddressCount {
    
    inline def apply(
      addressCount: Double,
      bytes: Double,
      characterCount: Double,
      lines: js.Any,
      unicode: js.Any,
      verifiedCount: Double
    ): AddressCount = {
      val __obj = js.Dynamic.literal(addressCount = addressCount.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], characterCount = characterCount.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any], verifiedCount = verifiedCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressCount]
    }
    
    extension [Self <: AddressCount](x: Self) {
      
      inline def setAddressCount(value: Double): Self = StObject.set(x, "addressCount", value.asInstanceOf[js.Any])
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCharacterCount(value: Double): Self = StObject.set(x, "characterCount", value.asInstanceOf[js.Any])
      
      inline def setLines(value: js.Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setUnicode(value: js.Any): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setVerifiedCount(value: Double): Self = StObject.set(x, "verifiedCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait Addresses extends StObject {
    
    var addresses: js.Any
    
    var meta: js.Any
  }
  object Addresses {
    
    inline def apply(addresses: js.Any, meta: js.Any): Addresses = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addresses]
    }
    
    extension [Self <: Addresses](x: Self) {
      
      inline def setAddresses(value: js.Any): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
