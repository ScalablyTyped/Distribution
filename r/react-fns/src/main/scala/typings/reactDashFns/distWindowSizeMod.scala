package typings.reactDashFns

import typings.react.reactMod.ComponentType
import typings.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeConfig
import typings.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/WindowSize", JSImport.Namespace)
@js.native
object distWindowSizeMod extends js.Object {
  @js.native
  class WindowSize ()
    extends typings.reactDashFns.distWindowSizeWindowSizeMod.WindowSize
  
  def withWindowSize[Props](Component: ComponentType[Props with WindowSizeProps]): ComponentType[Props] = js.native
  /* static members */
  @js.native
  object WindowSize extends js.Object {
    var defaultProps: Partial[WindowSizeConfig] = js.native
  }
  
}

