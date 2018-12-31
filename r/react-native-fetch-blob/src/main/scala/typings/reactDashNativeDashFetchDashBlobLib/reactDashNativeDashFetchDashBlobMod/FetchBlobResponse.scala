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
  def readFile(encode: reactDashNativeDashFetchDashBlobLib.Encoding): js.Promise[_] | scala.Null
  /**
    * Start read stream from cached file
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readStream(encode: reactDashNativeDashFetchDashBlobLib.Encoding): RNFetchBlobStream | scala.Null
  def session(name: java.lang.String): RNFetchBlobSession | scala.Null
  /**
    * Convert result to text.
    * @return Decoded base64 string.
    */
  def text(): java.lang.String | js.Promise[_]
}

