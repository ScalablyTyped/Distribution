package typings.atRebassForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atRebassFormsMod {
  import typings.std.Exclude
  import typings.std.Pick

  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
