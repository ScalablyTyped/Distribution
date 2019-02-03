package typings
package reactDashFnsLib.distWindowSizeWindowSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/WindowSize/WindowSize", "WindowSize")
@js.native
class WindowSize ()
  extends reactLib.reactMod.Component[
      WindowSizeConfig with reactDashFnsLib.distTypesMod.SharedRenderProps[WindowSizeProps], 
      WindowSizeProps, 
      js.Any
    ] {
  @JSName("state")
  var state_WindowSize: WindowSizeProps = js.native
  @JSName("componentDidMount")
  def componentDidMount_MWindowSize(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MWindowSize(): scala.Unit = js.native
  def handleWindowSize(): scala.Unit = js.native
}

/* static members */
@JSImport("react-fns/dist/WindowSize/WindowSize", "WindowSize")
@js.native
object WindowSize extends js.Object {
  var defaultProps: stdLib.Partial[reactDashFnsLib.distWindowSizeWindowSizeMod.WindowSizeConfig] = js.native
}

