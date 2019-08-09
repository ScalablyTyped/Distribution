package typings.reactDashIntl.distComponentsMessageMod

import typings.react.reactMod.Component
import typings.reactDashIntl.Anon_Values
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/components/message", "BaseFormattedMessage")
@js.native
class BaseFormattedMessage[V /* <: Record[String, _] */] protected ()
  extends Component[Props[V], js.Object, js.Any] {
  def this(props: Props[V]) = this()
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MBaseFormattedMessage(nextProps: Props[V]): Boolean = js.native
}

/* static members */
@JSImport("react-intl/dist/components/message", "BaseFormattedMessage")
@js.native
object BaseFormattedMessage extends js.Object {
  var defaultProps: Anon_Values = js.native
  var displayName: String = js.native
}

