package typings.sharepoint.global.SP.UI

import typings.sharepoint.SP.UI.DialogReturnValueCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.DialogOptions")
@js.native
open class DialogOptions ()
  extends StObject
     with typings.sharepoint.SP.UI.DialogOptions {
  
  /** specifies if maximize button should be shown on the dialog */
  /* CompleteClass */
  @JSName("allowMaximize")
  var allowMaximize_DialogOptions: Boolean = js.native
  
  /** minimum width of the dialog when using autoSize option */
  /* CompleteClass */
  @JSName("autoSizeStartWidth")
  var autoSizeStartWidth_DialogOptions: Double = js.native
  
  /** automatically determine size of the dialog based on its contents. */
  /* CompleteClass */
  @JSName("autoSize")
  var autoSize_DialogOptions: Boolean = js.native
  
  /** callback that is called after dialog is closed */
  /* CompleteClass */
  @JSName("dialogReturnValueCallback")
  override def dialogReturnValueCallback_MDialogOptions(dialogResult: typings.sharepoint.SP.UI.DialogResult, returnValue: Any): Unit = js.native
  /** callback that is called after dialog is closed */
  /* CompleteClass */
  @JSName("dialogReturnValueCallback")
  var dialogReturnValueCallback_Original: DialogReturnValueCallback = js.native
  
  /** height of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  /* CompleteClass */
  @JSName("height")
  var height_DialogOptions: Double = js.native
  
  /** html element which will be used as contents of the dialog. You should use either html or url attribute, but not both. */
  /* CompleteClass */
  @JSName("html")
  var html_DialogOptions: HTMLElement = js.native
  
  /** include padding for adding a scrollbar */
  /* CompleteClass */
  @JSName("includeScrollBarPadding")
  var includeScrollBarPadding_DialogOptions: Boolean = js.native
  
  /** specifies if close button should be shown on the dialog */
  /* CompleteClass */
  @JSName("showClose")
  var showClose_DialogOptions: Boolean = js.native
  
  /** The dialog will be maximized when shown. */
  /* CompleteClass */
  @JSName("showMaximized")
  var showMaximized_DialogOptions: Boolean = js.native
  
  /** Text displayed in the title bar of the dialog box. If not defined, it will default to the title of the page defined by url property. */
  /* CompleteClass */
  @JSName("title")
  var title_DialogOptions: String = js.native
  
  /** url of the page which is shown in the modal dialog. You should use either html or url attribute, but not both. */
  /* CompleteClass */
  @JSName("url")
  var url_DialogOptions: String = js.native
  
  /** width of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  /* CompleteClass */
  @JSName("width")
  var width_DialogOptions: Double = js.native
  
  /** X coordinate of the dialog box. */
  /* CompleteClass */
  @JSName("x")
  var x_DialogOptions: Double = js.native
  
  /** Y coordinate of the dialog box. */
  /* CompleteClass */
  @JSName("y")
  var y_DialogOptions: Double = js.native
}
