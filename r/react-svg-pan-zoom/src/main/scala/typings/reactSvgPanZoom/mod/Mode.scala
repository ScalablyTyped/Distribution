package typings.reactSvgPanZoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactSvgPanZoom.reactSvgPanZoomStrings.idle
  - typings.reactSvgPanZoom.reactSvgPanZoomStrings.panning
  - typings.reactSvgPanZoom.reactSvgPanZoomStrings.zooming
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idle: typings.reactSvgPanZoom.reactSvgPanZoomStrings.idle = this.cast("idle")
  @scala.inline
  def panning: typings.reactSvgPanZoom.reactSvgPanZoomStrings.panning = this.cast("panning")
  @scala.inline
  def zooming: typings.reactSvgPanZoom.reactSvgPanZoomStrings.zooming = this.cast("zooming")
}

