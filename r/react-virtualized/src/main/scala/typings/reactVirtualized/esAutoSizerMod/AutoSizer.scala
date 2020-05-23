package typings.reactVirtualized.esAutoSizerMod

import typings.react.mod.Component
import typings.reactVirtualized.anon.DisableHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/AutoSizer", "AutoSizer")
@js.native
class AutoSizer protected ()
  extends Component[AutoSizerProps, Size, js.Any] {
  def this(props: AutoSizerProps) = this()
  @JSName("componentDidMount")
  def componentDidMount_MAutoSizer(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAutoSizer(): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/AutoSizer", "AutoSizer")
@js.native
object AutoSizer extends js.Object {
  var defaultProps: DisableHeight = js.native
}

