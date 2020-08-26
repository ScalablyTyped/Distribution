package typings.resumablejs.Resumable

import typings.resumablejs.resumablejsStrings.DELETE
import typings.resumablejs.resumablejsStrings.GET
import typings.resumablejs.resumablejsStrings.OPTIONS
import typings.resumablejs.resumablejsStrings.POST
import typings.resumablejs.resumablejsStrings.PUT
import typings.resumablejs.resumablejsStrings.multipart
import typings.resumablejs.resumablejsStrings.octet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationHash extends js.Object {
  /**
    * The name of the chunk index (base-1) in the current upload POST parameter to use for the file chunk (Default: resumableChunkNumber)
    */
  var chunkNumberParameterName: js.UndefOr[String] = js.native
  /**
    * The number of milliseconds to wait before retrying a chunk on a non-permanent error. Valid values are any positive integer and undefined for immediate retry. (Default: undefined)
    **/
  var chunkRetryInterval: js.UndefOr[Double] = js.native
  /**
    * The size in bytes of each uploaded chunk of data. The last uploaded chunk will be at least this size and up to two the size, see Issue #51 for details and reasons. (Default: 1*1024*1024)
    **/
  var chunkSize: js.UndefOr[Double] = js.native
  /**
    * The name of the general chunk size POST parameter to use for the file chunk (Default: resumableChunkSize)
    */
  var chunkSizeParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the current chunk size POST parameter to use for the file chunk (Default: resumableCurrentChunkSize)
    */
  var currentChunkSizeParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the original file name POST parameter to use for the file chunk (Default: resumableFilename)
    */
  var fileNameParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the multipart POST parameter to use for the file chunk (Default: file)
    **/
  var fileParameterName: js.UndefOr[String] = js.native
  /**
    * The file types allowed to upload. An empty array allow any file type. (Default: [])
    **/
  var fileType: js.UndefOr[js.Array[String]] = js.native
  /**
    * A function which displays an error a selected file has type not allowed. (Default: displays an alert for every bad file.)
    **/
  var fileTypeErrorCallback: js.UndefOr[js.Function2[/* file */ js.Any, /* errorCount */ js.Any, Unit]] = js.native
  /**
    * Force all chunks to be less or equal than chunkSize. Otherwise, the last chunk will be greater than or equal to chunkSize. (Default: false)
    **/
  var forceChunkSize: js.UndefOr[Boolean] = js.native
  /**
    * Override the function that generates unique identifiers for each file. (Default: null)
    **/
  var generateUniqueIdentifier: js.UndefOr[js.Function0[String]] = js.native
  /**
    * Extra headers to include in the multipart POST with data. This can be an object or a function that allows you to construct and return a value, based on supplied file (Default: {})
    **/
  var headers: js.UndefOr[js.Object | (js.Function1[/* file */ js.Any, js.Object])] = js.native
  /**
    * The name of the unique identifier POST parameter to use for the file chunk (Default: resumableIdentifier)
    */
  var identifierParameterName: js.UndefOr[String] = js.native
  /**
    * The maximum number of retries for a chunk before the upload is failed. Valid values are any positive integer and undefined for no limit. (Default: undefined)
    **/
  var maxChunkRetries: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed file size. (Default: undefined)
    **/
  var maxFileSize: js.UndefOr[Boolean] = js.native
  /**
    * A function which displays an error a selected file is larger than allowed. (Default: displays an alert for every bad file.)
    **/
  var maxFileSizeErrorCallback: js.UndefOr[js.Function2[/* file */ js.Any, /* errorCount */ js.Any, Unit]] = js.native
  /**
    * Indicates how many files can be uploaded in a single session. Valid values are any positive integer and undefined for no limit. (Default: undefined)
    **/
  var maxFiles: js.UndefOr[Double] = js.native
  /**
    * A function which displays the please upload n file(s) at a time message. (Default: displays an alert box with the message Please n one file(s) at a time.)
    **/
  var maxFilesErrorCallback: js.UndefOr[js.Function2[/* files */ js.Any, /* errorCount */ js.Any, Unit]] = js.native
  /**
    * Method to use when POSTing chunks to the server (multipart or octet) (Default: multipart)
    **/
  var method: js.UndefOr[multipart | octet] = js.native
  /**
    * The minimum allowed file size. (Default: undefined)
    **/
  var minFileSize: js.UndefOr[Boolean] = js.native
  /**
    * A function which displays an error a selected file is smaller than allowed. (Default: displays an alert for every bad file.)
    **/
  var minFileSizeErrorCallback: js.UndefOr[js.Function2[/* file */ js.Any, /* errorCount */ js.Any, Unit]] = js.native
  /**
    * Extra prefix added before the name of each parameter included in the multipart POST or in the test GET. (Default: '')
    **/
  var parameterNamespace: js.UndefOr[String] = js.native
  /**
    * Optional function to process each chunk before testing & sending. Function is passed the chunk as parameter, and should call the preprocessFinished method on the chunk when finished. (Default: null)
    **/
  var preprocess: js.UndefOr[js.Function1[/* chunk */ ResumableChunk, ResumableChunk]] = js.native
  /**
    * Prioritize first and last chunks of all files. This can be handy if you can determine if a file is valid for your service from only the first or last chunk. For example, photo or video meta data is usually located in the first part of a file, making it easy to test support from only the first chunk. (Default: false)
    **/
  var prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.native
  /**
    * Extra parameters to include in the multipart POST with data. This can be an object or a function. If a function, it will be passed a ResumableFile and a ResumableChunk object (Default: {})
    **/
  var query: js.UndefOr[js.Object] = js.native
  /**
    * The name of the file's relative path POST parameter to use for the file chunk (Default: resumableRelativePath)
    */
  var relativePathParameterName: js.UndefOr[String] = js.native
  /**
    * setChunkTypeFromFile` Set chunk content-type from original file.type. (Default: false, if false default Content-Type: application/octet-stream)
    **/
  var setChunkTypeFromFile: js.UndefOr[Boolean] = js.native
  /**
    * Number of simultaneous uploads (Default: 3)
    **/
  var simultaneousUploads: js.UndefOr[Double] = js.native
  /**
    * The target URL for the multipart POST request. This can be a string or a function that allows you you to construct and return a value, based on supplied params. (Default: /)
    **/
  var target: js.UndefOr[String] = js.native
  /**
    * Make a GET request to the server for each chunks to see if it already exists. If implemented on the server-side, this will allow for upload resumes even after a browser crash or even a computer restart. (Default: true)
    **/
  var testChunks: js.UndefOr[Boolean] = js.native
  /**
    * Method for chunk test request. (Default: 'GET')
    **/
  var testMethod: js.UndefOr[GET | POST | OPTIONS | PUT | DELETE] = js.native
  /**
    * The name of the total number of chunks POST parameter to use for the file chunk (Default: resumableTotalChunks)
    */
  var totalChunksParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the total file size number POST parameter to use for the file chunk (Default: resumableTotalSize)
    */
  var totalSizeParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the file type POST parameter to use for the file chunk (Default: resumableType)
    */
  var typeParameterName: js.UndefOr[String] = js.native
  /**
    * Method for chunk upload request. (Default: 'POST')
    **/
  var uploadMethod: js.UndefOr[GET | POST | OPTIONS | PUT | DELETE] = js.native
  /**
    * Standard CORS requests do not send or set any cookies by default. In order to include cookies as part of the request, you need to set the withCredentials property to true. (Default: false)
    **/
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ConfigurationHash {
  @scala.inline
  def apply(): ConfigurationHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationHash]
  }
  @scala.inline
  implicit class ConfigurationHashOps[Self <: ConfigurationHash] (val x: Self) extends AnyVal {
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
    def setChunkNumberParameterName(value: String): Self = this.set("chunkNumberParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkNumberParameterName: Self = this.set("chunkNumberParameterName", js.undefined)
    @scala.inline
    def setChunkRetryInterval(value: Double): Self = this.set("chunkRetryInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkRetryInterval: Self = this.set("chunkRetryInterval", js.undefined)
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setChunkSizeParameterName(value: String): Self = this.set("chunkSizeParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSizeParameterName: Self = this.set("chunkSizeParameterName", js.undefined)
    @scala.inline
    def setCurrentChunkSizeParameterName(value: String): Self = this.set("currentChunkSizeParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentChunkSizeParameterName: Self = this.set("currentChunkSizeParameterName", js.undefined)
    @scala.inline
    def setFileNameParameterName(value: String): Self = this.set("fileNameParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileNameParameterName: Self = this.set("fileNameParameterName", js.undefined)
    @scala.inline
    def setFileParameterName(value: String): Self = this.set("fileParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileParameterName: Self = this.set("fileParameterName", js.undefined)
    @scala.inline
    def setFileTypeVarargs(value: String*): Self = this.set("fileType", js.Array(value :_*))
    @scala.inline
    def setFileType(value: js.Array[String]): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setFileTypeErrorCallback(value: (/* file */ js.Any, /* errorCount */ js.Any) => Unit): Self = this.set("fileTypeErrorCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFileTypeErrorCallback: Self = this.set("fileTypeErrorCallback", js.undefined)
    @scala.inline
    def setForceChunkSize(value: Boolean): Self = this.set("forceChunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceChunkSize: Self = this.set("forceChunkSize", js.undefined)
    @scala.inline
    def setGenerateUniqueIdentifier(value: () => String): Self = this.set("generateUniqueIdentifier", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGenerateUniqueIdentifier: Self = this.set("generateUniqueIdentifier", js.undefined)
    @scala.inline
    def setHeadersFunction1(value: /* file */ js.Any => js.Object): Self = this.set("headers", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaders(value: js.Object | (js.Function1[/* file */ js.Any, js.Object])): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIdentifierParameterName(value: String): Self = this.set("identifierParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifierParameterName: Self = this.set("identifierParameterName", js.undefined)
    @scala.inline
    def setMaxChunkRetries(value: Double): Self = this.set("maxChunkRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxChunkRetries: Self = this.set("maxChunkRetries", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Boolean): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    @scala.inline
    def setMaxFileSizeErrorCallback(value: (/* file */ js.Any, /* errorCount */ js.Any) => Unit): Self = this.set("maxFileSizeErrorCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMaxFileSizeErrorCallback: Self = this.set("maxFileSizeErrorCallback", js.undefined)
    @scala.inline
    def setMaxFiles(value: Double): Self = this.set("maxFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFiles: Self = this.set("maxFiles", js.undefined)
    @scala.inline
    def setMaxFilesErrorCallback(value: (/* files */ js.Any, /* errorCount */ js.Any) => Unit): Self = this.set("maxFilesErrorCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMaxFilesErrorCallback: Self = this.set("maxFilesErrorCallback", js.undefined)
    @scala.inline
    def setMethod(value: multipart | octet): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMinFileSize(value: Boolean): Self = this.set("minFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinFileSize: Self = this.set("minFileSize", js.undefined)
    @scala.inline
    def setMinFileSizeErrorCallback(value: (/* file */ js.Any, /* errorCount */ js.Any) => Unit): Self = this.set("minFileSizeErrorCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMinFileSizeErrorCallback: Self = this.set("minFileSizeErrorCallback", js.undefined)
    @scala.inline
    def setParameterNamespace(value: String): Self = this.set("parameterNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterNamespace: Self = this.set("parameterNamespace", js.undefined)
    @scala.inline
    def setPreprocess(value: /* chunk */ ResumableChunk => ResumableChunk): Self = this.set("preprocess", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreprocess: Self = this.set("preprocess", js.undefined)
    @scala.inline
    def setPrioritizeFirstAndLastChunk(value: Boolean): Self = this.set("prioritizeFirstAndLastChunk", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrioritizeFirstAndLastChunk: Self = this.set("prioritizeFirstAndLastChunk", js.undefined)
    @scala.inline
    def setQuery(value: js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRelativePathParameterName(value: String): Self = this.set("relativePathParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativePathParameterName: Self = this.set("relativePathParameterName", js.undefined)
    @scala.inline
    def setSetChunkTypeFromFile(value: Boolean): Self = this.set("setChunkTypeFromFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetChunkTypeFromFile: Self = this.set("setChunkTypeFromFile", js.undefined)
    @scala.inline
    def setSimultaneousUploads(value: Double): Self = this.set("simultaneousUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimultaneousUploads: Self = this.set("simultaneousUploads", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTestChunks(value: Boolean): Self = this.set("testChunks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestChunks: Self = this.set("testChunks", js.undefined)
    @scala.inline
    def setTestMethod(value: GET | POST | OPTIONS | PUT | DELETE): Self = this.set("testMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestMethod: Self = this.set("testMethod", js.undefined)
    @scala.inline
    def setTotalChunksParameterName(value: String): Self = this.set("totalChunksParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalChunksParameterName: Self = this.set("totalChunksParameterName", js.undefined)
    @scala.inline
    def setTotalSizeParameterName(value: String): Self = this.set("totalSizeParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSizeParameterName: Self = this.set("totalSizeParameterName", js.undefined)
    @scala.inline
    def setTypeParameterName(value: String): Self = this.set("typeParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeParameterName: Self = this.set("typeParameterName", js.undefined)
    @scala.inline
    def setUploadMethod(value: GET | POST | OPTIONS | PUT | DELETE): Self = this.set("uploadMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadMethod: Self = this.set("uploadMethod", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

