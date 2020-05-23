package typings.primereact.fileUploadMod

import typings.primereact.anon.File
import typings.primereact.anon.Files
import typings.primereact.anon.FilesAny
import typings.primereact.anon.FilesOriginalEvent
import typings.primereact.anon.FormData
import typings.primereact.anon.Progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadProps extends js.Object {
  var accept: js.UndefOr[String] = js.undefined
  var auto: js.UndefOr[Boolean] = js.undefined
  var cancelLabel: js.UndefOr[String] = js.undefined
  var chooseLabel: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customUpload: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var invalidFileSizeMessageDetail: js.UndefOr[String] = js.undefined
  var invalidFileSizeMessageSummary: js.UndefOr[String] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBeforeSend: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.undefined
  var onBeforeUpload: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* e */ Progress, Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* e */ File, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ FilesOriginalEvent, Unit]] = js.undefined
  var onUpload: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.undefined
  var onValidationFail: js.UndefOr[js.Function1[/* file */ typings.std.File, Unit]] = js.undefined
  var previewWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var uploadHandler: js.UndefOr[js.Function1[/* e */ FilesAny, Unit]] = js.undefined
  var uploadLabel: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object FileUploadProps {
  @scala.inline
  def apply(
    accept: String = null,
    auto: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: String = null,
    chooseLabel: String = null,
    className: String = null,
    customUpload: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    invalidFileSizeMessageDetail: String = null,
    invalidFileSizeMessageSummary: String = null,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBeforeSend: /* e */ FormData => Unit = null,
    onBeforeUpload: /* e */ FormData => Unit = null,
    onClear: () => Unit = null,
    onError: /* e */ Files => Unit = null,
    onProgress: /* e */ Progress => Unit = null,
    onRemove: /* e */ File => Unit = null,
    onSelect: /* e */ FilesOriginalEvent => Unit = null,
    onUpload: /* e */ Files => Unit = null,
    onValidationFail: /* file */ typings.std.File => Unit = null,
    previewWidth: js.UndefOr[Double] = js.undefined,
    style: js.Object = null,
    uploadHandler: /* e */ FilesAny => Unit = null,
    uploadLabel: String = null,
    url: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): FileUploadProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.get.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (chooseLabel != null) __obj.updateDynamic("chooseLabel")(chooseLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(customUpload)) __obj.updateDynamic("customUpload")(customUpload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invalidFileSizeMessageDetail != null) __obj.updateDynamic("invalidFileSizeMessageDetail")(invalidFileSizeMessageDetail.asInstanceOf[js.Any])
    if (invalidFileSizeMessageSummary != null) __obj.updateDynamic("invalidFileSizeMessageSummary")(invalidFileSizeMessageSummary.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBeforeSend != null) __obj.updateDynamic("onBeforeSend")(js.Any.fromFunction1(onBeforeSend))
    if (onBeforeUpload != null) __obj.updateDynamic("onBeforeUpload")(js.Any.fromFunction1(onBeforeUpload))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onUpload != null) __obj.updateDynamic("onUpload")(js.Any.fromFunction1(onUpload))
    if (onValidationFail != null) __obj.updateDynamic("onValidationFail")(js.Any.fromFunction1(onValidationFail))
    if (!js.isUndefined(previewWidth)) __obj.updateDynamic("previewWidth")(previewWidth.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uploadHandler != null) __obj.updateDynamic("uploadHandler")(js.Any.fromFunction1(uploadHandler))
    if (uploadLabel != null) __obj.updateDynamic("uploadLabel")(uploadLabel.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadProps]
  }
}

