package typings.stringNaturalCompare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alphabet extends StObject {
    
    var alphabet: js.UndefOr[String] = js.undefined
    
    var caseInsensitive: js.UndefOr[Boolean] = js.undefined
  }
  object Alphabet {
    
    inline def apply(): Alphabet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alphabet]
    }
    
    extension [Self <: Alphabet](x: Self) {
      
      inline def setAlphabet(value: String): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
      
      inline def setAlphabetUndefined: Self = StObject.set(x, "alphabet", js.undefined)
      
      inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
    }
  }
}
