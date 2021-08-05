package typings.qunitDom

import typings.qunitDom.qunitDomBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Any extends StObject {
    
    var any: `true`
  }
  object Any {
    
    inline def apply(): Any = {
      val __obj = js.Dynamic.literal(any = true)
      __obj.asInstanceOf[Any]
    }
    
    extension [Self <: Any](x: Self) {
      
      inline def setAny(value: `true`): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inverted extends StObject {
    
    var inverted: js.UndefOr[Boolean] = js.undefined
  }
  object Inverted {
    
    inline def apply(): Inverted = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inverted]
    }
    
    extension [Self <: Inverted](x: Self) {
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    }
  }
}
