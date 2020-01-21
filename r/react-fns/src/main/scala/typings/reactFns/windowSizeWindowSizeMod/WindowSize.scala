package typings.reactFns.windowSizeWindowSizeMod

import typings.react.mod.Component
import typings.reactFns.typesMod.SharedRenderProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/WindowSize/WindowSize", "WindowSize")
@js.native
class WindowSize ()
  extends Component[WindowSizeConfig with SharedRenderProps[WindowSizeProps], WindowSizeProps, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MWindowSize(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MWindowSize(): Unit = js.native
  def handleWindowSize(): Unit = js.native
}

/* static members */
@JSImport("react-fns/dist/WindowSize/WindowSize", "WindowSize")
@js.native
object WindowSize extends js.Object {
  var defaultProps: Partial[WindowSizeConfig] = js.native
}

