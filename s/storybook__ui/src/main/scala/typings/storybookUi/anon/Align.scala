package typings.storybookUi.anon

import typings.react.mod.CSSProperties
import typings.storybookUi.storybookUiStrings.bottom
import typings.storybookUi.storybookUiStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Align extends js.Object {
  
  var align: bottom | right = js.native
  
  var hidden: Boolean = js.native
  
  var position: CSSProperties = js.native
}
object Align {
  
  @scala.inline
  def apply(align: bottom | right, hidden: Boolean, position: CSSProperties): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: bottom | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: CSSProperties): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
