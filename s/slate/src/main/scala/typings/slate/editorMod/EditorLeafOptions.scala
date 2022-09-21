package typings.slate.editorMod

import typings.slate.typesMod.LeafEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorLeafOptions extends StObject {
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var edge: js.UndefOr[LeafEdge] = js.undefined
}
object EditorLeafOptions {
  
  inline def apply(): EditorLeafOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorLeafOptions]
  }
  
  extension [Self <: EditorLeafOptions](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setEdge(value: LeafEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
  }
}
