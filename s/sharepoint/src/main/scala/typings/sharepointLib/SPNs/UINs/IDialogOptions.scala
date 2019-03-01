package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for dialog creation */
// tslint:disable-next-line: interface-name
trait IDialogOptions extends js.Object {
  /** specifies if maximize button should be shown on the dialog */
  var allowMaximize: js.UndefOr[scala.Boolean] = js.undefined
  /** custom arguments to be passed to the dialog */
  var args: js.UndefOr[js.Any] = js.undefined
  /** automatically determine size of the dialog based on its contents. */
  var autoSize: js.UndefOr[scala.Boolean] = js.undefined
  /** minimum width of the dialog when using autoSize option */
  var autoSizeStartWidth: js.UndefOr[scala.Double] = js.undefined
  /** callback that is called after dialog is closed */
  var dialogReturnValueCallback: js.UndefOr[DialogReturnValueCallback] = js.undefined
  /** height of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** html element which will be used as contents of the dialog. You should use either html or url attribute, but not both. */
  var html: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** include padding for adding a scrollbar */
  var includeScrollBarPadding: js.UndefOr[scala.Boolean] = js.undefined
  /** specifies if close button should be shown on the dialog */
  var showClose: js.UndefOr[scala.Boolean] = js.undefined
  /** The dialog will be maximized when shown. */
  var showMaximized: js.UndefOr[scala.Boolean] = js.undefined
  /** Text displayed in the title bar of the dialog box. If not defined, it will default to the title of the page defined by url property. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** url of the page which is shown in the modal dialog. You should use either html or url attribute, but not both. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** width of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** X coordinate of the dialog box. */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Y coordinate of the dialog box. */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object IDialogOptions {
  @scala.inline
  def apply(
    allowMaximize: js.UndefOr[scala.Boolean] = js.undefined,
    args: js.Any = null,
    autoSize: js.UndefOr[scala.Boolean] = js.undefined,
    autoSizeStartWidth: scala.Int | scala.Double = null,
    dialogReturnValueCallback: DialogReturnValueCallback = null,
    height: scala.Int | scala.Double = null,
    html: stdLib.HTMLElement = null,
    includeScrollBarPadding: js.UndefOr[scala.Boolean] = js.undefined,
    showClose: js.UndefOr[scala.Boolean] = js.undefined,
    showMaximized: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMaximize)) __obj.updateDynamic("allowMaximize")(allowMaximize)
    if (args != null) __obj.updateDynamic("args")(args)
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize)
    if (autoSizeStartWidth != null) __obj.updateDynamic("autoSizeStartWidth")(autoSizeStartWidth.asInstanceOf[js.Any])
    if (dialogReturnValueCallback != null) __obj.updateDynamic("dialogReturnValueCallback")(dialogReturnValueCallback)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html)
    if (!js.isUndefined(includeScrollBarPadding)) __obj.updateDynamic("includeScrollBarPadding")(includeScrollBarPadding)
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose)
    if (!js.isUndefined(showMaximized)) __obj.updateDynamic("showMaximized")(showMaximized)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogOptions]
  }
}

