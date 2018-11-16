package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.DialogOptions")
@js.native
class DialogOptions () extends IDialogOptions {
  /** specifies if maximize button should be shown on the dialog */
  @JSName("allowMaximize")
  var allowMaximize_DialogOptions: scala.Boolean = js.native
  /** minimum width of the dialog when using autoSize option */
  @JSName("autoSizeStartWidth")
  var autoSizeStartWidth_DialogOptions: scala.Double = js.native
  /** automatically determine size of the dialog based on its contents. */
  @JSName("autoSize")
  var autoSize_DialogOptions: scala.Boolean = js.native
  /** callback that is called after dialog is closed */
  @JSName("dialogReturnValueCallback")
  var dialogReturnValueCallback_Original: DialogReturnValueCallback = js.native
  /** height of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  @JSName("height")
  var height_DialogOptions: scala.Double = js.native
  /** html element which will be used as contents of the dialog. You should use either html or url attribute, but not both. */
  @JSName("html")
  var html_DialogOptions: stdLib.HTMLElement = js.native
  /** include padding for adding a scrollbar */
  @JSName("includeScrollBarPadding")
  var includeScrollBarPadding_DialogOptions: scala.Boolean = js.native
  /** specifies if close button should be shown on the dialog */
  @JSName("showClose")
  var showClose_DialogOptions: scala.Boolean = js.native
  /** The dialog will be maximized when shown. */
  @JSName("showMaximized")
  var showMaximized_DialogOptions: scala.Boolean = js.native
  /** Text displayed in the title bar of the dialog box. If not defined, it will default to the title of the page defined by url property. */
  @JSName("title")
  var title_DialogOptions: java.lang.String = js.native
  /** url of the page which is shown in the modal dialog. You should use either html or url attribute, but not both. */
  @JSName("url")
  var url_DialogOptions: java.lang.String = js.native
  /** width of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  @JSName("width")
  var width_DialogOptions: scala.Double = js.native
  /** X coordinate of the dialog box. */
  @JSName("x")
  var x_DialogOptions: scala.Double = js.native
  /** Y coordinate of the dialog box. */
  @JSName("y")
  var y_DialogOptions: scala.Double = js.native
  /** callback that is called after dialog is closed */
  @JSName("dialogReturnValueCallback")
  def dialogReturnValueCallback_MDialogOptions(dialogResult: DialogResult, returnValue: js.Any): scala.Unit = js.native
}

