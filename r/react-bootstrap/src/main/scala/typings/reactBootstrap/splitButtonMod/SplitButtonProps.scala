package typings.reactBootstrap.splitButtonMod

import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/SplitButton.SplitButton>[P]} */ @js.native
trait SplitButtonProps extends js.Object {
  
  var bsSize: js.UndefOr[Sizes] = js.native
  
  var bsStyle: js.UndefOr[String] = js.native
  
  var dropdownTitle: js.UndefOr[js.Any] = js.native
  
   // TODO: Add more specific type
  var dropup: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var pullRight: js.UndefOr[Boolean] = js.native
  
  var title: ReactNode = js.native
}
object SplitButtonProps {
  
  @scala.inline
  def apply(id: String): SplitButtonProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitButtonProps]
  }
  
  @scala.inline
  implicit class SplitButtonPropsOps[Self <: SplitButtonProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    
    @scala.inline
    def setDropdownTitle(value: js.Any): Self = this.set("dropdownTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownTitle: Self = this.set("dropdownTitle", js.undefined)
    
    @scala.inline
    def setDropup(value: Boolean): Self = this.set("dropup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropup: Self = this.set("dropup", js.undefined)
    
    @scala.inline
    def setPullRight(value: Boolean): Self = this.set("pullRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRight: Self = this.set("pullRight", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
