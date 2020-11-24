package typings.reactHolder.mod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactHolderProp extends HTMLAttributes[ReactHolder] {
  
  var align: js.UndefOr[String] = js.native
  
  var bg: js.UndefOr[String] = js.native
  
  var fg: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var height: String | Double = js.native
  
  var lineWrap: js.UndefOr[Double] = js.native
  
  var outline: js.UndefOr[Boolean] = js.native
  
  var random: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  // config args
  var theme: js.UndefOr[String] = js.native
  
  var updateOnResize: Boolean = js.native
  
  var width: String | Double = js.native
}
object ReactHolderProp {
  
  @scala.inline
  def apply(height: String | Double, updateOnResize: Boolean, width: String | Double): ReactHolderProp = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], updateOnResize = updateOnResize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactHolderProp]
  }
  
  @scala.inline
  implicit class ReactHolderPropOps[Self <: ReactHolderProp] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOnResize(value: Boolean): Self = this.set("updateOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    
    @scala.inline
    def setFg(value: String): Self = this.set("fg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFg: Self = this.set("fg", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLineWrap(value: Double): Self = this.set("lineWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWrap: Self = this.set("lineWrap", js.undefined)
    
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
