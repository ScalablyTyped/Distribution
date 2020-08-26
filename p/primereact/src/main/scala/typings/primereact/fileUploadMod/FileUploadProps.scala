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

@js.native
trait FileUploadProps extends js.Object {
  var accept: js.UndefOr[String] = js.native
  var auto: js.UndefOr[Boolean] = js.native
  var cancelLabel: js.UndefOr[String] = js.native
  var chooseLabel: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var customUpload: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var invalidFileSizeMessageDetail: js.UndefOr[String] = js.native
  var invalidFileSizeMessageSummary: js.UndefOr[String] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onBeforeSend: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.native
  var onBeforeUpload: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.native
  var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* e */ Progress, Unit]] = js.native
  var onRemove: js.UndefOr[js.Function1[/* e */ File, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* e */ FilesOriginalEvent, Unit]] = js.native
  var onUpload: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.native
  var onValidationFail: js.UndefOr[js.Function1[/* file */ typings.std.File, Unit]] = js.native
  var previewWidth: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var uploadHandler: js.UndefOr[js.Function1[/* e */ FilesAny, Unit]] = js.native
  var uploadLabel: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object FileUploadProps {
  @scala.inline
  def apply(): FileUploadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadProps]
  }
  @scala.inline
  implicit class FileUploadPropsOps[Self <: FileUploadProps] (val x: Self) extends AnyVal {
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setCancelLabel(value: String): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    @scala.inline
    def setChooseLabel(value: String): Self = this.set("chooseLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChooseLabel: Self = this.set("chooseLabel", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCustomUpload(value: Boolean): Self = this.set("customUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomUpload: Self = this.set("customUpload", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInvalidFileSizeMessageDetail(value: String): Self = this.set("invalidFileSizeMessageDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidFileSizeMessageDetail: Self = this.set("invalidFileSizeMessageDetail", js.undefined)
    @scala.inline
    def setInvalidFileSizeMessageSummary(value: String): Self = this.set("invalidFileSizeMessageSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidFileSizeMessageSummary: Self = this.set("invalidFileSizeMessageSummary", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBeforeSend(value: /* e */ FormData => Unit): Self = this.set("onBeforeSend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeSend: Self = this.set("onBeforeSend", js.undefined)
    @scala.inline
    def setOnBeforeUpload(value: /* e */ FormData => Unit): Self = this.set("onBeforeUpload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeUpload: Self = this.set("onBeforeUpload", js.undefined)
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    @scala.inline
    def setOnError(value: /* e */ Files => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnProgress(value: /* e */ Progress => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnRemove(value: /* e */ File => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setOnSelect(value: /* e */ FilesOriginalEvent => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnUpload(value: /* e */ Files => Unit): Self = this.set("onUpload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUpload: Self = this.set("onUpload", js.undefined)
    @scala.inline
    def setOnValidationFail(value: /* file */ typings.std.File => Unit): Self = this.set("onValidationFail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValidationFail: Self = this.set("onValidationFail", js.undefined)
    @scala.inline
    def setPreviewWidth(value: Double): Self = this.set("previewWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewWidth: Self = this.set("previewWidth", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUploadHandler(value: /* e */ FilesAny => Unit): Self = this.set("uploadHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUploadHandler: Self = this.set("uploadHandler", js.undefined)
    @scala.inline
    def setUploadLabel(value: String): Self = this.set("uploadLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadLabel: Self = this.set("uploadLabel", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

