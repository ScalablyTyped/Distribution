package typings.storybookComponents

import typings.react.mod.FunctionComponent
import typings.storybookComponents.storybookComponentsStrings.ancillary
import typings.storybookComponents.storybookComponentsStrings.border
import typings.storybookComponents.storybookComponentsStrings.critical
import typings.storybookComponents.storybookComponentsStrings.dark
import typings.storybookComponents.storybookComponentsStrings.darker
import typings.storybookComponents.storybookComponentsStrings.darkest
import typings.storybookComponents.storybookComponentsStrings.defaultText
import typings.storybookComponents.storybookComponentsStrings.gold
import typings.storybookComponents.storybookComponentsStrings.green
import typings.storybookComponents.storybookComponentsStrings.inverseText
import typings.storybookComponents.storybookComponentsStrings.light
import typings.storybookComponents.storybookComponentsStrings.lighter
import typings.storybookComponents.storybookComponentsStrings.lightest
import typings.storybookComponents.storybookComponentsStrings.medium
import typings.storybookComponents.storybookComponentsStrings.mediumdark
import typings.storybookComponents.storybookComponentsStrings.mediumlight
import typings.storybookComponents.storybookComponentsStrings.negative
import typings.storybookComponents.storybookComponentsStrings.orange
import typings.storybookComponents.storybookComponentsStrings.positive
import typings.storybookComponents.storybookComponentsStrings.primary
import typings.storybookComponents.storybookComponentsStrings.purple
import typings.storybookComponents.storybookComponentsStrings.seafoam
import typings.storybookComponents.storybookComponentsStrings.secondary
import typings.storybookComponents.storybookComponentsStrings.tertiary
import typings.storybookComponents.storybookComponentsStrings.ultraviolet
import typings.storybookComponents.storybookComponentsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@storybook/components/dist/tooltip/Tooltip", "Tooltip")
  @js.native
  val Tooltip: FunctionComponent[TooltipProps] = js.native
  
  trait ArrowProps extends StObject {
    
    var color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
    
    var placement: String
  }
  object ArrowProps {
    
    inline def apply(
      color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText,
      placement: String
    ): ArrowProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowProps]
    }
    
    extension [Self <: ArrowProps](x: Self) {
      
      inline def setColor(
        value: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipProps extends StObject {
    
    var arrowProps: js.UndefOr[js.Any] = js.undefined
    
    var arrowRef: js.UndefOr[js.Any] = js.undefined
    
    var color: js.UndefOr[
        primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
      ] = js.undefined
    
    var hasChrome: js.UndefOr[Boolean] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var tooltipRef: js.UndefOr[js.Any] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setArrowProps(value: js.Any): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      inline def setArrowPropsUndefined: Self = StObject.set(x, "arrowProps", js.undefined)
      
      inline def setArrowRef(value: js.Any): Self = StObject.set(x, "arrowRef", value.asInstanceOf[js.Any])
      
      inline def setArrowRefUndefined: Self = StObject.set(x, "arrowRef", js.undefined)
      
      inline def setColor(
        value: primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHasChrome(value: Boolean): Self = StObject.set(x, "hasChrome", value.asInstanceOf[js.Any])
      
      inline def setHasChromeUndefined: Self = StObject.set(x, "hasChrome", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setTooltipRef(value: js.Any): Self = StObject.set(x, "tooltipRef", value.asInstanceOf[js.Any])
      
      inline def setTooltipRefUndefined: Self = StObject.set(x, "tooltipRef", js.undefined)
    }
  }
  
  trait WrapperProps extends StObject {
    
    var color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
    
    var hasChrome: Boolean
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var placement: String
  }
  object WrapperProps {
    
    inline def apply(
      color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText,
      hasChrome: Boolean,
      placement: String
    ): WrapperProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hasChrome = hasChrome.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperProps]
    }
    
    extension [Self <: WrapperProps](x: Self) {
      
      inline def setColor(
        value: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setHasChrome(value: Boolean): Self = StObject.set(x, "hasChrome", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
}
