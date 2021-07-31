package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasRect extends StObject {
  
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit
  
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit
  
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit
}
object CanvasRect {
  
  @scala.inline
  def apply(
    clearRect: (Double, Double, Double, Double) => Unit,
    fillRect: (Double, Double, Double, Double) => Unit,
    strokeRect: (Double, Double, Double, Double) => Unit
  ): CanvasRect = {
    val __obj = js.Dynamic.literal(clearRect = js.Any.fromFunction4(clearRect), fillRect = js.Any.fromFunction4(fillRect), strokeRect = js.Any.fromFunction4(strokeRect))
    __obj.asInstanceOf[CanvasRect]
  }
  
  @scala.inline
  implicit class CanvasRectMutableBuilder[Self <: CanvasRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearRect(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "clearRect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFillRect(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "fillRect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStrokeRect(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "strokeRect", js.Any.fromFunction4(value))
  }
}
