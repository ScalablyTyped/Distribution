package typings.spellchecker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spellchecker", "add")
  @js.native
  def add(word: String): Unit = js.native
  
  @JSImport("spellchecker", "checkSpelling")
  @js.native
  def checkSpelling(corpus: String): js.Array[MisspelledLocation] = js.native
  
  @JSImport("spellchecker", "checkSpellingAsync")
  @js.native
  def checkSpellingAsync(corpus: String): js.Promise[js.Array[MisspelledLocation]] = js.native
  
  @JSImport("spellchecker", "getCorrectionsForMisspelling")
  @js.native
  def getCorrectionsForMisspelling(word: String): js.Array[String] = js.native
  
  @JSImport("spellchecker", "isMisspelled")
  @js.native
  def isMisspelled(word: String): Boolean = js.native
  
  @js.native
  trait MisspelledLocation extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object MisspelledLocation {
    
    @scala.inline
    def apply(end: Double, start: Double): MisspelledLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[MisspelledLocation]
    }
    
    @scala.inline
    implicit class MisspelledLocationMutableBuilder[Self <: MisspelledLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
