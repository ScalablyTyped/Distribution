package typings.resumablejs.Resumable

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumableFile extends js.Object {
  /**
    * An array of ResumableChunk items. You shouldn't need to dig into these.
    **/
  var chunks: js.Array[ResumableChunk]
  /**
    * The correlating HTML5 File object.
    **/
  var file: File
  /**
    * The name of the file.
    **/
  var fileName: String
  /**
    * The relative path to the file (defaults to file name if relative path doesn't exist)
    **/
  var relativePath: String
  /**
    * A back-reference to the parent Resumable object.
    **/
  var resumableObj: typings.resumablejs.Resumable.Resumable
  /**
    * Size in bytes of the file.
    **/
  var size: Double
  /**
    * A unique identifier assigned to this file object. This value is included in uploads to the server for reference, but can also be used in CSS classes etc when building your upload UI.
    **/
  var uniqueIdentifier: String
  /**
    * Abort uploading the file.
    **/
  def abort(): Unit
  /**
    * Rebuild the state of a ResumableFile object, including reassigning chunks and XMLHttpRequest instances.
    **/
  def bootstrap(): Unit
  /**
    * Abort uploading the file and delete it from the list of files to upload.
    **/
  def cancel(): Unit
  /**
    * Returns a boolean indicating whether the file has completed uploading and received a server response.
    **/
  def isComplete(): Boolean
  /**
    * Returns a boolean indicating whether file chunks is uploading.
    **/
  def isUploading(): Boolean
  /**
    * Returns a float between 0 and 1 indicating the current upload progress of the file. If relative is true, the value is returned relative to all files in the Resumable.js instance.
    **/
  def progress(relative: Boolean): Double
  /**
    * Retry uploading the file.
    **/
  def retry(): Unit
}

object ResumableFile {
  @scala.inline
  def apply(
    abort: () => Unit,
    bootstrap: () => Unit,
    cancel: () => Unit,
    chunks: js.Array[ResumableChunk],
    file: File,
    fileName: String,
    isComplete: () => Boolean,
    isUploading: () => Boolean,
    progress: Boolean => Double,
    relativePath: String,
    resumableObj: typings.resumablejs.Resumable.Resumable,
    retry: () => Unit,
    size: Double,
    uniqueIdentifier: String
  ): ResumableFile = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), bootstrap = js.Any.fromFunction0(bootstrap), cancel = js.Any.fromFunction0(cancel), chunks = chunks.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isComplete = js.Any.fromFunction0(isComplete), isUploading = js.Any.fromFunction0(isUploading), progress = js.Any.fromFunction1(progress), relativePath = relativePath.asInstanceOf[js.Any], resumableObj = resumableObj.asInstanceOf[js.Any], retry = js.Any.fromFunction0(retry), size = size.asInstanceOf[js.Any], uniqueIdentifier = uniqueIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResumableFile]
  }
}

