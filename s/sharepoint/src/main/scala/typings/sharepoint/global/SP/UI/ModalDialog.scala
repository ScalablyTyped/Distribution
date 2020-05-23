package typings.sharepoint.global.SP.UI

import typings.sharepoint.SP.UI.DialogReturnValueCallback
import typings.sharepoint.SP.UI.IDialogOptions
import typings.std.HTMLElement
import typings.std.HTMLFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a modal dialog */
@JSGlobal("SP.UI.ModalDialog")
@js.native
class ModalDialog ()
  extends typings.sharepoint.SP.UI.ModalDialog {
  /* CompleteClass */
  override def autoSize(): Unit = js.native
  /* CompleteClass */
  override def autoSizeSuppressScrollbar(resizePageCallBack: js.Any): Unit = js.native
  /** Closes the dialog using the specified dialog result. */
  /* CompleteClass */
  override def close(dialogResult: typings.sharepoint.SP.UI.DialogResult): Unit = js.native
  /* CompleteClass */
  override def get_allowMaximize(): Boolean = js.native
  /* CompleteClass */
  override def get_args(): js.Any = js.native
  /* CompleteClass */
  override def get_closed(): Boolean = js.native
  /* CompleteClass */
  override def get_dialogElement(): HTMLElement = js.native
  /* CompleteClass */
  override def get_firstTabStop(): HTMLElement = js.native
  /* CompleteClass */
  override def get_frameElement(): HTMLFrameElement = js.native
  /* CompleteClass */
  override def get_html(): String = js.native
  /* CompleteClass */
  override def get_isMaximized(): Boolean = js.native
  /* CompleteClass */
  override def get_lastTabStop(): HTMLElement = js.native
  /* CompleteClass */
  override def get_returnValue(): js.Any = js.native
  /* CompleteClass */
  override def get_showClose(): Boolean = js.native
  /* CompleteClass */
  override def get_title(): String = js.native
  /* CompleteClass */
  override def get_url(): String = js.native
  /* CompleteClass */
  override def set_returnValue(value: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("SP.UI.ModalDialog")
@js.native
object ModalDialog extends js.Object {
  /** Show modal dialog specified by url, callback, height and width. */
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback): Unit = js.native
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: Double): Unit = js.native
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: Double, height: Double): Unit = js.native
  /** Refresh the page if specified dialogResult equals to SP.UI.DialogResult.OK */
  def RefreshPage(dialogResult: typings.sharepoint.SP.UI.DialogResult): Unit = js.native
  /** Show page specified by the url in a modal dialog. If the dialog returns SP.UI.DialogResult.OK, the page is refreshed. */
  def ShowPopupDialog(url: String): Unit = js.native
  /** Should be called from an existing dialog. */
  def commonModalDialogClose(dialogResult: typings.sharepoint.SP.UI.DialogResult, returnValue: js.Any): Unit = js.native
  /** Shows a modal dialog, specified by url, callback, args, and options. Internally, uses SP.UI.ModalDialog.showModalDialog.
    @param url overrides options.url
    @param callback overrides options.dialogResultValueCallback
    @param args overrides options.args */
  def commonModalDialogOpen(url: String, options: IDialogOptions): Unit = js.native
  def commonModalDialogOpen(url: String, options: IDialogOptions, callback: DialogReturnValueCallback): Unit = js.native
  def commonModalDialogOpen(url: String, options: IDialogOptions, callback: DialogReturnValueCallback, args: js.Any): Unit = js.native
  def get_childDialog(): typings.sharepoint.SP.UI.ModalDialog = js.native
  /** Displays a modal dialog defined by the specified options. */
  def showModalDialog(options: IDialogOptions): typings.sharepoint.SP.UI.ModalDialog = js.native
  def showPlatformFirstRunDialog(url: String, callbackFunc: DialogReturnValueCallback): typings.sharepoint.SP.UI.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel button is shown. If user clicks it, the callbackFunc is called. */
  def showWaitScreenSize(title: String): typings.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(title: String, message: String): typings.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(title: String, message: String, callbackFunc: DialogReturnValueCallback): typings.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(title: String, message: String, callbackFunc: DialogReturnValueCallback, height: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: DialogReturnValueCallback,
    height: Double,
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel/close button is not shown. */
  def showWaitScreenWithNoClose(title: String): typings.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(title: String, message: String): typings.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(title: String, message: String, height: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
  def showWaitScreenWithNoClose(title: String, message: String, height: Double, width: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
}

