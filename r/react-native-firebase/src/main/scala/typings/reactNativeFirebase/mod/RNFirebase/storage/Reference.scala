package typings.reactNativeFirebase.mod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference represents a reference to a Google Cloud Storage object.
  *
  * You can upload, download, and delete objects, as well as get/set object
  * metadata for a file via this reference.
  */
@js.native
trait Reference extends js.Object {
  var fullPath: String = js.native
  /**
    * Returns a reference to a relative path from this reference.
    *
    * @param path The relative path
    */
  def child(path: String): Reference = js.native
  /**
    * Deletes the object at this reference's location.
    */
  def delete(): js.Promise[Unit] = js.native
  /**
    * Downloads the storage object for this reference to the device file
    * path specified.
    *
    * @param filePath The destination path of the downloaded file.
    */
  def downloadFile(filePath: String): StorageTask[DownloadTaskSnapshot] = js.native
  /**
    * Fetches a long lived download URL for this object.
    */
  def getDownloadURL(): js.Promise[String] = js.native
  /**
    * Fetches metadata for the object at this location, if one exists.
    *
    * @returns A promise that is resolved with the metadata; or rejected on
    *          failure, including if the object does not exist.
    */
  def getMetadata(): js.Promise[FullMetadata] = js.native
  /**
    * Uploads the file path specified from the device into a storage object
    * for this reference.
    *
    * @param filePath The path to the file on the device. It must be a full
    *        file path.
    * @param metadata The metadata to associate with this file.
    */
  def putFile(filePath: String): StorageTask[UploadTaskSnapshot] = js.native
  def putFile(filePath: String, metadata: SettableMetadata): StorageTask[UploadTaskSnapshot] = js.native
  /**
    * Updates the metadata for the object at this location, if one exists.
    *
    * @param metadata
    */
  def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
}

