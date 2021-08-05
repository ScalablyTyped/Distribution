package typings.spellchecker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spellchecker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(word: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def checkSpelling(corpus: String): js.Array[MisspelledLocation] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSpelling")(corpus.asInstanceOf[js.Any]).asInstanceOf[js.Array[MisspelledLocation]]
  
  inline def checkSpellingAsync(corpus: String): js.Promise[js.Array[MisspelledLocation]] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSpellingAsync")(corpus.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MisspelledLocation]]]
  
  inline def getCorrectionsForMisspelling(word: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCorrectionsForMisspelling")(word.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isMisspelled(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMisspelled")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait MisspelledLocation extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object MisspelledLocation {
    
    inline def apply(end: Double, start: Double): MisspelledLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[MisspelledLocation]
    }
    
    extension [Self <: MisspelledLocation](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
