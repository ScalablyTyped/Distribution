package typings.rbx.tabGroupMod

import typings.rbx.rbxStrings.`toggle-rounded`
import typings.rbx.rbxStrings.boxed
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabGroupModifierProps extends js.Object {
  
  var align: js.UndefOr[centered | right] = js.native
  
  var fullwidth: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[boxed | toggle | `toggle-rounded`] = js.native
  
  var size: js.UndefOr[small | medium | large] = js.native
}
object TabGroupModifierProps {
  
  @scala.inline
  def apply(): TabGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabGroupModifierProps]
  }
  
  @scala.inline
  implicit class TabGroupModifierPropsOps[Self <: TabGroupModifierProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: centered | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setFullwidth(value: Boolean): Self = this.set("fullwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullwidth: Self = this.set("fullwidth", js.undefined)
    
    @scala.inline
    def setKind(value: boxed | toggle | `toggle-rounded`): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
