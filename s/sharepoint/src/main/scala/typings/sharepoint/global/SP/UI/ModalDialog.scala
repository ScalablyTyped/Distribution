package typings.sharepoint.global.SP.UI

import typings.sharepoint.SP.UI.DialogReturnValueCallback
import typings.sharepoint.SP.UI.IDialogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a modal dialog */
@JSGlobal("SP.UI.ModalDialog")
@js.native
class ModalDialog ()
  extends typings.sharepoint.SP.UI.ModalDialog
object ModalDialog {
  
  /** Show modal dialog specified by url, callback, height and width. */
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.OpenPopUpPage")
  @js.native
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback): Unit = js.native
  @JSGlobal("SP.UI.ModalDialog.OpenPopUpPage")
  @js.native
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  @JSGlobal("SP.UI.ModalDialog.OpenPopUpPage")
  @js.native
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: Double): Unit = js.native
  @JSGlobal("SP.UI.ModalDialog.OpenPopUpPage")
  @js.native
  def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: Double, height: Double): Unit = js.native
  
  /** Refresh the page if specified dialogResult equals to SP.UI.DialogResult.OK */
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.RefreshPage")
  @js.native
  def RefreshPage(dialogResult: typings.sharepoint.SP.UI.DialogResult): Unit = js.native
  
  /** Show page specified by the url in a modal dialog. If the dialog returns SP.UI.DialogResult.OK, the page is refreshed. */
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.ShowPopupDialog")
  @js.native
  def ShowPopupDialog(url: String): Unit = js.native
  
  /** Should be called from an existing dialog. */
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.commonModalDialogClose")
  @js.native
  def commonModalDialogClose(dialogResult: typings.sharepoint.SP.UI.DialogResult, returnValue: js.Any): Unit = js.native
  
  /** Shows a modal dialog, specified by url, callback, args, and options. Internally, uses SP.UI.ModalDialog.showModalDialog.
    @param url overrides options.url
    @param callback overrides options.dialogResultValueCallback
    @param args overrides options.args */
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.commonModalDialogOpen")
  @js.native
  def commonModalDialogOpen(url: String, options: IDialogOptions): Unit = js.native
  @JSGlobal("SP.UI.ModalDialog.commonModalDialogOpen")
  @js.native
  def commonModalDialogOpen(url: String, options: IDialogOptions, callback: js.UndefOr[scala.Nothing], args: js.Any): Unit = js.native
  @JSGlobal("SP.UI.ModalDialog.commonModalDialogOpen")
  @js.native
  def commonModalDialogOpen(url: String, options: IDialogOptions, callback: DialogReturnValueCallback): Unit = js.native
  @JSGlobal("SP.UI.ModalDialog.commonModalDialogOpen")
  @js.native
  def commonModalDialogOpen(url: String, options: IDialogOptions, callback: DialogReturnValueCallback, args: js.Any): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.get_childDialog")
  @js.native
  def getChildDialog(): typings.sharepoint.SP.UI.ModalDialog = js.native
  
  /** Displays a modal dialog defined by the specified options. */
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.showModalDialog")
  @js.native
  def showModalDialog(options: IDialogOptions): typings.sharepoint.SP.UI.ModalDialog = js.native
  
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.showPlatformFirstRunDialog")
  @js.native
  def showPlatformFirstRunDialog(url: String, callbackFunc: DialogReturnValueCallback): typings.sharepoint.SP.UI.ModalDialog = js.native
  
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel button is shown. If user clicks it, the callbackFunc is called. */
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(title: String): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: js.UndefOr[scala.Nothing],
    height: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: js.UndefOr[scala.Nothing],
    height: Double,
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(title: String, message: js.UndefOr[scala.Nothing], callbackFunc: DialogReturnValueCallback): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: DialogReturnValueCallback,
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: DialogReturnValueCallback,
    height: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: js.UndefOr[scala.Nothing],
    callbackFunc: DialogReturnValueCallback,
    height: Double,
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(title: String, message: String): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(title: String, message: String, callbackFunc: js.UndefOr[scala.Nothing], height: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: js.UndefOr[scala.Nothing],
    height: Double,
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(title: String, message: String, callbackFunc: DialogReturnValueCallback): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: DialogReturnValueCallback,
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(title: String, message: String, callbackFunc: DialogReturnValueCallback, height: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenSize")
  @js.native
  def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: DialogReturnValueCallback,
    height: Double,
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel/close button is not shown. */
  /* static member */
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenWithNoClose")
  @js.native
  def showWaitScreenWithNoClose(title: String): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenWithNoClose")
  @js.native
  def showWaitScreenWithNoClose(
    title: String,
    message: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    width: Double
  ): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenWithNoClose")
  @js.native
  def showWaitScreenWithNoClose(title: String, message: js.UndefOr[scala.Nothing], height: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenWithNoClose")
  @js.native
  def showWaitScreenWithNoClose(title: String, message: js.UndefOr[scala.Nothing], height: Double, width: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenWithNoClose")
  @js.native
  def showWaitScreenWithNoClose(title: String, message: String): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenWithNoClose")
  @js.native
  def showWaitScreenWithNoClose(title: String, message: String, height: js.UndefOr[scala.Nothing], width: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenWithNoClose")
  @js.native
  def showWaitScreenWithNoClose(title: String, message: String, height: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
  @JSGlobal("SP.UI.ModalDialog.showWaitScreenWithNoClose")
  @js.native
  def showWaitScreenWithNoClose(title: String, message: String, height: Double, width: Double): typings.sharepoint.SP.UI.ModalDialog = js.native
}
