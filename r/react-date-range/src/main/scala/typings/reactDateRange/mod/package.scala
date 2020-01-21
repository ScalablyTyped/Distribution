package typings.reactDateRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyDate = java.lang.String | typings.moment.mod.Moment
  type DateFunc = js.Function1[/* now */ typings.moment.mod.Moment, typings.reactDateRange.mod.AnyDate]
  type DateInputType = typings.reactDateRange.mod.AnyDate | typings.reactDateRange.mod.DateFunc
  type SizeType = scala.Double
}
