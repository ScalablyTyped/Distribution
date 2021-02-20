package typings.reactNativeFetchBlob.mod

import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.base64
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.path
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchBlobResponse extends StObject {
  
  /**
    * Return BASE64 string directly.
    * @return BASE64 string of response body.
    */
  def base64(): js.Any = js.native
  
  /**
    * Convert result to javascript RNFetchBlob object.
    * @return Return a promise resolves Blob object.
    */
  def blob(contentType: String, sliceSize: Double): js.Promise[PolyfillBlob] = js.native
  
  var data: js.Any = js.native
  
  /**
    * Remove cahced file
    */
  def flush(): Unit = js.native
  
  /**
    * Convert result to JSON object.
    * @return Parsed javascript object.
    */
  def json(): js.Any = js.native
  
  /**
    * get path of response temp file
    * @return File path of temp file.
    */
  def path(): String = js.native
  
  /**
    * Read file content with given encoding, if the response does not contains
    * a file path, show warning message
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readFile(encode: Encoding): js.Promise[_] | Null = js.native
  
  /**
    * Start read stream from cached file
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readStream(encode: Encoding): RNFetchBlobStream | Null = js.native
  
  var respInfo: RNFetchBlobResponseInfo = js.native
  
  def session(name: String): RNFetchBlobSession | Null = js.native
  
  var taskId: String = js.native
  
  /**
    * Convert result to text.
    * @return Decoded base64 string.
    */
  def text(): String | js.Promise[_] = js.native
  
  var `type`: base64 | path | utf8 = js.native
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
  
  @scala.inline
  implicit class FetchBlobResponseMutableBuilder[Self <: FetchBlobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase64(value: () => js.Any): Self = StObject.set(x, "base64", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: (String, Double) => js.Promise[PolyfillBlob]): Self = StObject.set(x, "blob", js.Any.fromFunction2(value))
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJson(value: () => js.Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPath(value: () => String): Self = StObject.set(x, "path", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadFile(value: Encoding => js.Promise[_] | Null): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadStream(value: Encoding => RNFetchBlobStream | Null): Self = StObject.set(x, "readStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRespInfo(value: RNFetchBlobResponseInfo): Self = StObject.set(x, "respInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: String => RNFetchBlobSession | Null): Self = StObject.set(x, "session", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: () => String | js.Promise[_]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: base64 | path | utf8): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
