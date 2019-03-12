package typings
package resumablejsLib.ResumableNs

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
  var file: stdLib.File
  /**
    * The name of the file.
    **/
  var fileName: java.lang.String
  /**
    * The relative path to the file (defaults to file name if relative path doesn't exist)
    **/
  var relativePath: java.lang.String
  /**
    * A back-reference to the parent Resumable object.
    **/
  var resumableObj: Resumable
  /**
    * Size in bytes of the file.
    **/
  var size: scala.Double
  /**
    * A unique identifier assigned to this file object. This value is included in uploads to the server for reference, but can also be used in CSS classes etc when building your upload UI.
    **/
  var uniqueIdentifier: java.lang.String
  /**
    * Abort uploading the file.
    **/
  def abort(): scala.Unit
  /**
    * Rebuild the state of a ResumableFile object, including reassigning chunks and XMLHttpRequest instances.
    **/
  def bootstrap(): scala.Unit
  /**
    * Abort uploading the file and delete it from the list of files to upload.
    **/
  def cancel(): scala.Unit
  /**
    * Returns a boolean indicating whether the file has completed uploading and received a server response.
    **/
  def isComplete(): scala.Boolean
  /**
    * Returns a boolean indicating whether file chunks is uploading.
    **/
  def isUploading(): scala.Boolean
  /**
    * Returns a float between 0 and 1 indicating the current upload progress of the file. If relative is true, the value is returned relative to all files in the Resumable.js instance.
    **/
  def progress(relative: scala.Boolean): scala.Double
  /**
    * Retry uploading the file.
    **/
  def retry(): scala.Unit
}

object ResumableFile {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    bootstrap: () => scala.Unit,
    cancel: () => scala.Unit,
    chunks: js.Array[ResumableChunk],
    file: stdLib.File,
    fileName: java.lang.String,
    isComplete: () => scala.Boolean,
    isUploading: () => scala.Boolean,
    progress: scala.Boolean => scala.Double,
    relativePath: java.lang.String,
    resumableObj: Resumable,
    retry: () => scala.Unit,
    size: scala.Double,
    uniqueIdentifier: java.lang.String
  ): ResumableFile = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), bootstrap = js.Any.fromFunction0(bootstrap), cancel = js.Any.fromFunction0(cancel), chunks = chunks, file = file, fileName = fileName, isComplete = js.Any.fromFunction0(isComplete), isUploading = js.Any.fromFunction0(isUploading), progress = js.Any.fromFunction1(progress), relativePath = relativePath, resumableObj = resumableObj, retry = js.Any.fromFunction0(retry), size = size, uniqueIdentifier = uniqueIdentifier)
  
    __obj.asInstanceOf[ResumableFile]
  }
}

