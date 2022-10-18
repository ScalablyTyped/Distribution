package typings.searchIndex

import typings.searchIndex.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EXCLUDE extends StObject {
    
    var EXCLUDE: Token
    
    var INCLUDE: Token
  }
  object EXCLUDE {
    
    inline def apply(EXCLUDE: Token, INCLUDE: Token): EXCLUDE = {
      val __obj = js.Dynamic.literal(EXCLUDE = EXCLUDE.asInstanceOf[js.Any], INCLUDE = INCLUDE.asInstanceOf[js.Any])
      __obj.asInstanceOf[EXCLUDE]
    }
    
    extension [Self <: EXCLUDE](x: Self) {
      
      inline def setEXCLUDE(value: Token): Self = StObject.set(x, "EXCLUDE", value.asInstanceOf[js.Any])
      
      inline def setEXCLUDEVarargs(value: String*): Self = StObject.set(x, "EXCLUDE", js.Array(value*))
      
      inline def setINCLUDE(value: Token): Self = StObject.set(x, "INCLUDE", value.asInstanceOf[js.Any])
      
      inline def setINCLUDEVarargs(value: String*): Self = StObject.set(x, "INCLUDE", js.Array(value*))
    }
  }
}
