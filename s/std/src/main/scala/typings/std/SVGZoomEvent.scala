package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGZoomEvent extends UIEvent {
  val newScale: Double = js.native
  val newTranslate: SVGPoint = js.native
  val previousScale: Double = js.native
  val previousTranslate: SVGPoint = js.native
  val zoomRectScreen: SVGRect = js.native
}

@JSGlobal("SVGZoomEvent")
@js.native
object SVGZoomEvent extends Instantiable0[SVGZoomEvent]

