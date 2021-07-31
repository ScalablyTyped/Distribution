package typings.reactNative

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request
  extends StObject
     with Object
     with Body {
  
  val credentials: RequestCredentials
  
  val headers: Headers
  
  val method: String
  
  val mode: RequestMode
  
  val referrer: String
  
  val url: String
}
object Request {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    constructor: js.Function,
    credentials: RequestCredentials,
    formData: () => js.Promise[FormData],
    hasOwnProperty: PropertyKey => Boolean,
    headers: Headers,
    json: () => js.Promise[js.Any],
    method: String,
    mode: RequestMode,
    propertyIsEnumerable: PropertyKey => Boolean,
    referrer: String,
    text: () => js.Promise[String],
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), referrer = referrer.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
