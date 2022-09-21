package typings.reactSketchapp.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var isHome: Requireable[Boolean]
  
  var name: Requireable[String]
  
  var style: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]]
  
  var viewport: Requireable[InferProps[FontScale]]
}
object Children {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    isHome: Requireable[Boolean],
    name: Requireable[String],
    style: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]],
    viewport: Requireable[InferProps[FontScale]]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isHome = isHome.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setIsHome(value: Requireable[Boolean]): Self = StObject.set(x, "isHome", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Requireable[InferProps[FontScale]]): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
