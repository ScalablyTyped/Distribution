package typings.priorityqueuejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object priorityqueuejsMod {
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
