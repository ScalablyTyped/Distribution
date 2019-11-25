package typings.reactDashFilepond.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondLabelProps extends js.Object {
  /** Label used for abort load button */
  var labelButtonAbortItemLoad: js.UndefOr[String] = js.undefined
  /** Label used for abort upload button */
  var labelButtonAbortItemProcessing: js.UndefOr[String] = js.undefined
  /** Label used for upload button */
  var labelButtonProcessItem: js.UndefOr[String] = js.undefined
  /** Label used for remove button */
  var labelButtonRemoveItem: js.UndefOr[String] = js.undefined
  /** Label used for retry load button */
  var labelButtonRetryItemLoad: js.UndefOr[String] = js.undefined
  /** Label used for retry upload button */
  var labelButtonRetryItemProcessing: js.UndefOr[String] = js.undefined
  /** Label used for undo upload button */
  var labelButtonUndoItemProcessing: js.UndefOr[String] = js.undefined
  /**
    * The decimal separator used to render numbers.
    * By default this is determined automatically.
    */
  var labelDecimalSeparator: js.UndefOr[String] = js.undefined
  /** Label used when file load failed */
  var labelFileLoadError: js.UndefOr[String] = js.undefined
  /** Label used while loading a file */
  var labelFileLoading: js.UndefOr[String] = js.undefined
  /** Label used when uploading a file */
  var labelFileProcessing: js.UndefOr[String] = js.undefined
  /** Label used when upload was cancelled */
  var labelFileProcessingAborted: js.UndefOr[String] = js.undefined
  /** Label used when file upload has completed */
  var labelFileProcessingComplete: js.UndefOr[String] = js.undefined
  /** Label used when something went wrong during file upload */
  var labelFileProcessingError: js.UndefOr[String] = js.undefined
  /** Label used when no file size information was received */
  var labelFileSizeNotAvailable: js.UndefOr[String] = js.undefined
  /** Label used while waiting for file size information */
  var labelFileWaitingForSize: js.UndefOr[String] = js.undefined
  /**
    * Default label shown to indicate this is a drop area.
    * FilePond will automatically bind browse file events to
    * the element with CSS class .filepond--label-action
    */
  var labelIdle: js.UndefOr[String] = js.undefined
  /** Label used to indicate to the user that an action can be cancelled. */
  var labelTapToCancel: js.UndefOr[String] = js.undefined
  /** Label used to indicate to the user that an action can be retried. */
  var labelTapToRetry: js.UndefOr[String] = js.undefined
  /** Label used to indicate to the user that an action can be undone. */
  var labelTapToUndo: js.UndefOr[String] = js.undefined
  /**
    * The thousands separator used to render numbers.
    * By default this is determined automatically.
    */
  var labelThousandsSeparator: js.UndefOr[String] = js.undefined
}

object FilePondLabelProps {
  @scala.inline
  def apply(
    labelButtonAbortItemLoad: String = null,
    labelButtonAbortItemProcessing: String = null,
    labelButtonProcessItem: String = null,
    labelButtonRemoveItem: String = null,
    labelButtonRetryItemLoad: String = null,
    labelButtonRetryItemProcessing: String = null,
    labelButtonUndoItemProcessing: String = null,
    labelDecimalSeparator: String = null,
    labelFileLoadError: String = null,
    labelFileLoading: String = null,
    labelFileProcessing: String = null,
    labelFileProcessingAborted: String = null,
    labelFileProcessingComplete: String = null,
    labelFileProcessingError: String = null,
    labelFileSizeNotAvailable: String = null,
    labelFileWaitingForSize: String = null,
    labelIdle: String = null,
    labelTapToCancel: String = null,
    labelTapToRetry: String = null,
    labelTapToUndo: String = null,
    labelThousandsSeparator: String = null
  ): FilePondLabelProps = {
    val __obj = js.Dynamic.literal()
    if (labelButtonAbortItemLoad != null) __obj.updateDynamic("labelButtonAbortItemLoad")(labelButtonAbortItemLoad.asInstanceOf[js.Any])
    if (labelButtonAbortItemProcessing != null) __obj.updateDynamic("labelButtonAbortItemProcessing")(labelButtonAbortItemProcessing.asInstanceOf[js.Any])
    if (labelButtonProcessItem != null) __obj.updateDynamic("labelButtonProcessItem")(labelButtonProcessItem.asInstanceOf[js.Any])
    if (labelButtonRemoveItem != null) __obj.updateDynamic("labelButtonRemoveItem")(labelButtonRemoveItem.asInstanceOf[js.Any])
    if (labelButtonRetryItemLoad != null) __obj.updateDynamic("labelButtonRetryItemLoad")(labelButtonRetryItemLoad.asInstanceOf[js.Any])
    if (labelButtonRetryItemProcessing != null) __obj.updateDynamic("labelButtonRetryItemProcessing")(labelButtonRetryItemProcessing.asInstanceOf[js.Any])
    if (labelButtonUndoItemProcessing != null) __obj.updateDynamic("labelButtonUndoItemProcessing")(labelButtonUndoItemProcessing.asInstanceOf[js.Any])
    if (labelDecimalSeparator != null) __obj.updateDynamic("labelDecimalSeparator")(labelDecimalSeparator.asInstanceOf[js.Any])
    if (labelFileLoadError != null) __obj.updateDynamic("labelFileLoadError")(labelFileLoadError.asInstanceOf[js.Any])
    if (labelFileLoading != null) __obj.updateDynamic("labelFileLoading")(labelFileLoading.asInstanceOf[js.Any])
    if (labelFileProcessing != null) __obj.updateDynamic("labelFileProcessing")(labelFileProcessing.asInstanceOf[js.Any])
    if (labelFileProcessingAborted != null) __obj.updateDynamic("labelFileProcessingAborted")(labelFileProcessingAborted.asInstanceOf[js.Any])
    if (labelFileProcessingComplete != null) __obj.updateDynamic("labelFileProcessingComplete")(labelFileProcessingComplete.asInstanceOf[js.Any])
    if (labelFileProcessingError != null) __obj.updateDynamic("labelFileProcessingError")(labelFileProcessingError.asInstanceOf[js.Any])
    if (labelFileSizeNotAvailable != null) __obj.updateDynamic("labelFileSizeNotAvailable")(labelFileSizeNotAvailable.asInstanceOf[js.Any])
    if (labelFileWaitingForSize != null) __obj.updateDynamic("labelFileWaitingForSize")(labelFileWaitingForSize.asInstanceOf[js.Any])
    if (labelIdle != null) __obj.updateDynamic("labelIdle")(labelIdle.asInstanceOf[js.Any])
    if (labelTapToCancel != null) __obj.updateDynamic("labelTapToCancel")(labelTapToCancel.asInstanceOf[js.Any])
    if (labelTapToRetry != null) __obj.updateDynamic("labelTapToRetry")(labelTapToRetry.asInstanceOf[js.Any])
    if (labelTapToUndo != null) __obj.updateDynamic("labelTapToUndo")(labelTapToUndo.asInstanceOf[js.Any])
    if (labelThousandsSeparator != null) __obj.updateDynamic("labelThousandsSeparator")(labelThousandsSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondLabelProps]
  }
}

