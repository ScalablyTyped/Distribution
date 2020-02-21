package typings.resq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NotFunc[T] = typings.std.Exclude[T, js.Function]
}
