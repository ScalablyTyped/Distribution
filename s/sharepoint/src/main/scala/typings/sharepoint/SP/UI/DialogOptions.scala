package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogOptions extends IDialogOptions {
  /** specifies if maximize button should be shown on the dialog */
  @JSName("allowMaximize")
  var allowMaximize_DialogOptions: Boolean = js.native
  /** minimum width of the dialog when using autoSize option */
  @JSName("autoSizeStartWidth")
  var autoSizeStartWidth_DialogOptions: Double = js.native
  /** automatically determine size of the dialog based on its contents. */
  @JSName("autoSize")
  var autoSize_DialogOptions: Boolean = js.native
  /** callback that is called after dialog is closed */
  @JSName("dialogReturnValueCallback")
  var dialogReturnValueCallback_Original: DialogReturnValueCallback = js.native
  /** height of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  @JSName("height")
  var height_DialogOptions: Double = js.native
  /** html element which will be used as contents of the dialog. You should use either html or url attribute, but not both. */
  @JSName("html")
  var html_DialogOptions: HTMLElement = js.native
  /** include padding for adding a scrollbar */
  @JSName("includeScrollBarPadding")
  var includeScrollBarPadding_DialogOptions: Boolean = js.native
  /** specifies if close button should be shown on the dialog */
  @JSName("showClose")
  var showClose_DialogOptions: Boolean = js.native
  /** The dialog will be maximized when shown. */
  @JSName("showMaximized")
  var showMaximized_DialogOptions: Boolean = js.native
  /** Text displayed in the title bar of the dialog box. If not defined, it will default to the title of the page defined by url property. */
  @JSName("title")
  var title_DialogOptions: String = js.native
  /** url of the page which is shown in the modal dialog. You should use either html or url attribute, but not both. */
  @JSName("url")
  var url_DialogOptions: String = js.native
  /** width of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  @JSName("width")
  var width_DialogOptions: Double = js.native
  /** X coordinate of the dialog box. */
  @JSName("x")
  var x_DialogOptions: Double = js.native
  /** Y coordinate of the dialog box. */
  @JSName("y")
  var y_DialogOptions: Double = js.native
  /** callback that is called after dialog is closed */
  @JSName("dialogReturnValueCallback")
  def dialogReturnValueCallback_MDialogOptions(dialogResult: DialogResult, returnValue: js.Any): Unit = js.native
}

