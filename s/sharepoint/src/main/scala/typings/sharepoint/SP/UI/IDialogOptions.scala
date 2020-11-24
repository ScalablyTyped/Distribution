package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for dialog creation */
@js.native
trait IDialogOptions extends js.Object {
  
  /** specifies if maximize button should be shown on the dialog */
  var allowMaximize: js.UndefOr[Boolean] = js.native
  
  /** custom arguments to be passed to the dialog */
  var args: js.UndefOr[js.Any] = js.native
  
  /** automatically determine size of the dialog based on its contents. */
  var autoSize: js.UndefOr[Boolean] = js.native
  
  /** minimum width of the dialog when using autoSize option */
  var autoSizeStartWidth: js.UndefOr[Double] = js.native
  
  /** callback that is called after dialog is closed */
  var dialogReturnValueCallback: js.UndefOr[DialogReturnValueCallback] = js.native
  
  /** height of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  var height: js.UndefOr[Double] = js.native
  
  /** html element which will be used as contents of the dialog. You should use either html or url attribute, but not both. */
  var html: js.UndefOr[HTMLElement] = js.native
  
  /** include padding for adding a scrollbar */
  var includeScrollBarPadding: js.UndefOr[Boolean] = js.native
  
  /** specifies if close button should be shown on the dialog */
  var showClose: js.UndefOr[Boolean] = js.native
  
  /** The dialog will be maximized when shown. */
  var showMaximized: js.UndefOr[Boolean] = js.native
  
  /** Text displayed in the title bar of the dialog box. If not defined, it will default to the title of the page defined by url property. */
  var title: js.UndefOr[String] = js.native
  
  /** url of the page which is shown in the modal dialog. You should use either html or url attribute, but not both. */
  var url: js.UndefOr[String] = js.native
  
  /** width of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  var width: js.UndefOr[Double] = js.native
  
  /** X coordinate of the dialog box. */
  var x: js.UndefOr[Double] = js.native
  
  /** Y coordinate of the dialog box. */
  var y: js.UndefOr[Double] = js.native
}
object IDialogOptions {
  
  @scala.inline
  def apply(): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogOptions]
  }
  
  @scala.inline
  implicit class IDialogOptionsOps[Self <: IDialogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowMaximize(value: Boolean): Self = this.set("allowMaximize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMaximize: Self = this.set("allowMaximize", js.undefined)
    
    @scala.inline
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = this.set("autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    
    @scala.inline
    def setAutoSizeStartWidth(value: Double): Self = this.set("autoSizeStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSizeStartWidth: Self = this.set("autoSizeStartWidth", js.undefined)
    
    @scala.inline
    def setDialogReturnValueCallback(value: (/* dialogResult */ DialogResult, /* returnValue */ js.Any) => Unit): Self = this.set("dialogReturnValueCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDialogReturnValueCallback: Self = this.set("dialogReturnValueCallback", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtml(value: HTMLElement): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setIncludeScrollBarPadding(value: Boolean): Self = this.set("includeScrollBarPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeScrollBarPadding: Self = this.set("includeScrollBarPadding", js.undefined)
    
    @scala.inline
    def setShowClose(value: Boolean): Self = this.set("showClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClose: Self = this.set("showClose", js.undefined)
    
    @scala.inline
    def setShowMaximized(value: Boolean): Self = this.set("showMaximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMaximized: Self = this.set("showMaximized", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
