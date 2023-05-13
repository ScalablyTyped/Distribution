package typings.primereact

import typings.primereact.tooltipTooltipoptionsMod.TooltipEvent
import typings.primereact.tooltipTooltipoptionsMod.TooltipOptions
import typings.primereact.utilsUtilsMod.PassThroughType
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLLIElement
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
  
  trait TooltipPassThroughMethodOptions extends StObject {
    
    var props: TooltipProps
    
    var state: TooltipState
  }
  object TooltipPassThroughMethodOptions {
    
    inline def apply(props: TooltipProps, state: TooltipState): TooltipPassThroughMethodOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipPassThroughMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipPassThroughMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setProps(value: TooltipProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setState(value: TooltipState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipPassThroughOptions extends StObject {
    
    /**
      * Uses to pass attributes to the arrow's DOM element.
      */
    var arrow: js.UndefOr[TooltipPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the root's DOM element.
      */
    var root: js.UndefOr[TooltipPassThroughType[HTMLAttributes[HTMLDivElement]]] = js.undefined
    
    /**
      * Uses to pass attributes to the text's DOM element.
      */
    var text: js.UndefOr[TooltipPassThroughType[HTMLAttributes[HTMLLIElement]]] = js.undefined
  }
  object TooltipPassThroughOptions {
    
    inline def apply(): TooltipPassThroughOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipPassThroughOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipPassThroughOptions] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: TooltipPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowFunction1(
        value: /* options */ js.UndefOr[TooltipPassThroughMethodOptions] => HTMLAttributes[HTMLDivElement] | Unit
      ): Self = StObject.set(x, "arrow", js.Any.fromFunction1(value))
      
      inline def setArrowNull: Self = StObject.set(x, "arrow", null)
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setRoot(value: TooltipPassThroughType[HTMLAttributes[HTMLDivElement]]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootFunction1(
        value: /* options */ js.UndefOr[TooltipPassThroughMethodOptions] => HTMLAttributes[HTMLDivElement] | Unit
      ): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setText(value: TooltipPassThroughType[HTMLAttributes[HTMLLIElement]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextFunction1(
        value: /* options */ js.UndefOr[TooltipPassThroughMethodOptions] => HTMLAttributes[HTMLLIElement] | Unit
      ): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type TooltipPassThroughType[T] = PassThroughType[T, TooltipPassThroughMethodOptions]
  
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
  
  trait TooltipState extends StObject {
    
    /**
      * Current className state as a string.
      */
    var className: String
    
    /**
      * Current position state as a string.
      * @defaultValue right
      */
    var position: String
    
    /**
      * Current visible state as a boolean.
      * @defaultValue false
      */
    var visible: Boolean
  }
  object TooltipState {
    
    inline def apply(className: String, position: String, visible: Boolean): TooltipState = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipState] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
