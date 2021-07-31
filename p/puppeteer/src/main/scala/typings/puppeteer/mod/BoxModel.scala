package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxModel extends StObject {
  
  /** Border box, represented as an array of {x, y} points. */
  var border: js.Array[Box]
  
  /** Content box, represented as an array of {x, y} points. */
  var content: js.Array[Box]
  
  var height: Double
  
  /** Margin box, represented as an array of {x, y} points. */
  var margin: js.Array[Box]
  
  /** Padding box, represented as an array of {x, y} points. */
  var padding: js.Array[Box]
  
  var width: Double
}
object BoxModel {
  
  @scala.inline
  def apply(
    border: js.Array[Box],
    content: js.Array[Box],
    height: Double,
    margin: js.Array[Box],
    padding: js.Array[Box],
    width: Double
  ): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxModel]
  }
  
  @scala.inline
  implicit class BoxModelMutableBuilder[Self <: BoxModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: js.Array[Box]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderVarargs(value: Box*): Self = StObject.set(x, "border", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[Box]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVarargs(value: Box*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: js.Array[Box]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginVarargs(value: Box*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[Box]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVarargs(value: Box*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
