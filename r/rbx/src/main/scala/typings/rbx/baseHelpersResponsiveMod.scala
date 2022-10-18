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
import typings.rbx.baseHelpersFactoryMod.MakeValidatingTransformFunction
import typings.rbx.baseHelpersFactoryMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseHelpersResponsiveMod {
  
  @JSImport("rbx/base/helpers/responsive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropTypes(): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")().asInstanceOf[ValidationMap[Any]]
  inline def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[Any]]
  
  inline def makeResponsiveBreakpointLimitedPropTypes(): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeResponsiveBreakpointLimitedPropTypes")().asInstanceOf[ValidationMap[Any]]
  inline def makeResponsiveBreakpointLimitedPropTypes(variables: PartialVariablesDefinitio): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeResponsiveBreakpointLimitedPropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[Any]]
  
  inline def makeResponsiveBreakpointPropTypes(): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeResponsiveBreakpointPropTypes")().asInstanceOf[ValidationMap[Any]]
  inline def makeResponsiveBreakpointPropTypes(variables: PartialVariablesDefinitio): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeResponsiveBreakpointPropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[Any]]
  
  @JSImport("rbx/base/helpers/responsive", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[ResponsiveHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/responsive", "transform")
  @js.native
  val transform: TransformFunction[ResponsiveHelpersProps, js.Object] = js.native
  
  trait LimitedResponsiveBreakpointProps extends StObject {
    
    var display: js.UndefOr[Value] = js.undefined
    
    var hide: js.UndefOr[ValueBoolean] = js.undefined
    
    var textAlign: js.UndefOr[`1`] = js.undefined
    
    var textSize: js.UndefOr[`2`] = js.undefined
  }
  object LimitedResponsiveBreakpointProps {
    
    inline def apply(): LimitedResponsiveBreakpointProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitedResponsiveBreakpointProps]
    }
    
    extension [Self <: LimitedResponsiveBreakpointProps](x: Self) {
      
      inline def setDisplay(value: Value): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setHide(value: ValueBoolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setTextAlign(value: `1`): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextSize(value: `2`): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    }
  }
  
  trait ResponsiveBreakpointProps extends StObject {
    
    var display: js.UndefOr[Only] = js.undefined
    
    var hide: js.UndefOr[OnlyValue] = js.undefined
    
    var textAlign: js.UndefOr[`3`] = js.undefined
    
    var textSize: js.UndefOr[`4`] = js.undefined
  }
  object ResponsiveBreakpointProps {
    
    inline def apply(): ResponsiveBreakpointProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveBreakpointProps]
    }
    
    extension [Self <: ResponsiveBreakpointProps](x: Self) {
      
      inline def setDisplay(value: Only): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setHide(value: OnlyValue): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setTextAlign(value: `3`): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextSize(value: `4`): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    }
  }
  
  trait ResponsiveHelpersProps extends StObject {
    
    var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.undefined
  }
  object ResponsiveHelpersProps {
    
    inline def apply(): ResponsiveHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveHelpersProps]
    }
    
    extension [Self <: ResponsiveHelpersProps](x: Self) {
      
      inline def setResponsive(value: BinVariablesbreakpointsLi): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    }
  }
}
