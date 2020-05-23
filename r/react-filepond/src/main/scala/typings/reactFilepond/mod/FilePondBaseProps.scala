package typings.reactFilepond.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondBaseProps extends js.Object {
  var acceptedFileTypes: js.UndefOr[js.Array[String]] = js.undefined
  /** Enable or disable file browser */
  var allowBrowse: js.UndefOr[Boolean] = js.undefined
  /** Enable or disable drag n’ drop */
  var allowDrop: js.UndefOr[Boolean] = js.undefined
  /** Enable or disable adding multiple files */
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable pasting of files. Pasting files is not
    * supported on all browsers.
    */
  var allowPaste: js.UndefOr[Boolean] = js.undefined
  /** Allow drop to replace a file, only works when allowMultiple is false */
  var allowReplace: js.UndefOr[Boolean] = js.undefined
  /** Allows the user to undo file upload */
  var allowRevert: js.UndefOr[Boolean] = js.undefined
  /** Sets the given value to the capture attribute */
  var captureMethod: js.UndefOr[js.Any] = js.undefined
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** List of files for controlled usage */
  var files: js.UndefOr[js.Array[File]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /** The maximum number of files that the pond can handle */
  var maxFiles: js.UndefOr[Double] = js.undefined
  /** The maximum number of files that can be uploaded in parallel */
  var maxParallelUploads: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /** Sets the required attribute to the output field */
  var required: js.UndefOr[Boolean] = js.undefined
}

object FilePondBaseProps {
  @scala.inline
  def apply(
    acceptedFileTypes: js.Array[String] = null,
    allowBrowse: js.UndefOr[Boolean] = js.undefined,
    allowDrop: js.UndefOr[Boolean] = js.undefined,
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    allowPaste: js.UndefOr[Boolean] = js.undefined,
    allowReplace: js.UndefOr[Boolean] = js.undefined,
    allowRevert: js.UndefOr[Boolean] = js.undefined,
    captureMethod: js.Any = null,
    children: ReactElement | js.Array[ReactElement] = null,
    className: String = null,
    files: js.Array[File] = null,
    id: String = null,
    maxFiles: js.UndefOr[Double] = js.undefined,
    maxParallelUploads: js.UndefOr[Double] = js.undefined,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): FilePondBaseProps = {
    val __obj = js.Dynamic.literal()
    if (acceptedFileTypes != null) __obj.updateDynamic("acceptedFileTypes")(acceptedFileTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBrowse)) __obj.updateDynamic("allowBrowse")(allowBrowse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPaste)) __obj.updateDynamic("allowPaste")(allowPaste.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReplace)) __obj.updateDynamic("allowReplace")(allowReplace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRevert)) __obj.updateDynamic("allowRevert")(allowRevert.get.asInstanceOf[js.Any])
    if (captureMethod != null) __obj.updateDynamic("captureMethod")(captureMethod.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFiles)) __obj.updateDynamic("maxFiles")(maxFiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxParallelUploads)) __obj.updateDynamic("maxParallelUploads")(maxParallelUploads.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondBaseProps]
  }
}

