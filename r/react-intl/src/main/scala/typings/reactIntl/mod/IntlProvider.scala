package typings.reactIntl.mod

import typings.react.mod.Component
import typings.reactIntl.PartialStateCache
import typings.reactIntl.PickIntlConfigformatsmessDefaultFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "IntlProvider")
@js.native
class IntlProvider ()
  extends Component[OptionalIntlConfig, State, js.Any] {
  var cache: js.Any = js.native
}

/* static members */
@JSImport("react-intl", "IntlProvider")
@js.native
object IntlProvider extends js.Object {
  var defaultProps: PickIntlConfigformatsmessDefaultFormats = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: State): PartialStateCache | Null = js.native
}

