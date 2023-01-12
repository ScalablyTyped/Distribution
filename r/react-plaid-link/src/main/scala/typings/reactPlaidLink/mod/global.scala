package typings.reactPlaidLink.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait Window extends StObject {
    
    var Plaid: typings.reactPlaidLink.mod.Plaid
  }
  object Window {
    
    inline def apply(Plaid: Plaid): Window = {
      val __obj = js.Dynamic.literal(Plaid = Plaid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      inline def setPlaid(value: Plaid): Self = StObject.set(x, "Plaid", value.asInstanceOf[js.Any])
    }
  }
}
