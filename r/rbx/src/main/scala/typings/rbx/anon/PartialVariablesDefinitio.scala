package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rbx.rbx/base/helpers/variables.VariablesDefinitions> */
@js.native
trait PartialVariablesDefinitio extends js.Object {
  
  var badgeSizes: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var breakpoints: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var breakpointsLimited: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var colors: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var displays: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var floatPulledAlignments: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var shades: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var textAlignments: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var textSizes: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var textTransforms: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var textWeights: js.UndefOr[ReadonlyArraystringnumber] = js.native
  
  var tooltipPositions: js.UndefOr[ReadonlyArraystringnumber] = js.native
}
object PartialVariablesDefinitio {
  
  @scala.inline
  def apply(): PartialVariablesDefinitio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVariablesDefinitio]
  }
  
  @scala.inline
  implicit class PartialVariablesDefinitioOps[Self <: PartialVariablesDefinitio] (val x: Self) extends AnyVal {
    
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
    def setBadgeSizes(value: ReadonlyArraystringnumber): Self = this.set("badgeSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeSizes: Self = this.set("badgeSizes", js.undefined)
    
    @scala.inline
    def setBreakpoints(value: ReadonlyArraystringnumber): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    
    @scala.inline
    def setBreakpointsLimited(value: ReadonlyArraystringnumber): Self = this.set("breakpointsLimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpointsLimited: Self = this.set("breakpointsLimited", js.undefined)
    
    @scala.inline
    def setColors(value: ReadonlyArraystringnumber): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDisplays(value: ReadonlyArraystringnumber): Self = this.set("displays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplays: Self = this.set("displays", js.undefined)
    
    @scala.inline
    def setFloatPulledAlignments(value: ReadonlyArraystringnumber): Self = this.set("floatPulledAlignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatPulledAlignments: Self = this.set("floatPulledAlignments", js.undefined)
    
    @scala.inline
    def setShades(value: ReadonlyArraystringnumber): Self = this.set("shades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShades: Self = this.set("shades", js.undefined)
    
    @scala.inline
    def setTextAlignments(value: ReadonlyArraystringnumber): Self = this.set("textAlignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlignments: Self = this.set("textAlignments", js.undefined)
    
    @scala.inline
    def setTextSizes(value: ReadonlyArraystringnumber): Self = this.set("textSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSizes: Self = this.set("textSizes", js.undefined)
    
    @scala.inline
    def setTextTransforms(value: ReadonlyArraystringnumber): Self = this.set("textTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTransforms: Self = this.set("textTransforms", js.undefined)
    
    @scala.inline
    def setTextWeights(value: ReadonlyArraystringnumber): Self = this.set("textWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextWeights: Self = this.set("textWeights", js.undefined)
    
    @scala.inline
    def setTooltipPositions(value: ReadonlyArraystringnumber): Self = this.set("tooltipPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipPositions: Self = this.set("tooltipPositions", js.undefined)
  }
}
