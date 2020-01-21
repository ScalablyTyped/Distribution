package typings.reactIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object providerMod {
  type OptionalIntlConfig = (typings.reactIntl.typesMod.Omit[typings.reactIntl.typesMod.IntlConfig, java.lang.String]) with (typings.std.Partial[
    typings.std.Pick[
      typings.reactIntl.typesMod.IntlConfig, 
      typings.reactIntl.reactIntlStrings.formats | typings.reactIntl.reactIntlStrings.messages | typings.reactIntl.reactIntlStrings.timeZone | typings.reactIntl.reactIntlStrings.textComponent | typings.reactIntl.reactIntlStrings.defaultLocale | typings.reactIntl.reactIntlStrings.defaultFormats | typings.reactIntl.reactIntlStrings.onError
    ]
  ])
}
