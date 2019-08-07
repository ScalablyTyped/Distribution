package typings.reactDashIntl.distComponentsProviderMod

import typings.reactDashIntl.Anon_Intl
import typings.reactDashIntl.distTypesMod.IntlConfig
import typings.reactDashIntl.reactDashIntlStrings.defaultFormats
import typings.reactDashIntl.reactDashIntlStrings.defaultLocale
import typings.reactDashIntl.reactDashIntlStrings.formats
import typings.reactDashIntl.reactDashIntlStrings.messages
import typings.reactDashIntl.reactDashIntlStrings.onError
import typings.reactDashIntl.reactDashIntlStrings.textComponent
import typings.reactDashIntl.reactDashIntlStrings.timeZone
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/components/provider", JSImport.Default)
@js.native
class default () extends IntlProvider

/* static members */
@JSImport("react-intl/dist/components/provider", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Pick[
    IntlConfig, 
    formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
  ] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevPropsCache: State): Anon_Intl | Null = js.native
}

