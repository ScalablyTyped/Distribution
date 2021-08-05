package typings.storybookUi.anon

import typings.storybookUi.sidebarTypesMod.SearchItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matches extends StObject {
  
  var item: SearchItem
  
  var matches: js.Array[js.Any]
  
  var score: Double
}
object Matches {
  
  inline def apply(item: SearchItem, matches: js.Array[js.Any], score: Double): Matches = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
  
  extension [Self <: Matches](x: Self) {
    
    inline def setItem(value: SearchItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: js.Array[js.Any]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: js.Any*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
