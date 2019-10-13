package typings.reactDashIntl.distComponentsRelativeMod

import typings.react.reactMod.Component
import typings.reactDashIntl.Anon_CurrentValueInSeconds
import typings.reactDashIntl.reactDashIntlStrings.unit
import typings.reactDashIntl.reactDashIntlStrings.value
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/components/relative", "FormattedRelativeTime")
@js.native
class FormattedRelativeTime protected ()
  extends Component[Props, State, js.Any] {
  def this(props: Props) = this()
  var _updateTimer: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormattedRelativeTime(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MFormattedRelativeTime(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MFormattedRelativeTime(): Unit = js.native
  def scheduleNextUpdate(hasUpdateIntervalInSecondsUnit: Props, hasCurrentValueInSeconds: State): Unit = js.native
}

/* static members */
@JSImport("react-intl/dist/components/relative", "FormattedRelativeTime")
@js.native
object FormattedRelativeTime extends js.Object {
  var defaultProps: Pick[Props, unit | value] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: Props, state: State): Anon_CurrentValueInSeconds | Null = js.native
}

