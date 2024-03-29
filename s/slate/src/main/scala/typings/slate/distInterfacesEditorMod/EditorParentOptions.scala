package typings.slate.distInterfacesEditorMod

import typings.slate.distTypesTypesMod.LeafEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorParentOptions extends StObject {
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var edge: js.UndefOr[LeafEdge] = js.undefined
}
object EditorParentOptions {
  
  inline def apply(): EditorParentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorParentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorParentOptions] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setEdge(value: LeafEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
  }
}
