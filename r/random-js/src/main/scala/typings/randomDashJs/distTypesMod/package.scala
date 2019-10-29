package typings.randomDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Distribution[T] = js.Function1[/* engine */ Engine, T]
  type StringDistribution = js.Function2[/* engine */ Engine, /* length */ Double, String]
}
