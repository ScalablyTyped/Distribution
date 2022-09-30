package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matches[T] extends StObject {
  
  var matches: js.Array[NodeData[T]]
}
object Matches {
  
  inline def apply[T](matches: js.Array[NodeData[T]]): Matches[T] = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches[T]]
  }
  
  extension [Self <: Matches[?], T](x: Self & Matches[T]) {
    
    inline def setMatches(value: js.Array[NodeData[T]]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: NodeData[T]*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
