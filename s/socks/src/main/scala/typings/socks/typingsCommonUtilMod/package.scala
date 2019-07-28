package typings.socks

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsCommonUtilMod {
  type RequireOnlyOne[T, Keys /* <: String */] = (Pick[T, Exclude[String, Keys]]) with (/* import warning: ImportType.apply Failed type conversion: {[ K in Keys ]:? std.Required<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
}
