package typings.reactScrollIntoViewIfNeeded.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.scrollIntoViewIfNeeded.mod.Options
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactScrollIntoViewIfNeededProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var elementType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  
  var options: js.UndefOr[Options[_]] = js.native
}
object ReactScrollIntoViewIfNeededProps {
  
  @scala.inline
  def apply(): ReactScrollIntoViewIfNeededProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactScrollIntoViewIfNeededProps]
  }
  
  @scala.inline
  implicit class ReactScrollIntoViewIfNeededPropsOps[Self <: ReactScrollIntoViewIfNeededProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setElementType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementType: Self = this.set("elementType", js.undefined)
    
    @scala.inline
    def setOptions(value: Options[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
