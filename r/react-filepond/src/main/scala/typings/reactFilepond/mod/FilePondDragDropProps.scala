package typings.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondDragDropProps extends js.Object {
  /** Require drop on the FilePond element itself to catch the file. */
  var dropOnElement: js.UndefOr[Boolean] = js.undefined
  /** FilePond will catch all files dropped on the webpage */
  var dropOnPage: js.UndefOr[Boolean] = js.undefined
  /**
    * When enabled, files are validated before they are dropped.
    * A file is not added when it’s invalid.
    */
  var dropValidation: js.UndefOr[Boolean] = js.undefined
  /**
    * Ignored file names when handling dropped directories.
    * Dropping directories is not supported on all browsers.
    */
  var ignoredFiles: js.UndefOr[js.Array[String]] = js.undefined
}

object FilePondDragDropProps {
  @scala.inline
  def apply(
    dropOnElement: js.UndefOr[Boolean] = js.undefined,
    dropOnPage: js.UndefOr[Boolean] = js.undefined,
    dropValidation: js.UndefOr[Boolean] = js.undefined,
    ignoredFiles: js.Array[String] = null
  ): FilePondDragDropProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropOnElement)) __obj.updateDynamic("dropOnElement")(dropOnElement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnPage)) __obj.updateDynamic("dropOnPage")(dropOnPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropValidation)) __obj.updateDynamic("dropValidation")(dropValidation.get.asInstanceOf[js.Any])
    if (ignoredFiles != null) __obj.updateDynamic("ignoredFiles")(ignoredFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondDragDropProps]
  }
}

