package typings.reactGridLayout

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.reactGridLayout.mod.ResponsiveProps
import typings.reactGridLayout.mod.WidthProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactGridLayout {
    
    @JSGlobal("ReactGridLayout")
    @js.native
    open class ^ ()
      extends typings.reactGridLayout.mod.^
    
    @JSGlobal("ReactGridLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ReactGridLayout.Responsive")
    @js.native
    open class Responsive protected ()
      extends typings.reactGridLayout.mod.Responsive {
      def this(props: ResponsiveProps) = this()
      /**
        * @deprecated
        * @see https://legacy.reactjs.org/docs/legacy-context.html
        */
      def this(props: ResponsiveProps, context: Any) = this()
    }
    
    inline def WidthProvider[P](component: ComponentClass[P, ComponentState]): ComponentClass[P & WidthProviderProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("WidthProvider")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P & WidthProviderProps, ComponentState]]
    inline def WidthProvider[P](component: FunctionComponent[P]): ComponentClass[P & WidthProviderProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("WidthProvider")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P & WidthProviderProps, ComponentState]]
  }
}
