package typings.reactDashI18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashI18nextMod {
  import typings.i18next.i18nextMod.TFunction
  import typings.i18next.i18nextMod.i18n
  import typings.reactDashI18next.Anon_I18n
  import typings.std.Exclude
  import typings.std.Pick

  type Namespace = String | js.Array[String]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type UseTranslationResponse = (js.Tuple3[TFunction, i18n, Boolean]) with Anon_I18n
}
