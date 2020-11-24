package typings.reactSvgPanZoom.mod

import typings.react.mod.TouchEvent
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewerTouchEvent[T] extends js.Object {
  
  var SVGViewer: SVGSVGElement = js.native
  
  var changedPoints: js.Array[Point] = js.native
  
  var originalEvent: TouchEvent[T] = js.native
  
  var points: js.Array[Point] = js.native
  
  def preventDefault(): Unit = js.native
  
  var scaleFactor: Double = js.native
  
  def stopPropagation(): Unit = js.native
  
  var translationX: Double = js.native
  
  var translationY: Double = js.native
}
object ViewerTouchEvent {
  
  @scala.inline
  def apply[T](
    SVGViewer: SVGSVGElement,
    changedPoints: js.Array[Point],
    originalEvent: TouchEvent[T],
    points: js.Array[Point],
    preventDefault: () => Unit,
    scaleFactor: Double,
    stopPropagation: () => Unit,
    translationX: Double,
    translationY: Double
  ): ViewerTouchEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], changedPoints = changedPoints.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerTouchEvent[T]]
  }
  
  @scala.inline
  implicit class ViewerTouchEventOps[Self <: ViewerTouchEvent[_], T] (val x: Self with ViewerTouchEvent[T]) extends AnyVal {
    
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
    def setChangedPointsVarargs(value: Point*): Self = this.set("changedPoints", js.Array(value :_*))
    
    @scala.inline
    def setChangedPoints(value: js.Array[Point]): Self = this.set("changedPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: TouchEvent[T]): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    
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
  }
}
