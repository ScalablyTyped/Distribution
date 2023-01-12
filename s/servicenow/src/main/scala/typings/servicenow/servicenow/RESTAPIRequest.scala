package typings.servicenow.servicenow

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTAPIRequest[T] extends StObject {
  
  val body: RESTAPIRequestBody[T]
  
  def getHeader(header: String): String
  
  def getSupportedResponseContentTypes(): js.Array[String]
  
  val headers: StringDictionary[String]
  
  val pathParams: StringDictionary[String]
  
  val queryParams: StringDictionary[js.Array[String]]
  
  val queryString: String
  
  val url: String
}
object RESTAPIRequest {
  
  inline def apply[T](
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
  implicit open class MutableBuilder[Self <: RESTAPIRequest[?], T] (val x: Self & RESTAPIRequest[T]) extends AnyVal {
    
    inline def setBody(value: RESTAPIRequestBody[T]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setGetSupportedResponseContentTypes(value: () => js.Array[String]): Self = StObject.set(x, "getSupportedResponseContentTypes", js.Any.fromFunction0(value))
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setPathParams(value: StringDictionary[String]): Self = StObject.set(x, "pathParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParams(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
