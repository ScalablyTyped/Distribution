package typings.primereact

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
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StyleClassProps, context: Any) = this()
    
    def getElement(): HTMLElement = js.native
    
    def getTarget(): HTMLElement = js.native
  }
  
  trait StyleClassProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var enterActiveClassName: js.UndefOr[String] = js.undefined
    
    var enterClassName: js.UndefOr[String] = js.undefined
    
    var enterToClassName: js.UndefOr[String] = js.undefined
    
    var hideOnOutsideClick: js.UndefOr[Boolean] = js.undefined
    
    var leaveActiveClassName: js.UndefOr[String] = js.undefined
    
    var leaveClassName: js.UndefOr[String] = js.undefined
    
    var leaveToClassName: js.UndefOr[String] = js.undefined
    
    var nodeRef: MutableRefObject[ReactNode]
    
    var selector: js.UndefOr[StyleClassSelectorType] = js.undefined
    
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
      
      inline def setSelector(value: StyleClassSelectorType): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setToggleClassName(value: String): Self = StObject.set(x, "toggleClassName", value.asInstanceOf[js.Any])
      
      inline def setToggleClassNameUndefined: Self = StObject.set(x, "toggleClassName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.`@next`
    - typings.primereact.primereactStrings.`@prev`
    - typings.primereact.primereactStrings.`@parent`
    - typings.primereact.primereactStrings.`@grandparent`
    - java.lang.String
  */
  type StyleClassSelectorType = _StyleClassSelectorType | String
  
  trait _StyleClassSelectorType extends StObject
}
