package typings.reactSketchapp.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flow extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var flow: Requireable[InferProps[AnimationType]]
  
  var height: Requireable[String | Double]
  
  var name: Requireable[String]
  
  var opacity: Requireable[String | Double]
  
  var preserveAspectRatio: Requireable[String]
  
  var resizingConstraint: Requireable[InferProps[Bottom]]
  
  var shadows: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]]
  
  var style: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]]
  
  var viewBox: Requireable[String]
  
  var width: Requireable[String | Double]
  
  var xmlns: Requireable[String]
  
  @JSName("xmlns:xlink")
  var xmlnsColonxlink: Requireable[String]
}
object Flow {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    flow: Requireable[InferProps[AnimationType]],
    height: Requireable[String | Double],
    name: Requireable[String],
    opacity: Requireable[String | Double],
    preserveAspectRatio: Requireable[String],
    resizingConstraint: Requireable[InferProps[Bottom]],
    shadows: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]],
    style: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]],
    viewBox: Requireable[String],
    width: Requireable[String | Double],
    xmlns: Requireable[String],
    xmlnsColonxlink: Requireable[String]
  ): Flow = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xmlns = xmlns.asInstanceOf[js.Any])
    __obj.updateDynamic("xmlns:xlink")(xmlnsColonxlink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  extension [Self <: Flow](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: Requireable[InferProps[AnimationType]]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Requireable[String | Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Requireable[String | Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatio(value: Requireable[String]): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setResizingConstraint(value: Requireable[InferProps[Bottom]]): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    inline def setShadows(value: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setViewBox(value: Requireable[String]): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXmlns(value: Requireable[String]): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    inline def setXmlnsColonxlink(value: Requireable[String]): Self = StObject.set(x, "xmlns:xlink", value.asInstanceOf[js.Any])
  }
}
