package typings.scureBip32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Xpriv extends StObject {
    
    var xpriv: String
  }
  object Xpriv {
    
    inline def apply(xpriv: String): Xpriv = {
      val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xpriv]
    }
    
    extension [Self <: Xpriv](x: Self) {
      
      inline def setXpriv(value: String): Self = StObject.set(x, "xpriv", value.asInstanceOf[js.Any])
    }
  }
  
  trait Xpub extends StObject {
    
    var xpriv: String
    
    var xpub: String
  }
  object Xpub {
    
    inline def apply(xpriv: String, xpub: String): Xpub = {
      val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xpub]
    }
    
    extension [Self <: Xpub](x: Self) {
      
      inline def setXpriv(value: String): Self = StObject.set(x, "xpriv", value.asInstanceOf[js.Any])
      
      inline def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
    }
  }
}
