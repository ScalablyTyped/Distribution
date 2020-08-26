package typings.reactSvgPanZoom.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewerMouseEvent[T] extends js.Object {
  var SVGViewer: SVGSVGElement = js.native
  var originalEvent: MouseEvent[T, NativeMouseEvent] = js.native
  var point: Point = js.native
  var scaleFactor: Double = js.native
  var translationX: Double = js.native
  var translationY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object ViewerMouseEvent {
  @scala.inline
  def apply[T](
    SVGViewer: SVGSVGElement,
    originalEvent: MouseEvent[T, NativeMouseEvent],
    point: Point,
    preventDefault: () => Unit,
    scaleFactor: Double,
    stopPropagation: () => Unit,
    translationX: Double,
    translationY: Double,
    x: Double,
    y: Double
  ): ViewerMouseEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerMouseEvent[T]]
  }
  @scala.inline
  implicit class ViewerMouseEventOps[Self <: ViewerMouseEvent[_], T] (val x: Self with ViewerMouseEvent[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSVGViewer(value: SVGSVGElement): Self = this.set("SVGViewer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: MouseEvent[T, NativeMouseEvent]): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setTranslationX(value: Double): Self = this.set("translationX", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslationY(value: Double): Self = this.set("translationY", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

