package typings.priorityqueuejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
