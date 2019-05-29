package typings
package stableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stableMod {
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Boolean | scala.Double]
}
