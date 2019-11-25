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

trait ConfigurationHash extends js.Object {
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
  var fileTypeErrorCallback: js.UndefOr[js.Function2[/* file */ js.Any, /* errorCount */ js.Any, Unit]] = js.undefined
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
  var headers: js.UndefOr[js.Object | (js.Function1[/* file */ js.Any, js.Object])] = js.undefined
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
  var maxFileSizeErrorCallback: js.UndefOr[js.Function2[/* file */ js.Any, /* errorCount */ js.Any, Unit]] = js.undefined
  /**
    * Indicates how many files can be uploaded in a single session. Valid values are any positive integer and undefined for no limit. (Default: undefined)
    **/
  var maxFiles: js.UndefOr[Double] = js.undefined
  /**
    * A function which displays the please upload n file(s) at a time message. (Default: displays an alert box with the message Please n one file(s) at a time.)
    **/
  var maxFilesErrorCallback: js.UndefOr[js.Function2[/* files */ js.Any, /* errorCount */ js.Any, Unit]] = js.undefined
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
  var minFileSizeErrorCallback: js.UndefOr[js.Function2[/* file */ js.Any, /* errorCount */ js.Any, Unit]] = js.undefined
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
  @scala.inline
  def apply(
    chunkNumberParameterName: String = null,
    chunkRetryInterval: Int | Double = null,
    chunkSize: Int | Double = null,
    chunkSizeParameterName: String = null,
    currentChunkSizeParameterName: String = null,
    fileNameParameterName: String = null,
    fileParameterName: String = null,
    fileType: js.Array[String] = null,
    fileTypeErrorCallback: (/* file */ js.Any, /* errorCount */ js.Any) => Unit = null,
    forceChunkSize: js.UndefOr[Boolean] = js.undefined,
    generateUniqueIdentifier: () => String = null,
    headers: js.Object | (js.Function1[/* file */ js.Any, js.Object]) = null,
    identifierParameterName: String = null,
    maxChunkRetries: Int | Double = null,
    maxFileSize: js.UndefOr[Boolean] = js.undefined,
    maxFileSizeErrorCallback: (/* file */ js.Any, /* errorCount */ js.Any) => Unit = null,
    maxFiles: Int | Double = null,
    maxFilesErrorCallback: (/* files */ js.Any, /* errorCount */ js.Any) => Unit = null,
    method: multipart | octet = null,
    minFileSize: js.UndefOr[Boolean] = js.undefined,
    minFileSizeErrorCallback: (/* file */ js.Any, /* errorCount */ js.Any) => Unit = null,
    parameterNamespace: String = null,
    preprocess: /* chunk */ ResumableChunk => ResumableChunk = null,
    prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.undefined,
    query: js.Object = null,
    relativePathParameterName: String = null,
    setChunkTypeFromFile: js.UndefOr[Boolean] = js.undefined,
    simultaneousUploads: Int | Double = null,
    target: String = null,
    testChunks: js.UndefOr[Boolean] = js.undefined,
    testMethod: GET | POST | OPTIONS | PUT | DELETE = null,
    totalChunksParameterName: String = null,
    totalSizeParameterName: String = null,
    typeParameterName: String = null,
    uploadMethod: GET | POST | OPTIONS | PUT | DELETE = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): ConfigurationHash = {
    val __obj = js.Dynamic.literal()
    if (chunkNumberParameterName != null) __obj.updateDynamic("chunkNumberParameterName")(chunkNumberParameterName.asInstanceOf[js.Any])
    if (chunkRetryInterval != null) __obj.updateDynamic("chunkRetryInterval")(chunkRetryInterval.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (chunkSizeParameterName != null) __obj.updateDynamic("chunkSizeParameterName")(chunkSizeParameterName.asInstanceOf[js.Any])
    if (currentChunkSizeParameterName != null) __obj.updateDynamic("currentChunkSizeParameterName")(currentChunkSizeParameterName.asInstanceOf[js.Any])
    if (fileNameParameterName != null) __obj.updateDynamic("fileNameParameterName")(fileNameParameterName.asInstanceOf[js.Any])
    if (fileParameterName != null) __obj.updateDynamic("fileParameterName")(fileParameterName.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (fileTypeErrorCallback != null) __obj.updateDynamic("fileTypeErrorCallback")(js.Any.fromFunction2(fileTypeErrorCallback))
    if (!js.isUndefined(forceChunkSize)) __obj.updateDynamic("forceChunkSize")(forceChunkSize.asInstanceOf[js.Any])
    if (generateUniqueIdentifier != null) __obj.updateDynamic("generateUniqueIdentifier")(js.Any.fromFunction0(generateUniqueIdentifier))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (identifierParameterName != null) __obj.updateDynamic("identifierParameterName")(identifierParameterName.asInstanceOf[js.Any])
    if (maxChunkRetries != null) __obj.updateDynamic("maxChunkRetries")(maxChunkRetries.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (maxFileSizeErrorCallback != null) __obj.updateDynamic("maxFileSizeErrorCallback")(js.Any.fromFunction2(maxFileSizeErrorCallback))
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxFilesErrorCallback != null) __obj.updateDynamic("maxFilesErrorCallback")(js.Any.fromFunction2(maxFilesErrorCallback))
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(minFileSize)) __obj.updateDynamic("minFileSize")(minFileSize.asInstanceOf[js.Any])
    if (minFileSizeErrorCallback != null) __obj.updateDynamic("minFileSizeErrorCallback")(js.Any.fromFunction2(minFileSizeErrorCallback))
    if (parameterNamespace != null) __obj.updateDynamic("parameterNamespace")(parameterNamespace.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction1(preprocess))
    if (!js.isUndefined(prioritizeFirstAndLastChunk)) __obj.updateDynamic("prioritizeFirstAndLastChunk")(prioritizeFirstAndLastChunk.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (relativePathParameterName != null) __obj.updateDynamic("relativePathParameterName")(relativePathParameterName.asInstanceOf[js.Any])
    if (!js.isUndefined(setChunkTypeFromFile)) __obj.updateDynamic("setChunkTypeFromFile")(setChunkTypeFromFile.asInstanceOf[js.Any])
    if (simultaneousUploads != null) __obj.updateDynamic("simultaneousUploads")(simultaneousUploads.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(testChunks)) __obj.updateDynamic("testChunks")(testChunks.asInstanceOf[js.Any])
    if (testMethod != null) __obj.updateDynamic("testMethod")(testMethod.asInstanceOf[js.Any])
    if (totalChunksParameterName != null) __obj.updateDynamic("totalChunksParameterName")(totalChunksParameterName.asInstanceOf[js.Any])
    if (totalSizeParameterName != null) __obj.updateDynamic("totalSizeParameterName")(totalSizeParameterName.asInstanceOf[js.Any])
    if (typeParameterName != null) __obj.updateDynamic("typeParameterName")(typeParameterName.asInstanceOf[js.Any])
    if (uploadMethod != null) __obj.updateDynamic("uploadMethod")(uploadMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationHash]
  }
}

