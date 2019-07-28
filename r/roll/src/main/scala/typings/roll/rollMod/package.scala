package typings.roll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollMod {
  type RollTransformation = RollTransformationKey | (js.Tuple2[RollTransformationKey, Double]) | (js.Function1[/* results */ js.Array[Double], js.Array[Double]])
}
