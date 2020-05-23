package typings.reactIntl.mod

import typings.react.mod.Component
import typings.reactIntl.anon.PartialState2
import typings.reactIntl.anon.PickPropsunitvalue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "FormattedRelativeTime")
@js.native
class FormattedRelativeTime protected ()
  extends Component[Props, State2, js.Any] {
  def this(props: Props) = this()
  var _updateTimer: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormattedRelativeTime(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MFormattedRelativeTime(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MFormattedRelativeTime(): Unit = js.native
  def scheduleNextUpdate(hasUpdateIntervalInSecondsUnit: Props, hasCurrentValueInSeconds: State2): Unit = js.native
}

/* static members */
@JSImport("react-intl", "FormattedRelativeTime")
@js.native
object FormattedRelativeTime extends js.Object {
  var defaultProps: PickPropsunitvalue = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: Props, state: State2): PartialState2 | Null = js.native
}

