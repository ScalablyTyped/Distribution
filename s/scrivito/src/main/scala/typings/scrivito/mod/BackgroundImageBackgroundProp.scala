package typings.scrivito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundImageBackgroundProp extends js.Object {
  
  var background: CSSImageStyleBackgroundProps | js.Array[CSSImageStyleBackgroundProps] = js.native
}
object BackgroundImageBackgroundProp {
  
  @scala.inline
  def apply(background: CSSImageStyleBackgroundProps | js.Array[CSSImageStyleBackgroundProps]): BackgroundImageBackgroundProp = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageBackgroundProp]
  }
  
  @scala.inline
  implicit class BackgroundImageBackgroundPropOps[Self <: BackgroundImageBackgroundProp] (val x: Self) extends AnyVal {
    
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
    def setBackgroundVarargs(value: CSSImageStyleBackgroundProps*): Self = this.set("background", js.Array(value :_*))
    
    @scala.inline
    def setBackground(value: CSSImageStyleBackgroundProps | js.Array[CSSImageStyleBackgroundProps]): Self = this.set("background", value.asInstanceOf[js.Any])
  }
}
