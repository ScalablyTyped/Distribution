package typings.reactCustomScroll

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-custom-scroll", JSImport.Default)
  @js.native
  open class default protected () extends Component[CustomScrollProps, ComponentState, Any] {
    def this(props: CustomScrollProps) = this()
    def this(props: CustomScrollProps, context: Any) = this()
  }
  /**
    * Customize scrollbar design while using native scroll behavior.
    */
  @JSImport("react-custom-scroll", JSImport.Default)
  @js.native
  val default: ComponentClass[CustomScrollProps, ComponentState] = js.native
  
  trait CustomScrollProps extends StObject {
    
    var addScrolledClass: js.UndefOr[Boolean] = js.undefined
    
    var allowOuterScroll: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var flex: js.UndefOr[Double | String] = js.undefined
    
    var freezePosition: js.UndefOr[Boolean] = js.undefined
    
    var heightRelativeToParent: js.UndefOr[String] = js.undefined
    
    var keepAtBottom: js.UndefOr[Boolean] = js.undefined
    
    var minScrollHandleHeight: js.UndefOr[Double] = js.undefined
    
    var onScroll: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Any]] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var scrollTo: js.UndefOr[Double] = js.undefined
  }
  object CustomScrollProps {
    
    inline def apply(): CustomScrollProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomScrollProps]
    }
    
    extension [Self <: CustomScrollProps](x: Self) {
      
      inline def setAddScrolledClass(value: Boolean): Self = StObject.set(x, "addScrolledClass", value.asInstanceOf[js.Any])
      
      inline def setAddScrolledClassUndefined: Self = StObject.set(x, "addScrolledClass", js.undefined)
      
      inline def setAllowOuterScroll(value: Boolean): Self = StObject.set(x, "allowOuterScroll", value.asInstanceOf[js.Any])
      
      inline def setAllowOuterScrollUndefined: Self = StObject.set(x, "allowOuterScroll", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFlex(value: Double | String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFreezePosition(value: Boolean): Self = StObject.set(x, "freezePosition", value.asInstanceOf[js.Any])
      
      inline def setFreezePositionUndefined: Self = StObject.set(x, "freezePosition", js.undefined)
      
      inline def setHeightRelativeToParent(value: String): Self = StObject.set(x, "heightRelativeToParent", value.asInstanceOf[js.Any])
      
      inline def setHeightRelativeToParentUndefined: Self = StObject.set(x, "heightRelativeToParent", js.undefined)
      
      inline def setKeepAtBottom(value: Boolean): Self = StObject.set(x, "keepAtBottom", value.asInstanceOf[js.Any])
      
      inline def setKeepAtBottomUndefined: Self = StObject.set(x, "keepAtBottom", js.undefined)
      
      inline def setMinScrollHandleHeight(value: Double): Self = StObject.set(x, "minScrollHandleHeight", value.asInstanceOf[js.Any])
      
      inline def setMinScrollHandleHeightUndefined: Self = StObject.set(x, "minScrollHandleHeight", js.undefined)
      
      inline def setOnScroll(value: /* e */ js.UndefOr[Any] => Any): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setScrollTo(value: Double): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    }
  }
  
  type _To = ComponentClass[CustomScrollProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[CustomScrollProps, ComponentState] = default
}
