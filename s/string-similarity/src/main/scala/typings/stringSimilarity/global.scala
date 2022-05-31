package typings.stringSimilarity

import typings.stringSimilarity.mod.BestMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object stringSimilarity {
    
    @JSGlobal("stringSimilarity")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compareTwoStrings(string1: String, string2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTwoStrings")(string1.asInstanceOf[js.Any], string2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def findBestMatch(mainString: String, targetStrings: js.Array[String]): BestMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("findBestMatch")(mainString.asInstanceOf[js.Any], targetStrings.asInstanceOf[js.Any])).asInstanceOf[BestMatch]
  }
}
