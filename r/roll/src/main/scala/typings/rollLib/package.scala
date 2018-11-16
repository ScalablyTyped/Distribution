package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollLib {
  type RollTransformation = RollTransformationKey | (js.Tuple2[RollTransformationKey, scala.Double]) | (js.Function1[/* results */ js.Array[scala.Double], js.Array[scala.Double]])
  type RollTransformationKey = rollLib.rollLibStrings.sum | rollLib.rollLibStrings.add | rollLib.rollLibStrings.subtract | rollLib.rollLibStrings.multiply | rollLib.rollLibStrings.divide | rollLib.rollLibStrings.`best-of` | rollLib.rollLibStrings.`worst-of`
}
