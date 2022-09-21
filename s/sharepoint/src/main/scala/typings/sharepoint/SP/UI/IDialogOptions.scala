package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for dialog creation */
trait IDialogOptions extends StObject {
  
  /** specifies if maximize button should be shown on the dialog */
  var allowMaximize: js.UndefOr[Boolean] = js.undefined
  
  /** custom arguments to be passed to the dialog */
  var args: js.UndefOr[Any] = js.undefined
  
  /** automatically determine size of the dialog based on its contents. */
  var autoSize: js.UndefOr[Boolean] = js.undefined
  
  /** minimum width of the dialog when using autoSize option */
  var autoSizeStartWidth: js.UndefOr[Double] = js.undefined
  
  /** callback that is called after dialog is closed */
  var dialogReturnValueCallback: js.UndefOr[DialogReturnValueCallback] = js.undefined
  
  /** height of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  var height: js.UndefOr[Double] = js.undefined
  
  /** html element which will be used as contents of the dialog. You should use either html or url attribute, but not both. */
  var html: js.UndefOr[HTMLElement] = js.undefined
  
  /** include padding for adding a scrollbar */
  var includeScrollBarPadding: js.UndefOr[Boolean] = js.undefined
  
  /** specifies if close button should be shown on the dialog */
  var showClose: js.UndefOr[Boolean] = js.undefined
  
  /** The dialog will be maximized when shown. */
  var showMaximized: js.UndefOr[Boolean] = js.undefined
  
  /** Text displayed in the title bar of the dialog box. If not defined, it will default to the title of the page defined by url property. */
  var title: js.UndefOr[String] = js.undefined
  
  /** url of the page which is shown in the modal dialog. You should use either html or url attribute, but not both. */
  var url: js.UndefOr[String] = js.undefined
  
  /** width of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  var width: js.UndefOr[Double] = js.undefined
  
  /** X coordinate of the dialog box. */
  var x: js.UndefOr[Double] = js.undefined
  
  /** Y coordinate of the dialog box. */
  var y: js.UndefOr[Double] = js.undefined
}
object IDialogOptions {
  
  inline def apply(): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogOptions]
  }
  
  extension [Self <: IDialogOptions](x: Self) {
    
    inline def setAllowMaximize(value: Boolean): Self = StObject.set(x, "allowMaximize", value.asInstanceOf[js.Any])
    
    inline def setAllowMaximizeUndefined: Self = StObject.set(x, "allowMaximize", js.undefined)
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeStartWidth(value: Double): Self = StObject.set(x, "autoSizeStartWidth", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeStartWidthUndefined: Self = StObject.set(x, "autoSizeStartWidth", js.undefined)
    
    inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    inline def setDialogReturnValueCallback(value: (/* dialogResult */ DialogResult, /* returnValue */ Any) => Unit): Self = StObject.set(x, "dialogReturnValueCallback", js.Any.fromFunction2(value))
    
    inline def setDialogReturnValueCallbackUndefined: Self = StObject.set(x, "dialogReturnValueCallback", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHtml(value: HTMLElement): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setIncludeScrollBarPadding(value: Boolean): Self = StObject.set(x, "includeScrollBarPadding", value.asInstanceOf[js.Any])
    
    inline def setIncludeScrollBarPaddingUndefined: Self = StObject.set(x, "includeScrollBarPadding", js.undefined)
    
    inline def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
    
    inline def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
    
    inline def setShowMaximized(value: Boolean): Self = StObject.set(x, "showMaximized", value.asInstanceOf[js.Any])
    
    inline def setShowMaximizedUndefined: Self = StObject.set(x, "showMaximized", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
