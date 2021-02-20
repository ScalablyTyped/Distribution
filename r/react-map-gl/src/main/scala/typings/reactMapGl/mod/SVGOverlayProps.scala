package typings.reactMapGl.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGOverlayProps extends BaseControlProps {
  
  def redraw(opts: SVGRedrawOptions): Unit = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object SVGOverlayProps {
  
  @scala.inline
  def apply(redraw: SVGRedrawOptions => Unit): SVGOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    __obj.asInstanceOf[SVGOverlayProps]
  }
  
  @scala.inline
  implicit class SVGOverlayPropsMutableBuilder[Self <: SVGOverlayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedraw(value: SVGRedrawOptions => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
