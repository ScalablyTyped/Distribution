package typings.slate.distInterfacesEditorMod

import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesLocationMod.Span
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorNodesOptions[T /* <: Node */] extends StObject {
  
  var at: js.UndefOr[Location | Span] = js.undefined
  
  var `match`: js.UndefOr[NodeMatch[T]] = js.undefined
  
  var mode: js.UndefOr[SelectionMode] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var universal: js.UndefOr[Boolean] = js.undefined
  
  var voids: js.UndefOr[Boolean] = js.undefined
}
object EditorNodesOptions {
  
  inline def apply[T /* <: Node */](): EditorNodesOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorNodesOptions[T]]
  }
  
  extension [Self <: EditorNodesOptions[?], T /* <: Node */](x: Self & EditorNodesOptions[T]) {
    
    inline def setAt(value: Location | Span): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
    
    inline def setMatch(value: (/* node */ Node, /* path */ Path) => /* is T */ Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMode(value: SelectionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setUniversal(value: Boolean): Self = StObject.set(x, "universal", value.asInstanceOf[js.Any])
    
    inline def setUniversalUndefined: Self = StObject.set(x, "universal", js.undefined)
    
    inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
    
    inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
  }
}
