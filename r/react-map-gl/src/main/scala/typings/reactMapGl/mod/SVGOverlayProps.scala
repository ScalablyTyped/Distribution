package typings.reactMapGl.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGOverlayProps
  extends StObject
     with BaseControlProps {
  
  def redraw(opts: SVGRedrawOptions): Unit
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object SVGOverlayProps {
  
  inline def apply(redraw: SVGRedrawOptions => Unit): SVGOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    __obj.asInstanceOf[SVGOverlayProps]
  }
  
  extension [Self <: SVGOverlayProps](x: Self) {
    
    inline def setRedraw(value: SVGRedrawOptions => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction1(value))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
