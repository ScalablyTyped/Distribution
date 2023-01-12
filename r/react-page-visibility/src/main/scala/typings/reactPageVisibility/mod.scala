package typings.reactPageVisibility

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-page-visibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-page-visibility", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PageVisibilityProps, js.Object, Any]
  
  inline def usePageVisibility(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("usePageVisibility")().asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactPageVisibility.reactPageVisibilityStrings.visible
    - typings.reactPageVisibility.reactPageVisibilityStrings.hidden
    - typings.reactPageVisibility.reactPageVisibilityStrings.prerender
    - typings.reactPageVisibility.reactPageVisibilityStrings.unloaded
  */
  trait KnownVisibilityStates extends StObject
  object KnownVisibilityStates {
    
    inline def hidden: typings.reactPageVisibility.reactPageVisibilityStrings.hidden = "hidden".asInstanceOf[typings.reactPageVisibility.reactPageVisibilityStrings.hidden]
    
    inline def prerender: typings.reactPageVisibility.reactPageVisibilityStrings.prerender = "prerender".asInstanceOf[typings.reactPageVisibility.reactPageVisibilityStrings.prerender]
    
    inline def unloaded: typings.reactPageVisibility.reactPageVisibilityStrings.unloaded = "unloaded".asInstanceOf[typings.reactPageVisibility.reactPageVisibilityStrings.unloaded]
    
    inline def visible: typings.reactPageVisibility.reactPageVisibilityStrings.visible = "visible".asInstanceOf[typings.reactPageVisibility.reactPageVisibilityStrings.visible]
  }
  
  type PageVisibility = Component[PageVisibilityProps, js.Object, Any]
  
  trait PageVisibilityProps extends StObject {
    
    var children: js.UndefOr[
        ReactNode | (js.Function2[/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates, ReactNode])
      ] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates, Unit]
      ] = js.undefined
  }
  object PageVisibilityProps {
    
    inline def apply(): PageVisibilityProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageVisibilityProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageVisibilityProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(
        value: ReactNode | (js.Function2[/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates, ReactNode])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction2(value: (/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnChange(value: (/* isVisible */ Boolean, /* visibilityState */ KnownVisibilityStates) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
