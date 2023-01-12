package typings.reactMapGl.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLOverlayProps
  extends StObject
     with BaseControlProps {
  
  def redraw(opts: HTMLRedrawOptions): Unit
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object HTMLOverlayProps {
  
  inline def apply(redraw: HTMLRedrawOptions => Unit): HTMLOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    __obj.asInstanceOf[HTMLOverlayProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLOverlayProps] (val x: Self) extends AnyVal {
    
    inline def setRedraw(value: HTMLRedrawOptions => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction1(value))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
