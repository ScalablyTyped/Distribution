package typings.reactSketchapp.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Href extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var height: Validator[String | Double]
  
  var href: Requireable[String | InferProps[Uri]]
  
  var preserveAspectRatio: Requireable[String]
  
  var width: Validator[String | Double]
  
  var x: Requireable[String | Double]
  
  var y: Requireable[String | Double]
}
object Href {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    height: Validator[String | Double],
    href: Requireable[String | InferProps[Uri]],
    preserveAspectRatio: Requireable[String],
    width: Validator[String | Double],
    x: Requireable[String | Double],
    y: Requireable[String | Double]
  ): Href = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  extension [Self <: Href](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Validator[String | Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHref(value: Requireable[String | InferProps[Uri]]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatio(value: Requireable[String]): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Validator[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Requireable[String | Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Requireable[String | Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
