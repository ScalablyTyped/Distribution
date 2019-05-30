package typings
package primereactLib.componentsFileuploadFileUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadProps extends js.Object {
  var accept: js.UndefOr[java.lang.String] = js.undefined
  var auto: js.UndefOr[scala.Boolean] = js.undefined
  var cancelLabel: js.UndefOr[java.lang.String] = js.undefined
  var chooseLabel: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var invalidFileSizeMessageDetail: js.UndefOr[java.lang.String] = js.undefined
  var invalidFileSizeMessageSummary: js.UndefOr[java.lang.String] = js.undefined
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBeforeSend: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_FormData, scala.Unit]] = js.undefined
  var onBeforeUpload: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_FormData, scala.Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Files, scala.Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventProgress, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_FilesOriginalEvent, scala.Unit]] = js.undefined
  var onUpload: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Files, scala.Unit]] = js.undefined
  var onValidationFail: js.UndefOr[js.Function1[/* file */ stdLib.File, scala.Unit]] = js.undefined
  var previewWidth: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var uploadLabel: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object FileUploadProps {
  @scala.inline
  def apply(
    accept: java.lang.String = null,
    auto: js.UndefOr[scala.Boolean] = js.undefined,
    cancelLabel: java.lang.String = null,
    chooseLabel: java.lang.String = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    invalidFileSizeMessageDetail: java.lang.String = null,
    invalidFileSizeMessageSummary: java.lang.String = null,
    maxFileSize: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onBeforeSend: /* e */ primereactLib.Anon_FormData => scala.Unit = null,
    onBeforeUpload: /* e */ primereactLib.Anon_FormData => scala.Unit = null,
    onClear: () => scala.Unit = null,
    onError: /* e */ primereactLib.Anon_Files => scala.Unit = null,
    onProgress: /* e */ primereactLib.Anon_OriginalEventProgress => scala.Unit = null,
    onSelect: /* e */ primereactLib.Anon_FilesOriginalEvent => scala.Unit = null,
    onUpload: /* e */ primereactLib.Anon_Files => scala.Unit = null,
    onValidationFail: /* file */ stdLib.File => scala.Unit = null,
    previewWidth: scala.Int | scala.Double = null,
    style: js.Object = null,
    uploadLabel: java.lang.String = null,
    url: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): FileUploadProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (chooseLabel != null) __obj.updateDynamic("chooseLabel")(chooseLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (invalidFileSizeMessageDetail != null) __obj.updateDynamic("invalidFileSizeMessageDetail")(invalidFileSizeMessageDetail)
    if (invalidFileSizeMessageSummary != null) __obj.updateDynamic("invalidFileSizeMessageSummary")(invalidFileSizeMessageSummary)
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBeforeSend != null) __obj.updateDynamic("onBeforeSend")(js.Any.fromFunction1(onBeforeSend))
    if (onBeforeUpload != null) __obj.updateDynamic("onBeforeUpload")(js.Any.fromFunction1(onBeforeUpload))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onUpload != null) __obj.updateDynamic("onUpload")(js.Any.fromFunction1(onUpload))
    if (onValidationFail != null) __obj.updateDynamic("onValidationFail")(js.Any.fromFunction1(onValidationFail))
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (uploadLabel != null) __obj.updateDynamic("uploadLabel")(uploadLabel)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[FileUploadProps]
  }
}

