package typings.sharepoint.SPNs.UINs

import typings.std.HTMLElement
import typings.std.HTMLFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a dialog. Do not use this class directly from your code. */
@JSGlobal("SP.UI.Dialog")
@js.native
class Dialog () extends js.Object {
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

