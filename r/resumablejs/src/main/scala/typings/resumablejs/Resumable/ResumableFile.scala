package typings.resumablejs.Resumable

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumableFile extends js.Object {
  
  /**
    * Abort uploading the file.
    **/
  def abort(): Unit = js.native
  
  /**
    * Rebuild the state of a ResumableFile object, including reassigning chunks and XMLHttpRequest instances.
    **/
  def bootstrap(): Unit = js.native
  
  /**
    * Abort uploading the file and delete it from the list of files to upload.
    **/
  def cancel(): Unit = js.native
  
  /**
    * An array of ResumableChunk items. You shouldn't need to dig into these.
    **/
  var chunks: js.Array[ResumableChunk] = js.native
  
  /**
    * The correlating HTML5 File object.
    **/
  var file: File = js.native
  
  /**
    * The name of the file.
    **/
  var fileName: String = js.native
  
  /**
    * Returns a boolean indicating whether the file has completed uploading and received a server response.
    **/
  def isComplete(): Boolean = js.native
  
  /**
    * Returns a boolean indicating whether file chunks is uploading.
    **/
  def isUploading(): Boolean = js.native
  
  /**
    * Returns a float between 0 and 1 indicating the current upload progress of the file. If relative is true, the value is returned relative to all files in the Resumable.js instance.
    **/
  def progress(relative: Boolean): Double = js.native
  
  /**
    * The relative path to the file (defaults to file name if relative path doesn't exist)
    **/
  var relativePath: String = js.native
  
  /**
    * A back-reference to the parent Resumable object.
    **/
  var resumableObj: typings.resumablejs.Resumable.Resumable = js.native
  
  /**
    * Retry uploading the file.
    **/
  def retry(): Unit = js.native
  
  /**
    * Size in bytes of the file.
    **/
  var size: Double = js.native
  
  /**
    * A unique identifier assigned to this file object. This value is included in uploads to the server for reference, but can also be used in CSS classes etc when building your upload UI.
    **/
  var uniqueIdentifier: String = js.native
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
  
  @scala.inline
  implicit class ResumableFileOps[Self <: ResumableFile] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBootstrap(value: () => Unit): Self = this.set("bootstrap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChunksVarargs(value: ResumableChunk*): Self = this.set("chunks", js.Array(value :_*))
    
    @scala.inline
    def setChunks(value: js.Array[ResumableChunk]): Self = this.set("chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComplete(value: () => Boolean): Self = this.set("isComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUploading(value: () => Boolean): Self = this.set("isUploading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgress(value: Boolean => Double): Self = this.set("progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumableObj(value: typings.resumablejs.Resumable.Resumable): Self = this.set("resumableObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry(value: () => Unit): Self = this.set("retry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueIdentifier(value: String): Self = this.set("uniqueIdentifier", value.asInstanceOf[js.Any])
  }
}
