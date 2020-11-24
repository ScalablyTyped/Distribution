package typings.reactMdList.listSubheaderMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSubheaderProps extends HTMLAttributes[HTMLLIElement] {
  
  /**
    * Boolean if the subheader should be inset to match the `ListItem` text
    * keyline.
    */
  var inset: js.UndefOr[Boolean] = js.native
}
object ListSubheaderProps {
  
  @scala.inline
  def apply(): ListSubheaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubheaderProps]
  }
  
  @scala.inline
  implicit class ListSubheaderPropsOps[Self <: ListSubheaderProps] (val x: Self) extends AnyVal {
    
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
    def setInset(value: Boolean): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
  }
}
