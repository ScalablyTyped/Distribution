package typings.rcDashDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIDrawerPropTypesMod {
  import typings.std.Exclude
  import typings.std.HTMLElement
  import typings.std.Pick

  type ILevelMove = Double | (js.Tuple2[Double, Double])
  type IStringOrHtmlElement = String | HTMLElement
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
