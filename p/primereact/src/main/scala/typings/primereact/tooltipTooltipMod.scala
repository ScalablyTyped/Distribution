package typings.primereact

import typings.primereact.tooltipTooltipoptionsMod.TooltipEvent
import typings.primereact.tooltipTooltipoptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipMod {
  
  @JSImport("primereact/tooltip/tooltip", "Tooltip")
  @js.native
  open class Tooltip protected () extends Component[TooltipProps, Any, Any] {
    def this(props: TooltipProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: TooltipProps, context: Any) = this()
    
    /**
      * Used to get container element.
      * @return {HTMLElement} Container element
      */
    def getElement(): HTMLElement = js.native
    
    /**
      * Used to get target element.
      * @return {HTMLElement} Target element
      */
    def getTarget(): HTMLElement | Null = js.native
    
    /**
      * Used to hide the tooltip.
      * @param {TooltipEvent} event - Browser event.
      */
    def hide(): Null = js.native
    def hide(event: TooltipEvent): Null = js.native
    
    /**
      * Used to load target events.
      * @param {HTMLElement} target - Target element.
      */
    def loadTargetEvents(target: HTMLElement): Unit = js.native
    
    /**
      * Used to show the tooltip.
      * @param {TooltipEvent} event - Browser event.
      */
    def show(): Null = js.native
    def show(event: TooltipEvent): Null = js.native
    
    /**
      * Used to unload target events.
      * @param {HTMLElement} target - Target element.
      */
    def unloadTargetEvents(target: HTMLElement): Unit = js.native
    
    /**
      * Used to reload target events. In some cases, the target element can be hidden initially. Later, when this element becomes visible, it will be necessary to bind tooltip events to this element.
      * @param {HTMLElement} target - Target element.
      */
    def updateTargetEvents(target: HTMLElement): Unit = js.native
  }
  
  trait TooltipProps
    extends StObject
       with TooltipOptions {
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Content to be displayed in tooltip.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * Unique identifier of the element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Target element on global tooltip option.
      */
    var target: js.UndefOr[String | js.Array[String] | HTMLElement] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTarget(value: String | js.Array[String] | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
}
