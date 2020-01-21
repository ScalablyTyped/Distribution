package typings.reactFns.scrollScrollMod

import typings.react.mod.Component
import typings.reactFns.typesMod.SharedRenderProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Scroll/Scroll", "Scroll")
@js.native
class Scroll ()
  extends Component[ScrollConfig with SharedRenderProps[ScrollProps], ScrollProps, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MScroll(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MScroll(): Unit = js.native
  def handleWindowScroll(): Unit = js.native
}

/* static members */
@JSImport("react-fns/dist/Scroll/Scroll", "Scroll")
@js.native
object Scroll extends js.Object {
  var defaultProps: Partial[ScrollConfig] = js.native
}

