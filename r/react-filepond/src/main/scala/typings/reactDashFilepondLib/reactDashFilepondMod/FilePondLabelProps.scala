package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondLabelProps extends js.Object {
  /** Label used for abort load button */
  var labelButtonAbortItemLoad: js.UndefOr[java.lang.String] = js.undefined
  /** Label used for abort upload button */
  var labelButtonAbortItemProcessing: js.UndefOr[java.lang.String] = js.undefined
  /** Label used for upload button */
  var labelButtonProcessItem: js.UndefOr[java.lang.String] = js.undefined
  /** Label used for remove button */
  var labelButtonRemoveItem: js.UndefOr[java.lang.String] = js.undefined
  /** Label used for retry load button */
  var labelButtonRetryItemLoad: js.UndefOr[java.lang.String] = js.undefined
  /** Label used for retry upload button */
  var labelButtonRetryItemProcessing: js.UndefOr[java.lang.String] = js.undefined
  /** Label used for undo upload button */
  var labelButtonUndoItemProcessing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The decimal separator used to render numbers.
    * By default this is determined automatically.
    */
  var labelDecimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** Label used when file load failed */
  var labelFileLoadError: js.UndefOr[java.lang.String] = js.undefined
  /** Label used while loading a file */
  var labelFileLoading: js.UndefOr[java.lang.String] = js.undefined
  /** Label used when uploading a file */
  var labelFileProcessing: js.UndefOr[java.lang.String] = js.undefined
  /** Label used when upload was cancelled */
  var labelFileProcessingAborted: js.UndefOr[java.lang.String] = js.undefined
  /** Label used when file upload has completed */
  var labelFileProcessingComplete: js.UndefOr[java.lang.String] = js.undefined
  /** Label used when something went wrong during file upload */
  var labelFileProcessingError: js.UndefOr[java.lang.String] = js.undefined
  /** Label used when no file size information was received */
  var labelFileSizeNotAvailable: js.UndefOr[java.lang.String] = js.undefined
  /** Label used while waiting for file size information */
  var labelFileWaitingForSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default label shown to indicate this is a drop area.
    * FilePond will automatically bind browse file events to
    * the element with CSS class .filepond--label-action
    */
  var labelIdle: js.UndefOr[java.lang.String] = js.undefined
  /** Label used to indicate to the user that an action can be cancelled. */
  var labelTapToCancel: js.UndefOr[java.lang.String] = js.undefined
  /** Label used to indicate to the user that an action can be retried. */
  var labelTapToRetry: js.UndefOr[java.lang.String] = js.undefined
  /** Label used to indicate to the user that an action can be undone. */
  var labelTapToUndo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The thousands separator used to render numbers.
    * By default this is determined automatically.
    */
  var labelThousandsSeparator: js.UndefOr[java.lang.String] = js.undefined
}

object FilePondLabelProps {
  @scala.inline
  def apply(
    labelButtonAbortItemLoad: java.lang.String = null,
    labelButtonAbortItemProcessing: java.lang.String = null,
    labelButtonProcessItem: java.lang.String = null,
    labelButtonRemoveItem: java.lang.String = null,
    labelButtonRetryItemLoad: java.lang.String = null,
    labelButtonRetryItemProcessing: java.lang.String = null,
    labelButtonUndoItemProcessing: java.lang.String = null,
    labelDecimalSeparator: java.lang.String = null,
    labelFileLoadError: java.lang.String = null,
    labelFileLoading: java.lang.String = null,
    labelFileProcessing: java.lang.String = null,
    labelFileProcessingAborted: java.lang.String = null,
    labelFileProcessingComplete: java.lang.String = null,
    labelFileProcessingError: java.lang.String = null,
    labelFileSizeNotAvailable: java.lang.String = null,
    labelFileWaitingForSize: java.lang.String = null,
    labelIdle: java.lang.String = null,
    labelTapToCancel: java.lang.String = null,
    labelTapToRetry: java.lang.String = null,
    labelTapToUndo: java.lang.String = null,
    labelThousandsSeparator: java.lang.String = null
  ): FilePondLabelProps = {
    val __obj = js.Dynamic.literal()
    if (labelButtonAbortItemLoad != null) __obj.updateDynamic("labelButtonAbortItemLoad")(labelButtonAbortItemLoad)
    if (labelButtonAbortItemProcessing != null) __obj.updateDynamic("labelButtonAbortItemProcessing")(labelButtonAbortItemProcessing)
    if (labelButtonProcessItem != null) __obj.updateDynamic("labelButtonProcessItem")(labelButtonProcessItem)
    if (labelButtonRemoveItem != null) __obj.updateDynamic("labelButtonRemoveItem")(labelButtonRemoveItem)
    if (labelButtonRetryItemLoad != null) __obj.updateDynamic("labelButtonRetryItemLoad")(labelButtonRetryItemLoad)
    if (labelButtonRetryItemProcessing != null) __obj.updateDynamic("labelButtonRetryItemProcessing")(labelButtonRetryItemProcessing)
    if (labelButtonUndoItemProcessing != null) __obj.updateDynamic("labelButtonUndoItemProcessing")(labelButtonUndoItemProcessing)
    if (labelDecimalSeparator != null) __obj.updateDynamic("labelDecimalSeparator")(labelDecimalSeparator)
    if (labelFileLoadError != null) __obj.updateDynamic("labelFileLoadError")(labelFileLoadError)
    if (labelFileLoading != null) __obj.updateDynamic("labelFileLoading")(labelFileLoading)
    if (labelFileProcessing != null) __obj.updateDynamic("labelFileProcessing")(labelFileProcessing)
    if (labelFileProcessingAborted != null) __obj.updateDynamic("labelFileProcessingAborted")(labelFileProcessingAborted)
    if (labelFileProcessingComplete != null) __obj.updateDynamic("labelFileProcessingComplete")(labelFileProcessingComplete)
    if (labelFileProcessingError != null) __obj.updateDynamic("labelFileProcessingError")(labelFileProcessingError)
    if (labelFileSizeNotAvailable != null) __obj.updateDynamic("labelFileSizeNotAvailable")(labelFileSizeNotAvailable)
    if (labelFileWaitingForSize != null) __obj.updateDynamic("labelFileWaitingForSize")(labelFileWaitingForSize)
    if (labelIdle != null) __obj.updateDynamic("labelIdle")(labelIdle)
    if (labelTapToCancel != null) __obj.updateDynamic("labelTapToCancel")(labelTapToCancel)
    if (labelTapToRetry != null) __obj.updateDynamic("labelTapToRetry")(labelTapToRetry)
    if (labelTapToUndo != null) __obj.updateDynamic("labelTapToUndo")(labelTapToUndo)
    if (labelThousandsSeparator != null) __obj.updateDynamic("labelThousandsSeparator")(labelThousandsSeparator)
    __obj.asInstanceOf[FilePondLabelProps]
  }
}

