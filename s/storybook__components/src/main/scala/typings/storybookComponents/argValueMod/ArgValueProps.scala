package typings.storybookComponents.argValueMod

import typings.storybookComponents.typesMod.PropSummaryValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgValueProps extends js.Object {
  
  var initialExpandedArgs: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[PropSummaryValue] = js.native
}
object ArgValueProps {
  
  @scala.inline
  def apply(): ArgValueProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgValueProps]
  }
  
  @scala.inline
  implicit class ArgValuePropsOps[Self <: ArgValueProps] (val x: Self) extends AnyVal {
    
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
    def setInitialExpandedArgs(value: Boolean): Self = this.set("initialExpandedArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialExpandedArgs: Self = this.set("initialExpandedArgs", js.undefined)
    
    @scala.inline
    def setValue(value: PropSummaryValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
