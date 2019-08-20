package typings.reactstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRowMod {
  import typings.react.reactMod.Component
  import typings.std.Exclude
  import typings.std.Pick

  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type Row[T] = Component[RowProps, js.Object, js.Any]
}
