package typings.rcDashDrawer

import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esIDrawerPropTypesMod {
  type ILevelMove = Double | (js.Tuple2[Double, Double])
  type IStringOrHtmlElement = String | HTMLElement
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
