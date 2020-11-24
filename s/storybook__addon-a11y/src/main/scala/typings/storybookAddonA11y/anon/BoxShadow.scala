package typings.storybookAddonA11y.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxShadow extends js.Object {
  
  var boxShadow: String = js.native
  
  var outline: String = js.native
  
  var outlineOffset: Double = js.native
}
object BoxShadow {
  
  @scala.inline
  def apply(boxShadow: String, outline: String, outlineOffset: Double): BoxShadow = {
    val __obj = js.Dynamic.literal(boxShadow = boxShadow.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], outlineOffset = outlineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxShadow]
  }
  
  @scala.inline
  implicit class BoxShadowOps[Self <: BoxShadow] (val x: Self) extends AnyVal {
    
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
    def setBoxShadow(value: String): Self = this.set("boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: String): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineOffset(value: Double): Self = this.set("outlineOffset", value.asInstanceOf[js.Any])
  }
}
