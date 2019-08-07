package typings.reactDashIntl.distComponentsMessageMod

import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.react.reactMod.ContextType
import typings.reactDashIntl.distTypesMod.IntlShape
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedMessage[V /* <: Record[String, _] */]
  extends Component[Props[V], js.Object, js.Any] {
  @JSName("context")
  var context_FormattedMessage: ContextType[Context[IntlShape]] = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MFormattedMessage(nextProps: Props[V]): Boolean = js.native
}

