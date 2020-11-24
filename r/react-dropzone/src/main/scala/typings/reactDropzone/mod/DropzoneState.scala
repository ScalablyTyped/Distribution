package typings.reactDropzone.mod

import typings.react.mod.RefObject
import typings.std.File
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-dropzone.react-dropzone.DropzoneRef & {  isFocused :boolean,   isDragActive :boolean,   isDragAccept :boolean,   isDragReject :boolean,   isFileDialogActive :boolean,   draggedFiles :std.Array<std.File>,   acceptedFiles :std.Array<std.File>,   fileRejections :std.Array<react-dropzone.react-dropzone.FileRejection>,   rootRef :react.react.RefObject<std.HTMLElement>,   inputRef :react.react.RefObject<std.HTMLInputElement>, getRootProps (props : react-dropzone.react-dropzone.DropzoneRootProps | undefined): react-dropzone.react-dropzone.DropzoneRootProps, getInputProps (props : react-dropzone.react-dropzone.DropzoneInputProps | undefined): react-dropzone.react-dropzone.DropzoneInputProps} */
@js.native
trait DropzoneState extends js.Object {
  
  var acceptedFiles: js.Array[File] = js.native
  
  var draggedFiles: js.Array[File] = js.native
  
  var fileRejections: js.Array[FileRejection] = js.native
  
  def getInputProps(): DropzoneInputProps = js.native
  def getInputProps(props: DropzoneInputProps): DropzoneInputProps = js.native
  
  def getRootProps(): DropzoneRootProps = js.native
  def getRootProps(props: DropzoneRootProps): DropzoneRootProps = js.native
  
  var inputRef: RefObject[HTMLInputElement] = js.native
  
  var isDragAccept: Boolean = js.native
  
  var isDragActive: Boolean = js.native
  
  var isDragReject: Boolean = js.native
  
  var isFileDialogActive: Boolean = js.native
  
  var isFocused: Boolean = js.native
  
  def open(): Unit = js.native
  
  var rootRef: RefObject[HTMLElement] = js.native
}
