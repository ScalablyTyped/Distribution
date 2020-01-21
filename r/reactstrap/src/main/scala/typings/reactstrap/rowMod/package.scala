package typings.reactstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rowMod {
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type Row[T] = typings.react.mod.Component[typings.reactstrap.rowMod.RowProps, js.Object, js.Any]
}
