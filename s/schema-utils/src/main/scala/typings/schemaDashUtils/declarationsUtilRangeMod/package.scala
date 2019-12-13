package typings.schemaDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object declarationsUtilRangeMod {
  type RangeValue = js.Tuple2[Double, Boolean]
  type RangeValueCallback = js.Function1[/* rangeValue */ js.Tuple2[Double, Boolean], Boolean]
}
