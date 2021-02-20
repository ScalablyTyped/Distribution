package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import typings.std.HTMLFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a dialog. Do not use this class directly from your code. */
@js.native
trait Dialog extends StObject {
  
  def autoSize(): Unit = js.native
  
  def autoSizeSuppressScrollbar(resizePageCallBack: js.Any): Unit = js.native
  
  def get_allowMaximize(): Boolean = js.native
  
  def get_args(): js.Any = js.native
  
  def get_closed(): Boolean = js.native
  
  def get_dialogElement(): HTMLElement = js.native
  
  def get_firstTabStop(): HTMLElement = js.native
  
  def get_frameElement(): HTMLFrameElement = js.native
  
  def get_html(): String = js.native
  
  def get_isMaximized(): Boolean = js.native
  
  def get_lastTabStop(): HTMLElement = js.native
  
  def get_returnValue(): js.Any = js.native
  
  def get_showClose(): Boolean = js.native
  
  def get_title(): String = js.native
  
  def get_url(): String = js.native
  
  def set_returnValue(value: js.Any): Unit = js.native
}
object Dialog {
  
  @scala.inline
  def apply(
    autoSize: () => Unit,
    autoSizeSuppressScrollbar: js.Any => Unit,
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
  ): Dialog = {
    val __obj = js.Dynamic.literal(autoSize = js.Any.fromFunction0(autoSize), autoSizeSuppressScrollbar = js.Any.fromFunction1(autoSizeSuppressScrollbar), get_allowMaximize = js.Any.fromFunction0(get_allowMaximize), get_args = js.Any.fromFunction0(get_args), get_closed = js.Any.fromFunction0(get_closed), get_dialogElement = js.Any.fromFunction0(get_dialogElement), get_firstTabStop = js.Any.fromFunction0(get_firstTabStop), get_frameElement = js.Any.fromFunction0(get_frameElement), get_html = js.Any.fromFunction0(get_html), get_isMaximized = js.Any.fromFunction0(get_isMaximized), get_lastTabStop = js.Any.fromFunction0(get_lastTabStop), get_returnValue = js.Any.fromFunction0(get_returnValue), get_showClose = js.Any.fromFunction0(get_showClose), get_title = js.Any.fromFunction0(get_title), get_url = js.Any.fromFunction0(get_url), set_returnValue = js.Any.fromFunction1(set_returnValue))
    __obj.asInstanceOf[Dialog]
  }
  
  @scala.inline
  implicit class DialogMutableBuilder[Self <: Dialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSize(value: () => Unit): Self = StObject.set(x, "autoSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutoSizeSuppressScrollbar(value: js.Any => Unit): Self = StObject.set(x, "autoSizeSuppressScrollbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_allowMaximize(value: () => Boolean): Self = StObject.set(x, "get_allowMaximize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_args(value: () => js.Any): Self = StObject.set(x, "get_args", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_closed(value: () => Boolean): Self = StObject.set(x, "get_closed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_dialogElement(value: () => HTMLElement): Self = StObject.set(x, "get_dialogElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_firstTabStop(value: () => HTMLElement): Self = StObject.set(x, "get_firstTabStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_frameElement(value: () => HTMLFrameElement): Self = StObject.set(x, "get_frameElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_html(value: () => String): Self = StObject.set(x, "get_html", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_isMaximized(value: () => Boolean): Self = StObject.set(x, "get_isMaximized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_lastTabStop(value: () => HTMLElement): Self = StObject.set(x, "get_lastTabStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_returnValue(value: () => js.Any): Self = StObject.set(x, "get_returnValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_showClose(value: () => Boolean): Self = StObject.set(x, "get_showClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_title(value: () => String): Self = StObject.set(x, "get_title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_url(value: () => String): Self = StObject.set(x, "get_url", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_returnValue(value: js.Any => Unit): Self = StObject.set(x, "set_returnValue", js.Any.fromFunction1(value))
  }
}
