package typings.smartystreetsJavascriptSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddressCount extends StObject {
    
    var addressCount: Double
    
    var bytes: Double
    
    var characterCount: Double
    
    var lines: Any
    
    var unicode: Any
    
    var verifiedCount: Double
  }
  object AddressCount {
    
    inline def apply(
      addressCount: Double,
      bytes: Double,
      characterCount: Double,
      lines: Any,
      unicode: Any,
      verifiedCount: Double
    ): AddressCount = {
      val __obj = js.Dynamic.literal(addressCount = addressCount.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], characterCount = characterCount.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any], verifiedCount = verifiedCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressCount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressCount] (val x: Self) extends AnyVal {
      
      inline def setAddressCount(value: Double): Self = StObject.set(x, "addressCount", value.asInstanceOf[js.Any])
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCharacterCount(value: Double): Self = StObject.set(x, "characterCount", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setUnicode(value: Any): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setVerifiedCount(value: Double): Self = StObject.set(x, "verifiedCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait Addresses extends StObject {
    
    var addresses: Any
    
    var meta: Any
  }
  object Addresses {
    
    inline def apply(addresses: Any, meta: Any): Addresses = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addresses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Addresses] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: Any): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
