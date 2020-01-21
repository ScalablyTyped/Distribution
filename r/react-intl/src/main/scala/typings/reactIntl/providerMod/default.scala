package typings.reactIntl.providerMod

import typings.reactIntl.reactIntlStrings.defaultFormats
import typings.reactIntl.reactIntlStrings.defaultLocale
import typings.reactIntl.reactIntlStrings.formats
import typings.reactIntl.reactIntlStrings.messages
import typings.reactIntl.reactIntlStrings.onError
import typings.reactIntl.reactIntlStrings.textComponent
import typings.reactIntl.reactIntlStrings.timeZone
import typings.reactIntl.typesMod.IntlConfig
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/provider", JSImport.Default)
@js.native
class default () extends IntlProvider

/* static members */
@JSImport("react-intl/lib/components/provider", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Pick[
    IntlConfig, 
    formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
  ] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: State): Partial[State] | Null = js.native
}

