package typings
package rcDashDrawerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esIDrawerPropTypesMod {
  type ILevelMove = scala.Double | (js.Tuple2[scala.Double, scala.Double])
  type IStringOrHtmlElement = java.lang.String | stdLib.HTMLElement
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}
