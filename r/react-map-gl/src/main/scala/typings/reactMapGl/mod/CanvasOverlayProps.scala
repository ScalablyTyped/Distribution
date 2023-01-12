package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasOverlayProps
  extends StObject
     with BaseControlProps {
  
  def redraw(opts: CanvasRedrawOptions): Unit
}
object CanvasOverlayProps {
  
  inline def apply(redraw: CanvasRedrawOptions => Unit): CanvasOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    __obj.asInstanceOf[CanvasOverlayProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasOverlayProps] (val x: Self) extends AnyVal {
    
    inline def setRedraw(value: CanvasRedrawOptions => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction1(value))
  }
}
