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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@storybook/components/dist/tooltip/Tooltip", "Tooltip")
  @js.native
  val Tooltip: FunctionComponent[TooltipProps] = js.native
  
  @js.native
  trait ArrowProps extends StObject {
    
    var color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText = js.native
    
    var placement: String = js.native
  }
  object ArrowProps {
    
    @scala.inline
    def apply(
      color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText,
      placement: String
    ): ArrowProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowProps]
    }
    
    @scala.inline
    implicit class ArrowPropsMutableBuilder[Self <: ArrowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(
        value: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooltipProps extends StObject {
    
    var arrowProps: js.UndefOr[js.Any] = js.native
    
    var arrowRef: js.UndefOr[js.Any] = js.native
    
    var color: js.UndefOr[
        primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
      ] = js.native
    
    var hasChrome: js.UndefOr[Boolean] = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var tooltipRef: js.UndefOr[js.Any] = js.native
  }
  object TooltipProps {
    
    @scala.inline
    def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowProps(value: js.Any): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPropsUndefined: Self = StObject.set(x, "arrowProps", js.undefined)
      
      @scala.inline
      def setArrowRef(value: js.Any): Self = StObject.set(x, "arrowRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowRefUndefined: Self = StObject.set(x, "arrowRef", js.undefined)
      
      @scala.inline
      def setColor(
        value: primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHasChrome(value: Boolean): Self = StObject.set(x, "hasChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChromeUndefined: Self = StObject.set(x, "hasChrome", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setTooltipRef(value: js.Any): Self = StObject.set(x, "tooltipRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipRefUndefined: Self = StObject.set(x, "tooltipRef", js.undefined)
    }
  }
  
  @js.native
  trait WrapperProps extends StObject {
    
    var color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText = js.native
    
    var hasChrome: Boolean = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var placement: String = js.native
  }
  object WrapperProps {
    
    @scala.inline
    def apply(
      color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText,
      hasChrome: Boolean,
      placement: String
    ): WrapperProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hasChrome = hasChrome.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperProps]
    }
    
    @scala.inline
    implicit class WrapperPropsMutableBuilder[Self <: WrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(
        value: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChrome(value: Boolean): Self = StObject.set(x, "hasChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
}
