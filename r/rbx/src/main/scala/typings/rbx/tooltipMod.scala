package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.KinVariablesbreakpointsco
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.anon.`5`
import typings.rbx.factoryMod.MakeValidatingTransformFunction
import typings.rbx.factoryMod.TransformFunction
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.top
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("rbx/base/helpers/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropTypes(): ValidationMap[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")().asInstanceOf[ValidationMap[js.Any]]
  inline def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[js.Any]]
  
  @JSImport("rbx/base/helpers/tooltip", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[TooltipHelpersProps, `5`] = js.native
  
  @JSImport("rbx/base/helpers/tooltip", "transform")
  @js.native
  val transform: TransformFunction[TooltipHelpersProps, `5`] = js.native
  
  trait TooltipHelpersProps extends StObject {
    
    var tooltip: js.UndefOr[Double | String] = js.undefined
    
    var tooltipActive: js.UndefOr[Boolean] = js.undefined
    
    var tooltipColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.undefined
    
    var tooltipMultiline: js.UndefOr[Boolean] = js.undefined
    
    var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsco] = js.undefined
  }
  object TooltipHelpersProps {
    
    inline def apply(): TooltipHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipHelpersProps]
    }
    
    extension [Self <: TooltipHelpersProps](x: Self) {
      
      inline def setTooltip(value: Double | String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipActive(value: Boolean): Self = StObject.set(x, "tooltipActive", value.asInstanceOf[js.Any])
      
      inline def setTooltipActiveUndefined: Self = StObject.set(x, "tooltipActive", js.undefined)
      
      inline def setTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "tooltipColor", value.asInstanceOf[js.Any])
      
      inline def setTooltipColorUndefined: Self = StObject.set(x, "tooltipColor", js.undefined)
      
      inline def setTooltipMultiline(value: Boolean): Self = StObject.set(x, "tooltipMultiline", value.asInstanceOf[js.Any])
      
      inline def setTooltipMultilineUndefined: Self = StObject.set(x, "tooltipMultiline", js.undefined)
      
      inline def setTooltipPosition(value: top | right | bottom | left): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      inline def setTooltipResponsive(value: KinVariablesbreakpointsco): Self = StObject.set(x, "tooltipResponsive", value.asInstanceOf[js.Any])
      
      inline def setTooltipResponsiveUndefined: Self = StObject.set(x, "tooltipResponsive", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
