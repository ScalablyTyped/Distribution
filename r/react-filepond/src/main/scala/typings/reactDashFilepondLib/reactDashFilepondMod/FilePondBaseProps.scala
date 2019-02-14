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
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement | js.Array[reactLib.reactMod.ReactNs.ReactElement]
  ] = js.undefined
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

