package typings.rbx.breadcrumbBreadcrumbMod

import typings.rbx.rbxStrings.arrow
import typings.rbx.rbxStrings.bullet
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.dot
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadcrumbModifierProps extends js.Object {
  
  var align: js.UndefOr[centered | right] = js.native
  
  var separator: js.UndefOr[arrow | bullet | dot | succeeds] = js.native
  
  var size: js.UndefOr[small | medium | large] = js.native
}
object BreadcrumbModifierProps {
  
  @scala.inline
  def apply(): BreadcrumbModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbModifierProps]
  }
  
  @scala.inline
  implicit class BreadcrumbModifierPropsOps[Self <: BreadcrumbModifierProps] (val x: Self) extends AnyVal {
    
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
    def setSeparator(value: arrow | bullet | dot | succeeds): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
