package typings.reactImgpro.mod.ReactImgpro

import typings.reactImgpro.reactImgproStrings.horizontal_center
import typings.reactImgpro.reactImgproStrings.horizontal_left
import typings.reactImgpro.reactImgproStrings.horizontal_right
import typings.reactImgpro.reactImgproStrings.vertical_bottom
import typings.reactImgpro.reactImgproStrings.vertical_middle
import typings.reactImgpro.reactImgproStrings.vertical_top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends js.Object {
  
  var height: Double = js.native
  
  var mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle = js.native
  
  var width: Double = js.native
}
object Size {
  
  @scala.inline
  def apply(
    height: Double,
    mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle,
    width: Double
  ): Size = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(
      value: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle
    ): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
