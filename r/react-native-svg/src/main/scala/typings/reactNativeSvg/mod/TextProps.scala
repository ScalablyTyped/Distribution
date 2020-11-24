package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextProps extends TextSpecificProps {
  
  var dx: js.UndefOr[NumberArray] = js.native
  
  var dy: js.UndefOr[NumberArray] = js.native
  
  var inlineSize: js.UndefOr[NumberProp] = js.native
  
  var opacity: js.UndefOr[NumberProp] = js.native
  
  var rotate: js.UndefOr[NumberArray] = js.native
}
object TextProps {
  
  @scala.inline
  def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  @scala.inline
  implicit class TextPropsOps[Self <: TextProps] (val x: Self) extends AnyVal {
    
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
    def setDxVarargs(value: NumberProp*): Self = this.set("dx", js.Array(value :_*))
    
    @scala.inline
    def setDx(value: NumberArray): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    
    @scala.inline
    def setDyVarargs(value: NumberProp*): Self = this.set("dy", js.Array(value :_*))
    
    @scala.inline
    def setDy(value: NumberArray): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    
    @scala.inline
    def setInlineSize(value: NumberProp): Self = this.set("inlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineSize: Self = this.set("inlineSize", js.undefined)
    
    @scala.inline
    def setOpacity(value: NumberProp): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRotateVarargs(value: NumberProp*): Self = this.set("rotate", js.Array(value :_*))
    
    @scala.inline
    def setRotate(value: NumberArray): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
  }
}
