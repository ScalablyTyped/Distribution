package typings.reactI18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Namespace = java.lang.String | js.Array[java.lang.String]
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type UseTranslationResponse = (js.Tuple3[typings.i18next.mod.TFunction, typings.i18next.mod.i18n, scala.Boolean]) with typings.reactI18next.anon.I18n
}
