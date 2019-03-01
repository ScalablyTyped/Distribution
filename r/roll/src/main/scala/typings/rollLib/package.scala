package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollLib {
  type RollTransformation = RollTransformationKey | (js.Tuple2[RollTransformationKey, scala.Double]) | (js.Function1[/* results */ js.Array[scala.Double], js.Array[scala.Double]])
}
