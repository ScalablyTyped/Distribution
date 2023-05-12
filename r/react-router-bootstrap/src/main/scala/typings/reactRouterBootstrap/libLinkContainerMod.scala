package typings.reactRouterBootstrap

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLinkContainerMod extends Shortcut {
  
  @JSImport("react-router-bootstrap/lib/LinkContainer", JSImport.Default)
  @js.native
  val default: LinkContainer = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-router-bootstrap/lib/LinkContainer", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[LinkContainerProps, ComponentState, Any] {
    def this(props: LinkContainerProps) = this()
    def this(props: LinkContainerProps, context: Any) = this()
  }
  
  type LinkContainer = ComponentClass[LinkContainerProps, ComponentState]
  
  // See https://github.com/react-bootstrap/react-router-bootstrap/blob/master/src/LinkContainer.js
  trait LinkContainerProps extends StObject {
    
    var activeClassName: js.UndefOr[String] = js.undefined
    
    var activeStyle: js.UndefOr[String | Double] = js.undefined
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var isActive: js.UndefOr[js.Function0[Unit | Boolean]] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[js.Object] = js.undefined
    
    var style: js.UndefOr[String | Double] = js.undefined
    
    var to: String | js.Object
  }
  object LinkContainerProps {
    
    inline def apply(to: String | js.Object): LinkContainerProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkContainerProps] (val x: Self) extends AnyVal {
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setActiveStyle(value: String | Double): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsActive(value: () => Unit | Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: js.Object): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStyle(value: String | Double): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTo(value: String | js.Object): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = LinkContainer
  
  /* This means you don't have to write `default`, but can instead just say `libLinkContainerMod.foo` */
  override def _to: LinkContainer = default
}
