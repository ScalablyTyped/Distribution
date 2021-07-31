package typings.storybookUi.anon

import typings.storybookUi.sidebarTypesMod.SearchItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: SearchItem
  
  var matches: js.Array[Indices]
  
  var score: Double
}
object Item {
  
  @scala.inline
  def apply(item: SearchItem, matches: js.Array[Indices], score: Double): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: SearchItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatches(value: js.Array[Indices]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesVarargs(value: Indices*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
