package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import typings.std.HTMLFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a dialog. Do not use this class directly from your code. */
trait Dialog extends js.Object {
  def autoSize(): Unit
  def autoSizeSuppressScrollbar(resizePageCallBack: js.Any): Unit
  def get_allowMaximize(): Boolean
  def get_args(): js.Any
  def get_closed(): Boolean
  def get_dialogElement(): HTMLElement
  def get_firstTabStop(): HTMLElement
  def get_frameElement(): HTMLFrameElement
  def get_html(): String
  def get_isMaximized(): Boolean
  def get_lastTabStop(): HTMLElement
  def get_returnValue(): js.Any
  def get_showClose(): Boolean
  def get_title(): String
  def get_url(): String
  def set_returnValue(value: js.Any): Unit
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
}

