package typings.reactFilepond.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-filepond", "FilePond")
@js.native
class FilePond ()
  extends Component[FilePondProps, js.Object, js.Any] {
  def addFile(source: File): Unit = js.native
  def addFiles(source: js.Array[File]): Unit = js.native
  def browse(): Unit = js.native
  @JSName("context")
  def context_MFilePond(): Unit = js.native
  def getFile(): File = js.native
  def getFiles(): js.Array[File] = js.native
  def processFile(query: String): Unit = js.native
  def processFiles(): Unit = js.native
  def removeFile(query: String): Unit = js.native
  def removeFiles(): Unit = js.native
  def setOptions(options: FilePondProps): Unit = js.native
}

