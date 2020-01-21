package typings.reactIntl.mod

import typings.react.mod.Component
import typings.reactIntl.AnonValues
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "FormattedMessage")
@js.native
class FormattedMessage[V /* <: Record[String, _] */] ()
  extends Component[Props3[V], js.Object, js.Any] {
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MFormattedMessage(nextProps: Props3[V]): Boolean = js.native
}

/* static members */
@JSImport("react-intl", "FormattedMessage")
@js.native
object FormattedMessage extends js.Object {
  var defaultProps: AnonValues = js.native
  var displayName: String = js.native
}

