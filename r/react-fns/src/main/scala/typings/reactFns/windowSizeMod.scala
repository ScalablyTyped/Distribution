package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.anon.PartialWindowSizeConfig
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/WindowSize", JSImport.Namespace)
@js.native
object windowSizeMod extends js.Object {
  @js.native
  class WindowSize ()
    extends typings.reactFns.windowSizeWindowSizeMod.WindowSize
  
  def withWindowSize[Props](Component: ComponentType[Props with WindowSizeProps]): ComponentType[Props] = js.native
  /* static members */
  @js.native
  object WindowSize extends js.Object {
    var defaultProps: PartialWindowSizeConfig = js.native
  }
  
}

