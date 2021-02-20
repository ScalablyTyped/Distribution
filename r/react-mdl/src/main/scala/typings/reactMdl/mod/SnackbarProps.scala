package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnackbarProps
  extends HTMLProps[js.Any] {
  
  var active: Boolean = js.native
  
  var onActionClick: js.UndefOr[MouseEventHandler[Snackbar]] = js.native
  
  def onTimeout(): js.Any = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object SnackbarProps {
  
  @scala.inline
  def apply(active: Boolean, onTimeout: () => js.Any): SnackbarProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onTimeout = js.Any.fromFunction0(onTimeout))
    __obj.asInstanceOf[SnackbarProps]
  }
  
  @scala.inline
  implicit class SnackbarPropsMutableBuilder[Self <: SnackbarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnActionClick(value: MouseEvent[Snackbar, NativeMouseEvent] => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    
    @scala.inline
    def setOnTimeout(value: () => js.Any): Self = StObject.set(x, "onTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
