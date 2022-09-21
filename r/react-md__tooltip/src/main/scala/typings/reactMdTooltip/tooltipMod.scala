package typings.reactMdTooltip

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.CSSTransitionComponentProps
import typings.reactMdUtils.positioningTypesMod.SimplePosition
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("@react-md/tooltip/types/Tooltip", "Tooltip")
  @js.native
  val Tooltip: ForwardRefExoticComponent[TooltipProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait TooltipProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement]
       with RenderConditionalPortalProps
       with CSSTransitionComponentProps {
    
    /**
      * Boolean if the tooltip is using the dense spec. This will reduce the
      * padding, margin and font size for the tooltip and is usually used for
      * desktop displays.
      */
    var dense: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An id for the tooltip. This is required for accessibility and finding an
      * element to attach event listeners to show and hide the tooltip.
      */
    @JSName("id")
    var id_TooltipProps: String
    
    /**
      * Boolean if the tooltip should allow line wrapping. This is disabled by
      * default since the tooltip will display weirdly when its container element
      * is small in size. It is advised to only enable line wrapping when there are
      * long tooltips or the tooltips are bigger than the container element.
      *
      * Once line wrapping is enabled, you will most likely need to set some
      * additional padding and widths.
      */
    var lineWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is the position that the tooltip should appear related to its
      * container element as well as updating the animation direction.
      */
    var position: js.UndefOr[SimplePosition] = js.undefined
    
    /**
      * Boolean if the tooltip is visible. This value changing will trigger the
      * different animations.
      */
    var visible: Boolean
  }
  object TooltipProps {
    
    inline def apply(id: String, visible: Boolean): TooltipProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLineWrap(value: Boolean): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      inline def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      inline def setPosition(value: SimplePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
