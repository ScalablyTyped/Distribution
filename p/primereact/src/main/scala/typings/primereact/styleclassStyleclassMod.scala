package typings.primereact

import typings.primereact.primereactStrings.`@grandparent`
import typings.primereact.primereactStrings.`@next`
import typings.primereact.primereactStrings.`@parent`
import typings.primereact.primereactStrings.`@prev`
import typings.react.mod.Component
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleclassStyleclassMod {
  
  @JSImport("primereact/styleclass/styleclass", "StyleClass")
  @js.native
  open class StyleClass protected () extends Component[StyleClassProps, Any, Any] {
    def this(props: StyleClassProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: StyleClassProps, context: Any) = this()
    
    /**
      * Used to get container element.
      * @return {HTMLElement} Container element
      */
    def getElement(): HTMLElement = js.native
    
    /**
      * Used to get target element.
      * @return {HTMLElement} Container element
      */
    def getTarget(): HTMLElement = js.native
  }
  
  trait StyleClassProps extends StObject {
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class to add during enter animation.
      */
    var enterActiveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Style class to add when item begins to get displayed.
      */
    var enterClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Style class to add when item begins to get displayed.
      */
    var enterToClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to trigger leave animation when outside of the element is clicked.
      * @defaultValue false
      */
    var hideOnOutsideClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style class to add during leave animation.
      */
    var leaveActiveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Style class to add when item begins to get hidden.
      */
    var leaveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Style class to add when leave animation is completed.
      */
    var leaveToClassName: js.UndefOr[String] = js.undefined
    
    /**
      * A React reference to DOM element that need to specify. Required.
      */
    var nodeRef: MutableRefObject[ReactNode]
    
    /**
      * Selector to define the target element.
      */
    var selector: js.UndefOr[`@next` | `@prev` | `@parent` | `@grandparent` | String] = js.undefined
    
    /**
      * Adds or removes a class when no enter-leave animation is required.
      */
    var toggleClassName: js.UndefOr[String] = js.undefined
  }
  object StyleClassProps {
    
    inline def apply(nodeRef: MutableRefObject[ReactNode]): StyleClassProps = {
      val __obj = js.Dynamic.literal(nodeRef = nodeRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleClassProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleClassProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEnterActiveClassName(value: String): Self = StObject.set(x, "enterActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setEnterActiveClassNameUndefined: Self = StObject.set(x, "enterActiveClassName", js.undefined)
      
      inline def setEnterClassName(value: String): Self = StObject.set(x, "enterClassName", value.asInstanceOf[js.Any])
      
      inline def setEnterClassNameUndefined: Self = StObject.set(x, "enterClassName", js.undefined)
      
      inline def setEnterToClassName(value: String): Self = StObject.set(x, "enterToClassName", value.asInstanceOf[js.Any])
      
      inline def setEnterToClassNameUndefined: Self = StObject.set(x, "enterToClassName", js.undefined)
      
      inline def setHideOnOutsideClick(value: Boolean): Self = StObject.set(x, "hideOnOutsideClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnOutsideClickUndefined: Self = StObject.set(x, "hideOnOutsideClick", js.undefined)
      
      inline def setLeaveActiveClassName(value: String): Self = StObject.set(x, "leaveActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setLeaveActiveClassNameUndefined: Self = StObject.set(x, "leaveActiveClassName", js.undefined)
      
      inline def setLeaveClassName(value: String): Self = StObject.set(x, "leaveClassName", value.asInstanceOf[js.Any])
      
      inline def setLeaveClassNameUndefined: Self = StObject.set(x, "leaveClassName", js.undefined)
      
      inline def setLeaveToClassName(value: String): Self = StObject.set(x, "leaveToClassName", value.asInstanceOf[js.Any])
      
      inline def setLeaveToClassNameUndefined: Self = StObject.set(x, "leaveToClassName", js.undefined)
      
      inline def setNodeRef(value: MutableRefObject[ReactNode]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: `@next` | `@prev` | `@parent` | `@grandparent` | String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setToggleClassName(value: String): Self = StObject.set(x, "toggleClassName", value.asInstanceOf[js.Any])
      
      inline def setToggleClassNameUndefined: Self = StObject.set(x, "toggleClassName", js.undefined)
    }
  }
}
