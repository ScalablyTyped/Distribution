package typings.reactDashIntl.distComponentsRelativeMod

import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.react.reactMod.PureComponent
import typings.reactDashIntl.distTypesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedRelativeTime
  extends PureComponent[Props, State, js.Any] {
  var _updateTimer: js.Any = js.native
  @JSName("context")
  var context_FormattedRelativeTime: ContextType[Context[IntlShape]] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormattedRelativeTime(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MFormattedRelativeTime(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MFormattedRelativeTime(): Unit = js.native
  def scheduleNextUpdate(hasUpdateIntervalInSecondsUnit: Props, hasCurrentValueInSeconds: State): Unit = js.native
}

