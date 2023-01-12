package typings.reactSketchapp.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSource extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var defaultSource: Requireable[String | InferProps[Uri]]
  
  var flow: Requireable[InferProps[AnimationType]]
  
  var name: Requireable[String]
  
  var resizeMode: Requireable[String]
  
  var resizingConstraint: Requireable[InferProps[Bottom]]
  
  var shadows: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]]
  
  var source: Requireable[String | InferProps[Uri]]
  
  var style: Requireable[js.UndefOr[Double | InferProps[AlignItems] | Null]]
}
object DefaultSource {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    defaultSource: Requireable[String | InferProps[Uri]],
    flow: Requireable[InferProps[AnimationType]],
    name: Requireable[String],
    resizeMode: Requireable[String],
    resizingConstraint: Requireable[InferProps[Bottom]],
    shadows: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]],
    source: Requireable[String | InferProps[Uri]],
    style: Requireable[js.UndefOr[Double | InferProps[AlignItems] | Null]]
  ): DefaultSource = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], defaultSource = defaultSource.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultSource] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDefaultSource(value: Requireable[String | InferProps[Uri]]): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: Requireable[InferProps[AnimationType]]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResizeMode(value: Requireable[String]): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizingConstraint(value: Requireable[InferProps[Bottom]]): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    inline def setShadows(value: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Requireable[String | InferProps[Uri]]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.UndefOr[Double | InferProps[AlignItems] | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
