package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchBlobResponse extends js.Object {
  var data: js.Any
  var respInfo: RNFetchBlobResponseInfo
  var taskId: java.lang.String
  var `type`: reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.base64 | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.path | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.utf8
  /**
    * Return BASE64 string directly.
    * @return BASE64 string of response body.
    */
  def base64(): js.Any
  /**
    * Convert result to javascript RNFetchBlob object.
    * @return Return a promise resolves Blob object.
    */
  def blob(contentType: java.lang.String, sliceSize: scala.Double): js.Promise[PolyfillBlob]
  /**
    * Remove cahced file
    */
  def flush(): scala.Unit
  /**
    * Convert result to JSON object.
    * @return Parsed javascript object.
    */
  def json(): js.Any
  /**
    * get path of response temp file
    * @return File path of temp file.
    */
  def path(): java.lang.String
  /**
    * Read file content with given encoding, if the response does not contains
    * a file path, show warning message
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readFile(encode: Encoding): js.Promise[_] | scala.Null
  /**
    * Start read stream from cached file
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readStream(encode: Encoding): RNFetchBlobStream | scala.Null
  def session(name: java.lang.String): RNFetchBlobSession | scala.Null
  /**
    * Convert result to text.
    * @return Decoded base64 string.
    */
  def text(): java.lang.String | js.Promise[_]
}

object FetchBlobResponse {
  @scala.inline
  def apply(
    base64: () => js.Any,
    blob: (java.lang.String, scala.Double) => js.Promise[PolyfillBlob],
    data: js.Any,
    flush: () => scala.Unit,
    json: () => js.Any,
    path: () => java.lang.String,
    readFile: Encoding => js.Promise[_] | scala.Null,
    readStream: Encoding => RNFetchBlobStream | scala.Null,
    respInfo: RNFetchBlobResponseInfo,
    session: java.lang.String => RNFetchBlobSession | scala.Null,
    taskId: java.lang.String,
    text: () => java.lang.String | js.Promise[_],
    `type`: reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.base64 | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.path | reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobLibStrings.utf8
  ): FetchBlobResponse = {
    val __obj = js.Dynamic.literal(base64 = js.Any.fromFunction0(base64), blob = js.Any.fromFunction2(blob), data = data, flush = js.Any.fromFunction0(flush), json = js.Any.fromFunction0(json), path = js.Any.fromFunction0(path), readFile = js.Any.fromFunction1(readFile), readStream = js.Any.fromFunction1(readStream), respInfo = respInfo, session = js.Any.fromFunction1(session), taskId = taskId, text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchBlobResponse]
  }
}

