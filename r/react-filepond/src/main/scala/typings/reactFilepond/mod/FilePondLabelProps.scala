package typings.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondLabelProps extends js.Object {
  /** Label used for abort load button */
  var labelButtonAbortItemLoad: js.UndefOr[String] = js.native
  /** Label used for abort upload button */
  var labelButtonAbortItemProcessing: js.UndefOr[String] = js.native
  /** Label used for upload button */
  var labelButtonProcessItem: js.UndefOr[String] = js.native
  /** Label used for remove button */
  var labelButtonRemoveItem: js.UndefOr[String] = js.native
  /** Label used for retry load button */
  var labelButtonRetryItemLoad: js.UndefOr[String] = js.native
  /** Label used for retry upload button */
  var labelButtonRetryItemProcessing: js.UndefOr[String] = js.native
  /** Label used for undo upload button */
  var labelButtonUndoItemProcessing: js.UndefOr[String] = js.native
  /**
    * The decimal separator used to render numbers.
    * By default this is determined automatically.
    */
  var labelDecimalSeparator: js.UndefOr[String] = js.native
  /** Label used when file load failed */
  var labelFileLoadError: js.UndefOr[String] = js.native
  /** Label used while loading a file */
  var labelFileLoading: js.UndefOr[String] = js.native
  /** Label used when uploading a file */
  var labelFileProcessing: js.UndefOr[String] = js.native
  /** Label used when upload was cancelled */
  var labelFileProcessingAborted: js.UndefOr[String] = js.native
  /** Label used when file upload has completed */
  var labelFileProcessingComplete: js.UndefOr[String] = js.native
  /** Label used when something went wrong during file upload */
  var labelFileProcessingError: js.UndefOr[String] = js.native
  /** Label used when no file size information was received */
  var labelFileSizeNotAvailable: js.UndefOr[String] = js.native
  /** Label used while waiting for file size information */
  var labelFileWaitingForSize: js.UndefOr[String] = js.native
  /**
    * Default label shown to indicate this is a drop area.
    * FilePond will automatically bind browse file events to
    * the element with CSS class .filepond--label-action
    */
  var labelIdle: js.UndefOr[String] = js.native
  /** Label used to indicate to the user that an action can be cancelled. */
  var labelTapToCancel: js.UndefOr[String] = js.native
  /** Label used to indicate to the user that an action can be retried. */
  var labelTapToRetry: js.UndefOr[String] = js.native
  /** Label used to indicate to the user that an action can be undone. */
  var labelTapToUndo: js.UndefOr[String] = js.native
  /**
    * The thousands separator used to render numbers.
    * By default this is determined automatically.
    */
  var labelThousandsSeparator: js.UndefOr[String] = js.native
}

object FilePondLabelProps {
  @scala.inline
  def apply(): FilePondLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondLabelProps]
  }
  @scala.inline
  implicit class FilePondLabelPropsOps[Self <: FilePondLabelProps] (val x: Self) extends AnyVal {
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
    def setLabelButtonAbortItemLoad(value: String): Self = this.set("labelButtonAbortItemLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelButtonAbortItemLoad: Self = this.set("labelButtonAbortItemLoad", js.undefined)
    @scala.inline
    def setLabelButtonAbortItemProcessing(value: String): Self = this.set("labelButtonAbortItemProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelButtonAbortItemProcessing: Self = this.set("labelButtonAbortItemProcessing", js.undefined)
    @scala.inline
    def setLabelButtonProcessItem(value: String): Self = this.set("labelButtonProcessItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelButtonProcessItem: Self = this.set("labelButtonProcessItem", js.undefined)
    @scala.inline
    def setLabelButtonRemoveItem(value: String): Self = this.set("labelButtonRemoveItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelButtonRemoveItem: Self = this.set("labelButtonRemoveItem", js.undefined)
    @scala.inline
    def setLabelButtonRetryItemLoad(value: String): Self = this.set("labelButtonRetryItemLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelButtonRetryItemLoad: Self = this.set("labelButtonRetryItemLoad", js.undefined)
    @scala.inline
    def setLabelButtonRetryItemProcessing(value: String): Self = this.set("labelButtonRetryItemProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelButtonRetryItemProcessing: Self = this.set("labelButtonRetryItemProcessing", js.undefined)
    @scala.inline
    def setLabelButtonUndoItemProcessing(value: String): Self = this.set("labelButtonUndoItemProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelButtonUndoItemProcessing: Self = this.set("labelButtonUndoItemProcessing", js.undefined)
    @scala.inline
    def setLabelDecimalSeparator(value: String): Self = this.set("labelDecimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDecimalSeparator: Self = this.set("labelDecimalSeparator", js.undefined)
    @scala.inline
    def setLabelFileLoadError(value: String): Self = this.set("labelFileLoadError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFileLoadError: Self = this.set("labelFileLoadError", js.undefined)
    @scala.inline
    def setLabelFileLoading(value: String): Self = this.set("labelFileLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFileLoading: Self = this.set("labelFileLoading", js.undefined)
    @scala.inline
    def setLabelFileProcessing(value: String): Self = this.set("labelFileProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFileProcessing: Self = this.set("labelFileProcessing", js.undefined)
    @scala.inline
    def setLabelFileProcessingAborted(value: String): Self = this.set("labelFileProcessingAborted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFileProcessingAborted: Self = this.set("labelFileProcessingAborted", js.undefined)
    @scala.inline
    def setLabelFileProcessingComplete(value: String): Self = this.set("labelFileProcessingComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFileProcessingComplete: Self = this.set("labelFileProcessingComplete", js.undefined)
    @scala.inline
    def setLabelFileProcessingError(value: String): Self = this.set("labelFileProcessingError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFileProcessingError: Self = this.set("labelFileProcessingError", js.undefined)
    @scala.inline
    def setLabelFileSizeNotAvailable(value: String): Self = this.set("labelFileSizeNotAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFileSizeNotAvailable: Self = this.set("labelFileSizeNotAvailable", js.undefined)
    @scala.inline
    def setLabelFileWaitingForSize(value: String): Self = this.set("labelFileWaitingForSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFileWaitingForSize: Self = this.set("labelFileWaitingForSize", js.undefined)
    @scala.inline
    def setLabelIdle(value: String): Self = this.set("labelIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelIdle: Self = this.set("labelIdle", js.undefined)
    @scala.inline
    def setLabelTapToCancel(value: String): Self = this.set("labelTapToCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTapToCancel: Self = this.set("labelTapToCancel", js.undefined)
    @scala.inline
    def setLabelTapToRetry(value: String): Self = this.set("labelTapToRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTapToRetry: Self = this.set("labelTapToRetry", js.undefined)
    @scala.inline
    def setLabelTapToUndo(value: String): Self = this.set("labelTapToUndo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTapToUndo: Self = this.set("labelTapToUndo", js.undefined)
    @scala.inline
    def setLabelThousandsSeparator(value: String): Self = this.set("labelThousandsSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelThousandsSeparator: Self = this.set("labelThousandsSeparator", js.undefined)
  }
  
}

