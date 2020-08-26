package typings.reactFilepond.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondBaseProps extends js.Object {
  var acceptedFileTypes: js.UndefOr[js.Array[String]] = js.native
  /** Enable or disable file browser */
  var allowBrowse: js.UndefOr[Boolean] = js.native
  /** Enable or disable drag n’ drop */
  var allowDrop: js.UndefOr[Boolean] = js.native
  /** Enable or disable adding multiple files */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable pasting of files. Pasting files is not
    * supported on all browsers.
    */
  var allowPaste: js.UndefOr[Boolean] = js.native
  /** Allow drop to replace a file, only works when allowMultiple is false */
  var allowReplace: js.UndefOr[Boolean] = js.native
  /** Allows the user to undo file upload */
  var allowRevert: js.UndefOr[Boolean] = js.native
  /** Sets the given value to the capture attribute */
  var captureMethod: js.UndefOr[js.Any] = js.native
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  var className: js.UndefOr[String] = js.native
  /** List of files for controlled usage */
  var files: js.UndefOr[js.Array[File]] = js.native
  var id: js.UndefOr[String] = js.native
  /** The maximum number of files that the pond can handle */
  var maxFiles: js.UndefOr[Double] = js.native
  /** The maximum number of files that can be uploaded in parallel */
  var maxParallelUploads: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  var name: js.UndefOr[String] = js.native
  /** Sets the required attribute to the output field */
  var required: js.UndefOr[Boolean] = js.native
}

object FilePondBaseProps {
  @scala.inline
  def apply(): FilePondBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondBaseProps]
  }
  @scala.inline
  implicit class FilePondBasePropsOps[Self <: FilePondBaseProps] (val x: Self) extends AnyVal {
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
    def setAcceptedFileTypesVarargs(value: String*): Self = this.set("acceptedFileTypes", js.Array(value :_*))
    @scala.inline
    def setAcceptedFileTypes(value: js.Array[String]): Self = this.set("acceptedFileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptedFileTypes: Self = this.set("acceptedFileTypes", js.undefined)
    @scala.inline
    def setAllowBrowse(value: Boolean): Self = this.set("allowBrowse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowBrowse: Self = this.set("allowBrowse", js.undefined)
    @scala.inline
    def setAllowDrop(value: Boolean): Self = this.set("allowDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDrop: Self = this.set("allowDrop", js.undefined)
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    @scala.inline
    def setAllowPaste(value: Boolean): Self = this.set("allowPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPaste: Self = this.set("allowPaste", js.undefined)
    @scala.inline
    def setAllowReplace(value: Boolean): Self = this.set("allowReplace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReplace: Self = this.set("allowReplace", js.undefined)
    @scala.inline
    def setAllowRevert(value: Boolean): Self = this.set("allowRevert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRevert: Self = this.set("allowRevert", js.undefined)
    @scala.inline
    def setCaptureMethod(value: js.Any): Self = this.set("captureMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureMethod: Self = this.set("captureMethod", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: ReactElement | js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[File]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaxFiles(value: Double): Self = this.set("maxFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFiles: Self = this.set("maxFiles", js.undefined)
    @scala.inline
    def setMaxParallelUploads(value: Double): Self = this.set("maxParallelUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParallelUploads: Self = this.set("maxParallelUploads", js.undefined)
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

