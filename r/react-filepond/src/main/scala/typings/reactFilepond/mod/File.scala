package typings.reactFilepond.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-filepond", "File")
@js.native
class File ()
  extends Component[FileProps, js.Object, js.Any] {
  var archived: Boolean = js.native
  var file: ActualFileObject = js.native
  var fileExtension: String = js.native
  var fileSize: Double = js.native
  var fileType: String = js.native
  var filename: String = js.native
  var filenameWithoutExtension: String = js.native
  var id: String = js.native
  var serverId: String = js.native
  var status: Double = js.native
  /** Aborts loading of this file */
  def abortLoad(): Unit = js.native
  /** Aborts processing of this file */
  def abortProcessing(): Unit = js.native
  /**
    * Retrieve metadata saved to the file, pass a key to retrieve
    * a specific part of the metadata (e.g. 'crop' or 'resize').
    * If no key is passed, the entire metadata object is returned.
    */
  def getMetadata(): js.Any = js.native
  def getMetadata(key: String): js.Any = js.native
  /** Add additional metadata to the file */
  def setMetadata(key: String, value: js.Any): Unit = js.native
}

