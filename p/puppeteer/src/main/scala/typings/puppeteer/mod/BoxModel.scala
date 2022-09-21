package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxModel extends StObject {
  
  var border: js.Array[Point]
  
  var content: js.Array[Point]
  
  var height: Double
  
  var margin: js.Array[Point]
  
  var padding: js.Array[Point]
  
  var width: Double
}
object BoxModel {
  
  inline def apply(
    border: js.Array[Point],
    content: js.Array[Point],
    height: Double,
    margin: js.Array[Point],
    padding: js.Array[Point],
    width: Double
  ): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxModel]
  }
  
  extension [Self <: BoxModel](x: Self) {
    
    inline def setBorder(value: js.Array[Point]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderVarargs(value: Point*): Self = StObject.set(x, "border", js.Array(value*))
    
    inline def setContent(value: js.Array[Point]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: Point*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: js.Array[Point]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginVarargs(value: Point*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setPadding(value: js.Array[Point]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: Point*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
