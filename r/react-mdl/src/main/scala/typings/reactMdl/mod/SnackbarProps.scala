package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnackbarProps
  extends StObject
     with HTMLProps[Any] {
  
  var active: Boolean
  
  var onActionClick: js.UndefOr[MouseEventHandler[Snackbar]] = js.undefined
  
  def onTimeout(): Any
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object SnackbarProps {
  
  inline def apply(active: Boolean, onTimeout: () => Any): SnackbarProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onTimeout = js.Any.fromFunction0(onTimeout))
    __obj.asInstanceOf[SnackbarProps]
  }
  
  extension [Self <: SnackbarProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setOnActionClick(value: MouseEvent[Snackbar, NativeMouseEvent] => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction1(value))
    
    inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    
    inline def setOnTimeout(value: () => Any): Self = StObject.set(x, "onTimeout", js.Any.fromFunction0(value))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
