package typings
package rollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollMod {
  type RollTransformation = RollTransformationKey | (js.Tuple2[RollTransformationKey, scala.Double]) | (js.Function1[/* results */ js.Array[scala.Double], js.Array[scala.Double]])
}
