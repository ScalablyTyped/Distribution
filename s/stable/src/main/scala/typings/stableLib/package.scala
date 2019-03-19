package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stableLib {
  type Comparator[T] = (js.Function2[/* a */ T, /* b */ T, scala.Boolean]) | (js.Function2[/* a */ T, /* b */ T, scala.Double])
}
