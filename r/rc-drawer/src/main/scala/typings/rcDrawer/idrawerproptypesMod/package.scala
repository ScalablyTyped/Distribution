package typings.rcDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idrawerproptypesMod {
  type ILevelMove = scala.Double | (js.Tuple2[scala.Double, scala.Double])
  type IStringOrHtmlElement = java.lang.String | typings.std.HTMLElement
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
}
