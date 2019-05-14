package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-filepond", "File")
@js.native
class File ()
  extends reactLib.reactMod.Component[FileProps, js.Object, js.Any] {
  var archived: scala.Boolean = js.native
  var file: ActualFileObject = js.native
  var fileExtension: java.lang.String = js.native
  var fileSize: scala.Double = js.native
  var fileType: java.lang.String = js.native
  var filename: java.lang.String = js.native
  var filenameWithoutExtension: java.lang.String = js.native
  var id: java.lang.String = js.native
  var serverId: java.lang.String = js.native
  var status: scala.Double = js.native
  /** Aborts loading of this file */
  def abortLoad(): scala.Unit = js.native
  /** Aborts processing of this file */
  def abortProcessing(): scala.Unit = js.native
  /**
    * Retrieve metadata saved to the file, pass a key to retrieve
    * a specific part of the metadata (e.g. 'crop' or 'resize').
    * If no key is passed, the entire metadata object is returned.
    */
  def getMetadata(): js.Any = js.native
  def getMetadata(key: java.lang.String): js.Any = js.native
  /** Add additional metadata to the file */
  def setMetadata(key: java.lang.String, value: js.Any): scala.Unit = js.native
}

