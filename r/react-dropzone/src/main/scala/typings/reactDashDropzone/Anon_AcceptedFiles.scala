package typings.reactDashDropzone

import typings.react.reactMod.RefObject
import typings.reactDashDropzone.reactDashDropzoneMod.DropzoneInputProps
import typings.reactDashDropzone.reactDashDropzoneMod.DropzoneRootProps
import typings.std.File
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AcceptedFiles extends js.Object {
  var acceptedFiles: js.Array[File] = js.native
  var draggedFiles: js.Array[File] = js.native
  var inputRef: RefObject[HTMLInputElement] = js.native
  var isDragAccept: Boolean = js.native
  var isDragActive: Boolean = js.native
  var isDragReject: Boolean = js.native
  var isFileDialogActive: Boolean = js.native
  var isFocused: Boolean = js.native
  var rejectedFiles: js.Array[File] = js.native
  var rootRef: RefObject[HTMLElement] = js.native
  def getInputProps(): DropzoneInputProps = js.native
  def getInputProps(props: DropzoneInputProps): DropzoneInputProps = js.native
  def getRootProps(): DropzoneRootProps = js.native
  def getRootProps(props: DropzoneRootProps): DropzoneRootProps = js.native
}

