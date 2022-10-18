package typings.reactMentions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDiacriticsMod {
  
  trait Diacritic extends StObject {
    
    var base: String
    
    var letters: js.RegExp
  }
  object Diacritic {
    
    inline def apply(base: String, letters: js.RegExp): Diacritic = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], letters = letters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diacritic]
    }
    
    extension [Self <: Diacritic](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setLetters(value: js.RegExp): Self = StObject.set(x, "letters", value.asInstanceOf[js.Any])
    }
  }
  
  type lettersDiacritics = js.Array[Diacritic]
}
