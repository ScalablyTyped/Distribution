package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for dialog creation */
// tslint:disable-next-line: interface-name
trait IDialogOptions extends js.Object {
  /** specifies if maximize button should be shown on the dialog */
  var allowMaximize: js.UndefOr[Boolean] = js.undefined
  /** custom arguments to be passed to the dialog */
  var args: js.UndefOr[js.Any] = js.undefined
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
  @scala.inline
  def apply(
    allowMaximize: js.UndefOr[Boolean] = js.undefined,
    args: js.Any = null,
    autoSize: js.UndefOr[Boolean] = js.undefined,
    autoSizeStartWidth: Int | Double = null,
    dialogReturnValueCallback: (/* dialogResult */ DialogResult, /* returnValue */ js.Any) => Unit = null,
    height: Int | Double = null,
    html: HTMLElement = null,
    includeScrollBarPadding: js.UndefOr[Boolean] = js.undefined,
    showClose: js.UndefOr[Boolean] = js.undefined,
    showMaximized: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    url: String = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMaximize)) __obj.updateDynamic("allowMaximize")(allowMaximize.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (autoSizeStartWidth != null) __obj.updateDynamic("autoSizeStartWidth")(autoSizeStartWidth.asInstanceOf[js.Any])
    if (dialogReturnValueCallback != null) __obj.updateDynamic("dialogReturnValueCallback")(js.Any.fromFunction2(dialogReturnValueCallback))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(includeScrollBarPadding)) __obj.updateDynamic("includeScrollBarPadding")(includeScrollBarPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose.asInstanceOf[js.Any])
    if (!js.isUndefined(showMaximized)) __obj.updateDynamic("showMaximized")(showMaximized.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogOptions]
  }
}

