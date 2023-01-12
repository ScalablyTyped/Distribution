package typings.slate.distInterfacesEditorMod

import typings.slate.distInterfacesTypesMod.LeafEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPointOptions extends StObject {
  
  var edge: js.UndefOr[LeafEdge] = js.undefined
}
object EditorPointOptions {
  
  inline def apply(): EditorPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorPointOptions] (val x: Self) extends AnyVal {
    
    inline def setEdge(value: LeafEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
  }
}
