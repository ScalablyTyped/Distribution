package typings.rbx.fileMod

import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileModifierProps extends js.Object {
  
  var align: js.UndefOr[centered | right] = js.native
  
  var boxed: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  
  var fullwidth: js.UndefOr[Boolean] = js.native
  
  var hasName: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[small | medium | large] = js.native
}
object FileModifierProps {
  
  @scala.inline
  def apply(): FileModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileModifierProps]
  }
  
  @scala.inline
  implicit class FileModifierPropsOps[Self <: FileModifierProps] (val x: Self) extends AnyVal {
    
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
    def setBoxed(value: Boolean): Self = this.set("boxed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxed: Self = this.set("boxed", js.undefined)
    
    @scala.inline
    def setColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFullwidth(value: Boolean): Self = this.set("fullwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullwidth: Self = this.set("fullwidth", js.undefined)
    
    @scala.inline
    def setHasName(value: Boolean): Self = this.set("hasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasName: Self = this.set("hasName", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
