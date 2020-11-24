package typings.rbx.variablesMod

import typings.rbx.anon.ReadonlyArraystringnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariablesDefinitions extends js.Object {
  
  var badgeSizes: ReadonlyArraystringnumber = js.native
  
  var breakpoints: ReadonlyArraystringnumber = js.native
  
  var breakpointsLimited: ReadonlyArraystringnumber = js.native
  
  var colors: ReadonlyArraystringnumber = js.native
  
  var displays: ReadonlyArraystringnumber = js.native
  
  var floatPulledAlignments: ReadonlyArraystringnumber = js.native
  
  var shades: ReadonlyArraystringnumber = js.native
  
  var textAlignments: ReadonlyArraystringnumber = js.native
  
  var textSizes: ReadonlyArraystringnumber = js.native
  
  var textTransforms: ReadonlyArraystringnumber = js.native
  
  var textWeights: ReadonlyArraystringnumber = js.native
  
  var tooltipPositions: ReadonlyArraystringnumber = js.native
}
object VariablesDefinitions {
  
  @scala.inline
  def apply(
    badgeSizes: ReadonlyArraystringnumber,
    breakpoints: ReadonlyArraystringnumber,
    breakpointsLimited: ReadonlyArraystringnumber,
    colors: ReadonlyArraystringnumber,
    displays: ReadonlyArraystringnumber,
    floatPulledAlignments: ReadonlyArraystringnumber,
    shades: ReadonlyArraystringnumber,
    textAlignments: ReadonlyArraystringnumber,
    textSizes: ReadonlyArraystringnumber,
    textTransforms: ReadonlyArraystringnumber,
    textWeights: ReadonlyArraystringnumber,
    tooltipPositions: ReadonlyArraystringnumber
  ): VariablesDefinitions = {
    val __obj = js.Dynamic.literal(badgeSizes = badgeSizes.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], breakpointsLimited = breakpointsLimited.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], floatPulledAlignments = floatPulledAlignments.asInstanceOf[js.Any], shades = shades.asInstanceOf[js.Any], textAlignments = textAlignments.asInstanceOf[js.Any], textSizes = textSizes.asInstanceOf[js.Any], textTransforms = textTransforms.asInstanceOf[js.Any], textWeights = textWeights.asInstanceOf[js.Any], tooltipPositions = tooltipPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablesDefinitions]
  }
  
  @scala.inline
  implicit class VariablesDefinitionsOps[Self <: VariablesDefinitions] (val x: Self) extends AnyVal {
    
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
    def setBreakpoints(value: ReadonlyArraystringnumber): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsLimited(value: ReadonlyArraystringnumber): Self = this.set("breakpointsLimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColors(value: ReadonlyArraystringnumber): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplays(value: ReadonlyArraystringnumber): Self = this.set("displays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatPulledAlignments(value: ReadonlyArraystringnumber): Self = this.set("floatPulledAlignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShades(value: ReadonlyArraystringnumber): Self = this.set("shades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignments(value: ReadonlyArraystringnumber): Self = this.set("textAlignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSizes(value: ReadonlyArraystringnumber): Self = this.set("textSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransforms(value: ReadonlyArraystringnumber): Self = this.set("textTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextWeights(value: ReadonlyArraystringnumber): Self = this.set("textWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipPositions(value: ReadonlyArraystringnumber): Self = this.set("tooltipPositions", value.asInstanceOf[js.Any])
  }
}
