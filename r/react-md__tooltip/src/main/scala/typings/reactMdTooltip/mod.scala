package typings.reactMdTooltip

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdTooltip.tooltipHoverModeConfigMod.TooltipHoverModeConfigProps
import typings.reactMdTooltip.tooltipMod.TooltipProps
import typings.reactMdTooltip.tooltippedMod.TooltippedProps
import typings.reactMdTooltip.useTooltipHoverModeMod.TooltipHoverModeState
import typings.reactMdTooltip.useTooltipStateMod.ReturnValue
import typings.reactMdTooltip.useTooltipStateMod.TooltipStateOptions
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
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
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_THRESHOLD")
  @js.native
  val DEFAULT_TOOLTIP_THRESHOLD: /* 0.75 */ Double = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_TIMEOUT")
  @js.native
  val DEFAULT_TOOLTIP_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/tooltip", "Tooltip")
  @js.native
  val Tooltip: ForwardRefExoticComponent[TooltipProps & RefAttributes[HTMLSpanElement]] = js.native
  
  object TooltipHoverModeConfig {
    
    inline def apply(hasDefaultDelayDelayTimeoutEnabledChildren: TooltipHoverModeConfigProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasDefaultDelayDelayTimeoutEnabledChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/tooltip", "TooltipHoverModeConfig")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/tooltip", "TooltipHoverModeConfig.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/tooltip", "TooltipHoverModeConfig.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "TooltipHoverModeConfig.propTypes.defaultDelay")
      @js.native
      def defaultDelay: js.Any = js.native
      inline def defaultDelay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "TooltipHoverModeConfig.propTypes.delayTimeout")
      @js.native
      def delayTimeout: js.Any = js.native
      inline def delayTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayTimeout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "TooltipHoverModeConfig.propTypes.enabled")
      @js.native
      def enabled: js.Any = js.native
      inline def enabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
    }
  }
  
  object Tooltipped {
    
    inline def apply(
      hasIdChildrenTooltipChildrenDenseVhMarginVwMarginHoverDelayFocusDelayTouchTimeoutSpacingDenseSpacingPropPositionPositionThresholdPortalPortalIntoPortalIntoIdOnMouseEnterOnMouseLeaveOnTouchStartOnTouchMoveOnContextMenuOnFocusOnKeyDownOnShowOnHideDisableHoverModeDescribedByDefaultPositionDisableSwappingMountOnEnterUnmountOnExitDisableAutoSpacingProps: TooltippedProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasIdChildrenTooltipChildrenDenseVhMarginVwMarginHoverDelayFocusDelayTouchTimeoutSpacingDenseSpacingPropPositionPositionThresholdPortalPortalIntoPortalIntoIdOnMouseEnterOnMouseLeaveOnTouchStartOnTouchMoveOnContextMenuOnFocusOnKeyDownOnShowOnHideDisableHoverModeDescribedByDefaultPositionDisableSwappingMountOnEnterUnmountOnExitDisableAutoSpacingProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/tooltip", "Tooltipped")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.defaultPosition")
      @js.native
      def defaultPosition: js.Any = js.native
      inline def defaultPosition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.dense")
      @js.native
      def dense: js.Any = js.native
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.denseSpacing")
      @js.native
      def denseSpacing: js.Any = js.native
      inline def denseSpacing_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("denseSpacing")(x.asInstanceOf[js.Any])
      
      inline def dense_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dense")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.disableAutoSpacing")
      @js.native
      def disableAutoSpacing: js.Any = js.native
      inline def disableAutoSpacing_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableAutoSpacing")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.focusDelay")
      @js.native
      def focusDelay: js.Any = js.native
      inline def focusDelay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.hoverDelay")
      @js.native
      def hoverDelay: js.Any = js.native
      inline def hoverDelay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoverDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.lineWrap")
      @js.native
      def lineWrap: js.Any = js.native
      inline def lineWrap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.mountOnEnter")
      @js.native
      def mountOnEnter: js.Any = js.native
      inline def mountOnEnter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountOnEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.portal")
      @js.native
      def portal: js.Any = js.native
      inline def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.positionThreshold")
      @js.native
      def positionThreshold: js.Any = js.native
      inline def positionThreshold_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionThreshold")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.spacing")
      @js.native
      def spacing: js.Any = js.native
      inline def spacing_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spacing")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.tooltipId")
      @js.native
      def tooltipId: js.Any = js.native
      inline def tooltipId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipId")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.touchTimeout")
      @js.native
      def touchTimeout: js.Any = js.native
      inline def touchTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchTimeout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.unmountOnExit")
      @js.native
      def unmountOnExit: js.Any = js.native
      inline def unmountOnExit_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unmountOnExit")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.vhMargin")
      @js.native
      def vhMargin: js.Any = js.native
      inline def vhMargin_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vhMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip", "Tooltipped.propTypes.vwMargin")
      @js.native
      def vwMargin: js.Any = js.native
      inline def vwMargin_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vwMargin")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def useTooltipHoverModeState(defaultDelay: Double, delayTimeout: Double): TooltipHoverModeState = (^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipHoverModeState")(defaultDelay.asInstanceOf[js.Any], delayTimeout.asInstanceOf[js.Any])).asInstanceOf[TooltipHoverModeState]
  
  inline def useTooltipState(
    hasPropPositionDefaultPositionPositionThresholdHoverDelayTouchTimeoutFocusDelayDisableHoverModeOnMouseEnterOnMouseLeaveOnTouchStartOnTouchMoveOnFocusOnBlurOnKeyDownOnShowOnHide: TooltipStateOptions
  ): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipState")(hasPropPositionDefaultPositionPositionThresholdHoverDelayTouchTimeoutFocusDelayDisableHoverModeOnMouseEnterOnMouseLeaveOnTouchStartOnTouchMoveOnFocusOnBlurOnKeyDownOnShowOnHide.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
}
