package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondBaseProps extends js.Object {
  var acceptedFileTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Enable or disable file browser */
  var allowBrowse: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable drag n’ drop */
  var allowDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable adding multiple files */
  var allowMultiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable or disable pasting of files. Pasting files is not
    * supported on all browsers.
    */
  var allowPaste: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow drop to replace a file, only works when allowMultiple is false */
  var allowReplace: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the user to undo file upload */
  var allowRevert: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the given value to the capture attribute */
  var captureMethod: js.UndefOr[js.Any] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactElement | js.Array[reactLib.reactMod.ReactElement]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of files that the pond can handle */
  var maxFiles: js.UndefOr[scala.Double] = js.undefined
  /** The maximum number of files that can be uploaded in parallel */
  var maxParallelUploads: js.UndefOr[scala.Double] = js.undefined
  var metadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the required attribute to the output field */
  var required: js.UndefOr[scala.Boolean] = js.undefined
}

object FilePondBaseProps {
  @scala.inline
  def apply(
    acceptedFileTypes: js.Array[java.lang.String] = null,
    allowBrowse: js.UndefOr[scala.Boolean] = js.undefined,
    allowDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    allowPaste: js.UndefOr[scala.Boolean] = js.undefined,
    allowReplace: js.UndefOr[scala.Boolean] = js.undefined,
    allowRevert: js.UndefOr[scala.Boolean] = js.undefined,
    captureMethod: js.Any = null,
    children: reactLib.reactMod.ReactElement | js.Array[reactLib.reactMod.ReactElement] = null,
    className: java.lang.String = null,
    id: java.lang.String = null,
    maxFiles: scala.Int | scala.Double = null,
    maxParallelUploads: scala.Int | scala.Double = null,
    metadata: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): FilePondBaseProps = {
    val __obj = js.Dynamic.literal()
    if (acceptedFileTypes != null) __obj.updateDynamic("acceptedFileTypes")(acceptedFileTypes)
    if (!js.isUndefined(allowBrowse)) __obj.updateDynamic("allowBrowse")(allowBrowse)
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop)
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple)
    if (!js.isUndefined(allowPaste)) __obj.updateDynamic("allowPaste")(allowPaste)
    if (!js.isUndefined(allowReplace)) __obj.updateDynamic("allowReplace")(allowReplace)
    if (!js.isUndefined(allowRevert)) __obj.updateDynamic("allowRevert")(allowRevert)
    if (captureMethod != null) __obj.updateDynamic("captureMethod")(captureMethod)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxParallelUploads != null) __obj.updateDynamic("maxParallelUploads")(maxParallelUploads.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[FilePondBaseProps]
  }
}

