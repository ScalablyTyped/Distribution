package typings.reachTooltip

import typings.reachTooltip.anon.DEBUGSTYLE
import typings.reachTooltip.srcMod.Position
import typings.reachTooltip.srcMod.TooltipParams
import typings.reachTooltip.srcMod.TriggerParams
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tooltip
    *
    * @see Docs https://reach.tech/tooltip#tooltip
    */
  @JSImport("@reach/tooltip", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', TooltipProps> */ Any = js.native
  
  @JSImport("@reach/tooltip", "LEAVE_TIMEOUT")
  @js.native
  val LEAVE_TIMEOUT: /* 500 */ Double = js.native
  
  @JSImport("@reach/tooltip", "MOUSE_REST_TIMEOUT")
  @js.native
  val MOUSE_REST_TIMEOUT: /* 100 */ Double = js.native
  
  /**
    * Tooltip
    *
    * @see Docs https://reach.tech/tooltip#tooltip
    */
  @JSImport("@reach/tooltip", "Tooltip")
  @js.native
  val Tooltip: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', TooltipProps> */ Any = js.native
  
  /**
    * TooltipPopup
    *
    * @see Docs https://reach.tech/tooltip#tooltippopup
    */
  @JSImport("@reach/tooltip", "TooltipPopup")
  @js.native
  val TooltipPopup: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', TooltipPopupProps> */ Any = js.native
  
  @JSImport("@reach/tooltip", "positionTooltip")
  @js.native
  val positionTooltip: Position = js.native
  
  /**
    * useTooltip
    *
    * @param params
    */
  inline def useTooltip[ElementType /* <: HTMLElement */](): js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")().asInstanceOf[js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean]]
  inline def useTooltip[ElementType /* <: HTMLElement */](
    hasIdPropOnPointerEnterOnPointerMoveOnPointerLeaveOnPointerDownOnMouseEnterOnMouseMoveOnMouseLeaveOnMouseDownOnFocusOnBlurOnKeyDownDisabledForwardedRefDEBUG_STYLE: DEBUGSTYLE[ElementType] & HTMLAttributes[ElementType]
  ): js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")(hasIdPropOnPointerEnterOnPointerMoveOnPointerLeaveOnPointerDownOnMouseEnterOnMouseMoveOnMouseLeaveOnMouseDownOnFocusOnBlurOnKeyDownDisabledForwardedRefDEBUG_STYLE.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean]]
}
