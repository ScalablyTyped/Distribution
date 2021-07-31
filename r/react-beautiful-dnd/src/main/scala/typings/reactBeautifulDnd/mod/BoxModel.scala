package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxModel extends StObject {
  
  // for your own consumption
  var border: Spacing
  
  // content + padding + border
  var borderBox: Rect
  
  // content
  var contentBox: Rect
  
  var margin: Spacing
  
  // content + padding + border + margin
  var marginBox: Rect
  
  var padding: Spacing
  
  // content + padding
  var paddingBox: Rect
}
object BoxModel {
  
  @scala.inline
  def apply(
    border: Spacing,
    borderBox: Rect,
    contentBox: Rect,
    margin: Spacing,
    marginBox: Rect,
    padding: Spacing,
    paddingBox: Rect
  ): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], borderBox = borderBox.asInstanceOf[js.Any], contentBox = contentBox.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], marginBox = marginBox.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], paddingBox = paddingBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxModel]
  }
  
  @scala.inline
  implicit class BoxModelMutableBuilder[Self <: BoxModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: Spacing): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBox(value: Rect): Self = StObject.set(x, "borderBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentBox(value: Rect): Self = StObject.set(x, "contentBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Spacing): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBox(value: Rect): Self = StObject.set(x, "marginBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Spacing): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBox(value: Rect): Self = StObject.set(x, "paddingBox", value.asInstanceOf[js.Any])
  }
}
