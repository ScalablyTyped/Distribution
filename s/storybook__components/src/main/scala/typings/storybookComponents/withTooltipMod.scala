package typings.storybookComponents

import typings.popperjsCore.enumsMod.Placement
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.storybookComponents.anon.PartialModifierstring
import typings.storybookComponents.anon.WithTooltipPurePropsstart
import typings.storybookComponents.storybookComponentsStrings.`right-click`
import typings.storybookComponents.storybookComponentsStrings.click
import typings.storybookComponents.storybookComponentsStrings.hover
import typings.storybookComponents.storybookComponentsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withTooltipMod {
  
  @JSImport("@storybook/components/dist/tooltip/WithTooltip", "WithToolTipState")
  @js.native
  val WithToolTipState: FunctionComponent[WithTooltipPurePropsstart] = js.native
  
  @JSImport("@storybook/components/dist/tooltip/WithTooltip", "WithTooltip")
  @js.native
  val WithTooltip: FunctionComponent[WithTooltipPurePropsstart] = js.native
  
  @JSImport("@storybook/components/dist/tooltip/WithTooltip", "WithTooltipPure")
  @js.native
  val WithTooltipPure: FunctionComponent[WithTooltipPureProps] = js.native
  
  @js.native
  trait WithHideFn extends StObject {
    
    def onHide(): Unit = js.native
  }
  object WithHideFn {
    
    @scala.inline
    def apply(onHide: () => Unit): WithHideFn = {
      val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
      __obj.asInstanceOf[WithHideFn]
    }
    
    @scala.inline
    implicit class WithHideFnMutableBuilder[Self <: WithHideFn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait WithTooltipPureProps extends StObject {
    
    var children: ReactNode = js.native
    
    var closeOnClick: js.UndefOr[Boolean] = js.native
    
    var hasChrome: js.UndefOr[Boolean] = js.native
    
    var modifiers: js.UndefOr[js.Array[PartialModifierstring]] = js.native
    
    var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onVisibilityChange: js.UndefOr[js.Function1[/* visibility */ Boolean, Unit]] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var svg: js.UndefOr[Boolean] = js.native
    
    var tooltip: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode]) = js.native
    
    var tooltipShown: js.UndefOr[Boolean] = js.native
    
    var trigger: js.UndefOr[none | hover | click | `right-click`] = js.native
  }
  object WithTooltipPureProps {
    
    @scala.inline
    def apply(): WithTooltipPureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithTooltipPureProps]
    }
    
    @scala.inline
    implicit class WithTooltipPurePropsMutableBuilder[Self <: WithTooltipPureProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      @scala.inline
      def setHasChrome(value: Boolean): Self = StObject.set(x, "hasChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChromeUndefined: Self = StObject.set(x, "hasChrome", js.undefined)
      
      @scala.inline
      def setModifiers(value: js.Array[PartialModifierstring]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setModifiersVarargs(value: PartialModifierstring*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
      
      @scala.inline
      def setOnDoubleClick(value: () => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnVisibilityChange(value: /* visibility */ Boolean => Unit): Self = StObject.set(x, "onVisibilityChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibilityChangeUndefined: Self = StObject.set(x, "onVisibilityChange", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setSvg(value: Boolean): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      @scala.inline
      def setTooltip(value: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode])): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipFunction1(value: /* p */ WithHideFn => ReactNode): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipShown(value: Boolean): Self = StObject.set(x, "tooltipShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipShownUndefined: Self = StObject.set(x, "tooltipShown", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTrigger(value: none | hover | click | `right-click`): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
