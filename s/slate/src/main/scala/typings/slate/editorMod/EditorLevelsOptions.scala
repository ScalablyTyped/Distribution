package typings.slate.editorMod

import typings.slate.locationMod.Location
import typings.slate.nodeMod.Node
import typings.slate.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorLevelsOptions[T /* <: Node */] extends StObject {
  
  var at: js.UndefOr[Location] = js.undefined
  
  var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var voids: js.UndefOr[Boolean] = js.undefined
}
object EditorLevelsOptions {
  
  inline def apply[T /* <: Node */](): EditorLevelsOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorLevelsOptions[T]]
  }
  
  extension [Self <: EditorLevelsOptions[?], T /* <: Node */](x: Self & EditorLevelsOptions[T]) {
    
    inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
    
    inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
    
    inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
  }
}
