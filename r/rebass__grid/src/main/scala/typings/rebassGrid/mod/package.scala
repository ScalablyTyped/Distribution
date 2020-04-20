package typings.rebassGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
}
