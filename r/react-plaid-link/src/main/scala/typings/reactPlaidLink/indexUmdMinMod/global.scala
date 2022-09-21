package typings.reactPlaidLink.indexUmdMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait Window extends StObject {
    
    var Plaid: typings.reactPlaidLink.indexUmdMinMod.Plaid
  }
  object Window {
    
    inline def apply(Plaid: Plaid): Window = {
      val __obj = js.Dynamic.literal(Plaid = Plaid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    extension [Self <: Window](x: Self) {
      
      inline def setPlaid(value: Plaid): Self = StObject.set(x, "Plaid", value.asInstanceOf[js.Any])
    }
  }
}
