package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxModel extends js.Object {
  
  /** Border box, represented as an array of {x, y} points. */
  var border: js.Array[Box] = js.native
  
  /** Content box, represented as an array of {x, y} points. */
  var content: js.Array[Box] = js.native
  
  var height: Double = js.native
  
  /** Margin box, represented as an array of {x, y} points. */
  var margin: js.Array[Box] = js.native
  
  /** Padding box, represented as an array of {x, y} points. */
  var padding: js.Array[Box] = js.native
  
  var width: Double = js.native
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
    def setBorderVarargs(value: Box*): Self = this.set("border", js.Array(value :_*))
    
    @scala.inline
    def setBorder(value: js.Array[Box]): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVarargs(value: Box*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[Box]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginVarargs(value: Box*): Self = this.set("margin", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[Box]): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVarargs(value: Box*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[Box]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
