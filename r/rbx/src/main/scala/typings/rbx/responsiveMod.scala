package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.BinVariablesbreakpointsLi
import typings.rbx.anon.Only
import typings.rbx.anon.OnlyValue
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.anon.Value
import typings.rbx.anon.ValueBoolean
import typings.rbx.anon.`1`
import typings.rbx.anon.`2`
import typings.rbx.anon.`3`
import typings.rbx.anon.`4`
import typings.rbx.factoryMod.MakeValidatingTransformFunction
import typings.rbx.factoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveMod {
  
  @JSImport("rbx/base/helpers/responsive", "makePropTypes")
  @js.native
  def makePropTypes(): ValidationMap[_] = js.native
  @JSImport("rbx/base/helpers/responsive", "makePropTypes")
  @js.native
  def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[_] = js.native
  
  @JSImport("rbx/base/helpers/responsive", "makeResponsiveBreakpointLimitedPropTypes")
  @js.native
  def makeResponsiveBreakpointLimitedPropTypes(): ValidationMap[_] = js.native
  @JSImport("rbx/base/helpers/responsive", "makeResponsiveBreakpointLimitedPropTypes")
  @js.native
  def makeResponsiveBreakpointLimitedPropTypes(variables: PartialVariablesDefinitio): ValidationMap[_] = js.native
  
  @JSImport("rbx/base/helpers/responsive", "makeResponsiveBreakpointPropTypes")
  @js.native
  def makeResponsiveBreakpointPropTypes(): ValidationMap[_] = js.native
  @JSImport("rbx/base/helpers/responsive", "makeResponsiveBreakpointPropTypes")
  @js.native
  def makeResponsiveBreakpointPropTypes(variables: PartialVariablesDefinitio): ValidationMap[_] = js.native
  
  @JSImport("rbx/base/helpers/responsive", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[ResponsiveHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/responsive", "transform")
  @js.native
  val transform: TransformFunction[ResponsiveHelpersProps, js.Object] = js.native
  
  @js.native
  trait LimitedResponsiveBreakpointProps extends StObject {
    
    var display: js.UndefOr[Value] = js.native
    
    var hide: js.UndefOr[ValueBoolean] = js.native
    
    var textAlign: js.UndefOr[`1`] = js.native
    
    var textSize: js.UndefOr[`2`] = js.native
  }
  object LimitedResponsiveBreakpointProps {
    
    @scala.inline
    def apply(): LimitedResponsiveBreakpointProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitedResponsiveBreakpointProps]
    }
    
    @scala.inline
    implicit class LimitedResponsiveBreakpointPropsMutableBuilder[Self <: LimitedResponsiveBreakpointProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: Value): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setHide(value: ValueBoolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setTextAlign(value: `1`): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextSize(value: `2`): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    }
  }
  
  @js.native
  trait ResponsiveBreakpointProps extends StObject {
    
    var display: js.UndefOr[Only] = js.native
    
    var hide: js.UndefOr[OnlyValue] = js.native
    
    var textAlign: js.UndefOr[`3`] = js.native
    
    var textSize: js.UndefOr[`4`] = js.native
  }
  object ResponsiveBreakpointProps {
    
    @scala.inline
    def apply(): ResponsiveBreakpointProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveBreakpointProps]
    }
    
    @scala.inline
    implicit class ResponsiveBreakpointPropsMutableBuilder[Self <: ResponsiveBreakpointProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: Only): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setHide(value: OnlyValue): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setTextAlign(value: `3`): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextSize(value: `4`): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    }
  }
  
  @js.native
  trait ResponsiveHelpersProps extends StObject {
    
    var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.native
  }
  object ResponsiveHelpersProps {
    
    @scala.inline
    def apply(): ResponsiveHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveHelpersProps]
    }
    
    @scala.inline
    implicit class ResponsiveHelpersPropsMutableBuilder[Self <: ResponsiveHelpersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponsive(value: BinVariablesbreakpointsLi): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    }
  }
}
