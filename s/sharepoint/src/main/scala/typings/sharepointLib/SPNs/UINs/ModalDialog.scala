package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a modal dialog */
@JSGlobal("SP.UI.ModalDialog")
@js.native
class ModalDialog () extends Dialog {
  /** Closes the dialog using the specified dialog result. */
  def close(dialogResult: DialogResult): scala.Unit = js.native
}

/** Represents a modal dialog */
@JSGlobal("SP.UI.ModalDialog")
@js.native
object ModalDialog extends js.Object {
  /** Show modal dialog specified by url, callback, height and width. */
  def OpenPopUpPage(url: java.lang.String, callback: sharepointLib.SPNs.UINs.DialogReturnValueCallback): scala.Unit = js.native
  /** Show modal dialog specified by url, callback, height and width. */
  def OpenPopUpPage(
    url: java.lang.String,
    callback: sharepointLib.SPNs.UINs.DialogReturnValueCallback,
    width: scala.Double
  ): scala.Unit = js.native
  /** Show modal dialog specified by url, callback, height and width. */
  def OpenPopUpPage(
    url: java.lang.String,
    callback: sharepointLib.SPNs.UINs.DialogReturnValueCallback,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
  /** Refresh the page if specified dialogResult equals to SP.UI.DialogResult.OK */
  def RefreshPage(dialogResult: sharepointLib.SPNs.UINs.DialogResult): scala.Unit = js.native
  /** Show page specified by the url in a modal dialog. If the dialog returns SP.UI.DialogResult.OK, the page is refreshed. */
  def ShowPopupDialog(url: java.lang.String): scala.Unit = js.native
  /** Should be called from an existing dialog. */
  def commonModalDialogClose(dialogResult: sharepointLib.SPNs.UINs.DialogResult, returnValue: js.Any): scala.Unit = js.native
  /** Shows a modal dialog, specified by url, callback, args, and options. Internally, uses SP.UI.ModalDialog.showModalDialog.
                  @param url overrides options.url
                  @param callback overrides options.dialogResultValueCallback
                  @param args overrides options.args */
  def commonModalDialogOpen(url: java.lang.String, options: sharepointLib.SPNs.UINs.IDialogOptions): scala.Unit = js.native
  /** Shows a modal dialog, specified by url, callback, args, and options. Internally, uses SP.UI.ModalDialog.showModalDialog.
                  @param url overrides options.url
                  @param callback overrides options.dialogResultValueCallback
                  @param args overrides options.args */
  def commonModalDialogOpen(
    url: java.lang.String,
    options: sharepointLib.SPNs.UINs.IDialogOptions,
    callback: sharepointLib.SPNs.UINs.DialogReturnValueCallback
  ): scala.Unit = js.native
  /** Shows a modal dialog, specified by url, callback, args, and options. Internally, uses SP.UI.ModalDialog.showModalDialog.
                  @param url overrides options.url
                  @param callback overrides options.dialogResultValueCallback
                  @param args overrides options.args */
  def commonModalDialogOpen(
    url: java.lang.String,
    options: sharepointLib.SPNs.UINs.IDialogOptions,
    callback: sharepointLib.SPNs.UINs.DialogReturnValueCallback,
    args: js.Any
  ): scala.Unit = js.native
  def get_childDialog(): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a modal dialog defined by the specified options. */
  def showModalDialog(options: sharepointLib.SPNs.UINs.IDialogOptions): sharepointLib.SPNs.UINs.ModalDialog = js.native
  def showPlatformFirstRunDialog(url: java.lang.String, callbackFunc: sharepointLib.SPNs.UINs.DialogReturnValueCallback): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel button is shown. If user clicks it, the callbackFunc is called. */
  def showWaitScreenSize(title: java.lang.String): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel button is shown. If user clicks it, the callbackFunc is called. */
  def showWaitScreenSize(title: java.lang.String, message: java.lang.String): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel button is shown. If user clicks it, the callbackFunc is called. */
  def showWaitScreenSize(
    title: java.lang.String,
    message: java.lang.String,
    callbackFunc: sharepointLib.SPNs.UINs.DialogReturnValueCallback
  ): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel button is shown. If user clicks it, the callbackFunc is called. */
  def showWaitScreenSize(
    title: java.lang.String,
    message: java.lang.String,
    callbackFunc: sharepointLib.SPNs.UINs.DialogReturnValueCallback,
    height: scala.Double
  ): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel button is shown. If user clicks it, the callbackFunc is called. */
  def showWaitScreenSize(
    title: java.lang.String,
    message: java.lang.String,
    callbackFunc: sharepointLib.SPNs.UINs.DialogReturnValueCallback,
    height: scala.Double,
    width: scala.Double
  ): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel/close button is not shown. */
  def showWaitScreenWithNoClose(title: java.lang.String): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel/close button is not shown. */
  def showWaitScreenWithNoClose(title: java.lang.String, message: java.lang.String): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel/close button is not shown. */
  def showWaitScreenWithNoClose(title: java.lang.String, message: java.lang.String, height: scala.Double): sharepointLib.SPNs.UINs.ModalDialog = js.native
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel/close button is not shown. */
  def showWaitScreenWithNoClose(title: java.lang.String, message: java.lang.String, height: scala.Double, width: scala.Double): sharepointLib.SPNs.UINs.ModalDialog = js.native
}

