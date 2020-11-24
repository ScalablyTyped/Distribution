package typings.reactBootstrap.popoverMod

import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Popover.Popover>[P]} */ @js.native
trait PopoverProps extends js.Object {
  
  // Optional
  var arrowOffsetLeft: js.UndefOr[Double | String] = js.native
  
  var arrowOffsetTop: js.UndefOr[Double | String] = js.native
  
  var bsClass: js.UndefOr[String] = js.native
  
  var bsSize: js.UndefOr[Sizes] = js.native
  
  var bsStyle: js.UndefOr[String] = js.native
  
  var placement: js.UndefOr[String] = js.native
  
  var positionLeft: js.UndefOr[Double | String] = js.native
  
   // String support added since v0.30.0
  var positionTop: js.UndefOr[Double | String] = js.native
  
   // String support added since v0.30.0
  var title: js.UndefOr[ReactNode] = js.native
}
object PopoverProps {
  
  @scala.inline
  def apply(): PopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverProps]
  }
  
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
    
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
    def setArrowOffsetLeft(value: Double | String): Self = this.set("arrowOffsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowOffsetLeft: Self = this.set("arrowOffsetLeft", js.undefined)
    
    @scala.inline
    def setArrowOffsetTop(value: Double | String): Self = this.set("arrowOffsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowOffsetTop: Self = this.set("arrowOffsetTop", js.undefined)
    
    @scala.inline
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPositionLeft(value: Double | String): Self = this.set("positionLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionLeft: Self = this.set("positionLeft", js.undefined)
    
    @scala.inline
    def setPositionTop(value: Double | String): Self = this.set("positionTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionTop: Self = this.set("positionTop", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
