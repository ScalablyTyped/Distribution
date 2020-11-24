package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextLayoutLine extends js.Object {
  
  var ascender: Double = js.native
  
  var capHeight: Double = js.native
  
  var descender: Double = js.native
  
  var height: Double = js.native
  
  var text: String = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var xHeight: Double = js.native
  
  var y: Double = js.native
}
object TextLayoutLine {
  
  @scala.inline
  def apply(
    ascender: Double,
    capHeight: Double,
    descender: Double,
    height: Double,
    text: String,
    width: Double,
    x: Double,
    xHeight: Double,
    y: Double
  ): TextLayoutLine = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], capHeight = capHeight.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xHeight = xHeight.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLayoutLine]
  }
  
  @scala.inline
  implicit class TextLayoutLineOps[Self <: TextLayoutLine] (val x: Self) extends AnyVal {
    
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
    def setAscender(value: Double): Self = this.set("ascender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapHeight(value: Double): Self = this.set("capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescender(value: Double): Self = this.set("descender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHeight(value: Double): Self = this.set("xHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
