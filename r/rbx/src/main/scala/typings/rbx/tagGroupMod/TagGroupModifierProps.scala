package typings.rbx.tagGroupMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagGroupModifierProps extends js.Object {
  
  var gapless: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[medium | large] = js.native
}
object TagGroupModifierProps {
  
  @scala.inline
  def apply(): TagGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagGroupModifierProps]
  }
  
  @scala.inline
  implicit class TagGroupModifierPropsOps[Self <: TagGroupModifierProps] (val x: Self) extends AnyVal {
    
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
    def setGapless(value: Boolean): Self = this.set("gapless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapless: Self = this.set("gapless", js.undefined)
    
    @scala.inline
    def setSize(value: medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
