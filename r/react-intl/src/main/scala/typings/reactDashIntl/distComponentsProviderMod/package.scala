package typings.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distComponentsProviderMod {
  import typings.reactDashIntl.distTypesMod.IntlConfig
  import typings.reactDashIntl.distTypesMod.Omit
  import typings.reactDashIntl.reactDashIntlStrings.defaultFormats
  import typings.reactDashIntl.reactDashIntlStrings.defaultLocale
  import typings.reactDashIntl.reactDashIntlStrings.formats
  import typings.reactDashIntl.reactDashIntlStrings.messages
  import typings.reactDashIntl.reactDashIntlStrings.onError
  import typings.reactDashIntl.reactDashIntlStrings.textComponent
  import typings.reactDashIntl.reactDashIntlStrings.timeZone
  import typings.std.Partial
  import typings.std.Pick

  type OptionalIntlConfig = (Omit[IntlConfig, String]) with (Partial[
    Pick[
      IntlConfig, 
      formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
    ]
  ])
}
