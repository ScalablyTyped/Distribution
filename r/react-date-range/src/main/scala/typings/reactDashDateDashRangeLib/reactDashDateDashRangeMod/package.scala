package typings
package reactDashDateDashRangeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDateDashRangeMod {
  type AnyDate = java.lang.String | momentLib.momentMod.Moment
  type DateFunc = js.Function1[/* now */ momentLib.momentMod.Moment, AnyDate]
  type DateInputType = AnyDate | DateFunc
  type SizeType = scala.Double
}
