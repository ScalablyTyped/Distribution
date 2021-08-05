package typings.storybookComponents.anon

import typings.popperjsCore.enumsMod.Placement
import typings.react.mod.ReactNode
import typings.storybookComponents.storybookComponentsStrings.`right-click`
import typings.storybookComponents.storybookComponentsStrings.click
import typings.storybookComponents.storybookComponentsStrings.hover
import typings.storybookComponents.storybookComponentsStrings.none
import typings.storybookComponents.withTooltipMod.WithHideFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/components.@storybook/components/dist/tooltip/WithTooltip.WithTooltipPureProps & {  startOpen :boolean | undefined} */
trait WithTooltipPurePropsstart extends StObject {
  
  var children: ReactNode
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var hasChrome: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[js.Array[PartialModifierstring]] = js.undefined
  
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onVisibilityChange: js.UndefOr[js.Function1[/* visibility */ Boolean, Unit]] = js.undefined
  
  var placement: js.UndefOr[Placement] = js.undefined
  
  var startOpen: js.UndefOr[Boolean] = js.undefined
  
  var svg: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode])
  
  var tooltipShown: js.UndefOr[Boolean] = js.undefined
  
  var trigger: js.UndefOr[none | hover | click | `right-click`] = js.undefined
}
object WithTooltipPurePropsstart {
  
  inline def apply(): WithTooltipPurePropsstart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithTooltipPurePropsstart]
  }
  
  extension [Self <: WithTooltipPurePropsstart](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setHasChrome(value: Boolean): Self = StObject.set(x, "hasChrome", value.asInstanceOf[js.Any])
    
    inline def setHasChromeUndefined: Self = StObject.set(x, "hasChrome", js.undefined)
    
    inline def setModifiers(value: js.Array[PartialModifierstring]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: PartialModifierstring*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    inline def setOnDoubleClick(value: () => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction0(value))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnVisibilityChange(value: /* visibility */ Boolean => Unit): Self = StObject.set(x, "onVisibilityChange", js.Any.fromFunction1(value))
    
    inline def setOnVisibilityChangeUndefined: Self = StObject.set(x, "onVisibilityChange", js.undefined)
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setStartOpen(value: Boolean): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
    
    inline def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
    
    inline def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    inline def setTooltip(value: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode])): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipFunction1(value: /* p */ WithHideFn => ReactNode): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
    
    inline def setTooltipShown(value: Boolean): Self = StObject.set(x, "tooltipShown", value.asInstanceOf[js.Any])
    
    inline def setTooltipShownUndefined: Self = StObject.set(x, "tooltipShown", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTrigger(value: none | hover | click | `right-click`): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
