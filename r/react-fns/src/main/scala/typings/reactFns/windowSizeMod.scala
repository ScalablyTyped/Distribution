package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.anon.PartialWindowSizeConfig
import typings.reactFns.typesMod.SharedRenderProps
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeConfig
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowSizeMod {
  
  @JSImport("react-fns/dist/WindowSize", "WindowSize")
  @js.native
  class WindowSize protected ()
    extends typings.reactFns.windowSizeWindowSizeMod.WindowSize {
    def this(props: WindowSizeConfig with SharedRenderProps[WindowSizeProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WindowSizeConfig with SharedRenderProps[WindowSizeProps], context: js.Any) = this()
  }
  /* static members */
  object WindowSize {
    
    @JSImport("react-fns/dist/WindowSize", "WindowSize")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns/dist/WindowSize", "WindowSize.defaultProps")
    @js.native
    def defaultProps: PartialWindowSizeConfig = js.native
    @scala.inline
    def defaultProps_=(x: PartialWindowSizeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-fns/dist/WindowSize", "withWindowSize")
  @js.native
  def withWindowSize[Props](Component: ComponentType[Props with WindowSizeProps]): ComponentType[Props] = js.native
}
