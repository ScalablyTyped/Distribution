package typings.reactNativeFetchBlob.mod

import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.base64
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.path
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchBlobResponse extends js.Object {
  var data: js.Any
  var respInfo: RNFetchBlobResponseInfo
  var taskId: String
  var `type`: base64 | path | utf8
  /**
    * Return BASE64 string directly.
    * @return BASE64 string of response body.
    */
  def base64(): js.Any
  /**
    * Convert result to javascript RNFetchBlob object.
    * @return Return a promise resolves Blob object.
    */
  def blob(contentType: String, sliceSize: Double): js.Promise[PolyfillBlob]
  /**
    * Remove cahced file
    */
  def flush(): Unit
  /**
    * Convert result to JSON object.
    * @return Parsed javascript object.
    */
  def json(): js.Any
  /**
    * get path of response temp file
    * @return File path of temp file.
    */
  def path(): String
  /**
    * Read file content with given encoding, if the response does not contains
    * a file path, show warning message
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readFile(encode: Encoding): js.Promise[_] | Null
  /**
    * Start read stream from cached file
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readStream(encode: Encoding): RNFetchBlobStream | Null
  def session(name: String): RNFetchBlobSession | Null
  /**
    * Convert result to text.
    * @return Decoded base64 string.
    */
  def text(): String | js.Promise[_]
}

object FetchBlobResponse {
  @scala.inline
  def apply(
    base64: () => js.Any,
    blob: (String, Double) => js.Promise[PolyfillBlob],
    data: js.Any,
    flush: () => Unit,
    json: () => js.Any,
    path: () => String,
    readFile: Encoding => js.Promise[_] | Null,
    readStream: Encoding => RNFetchBlobStream | Null,
    respInfo: RNFetchBlobResponseInfo,
    session: String => RNFetchBlobSession | Null,
    taskId: String,
    text: () => String | js.Promise[_],
    `type`: base64 | path | utf8
  ): FetchBlobResponse = {
    val __obj = js.Dynamic.literal(base64 = js.Any.fromFunction0(base64), blob = js.Any.fromFunction2(blob), data = data.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), json = js.Any.fromFunction0(json), path = js.Any.fromFunction0(path), readFile = js.Any.fromFunction1(readFile), readStream = js.Any.fromFunction1(readStream), respInfo = respInfo.asInstanceOf[js.Any], session = js.Any.fromFunction1(session), taskId = taskId.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchBlobResponse]
  }
}

