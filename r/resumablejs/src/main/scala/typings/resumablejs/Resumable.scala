package typings.resumablejs

import typings.resumablejs.resumablejsStrings.DELETE
import typings.resumablejs.resumablejsStrings.GET
import typings.resumablejs.resumablejsStrings.OPTIONS
import typings.resumablejs.resumablejsStrings.POST
import typings.resumablejs.resumablejsStrings.PUT
import typings.resumablejs.resumablejsStrings.beforeCancel
import typings.resumablejs.resumablejsStrings.cancel
import typings.resumablejs.resumablejsStrings.catchAll
import typings.resumablejs.resumablejsStrings.chunkingComplete
import typings.resumablejs.resumablejsStrings.chunkingProgress
import typings.resumablejs.resumablejsStrings.chunkingStart
import typings.resumablejs.resumablejsStrings.complete
import typings.resumablejs.resumablejsStrings.error
import typings.resumablejs.resumablejsStrings.fileAdded
import typings.resumablejs.resumablejsStrings.fileError
import typings.resumablejs.resumablejsStrings.fileProgress
import typings.resumablejs.resumablejsStrings.fileRetry
import typings.resumablejs.resumablejsStrings.fileSuccess
import typings.resumablejs.resumablejsStrings.filesAdded
import typings.resumablejs.resumablejsStrings.multipart
import typings.resumablejs.resumablejsStrings.octet
import typings.resumablejs.resumablejsStrings.pause
import typings.resumablejs.resumablejsStrings.progress
import typings.resumablejs.resumablejsStrings.uploadStart
import typings.std.DragEvent
import typings.std.Element
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Resumable {
  
  trait ConfigurationHash extends StObject {
    
    /**
      * The name of the chunk index (base-1) in the current upload POST parameter to use for the file chunk (Default: resumableChunkNumber)
      */
    var chunkNumberParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * The number of milliseconds to wait before retrying a chunk on a non-permanent error. Valid values are any positive integer and undefined for immediate retry. (Default: undefined)
      **/
    var chunkRetryInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * The size in bytes of each uploaded chunk of data. The last uploaded chunk will be at least this size and up to two the size, see Issue #51 for details and reasons. (Default: 1*1024*1024)
      **/
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the general chunk size POST parameter to use for the file chunk (Default: resumableChunkSize)
      */
    var chunkSizeParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the current chunk size POST parameter to use for the file chunk (Default: resumableCurrentChunkSize)
      */
    var currentChunkSizeParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the original file name POST parameter to use for the file chunk (Default: resumableFilename)
      */
    var fileNameParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the multipart POST parameter to use for the file chunk (Default: file)
      **/
    var fileParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * The file types allowed to upload. An empty array allow any file type. (Default: [])
      **/
    var fileType: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A function which displays an error a selected file has type not allowed. (Default: displays an alert for every bad file.)
      **/
    var fileTypeErrorCallback: js.UndefOr[js.Function2[/* file */ Any, /* errorCount */ Any, Unit]] = js.undefined
    
    /**
      * Force all chunks to be less or equal than chunkSize. Otherwise, the last chunk will be greater than or equal to chunkSize. (Default: false)
      **/
    var forceChunkSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Override the function that generates unique identifiers for each file. (Default: null)
      **/
    var generateUniqueIdentifier: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * Extra headers to include in the multipart POST with data. This can be an object or a function that allows you to construct and return a value, based on supplied file (Default: {})
      **/
    var headers: js.UndefOr[js.Object | (js.Function1[/* file */ Any, js.Object])] = js.undefined
    
    /**
      * The name of the unique identifier POST parameter to use for the file chunk (Default: resumableIdentifier)
      */
    var identifierParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum number of retries for a chunk before the upload is failed. Valid values are any positive integer and undefined for no limit. (Default: undefined)
      **/
    var maxChunkRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum allowed file size. (Default: undefined)
      **/
    var maxFileSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function which displays an error a selected file is larger than allowed. (Default: displays an alert for every bad file.)
      **/
    var maxFileSizeErrorCallback: js.UndefOr[js.Function2[/* file */ Any, /* errorCount */ Any, Unit]] = js.undefined
    
    /**
      * Indicates how many files can be uploaded in a single session. Valid values are any positive integer and undefined for no limit. (Default: undefined)
      **/
    var maxFiles: js.UndefOr[Double] = js.undefined
    
    /**
      * A function which displays the please upload n file(s) at a time message. (Default: displays an alert box with the message Please n one file(s) at a time.)
      **/
    var maxFilesErrorCallback: js.UndefOr[js.Function2[/* files */ Any, /* errorCount */ Any, Unit]] = js.undefined
    
    /**
      * Method to use when POSTing chunks to the server (multipart or octet) (Default: multipart)
      **/
    var method: js.UndefOr[multipart | octet] = js.undefined
    
    /**
      * The minimum allowed file size. (Default: undefined)
      **/
    var minFileSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function which displays an error a selected file is smaller than allowed. (Default: displays an alert for every bad file.)
      **/
    var minFileSizeErrorCallback: js.UndefOr[js.Function2[/* file */ Any, /* errorCount */ Any, Unit]] = js.undefined
    
    /**
      * Extra prefix added before the name of each parameter included in the multipart POST or in the test GET. (Default: '')
      **/
    var parameterNamespace: js.UndefOr[String] = js.undefined
    
    /**
      * Optional function to process each chunk before testing & sending. Function is passed the chunk as parameter, and should call the preprocessFinished method on the chunk when finished. (Default: null)
      **/
    var preprocess: js.UndefOr[js.Function1[/* chunk */ ResumableChunk, ResumableChunk]] = js.undefined
    
    /**
      * Prioritize first and last chunks of all files. This can be handy if you can determine if a file is valid for your service from only the first or last chunk. For example, photo or video meta data is usually located in the first part of a file, making it easy to test support from only the first chunk. (Default: false)
      **/
    var prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Extra parameters to include in the multipart POST with data. This can be an object or a function. If a function, it will be passed a ResumableFile and a ResumableChunk object (Default: {})
      **/
    var query: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The name of the file's relative path POST parameter to use for the file chunk (Default: resumableRelativePath)
      */
    var relativePathParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * setChunkTypeFromFile` Set chunk content-type from original file.type. (Default: false, if false default Content-Type: application/octet-stream)
      **/
    var setChunkTypeFromFile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of simultaneous uploads (Default: 3)
      **/
    var simultaneousUploads: js.UndefOr[Double] = js.undefined
    
    /**
      * The target URL for the multipart POST request. This can be a string or a function that allows you you to construct and return a value, based on supplied params. (Default: /)
      **/
    var target: js.UndefOr[String] = js.undefined
    
    /**
      * Make a GET request to the server for each chunks to see if it already exists. If implemented on the server-side, this will allow for upload resumes even after a browser crash or even a computer restart. (Default: true)
      **/
    var testChunks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Method for chunk test request. (Default: 'GET')
      **/
    var testMethod: js.UndefOr[GET | POST | OPTIONS | PUT | DELETE] = js.undefined
    
    /**
      * The name of the total number of chunks POST parameter to use for the file chunk (Default: resumableTotalChunks)
      */
    var totalChunksParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the total file size number POST parameter to use for the file chunk (Default: resumableTotalSize)
      */
    var totalSizeParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the file type POST parameter to use for the file chunk (Default: resumableType)
      */
    var typeParameterName: js.UndefOr[String] = js.undefined
    
    /**
      * Method for chunk upload request. (Default: 'POST')
      **/
    var uploadMethod: js.UndefOr[GET | POST | OPTIONS | PUT | DELETE] = js.undefined
    
    /**
      * Standard CORS requests do not send or set any cookies by default. In order to include cookies as part of the request, you need to set the withCredentials property to true. (Default: false)
      **/
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigurationHash {
    
    inline def apply(): ConfigurationHash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationHash]
    }
    
    extension [Self <: ConfigurationHash](x: Self) {
      
      inline def setChunkNumberParameterName(value: String): Self = StObject.set(x, "chunkNumberParameterName", value.asInstanceOf[js.Any])
      
      inline def setChunkNumberParameterNameUndefined: Self = StObject.set(x, "chunkNumberParameterName", js.undefined)
      
      inline def setChunkRetryInterval(value: Double): Self = StObject.set(x, "chunkRetryInterval", value.asInstanceOf[js.Any])
      
      inline def setChunkRetryIntervalUndefined: Self = StObject.set(x, "chunkRetryInterval", js.undefined)
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeParameterName(value: String): Self = StObject.set(x, "chunkSizeParameterName", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeParameterNameUndefined: Self = StObject.set(x, "chunkSizeParameterName", js.undefined)
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setCurrentChunkSizeParameterName(value: String): Self = StObject.set(x, "currentChunkSizeParameterName", value.asInstanceOf[js.Any])
      
      inline def setCurrentChunkSizeParameterNameUndefined: Self = StObject.set(x, "currentChunkSizeParameterName", js.undefined)
      
      inline def setFileNameParameterName(value: String): Self = StObject.set(x, "fileNameParameterName", value.asInstanceOf[js.Any])
      
      inline def setFileNameParameterNameUndefined: Self = StObject.set(x, "fileNameParameterName", js.undefined)
      
      inline def setFileParameterName(value: String): Self = StObject.set(x, "fileParameterName", value.asInstanceOf[js.Any])
      
      inline def setFileParameterNameUndefined: Self = StObject.set(x, "fileParameterName", js.undefined)
      
      inline def setFileType(value: js.Array[String]): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeErrorCallback(value: (/* file */ Any, /* errorCount */ Any) => Unit): Self = StObject.set(x, "fileTypeErrorCallback", js.Any.fromFunction2(value))
      
      inline def setFileTypeErrorCallbackUndefined: Self = StObject.set(x, "fileTypeErrorCallback", js.undefined)
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      inline def setFileTypeVarargs(value: String*): Self = StObject.set(x, "fileType", js.Array(value*))
      
      inline def setForceChunkSize(value: Boolean): Self = StObject.set(x, "forceChunkSize", value.asInstanceOf[js.Any])
      
      inline def setForceChunkSizeUndefined: Self = StObject.set(x, "forceChunkSize", js.undefined)
      
      inline def setGenerateUniqueIdentifier(value: () => String): Self = StObject.set(x, "generateUniqueIdentifier", js.Any.fromFunction0(value))
      
      inline def setGenerateUniqueIdentifierUndefined: Self = StObject.set(x, "generateUniqueIdentifier", js.undefined)
      
      inline def setHeaders(value: js.Object | (js.Function1[/* file */ Any, js.Object])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersFunction1(value: /* file */ Any => js.Object): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIdentifierParameterName(value: String): Self = StObject.set(x, "identifierParameterName", value.asInstanceOf[js.Any])
      
      inline def setIdentifierParameterNameUndefined: Self = StObject.set(x, "identifierParameterName", js.undefined)
      
      inline def setMaxChunkRetries(value: Double): Self = StObject.set(x, "maxChunkRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxChunkRetriesUndefined: Self = StObject.set(x, "maxChunkRetries", js.undefined)
      
      inline def setMaxFileSize(value: Boolean): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeErrorCallback(value: (/* file */ Any, /* errorCount */ Any) => Unit): Self = StObject.set(x, "maxFileSizeErrorCallback", js.Any.fromFunction2(value))
      
      inline def setMaxFileSizeErrorCallbackUndefined: Self = StObject.set(x, "maxFileSizeErrorCallback", js.undefined)
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesErrorCallback(value: (/* files */ Any, /* errorCount */ Any) => Unit): Self = StObject.set(x, "maxFilesErrorCallback", js.Any.fromFunction2(value))
      
      inline def setMaxFilesErrorCallbackUndefined: Self = StObject.set(x, "maxFilesErrorCallback", js.undefined)
      
      inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
      
      inline def setMethod(value: multipart | octet): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMinFileSize(value: Boolean): Self = StObject.set(x, "minFileSize", value.asInstanceOf[js.Any])
      
      inline def setMinFileSizeErrorCallback(value: (/* file */ Any, /* errorCount */ Any) => Unit): Self = StObject.set(x, "minFileSizeErrorCallback", js.Any.fromFunction2(value))
      
      inline def setMinFileSizeErrorCallbackUndefined: Self = StObject.set(x, "minFileSizeErrorCallback", js.undefined)
      
      inline def setMinFileSizeUndefined: Self = StObject.set(x, "minFileSize", js.undefined)
      
      inline def setParameterNamespace(value: String): Self = StObject.set(x, "parameterNamespace", value.asInstanceOf[js.Any])
      
      inline def setParameterNamespaceUndefined: Self = StObject.set(x, "parameterNamespace", js.undefined)
      
      inline def setPreprocess(value: /* chunk */ ResumableChunk => ResumableChunk): Self = StObject.set(x, "preprocess", js.Any.fromFunction1(value))
      
      inline def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
      
      inline def setPrioritizeFirstAndLastChunk(value: Boolean): Self = StObject.set(x, "prioritizeFirstAndLastChunk", value.asInstanceOf[js.Any])
      
      inline def setPrioritizeFirstAndLastChunkUndefined: Self = StObject.set(x, "prioritizeFirstAndLastChunk", js.undefined)
      
      inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRelativePathParameterName(value: String): Self = StObject.set(x, "relativePathParameterName", value.asInstanceOf[js.Any])
      
      inline def setRelativePathParameterNameUndefined: Self = StObject.set(x, "relativePathParameterName", js.undefined)
      
      inline def setSetChunkTypeFromFile(value: Boolean): Self = StObject.set(x, "setChunkTypeFromFile", value.asInstanceOf[js.Any])
      
      inline def setSetChunkTypeFromFileUndefined: Self = StObject.set(x, "setChunkTypeFromFile", js.undefined)
      
      inline def setSimultaneousUploads(value: Double): Self = StObject.set(x, "simultaneousUploads", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousUploadsUndefined: Self = StObject.set(x, "simultaneousUploads", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTestChunks(value: Boolean): Self = StObject.set(x, "testChunks", value.asInstanceOf[js.Any])
      
      inline def setTestChunksUndefined: Self = StObject.set(x, "testChunks", js.undefined)
      
      inline def setTestMethod(value: GET | POST | OPTIONS | PUT | DELETE): Self = StObject.set(x, "testMethod", value.asInstanceOf[js.Any])
      
      inline def setTestMethodUndefined: Self = StObject.set(x, "testMethod", js.undefined)
      
      inline def setTotalChunksParameterName(value: String): Self = StObject.set(x, "totalChunksParameterName", value.asInstanceOf[js.Any])
      
      inline def setTotalChunksParameterNameUndefined: Self = StObject.set(x, "totalChunksParameterName", js.undefined)
      
      inline def setTotalSizeParameterName(value: String): Self = StObject.set(x, "totalSizeParameterName", value.asInstanceOf[js.Any])
      
      inline def setTotalSizeParameterNameUndefined: Self = StObject.set(x, "totalSizeParameterName", js.undefined)
      
      inline def setTypeParameterName(value: String): Self = StObject.set(x, "typeParameterName", value.asInstanceOf[js.Any])
      
      inline def setTypeParameterNameUndefined: Self = StObject.set(x, "typeParameterName", js.undefined)
      
      inline def setUploadMethod(value: GET | POST | OPTIONS | PUT | DELETE): Self = StObject.set(x, "uploadMethod", value.asInstanceOf[js.Any])
      
      inline def setUploadMethodUndefined: Self = StObject.set(x, "uploadMethod", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait Resumable extends StObject {
    
    /**
      * Add a HTML5 File object to the list of files.
      **/
    def addFile(file: File): Unit = js.native
    
    /**
      * Add an Array of HTML5 File objects to the list of files.
      **/
    def addFiles(files: js.Array[File]): Unit = js.native
    
    def assignBrowse(domNodes: js.Array[Element], isDirectory: Boolean): Unit = js.native
    /**
      * Assign a browse action to one or more DOM nodes. Pass in true to allow directories to be selected (Chrome only).
      **/
    def assignBrowse(domNode: Element, isDirectory: Boolean): Unit = js.native
    
    def assignDrop(domNodes: js.Array[Element]): Unit = js.native
    /**
      * Assign one or more DOM nodes as a drop target.
      **/
    def assignDrop(domNode: Element): Unit = js.native
    
    /**
      * Cancel upload of all ResumableFile objects and remove them from the list.
      **/
    def cancel(): Unit = js.native
    
    var events: js.Array[Any] = js.native
    
    /**
      * An array of ResumableFile file objects added by the user (see full docs for this object type below).
      **/
    var files: js.Array[ResumableFile] = js.native
    
    def fire(): Unit = js.native
    
    /**
      * Look up a ResumableFile object by its unique identifier.
      **/
    def getFromUniqueIdentifier(uniqueIdentifier: String): Unit = js.native
    
    def getOpt(o: String): Any = js.native
    
    /**
      * Returns the total size of the upload in bytes.
      **/
    def getSize(): Unit = js.native
    
    /**
      * Returns a boolean indicating whether or not the instance is currently uploading anything.
      **/
    def isUploading(): Boolean = js.native
    
    // Events
    /**
      * Listen for event from Resumable.js (see below)
      **/
    def on(event: String, callback: js.Function): Unit = js.native
    /**
      *  Triggers before the items are cancelled allowing to do any processing on uploading files.
      **/
    @JSName("on")
    def on_beforeCancel(event: beforeCancel, callback: js.Function0[Unit]): Unit = js.native
    /**
      *  Uploading was canceled.
      **/
    @JSName("on")
    def on_cancel(event: cancel, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Listen to all the events listed above with the same callback function.
      **/
    @JSName("on")
    def on_catchAll(event: catchAll, callback: js.Function0[Unit]): Any = js.native
    /**
      *  File is ready for upload
      **/
    @JSName("on")
    def on_chunkingComplete(event: chunkingComplete, callback: js.Function1[/* file */ ResumableFile, Unit]): Unit = js.native
    /**
      *  Show progress in file preparation
      **/
    @JSName("on")
    def on_chunkingProgress(event: chunkingProgress, callback: js.Function2[/* file */ ResumableFile, /* ratio */ Any, Unit]): Unit = js.native
    /**
      *  Started preparing file for upload
      **/
    @JSName("on")
    def on_chunkingStart(event: chunkingStart, callback: js.Function1[/* file */ ResumableFile, Unit]): Unit = js.native
    /**
      *  Uploading completed.
      **/
    @JSName("on")
    def on_complete(event: complete, callback: js.Function0[Unit]): Unit = js.native
    /**
      *  An error, including fileError, occurred.
      **/
    @JSName("on")
    def on_error(event: error, callback: js.Function2[/* message */ String, /* file */ ResumableFile, Unit]): Unit = js.native
    /**
      *  A new file was added. Optionally, you can use the browser event object from when the file was added.
      **/
    @JSName("on")
    def on_fileAdded(event: fileAdded, callback: js.Function2[/* file */ ResumableFile, /* event */ DragEvent, Unit]): Unit = js.native
    /**
      *  An error occurred during upload of a specific file.
      **/
    @JSName("on")
    def on_fileError(event: fileError, callback: js.Function2[/* file */ ResumableFile, /* message */ String, Unit]): Unit = js.native
    /**
      *  Uploading progressed for a specific file.
      **/
    @JSName("on")
    def on_fileProgress(event: fileProgress, callback: js.Function1[/* file */ ResumableFile, Unit]): Unit = js.native
    /**
      *  Something went wrong during upload of a specific file, uploading is being retried.
      **/
    @JSName("on")
    def on_fileRetry(event: fileRetry, callback: js.Function1[/* file */ ResumableFile, Unit]): Unit = js.native
    /**
      *  A specific file was completed.
      **/
    @JSName("on")
    def on_fileSuccess(event: fileSuccess, callback: js.Function1[/* file */ ResumableFile, Unit]): Any = js.native
    /**
      *  New files were added.
      **/
    @JSName("on")
    def on_filesAdded(event: filesAdded, callback: js.Function1[/* files */ js.Array[ResumableFile], Unit]): Unit = js.native
    /**
      *  Uploading was paused.
      **/
    @JSName("on")
    def on_pause(event: pause, callback: js.Function0[Unit]): Unit = js.native
    /**
      *  Uploading progress.
      **/
    @JSName("on")
    def on_progress(event: progress, callback: js.Function0[Unit]): Unit = js.native
    /**
      *  Upload has been started on the Resumable object.
      **/
    @JSName("on")
    def on_uploadStart(event: uploadStart, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * A hash object of the configuration of the Resumable.js instance.
      **/
    var opts: ConfigurationHash = js.native
    
    /**
      * Pause uploading.
      **/
    def pause(): Unit = js.native
    
    /**
      * Returns a float between 0 and 1 indicating the current upload progress of all files.
      **/
    def progress(): Double = js.native
    
    /**
      * Cancel upload of a specific ResumableFile object on the list from the list.
      **/
    def removeFile(file: ResumableFile): Unit = js.native
    
    /**
      * A boolean value indicator whether or not Resumable.js is supported by the current browser.
      **/
    var support: Boolean = js.native
    
    def unAssignDrop(domNodes: js.Array[Element]): Unit = js.native
    def unAssignDrop(domNode: Element): Unit = js.native
    
    /**
      * Start or resume uploading.
      **/
    def upload(): Unit = js.native
    
    def uploadNextChunk(): Unit = js.native
    
    var version: Double = js.native
    
    var void: Any = js.native
  }
  
  trait ResumableChunk extends StObject
  
  trait ResumableFile extends StObject {
    
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
      * The relative path to the file (defaults to file name if relative path doesn't exist)
      **/
    var relativePath: String
    
    /**
      * A back-reference to the parent Resumable object.
      **/
    var resumableObj: typings.resumablejs.Resumable.Resumable
    
    /**
      * Retry uploading the file.
      **/
    def retry(): Unit
    
    /**
      * Size in bytes of the file.
      **/
    var size: Double
    
    /**
      * A unique identifier assigned to this file object. This value is included in uploads to the server for reference, but can also be used in CSS classes etc when building your upload UI.
      **/
    var uniqueIdentifier: String
  }
  object ResumableFile {
    
    inline def apply(
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
    
    extension [Self <: ResumableFile](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setBootstrap(value: () => Unit): Self = StObject.set(x, "bootstrap", js.Any.fromFunction0(value))
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setChunks(value: js.Array[ResumableChunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: ResumableChunk*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setIsComplete(value: () => Boolean): Self = StObject.set(x, "isComplete", js.Any.fromFunction0(value))
      
      inline def setIsUploading(value: () => Boolean): Self = StObject.set(x, "isUploading", js.Any.fromFunction0(value))
      
      inline def setProgress(value: Boolean => Double): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setResumableObj(value: typings.resumablejs.Resumable.Resumable): Self = StObject.set(x, "resumableObj", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUniqueIdentifier(value: String): Self = StObject.set(x, "uniqueIdentifier", value.asInstanceOf[js.Any])
    }
  }
}
