package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNativeSvg.libTypescriptLibExtractExtractTextMod.TextChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignmentBaseline extends StObject {
  
  var alignmentBaseline: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[
    Element | ComponentType[js.Object] | (js.Array[Element | ComponentType[js.Object] | js.Array[TextChild]]) | Null
  ] = js.undefined
  
  var content: String | Null
  
  var dx: js.Array[String]
  
  var dy: js.Array[String]
  
  var font: StringDictionary[String | Null]
  
  var rotate: js.Array[String]
  
  var x: js.Array[String]
  
  var y: js.Array[String]
}
object AlignmentBaseline {
  
  inline def apply(
    dx: js.Array[String],
    dy: js.Array[String],
    font: StringDictionary[String | Null],
    rotate: js.Array[String],
    x: js.Array[String],
    y: js.Array[String]
  ): AlignmentBaseline = {
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], content = null)
    __obj.asInstanceOf[AlignmentBaseline]
  }
  
  extension [Self <: AlignmentBaseline](x: Self) {
    
    inline def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    inline def setChildren(
      value: Element | ComponentType[js.Object] | (js.Array[Element | ComponentType[js.Object] | js.Array[TextChild]])
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Element | ComponentType[js.Object] | js.Array[TextChild])*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setDx(value: js.Array[String]): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxVarargs(value: String*): Self = StObject.set(x, "dx", js.Array(value*))
    
    inline def setDy(value: js.Array[String]): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyVarargs(value: String*): Self = StObject.set(x, "dy", js.Array(value*))
    
    inline def setFont(value: StringDictionary[String | Null]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: js.Array[String]): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateVarargs(value: String*): Self = StObject.set(x, "rotate", js.Array(value*))
    
    inline def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: js.Array[String]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYVarargs(value: String*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
