package typings.reactMdTooltip

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdTooltip.typesTooltipMod.TooltipProps
import typings.reactMdTooltip.typesTooltippedMod.TooltippedProps
import typings.reactMdTooltip.typesUseTooltipMod.TooltipHookOptions
import typings.reactMdTooltip.typesUseTooltipMod.TooltipHookReturnValue
import typings.reactMdTooltip.typesUseTooltipPositionMod.TooltipPositionHookOptions
import typings.reactMdTooltip.typesUseTooltipPositionMod.TooltipPositionHookReturnValue
import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_CLASSNAMES")
  @js.native
  val DEFAULT_TOOLTIP_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_DELAY")
  @js.native
  val DEFAULT_TOOLTIP_DELAY: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_DENSE_SPACING")
  @js.native
  val DEFAULT_TOOLTIP_DENSE_SPACING: /* "0.875rem" */ String = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_MARGIN")
  @js.native
  val DEFAULT_TOOLTIP_MARGIN: /* 16 */ Double = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_POSITION")
  @js.native
  val DEFAULT_TOOLTIP_POSITION: /* "below" */ String = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_SPACING")
  @js.native
  val DEFAULT_TOOLTIP_SPACING: /* "1.5rem" */ String = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_THRESHOLD")
  @js.native
  val DEFAULT_TOOLTIP_THRESHOLD: /* 0.75 */ Double = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_TIMEOUT")
  @js.native
  val DEFAULT_TOOLTIP_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/tooltip", "TOOLTIP_SPACING_VAR")
  @js.native
  val TOOLTIP_SPACING_VAR: /* "--rmd-tooltip-spacing" */ String = js.native
  
  @JSImport("@react-md/tooltip", "Tooltip")
  @js.native
  val Tooltip: ForwardRefExoticComponent[TooltipProps & RefAttributes[HTMLSpanElement]] = js.native
  
  inline def Tooltipped(
    hasIdStyleChildrenTooltipChildrenDenseVhMarginVwMarginSpacingDenseSpacingPropPositionThresholdOnClickOnMouseEnterOnMouseLeaveOnTouchStartOnContextMenuOnBlurOnFocusOnKeyDownDescribedByDefaultPositionTemporaryDisableSwappingDisableHoverModeDisableAutoSpacingProps: TooltippedProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltipped")(hasIdStyleChildrenTooltipChildrenDenseVhMarginVwMarginSpacingDenseSpacingPropPositionThresholdOnClickOnMouseEnterOnMouseLeaveOnTouchStartOnContextMenuOnBlurOnFocusOnKeyDownDescribedByDefaultPositionTemporaryDisableSwappingDisableHoverModeDisableAutoSpacingProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useTooltip[E /* <: HTMLElement */](
    hasBaseIdPropStyleDescribedByDenseSpacingDenseSpacingDeterminedPositionDefaultPositionVwMarginVhMarginThresholdTouchTimeFocusTimePropOnFocusPropOnBlurPropOnKeyDownOnClickOnMouseEnterOnMouseLeavePropOnTouchStartPropOnContextMenuOnEnterOnEnteringOnEnteredOnExitedDisabledDisableSwappingPropDisableHoverModeDisableAutoSpacing: TooltipHookOptions[E]
  ): TooltipHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")(hasBaseIdPropStyleDescribedByDenseSpacingDenseSpacingDeterminedPositionDefaultPositionVwMarginVhMarginThresholdTouchTimeFocusTimePropOnFocusPropOnBlurPropOnKeyDownOnClickOnMouseEnterOnMouseLeavePropOnTouchStartPropOnContextMenuOnEnterOnEnteringOnEnteredOnExitedDisabledDisableSwappingPropDisableHoverModeDisableAutoSpacing.asInstanceOf[js.Any]).asInstanceOf[TooltipHookReturnValue[E]]
  
  inline def useTooltipPosition(hasDeterminedPositionDefaultPositionThreshold: TooltipPositionHookOptions): TooltipPositionHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipPosition")(hasDeterminedPositionDefaultPositionThreshold.asInstanceOf[js.Any]).asInstanceOf[TooltipPositionHookReturnValue]
}
