package typings.atReachTabs

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atReachTabsMod {
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
