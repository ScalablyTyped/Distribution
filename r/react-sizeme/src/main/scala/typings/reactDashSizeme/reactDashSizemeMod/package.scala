package typings.reactDashSizeme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSizemeMod {
  import typings.reactDashSizeme.Anon_Height
  import typings.std.Exclude
  import typings.std.Pick

  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type WithSizeOnSizeCallback = js.Function1[/* size */ Anon_Height, Unit]
}
