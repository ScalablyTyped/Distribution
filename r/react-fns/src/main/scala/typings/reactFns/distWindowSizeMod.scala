package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.anon.PartialWindowSizeConfig
import typings.reactFns.distTypesMod.SharedRenderProps
import typings.reactFns.distWindowSizeWindowSizeMod.WindowSizeConfig
import typings.reactFns.distWindowSizeWindowSizeMod.WindowSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWindowSizeMod {
  
  @JSImport("react-fns/dist/WindowSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns/dist/WindowSize", "WindowSize")
  @js.native
  open class WindowSize protected ()
    extends typings.reactFns.distWindowSizeWindowSizeMod.WindowSize {
    def this(props: WindowSizeConfig & SharedRenderProps[WindowSizeProps]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: WindowSizeConfig & SharedRenderProps[WindowSizeProps], context: Any) = this()
  }
  /* static members */
  object WindowSize {
    
    @JSImport("react-fns/dist/WindowSize", "WindowSize")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns/dist/WindowSize", "WindowSize.defaultProps")
    @js.native
    def defaultProps: PartialWindowSizeConfig = js.native
    inline def defaultProps_=(x: PartialWindowSizeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def withWindowSize[Props](Component: ComponentType[Props & WindowSizeProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withWindowSize")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
