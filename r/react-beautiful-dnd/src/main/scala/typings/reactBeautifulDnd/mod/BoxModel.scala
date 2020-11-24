package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxModel extends js.Object {
  
  // for your own consumption
  var border: Spacing = js.native
  
  // content + padding + border
  var borderBox: Rect = js.native
  
  // content
  var contentBox: Rect = js.native
  
  var margin: Spacing = js.native
  
  // content + padding + border + margin
  var marginBox: Rect = js.native
  
  var padding: Spacing = js.native
  
  // content + padding
  var paddingBox: Rect = js.native
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
  implicit class BoxModelOps[Self <: BoxModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBorder(value: Spacing): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBox(value: Rect): Self = this.set("borderBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentBox(value: Rect): Self = this.set("contentBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Spacing): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBox(value: Rect): Self = this.set("marginBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Spacing): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBox(value: Rect): Self = this.set("paddingBox", value.asInstanceOf[js.Any])
  }
}
