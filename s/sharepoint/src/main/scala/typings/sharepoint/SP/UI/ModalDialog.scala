package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import typings.std.HTMLFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a modal dialog */
trait ModalDialog
  extends StObject
     with Dialog {
  
  /** Closes the dialog using the specified dialog result. */
  def close(dialogResult: DialogResult): Unit
}
object ModalDialog {
  
  inline def apply(
    autoSize: () => Unit,
    autoSizeSuppressScrollbar: js.Any => Unit,
    close: DialogResult => Unit,
    get_allowMaximize: () => Boolean,
    get_args: () => js.Any,
    get_closed: () => Boolean,
    get_dialogElement: () => HTMLElement,
    get_firstTabStop: () => HTMLElement,
    get_frameElement: () => HTMLFrameElement,
    get_html: () => String,
    get_isMaximized: () => Boolean,
    get_lastTabStop: () => HTMLElement,
    get_returnValue: () => js.Any,
    get_showClose: () => Boolean,
    get_title: () => String,
    get_url: () => String,
    set_returnValue: js.Any => Unit
  ): ModalDialog = {
    val __obj = js.Dynamic.literal(autoSize = js.Any.fromFunction0(autoSize), autoSizeSuppressScrollbar = js.Any.fromFunction1(autoSizeSuppressScrollbar), close = js.Any.fromFunction1(close), get_allowMaximize = js.Any.fromFunction0(get_allowMaximize), get_args = js.Any.fromFunction0(get_args), get_closed = js.Any.fromFunction0(get_closed), get_dialogElement = js.Any.fromFunction0(get_dialogElement), get_firstTabStop = js.Any.fromFunction0(get_firstTabStop), get_frameElement = js.Any.fromFunction0(get_frameElement), get_html = js.Any.fromFunction0(get_html), get_isMaximized = js.Any.fromFunction0(get_isMaximized), get_lastTabStop = js.Any.fromFunction0(get_lastTabStop), get_returnValue = js.Any.fromFunction0(get_returnValue), get_showClose = js.Any.fromFunction0(get_showClose), get_title = js.Any.fromFunction0(get_title), get_url = js.Any.fromFunction0(get_url), set_returnValue = js.Any.fromFunction1(set_returnValue))
    __obj.asInstanceOf[ModalDialog]
  }
  
  extension [Self <: ModalDialog](x: Self) {
    
    inline def setClose(value: DialogResult => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
  }
}
