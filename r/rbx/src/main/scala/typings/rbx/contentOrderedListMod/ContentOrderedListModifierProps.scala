package typings.rbx.contentOrderedListMod

import typings.rbx.rbxStrings.`lower-alpha`
import typings.rbx.rbxStrings.`lower-roman`
import typings.rbx.rbxStrings.`upper-alpha`
import typings.rbx.rbxStrings.`upper-roman`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentOrderedListModifierProps extends js.Object {
  
  var `type`: js.UndefOr[`lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`] = js.native
}
object ContentOrderedListModifierProps {
  
  @scala.inline
  def apply(): ContentOrderedListModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentOrderedListModifierProps]
  }
  
  @scala.inline
  implicit class ContentOrderedListModifierPropsOps[Self <: ContentOrderedListModifierProps] (val x: Self) extends AnyVal {
    
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
    def setType(value: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
