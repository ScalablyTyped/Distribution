package typings.servicenow.servicenow

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RESTAPIRequest[T] extends StObject {
  
  val body: RESTAPIRequestBody[T] = js.native
  
  def getHeader(header: String): String = js.native
  
  def getSupportedResponseContentTypes(): js.Array[String] = js.native
  
  val headers: StringDictionary[String] = js.native
  
  val pathParams: StringDictionary[String] = js.native
  
  val queryParams: StringDictionary[js.Array[String]] = js.native
  
  val queryString: String = js.native
  
  val url: String = js.native
}
object RESTAPIRequest {
  
  @scala.inline
  def apply[T](
    body: RESTAPIRequestBody[T],
    getHeader: String => String,
    getSupportedResponseContentTypes: () => js.Array[String],
    headers: StringDictionary[String],
    pathParams: StringDictionary[String],
    queryParams: StringDictionary[js.Array[String]],
    queryString: String,
    url: String
  ): RESTAPIRequest[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getSupportedResponseContentTypes = js.Any.fromFunction0(getSupportedResponseContentTypes), headers = headers.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RESTAPIRequest[T]]
  }
  
  @scala.inline
  implicit class RESTAPIRequestMutableBuilder[Self <: RESTAPIRequest[_], T] (val x: Self with RESTAPIRequest[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: RESTAPIRequestBody[T]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSupportedResponseContentTypes(value: () => js.Array[String]): Self = StObject.set(x, "getSupportedResponseContentTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathParams(value: StringDictionary[String]): Self = StObject.set(x, "pathParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParams(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
