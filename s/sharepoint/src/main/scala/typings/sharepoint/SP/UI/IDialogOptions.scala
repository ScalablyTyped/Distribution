package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for dialog creation */
@js.native
trait IDialogOptions extends StObject {
  
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
  implicit class IDialogOptionsMutableBuilder[Self <: IDialogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMaximize(value: Boolean): Self = StObject.set(x, "allowMaximize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMaximizeUndefined: Self = StObject.set(x, "allowMaximize", js.undefined)
    
    @scala.inline
    def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSizeStartWidth(value: Double): Self = StObject.set(x, "autoSizeStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSizeStartWidthUndefined: Self = StObject.set(x, "autoSizeStartWidth", js.undefined)
    
    @scala.inline
    def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    @scala.inline
    def setDialogReturnValueCallback(value: (/* dialogResult */ DialogResult, /* returnValue */ js.Any) => Unit): Self = StObject.set(x, "dialogReturnValueCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDialogReturnValueCallbackUndefined: Self = StObject.set(x, "dialogReturnValueCallback", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHtml(value: HTMLElement): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setIncludeScrollBarPadding(value: Boolean): Self = StObject.set(x, "includeScrollBarPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeScrollBarPaddingUndefined: Self = StObject.set(x, "includeScrollBarPadding", js.undefined)
    
    @scala.inline
    def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
    
    @scala.inline
    def setShowMaximized(value: Boolean): Self = StObject.set(x, "showMaximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMaximizedUndefined: Self = StObject.set(x, "showMaximized", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
