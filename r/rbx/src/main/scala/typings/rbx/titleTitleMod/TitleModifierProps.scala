package typings.rbx.titleTitleMod

import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleModifierProps extends js.Object {
  
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  var spaced: js.UndefOr[Boolean] = js.native
  
  var subtitle: js.UndefOr[Boolean] = js.native
}
object TitleModifierProps {
  
  @scala.inline
  def apply(): TitleModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleModifierProps]
  }
  
  @scala.inline
  implicit class TitleModifierPropsOps[Self <: TitleModifierProps] (val x: Self) extends AnyVal {
    
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
    def setSize(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSpaced(value: Boolean): Self = this.set("spaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaced: Self = this.set("spaced", js.undefined)
    
    @scala.inline
    def setSubtitle(value: Boolean): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
  }
}
