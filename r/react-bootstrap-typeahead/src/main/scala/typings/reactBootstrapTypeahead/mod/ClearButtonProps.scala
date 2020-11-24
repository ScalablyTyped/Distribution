package typings.reactBootstrapTypeahead.mod

import typings.react.mod.HTMLAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearButtonProps extends HTMLAttributes[button] {
  
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.native
  
  var label: js.UndefOr[String] = js.native
}
object ClearButtonProps {
  
  @scala.inline
  def apply(): ClearButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearButtonProps]
  }
  
  @scala.inline
  implicit class ClearButtonPropsOps[Self <: ClearButtonProps] (val x: Self) extends AnyVal {
    
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
    def setBsSize(value: TypeaheadBsSizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
