package typings.reactMdTooltip

import typings.reactMdUtils.positioningTypesMod.SimplePosition
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTooltipPositionMod {
  
  @JSImport("@react-md/tooltip/types/useTooltipPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTooltipPosition(hasDeterminedPositionDefaultPositionThreshold: TooltipPositionHookOptions): TooltipPositionHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipPosition")(hasDeterminedPositionDefaultPositionThreshold.asInstanceOf[js.Any]).asInstanceOf[TooltipPositionHookReturnValue]
  
  trait TooltipPositionHookOptions extends StObject {
    
    /**
      * An optional position to use before the positioning calculation has
      * occurred. This is also used to determine if the position should be
      * horizontal vs vertical.
      *
      * Vertical - `"below"` or `"above"`
      * Horizontal - `"left"` or `"right"`
      *
      * @defaultValue `"below"`
      */
    var defaultPosition: js.UndefOr[SimplePosition] = js.undefined
    
    /**
      * An optional controlled position to use that will disable the functionality
      * to determine the "best" position to render the tooltip within the viewport.
      */
    var position: js.UndefOr[SimplePosition] = js.undefined
    
    /**
      * This value should be between 0 and 1 and will be multiplied by either the
      * viewport height or viewport width to determine the best position to render
      * the tooltip based on available space within the viewport.
      *
      * You _probably_ won't ever really need to update this value.
      */
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object TooltipPositionHookOptions {
    
    inline def apply(): TooltipPositionHookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipPositionHookOptions]
    }
    
    extension [Self <: TooltipPositionHookOptions](x: Self) {
      
      inline def setDefaultPosition(value: SimplePosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionUndefined: Self = StObject.set(x, "defaultPosition", js.undefined)
      
      inline def setPosition(value: SimplePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type TooltipPositionHookReturnValue = js.Tuple2[SimplePosition, UpdateTooltipPosition]
  
  type UpdateTooltipPosition = js.Function1[/* container */ HTMLElement, Unit]
}
