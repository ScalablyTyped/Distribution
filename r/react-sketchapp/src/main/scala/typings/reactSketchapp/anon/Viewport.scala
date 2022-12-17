package typings.reactSketchapp.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var viewport: Requireable[InferProps[Scale]]
}
object Viewport {
  
  inline def apply(children: Requireable[ReactNodeLike], viewport: Requireable[InferProps[Scale]]): Viewport = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Requireable[InferProps[Scale]]): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
