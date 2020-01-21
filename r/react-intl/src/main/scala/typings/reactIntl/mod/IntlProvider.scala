package typings.reactIntl.mod

import typings.react.mod.Component
import typings.reactIntl.reactIntlStrings.defaultFormats
import typings.reactIntl.reactIntlStrings.defaultLocale
import typings.reactIntl.reactIntlStrings.formats
import typings.reactIntl.reactIntlStrings.messages
import typings.reactIntl.reactIntlStrings.onError
import typings.reactIntl.reactIntlStrings.textComponent
import typings.reactIntl.reactIntlStrings.timeZone
import typings.std.Partial
import typings.std.Pick
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
  var defaultProps: Pick[
    IntlConfig, 
    formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
  ] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: State): Partial[State] | Null = js.native
}

