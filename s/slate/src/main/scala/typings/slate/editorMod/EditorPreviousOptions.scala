package typings.slate.editorMod

import typings.slate.locationMod.Location
import typings.slate.nodeMod.Node
import typings.slate.pathMod.Path
import typings.slate.typesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPreviousOptions[T /* <: Node */] extends StObject {
  
  var at: js.UndefOr[Location] = js.undefined
  
  var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
  
  var mode: js.UndefOr[SelectionMode] = js.undefined
  
  var voids: js.UndefOr[Boolean] = js.undefined
}
object EditorPreviousOptions {
  
  inline def apply[T /* <: Node */](): EditorPreviousOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPreviousOptions[T]]
  }
  
  extension [Self <: EditorPreviousOptions[?], T /* <: Node */](x: Self & EditorPreviousOptions[T]) {
    
    inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
    
    inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMode(value: SelectionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
    
    inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
  }
}
