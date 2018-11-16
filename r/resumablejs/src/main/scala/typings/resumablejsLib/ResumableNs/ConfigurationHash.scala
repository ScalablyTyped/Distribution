package typings
package resumablejsLib.ResumableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfigurationHash extends js.Object {
  /**
       * The name of the chunk index (base-1) in the current upload POST parameter to use for the file chunk (Default: resumableChunkNumber)
       */
  var chunkNumberParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The number of milliseconds to wait before retrying a chunk on a non-permanent error. Valid values are any positive integer and undefined for immediate retry. (Default: undefined)
       **/
  var chunkRetryInterval: js.UndefOr[scala.Double] = js.undefined
  /**
       * The size in bytes of each uploaded chunk of data. The last uploaded chunk will be at least this size and up to two the size, see Issue #51 for details and reasons. (Default: 1*1024*1024)
       **/
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * The name of the general chunk size POST parameter to use for the file chunk (Default: resumableChunkSize)
       */
  var chunkSizeParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the current chunk size POST parameter to use for the file chunk (Default: resumableCurrentChunkSize)
       */
  var currentChunkSizeParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the original file name POST parameter to use for the file chunk (Default: resumableFilename)
       */
  var fileNameParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the multipart POST parameter to use for the file chunk (Default: file)
       **/
  var fileParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The file types allowed to upload. An empty array allow any file type. (Default: [])
       **/
  var fileType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * A function which displays an error a selected file has type not allowed. (Default: displays an alert for every bad file.)
       **/
  var fileTypeErrorCallback: js.UndefOr[
    js.Function2[/* file */ ResumableFile, /* errorCount */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
       * Force all chunks to be less or equal than chunkSize. Otherwise, the last chunk will be greater than or equal to chunkSize. (Default: false)
       **/
  var forceChunkSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Override the function that generates unique identifiers for each file. (Default: null)
       **/
  var generateUniqueIdentifier: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /**
       * Extra headers to include in the multipart POST with data. This can be an object or a function that allows you to construct and return a value, based on supplied file (Default: {})
       **/
  var headers: js.UndefOr[js.Object | (js.Function1[/* file */ ResumableFile, js.Object])] = js.undefined
  /**
       * The name of the unique identifier POST parameter to use for the file chunk (Default: resumableIdentifier)
       */
  var identifierParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The maximum number of retries for a chunk before the upload is failed. Valid values are any positive integer and undefined for no limit. (Default: undefined)
       **/
  var maxChunkRetries: js.UndefOr[scala.Double] = js.undefined
  /**
       * The maximum allowed file size. (Default: undefined)
       **/
  var maxFileSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A function which displays an error a selected file is larger than allowed. (Default: displays an alert for every bad file.)
       **/
  var maxFileSizeErrorCallback: js.UndefOr[
    js.Function2[/* file */ ResumableFile, /* errorCount */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
       * Indicates how many files can be uploaded in a single session. Valid values are any positive integer and undefined for no limit. (Default: undefined)
       **/
  var maxFiles: js.UndefOr[scala.Double] = js.undefined
  /**
       * A function which displays the please upload n file(s) at a time message. (Default: displays an alert box with the message Please n one file(s) at a time.)
       **/
  var maxFilesErrorCallback: js.UndefOr[
    js.Function2[/* files */ ResumableFile, /* errorCount */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
       * Method to use when POSTing chunks to the server (multipart or octet) (Default: multipart)
       **/
  var method: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The minimum allowed file size. (Default: undefined)
       **/
  var minFileSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A function which displays an error a selected file is smaller than allowed. (Default: displays an alert for every bad file.)
       **/
  var minFileSizeErrorCallback: js.UndefOr[
    js.Function2[/* file */ ResumableFile, /* errorCount */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
       * Extra prefix added before the name of each parameter included in the multipart POST or in the test GET. (Default: '')
       **/
  var parameterNamespace: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional function to process each chunk before testing & sending. Function is passed the chunk as parameter, and should call the preprocessFinished method on the chunk when finished. (Default: null)
       **/
  var preprocess: js.UndefOr[js.Function1[/* chunk */ ResumableChunk, ResumableChunk]] = js.undefined
  /**
       * Prioritize first and last chunks of all files. This can be handy if you can determine if a file is valid for your service from only the first or last chunk. For example, photo or video meta data is usually located in the first part of a file, making it easy to test support from only the first chunk. (Default: false)
       **/
  var prioritizeFirstAndLastChunk: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Extra parameters to include in the multipart POST with data. This can be an object or a function. If a function, it will be passed a ResumableFile and a ResumableChunk object (Default: {})
       **/
  var query: js.UndefOr[js.Object] = js.undefined
  /**
       * The name of the file's relative path POST parameter to use for the file chunk (Default: resumableRelativePath)
       */
  var relativePathParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Number of simultaneous uploads (Default: 3)
       **/
  var simultaneousUploads: js.UndefOr[scala.Double] = js.undefined
  /**
       * The target URL for the multipart POST request. This can be a string or a function that allows you you to construct and return a value, based on supplied params. (Default: /)
       **/
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Make a GET request to the server for each chunks to see if it already exists. If implemented on the server-side, this will allow for upload resumes even after a browser crash or even a computer restart. (Default: true)
       **/
  var testChunks: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Method for chunk test request. (Default: 'GET')
       **/
  var testMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the total number of chunks POST parameter to use for the file chunk (Default: resumableTotalChunks)
       */
  var totalChunksParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the total file size number POST parameter to use for the file chunk (Default: resumableTotalSize)
       */
  var totalSizeParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the file type POST parameter to use for the file chunk (Default: resumableType)
       */
  var typeParameterName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Method for chunk upload request. (Default: 'POST')
       **/
  var uploadMethod: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Standard CORS requests do not send or set any cookies by default. In order to include cookies as part of the request, you need to set the withCredentials property to true. (Default: false)
       **/
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

