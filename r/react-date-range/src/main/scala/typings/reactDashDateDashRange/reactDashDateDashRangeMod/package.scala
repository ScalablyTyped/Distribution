package typings.reactDashDateDashRange

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDateDashRangeMod {
  type AnyDate = String | Moment
  type DateFunc = js.Function1[/* now */ Moment, AnyDate]
  type DateInputType = AnyDate | DateFunc
  type SizeType = Double
}
