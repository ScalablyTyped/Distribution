package typings
package socksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsCommonUtilMod {
  type RequireOnlyOne[T, Keys /* <: java.lang.String */] = (stdLib.Pick[T, stdLib.Exclude[java.lang.String, Keys]]) with (/* import warning: ImportType.apply Failed type conversion: {[ K in Keys ]:? std.Required<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
}
