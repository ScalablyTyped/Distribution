package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomableProps extends js.Object {
  var center: js.UndefOr[Point] = js.undefined
  var onMoveEnd: js.UndefOr[js.Function1[/* newCenter */ Point, scala.Unit]] = js.undefined
  var onMoveStart: js.UndefOr[js.Function1[/* currentCenter */ Point, scala.Unit]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

