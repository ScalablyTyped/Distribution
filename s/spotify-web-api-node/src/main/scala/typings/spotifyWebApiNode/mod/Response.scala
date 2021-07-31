package typings.spotifyWebApiNode.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response[T] extends StObject {
  
  var body: T
  
  var headers: Record[String, String]
  
  var statusCode: Double
}
object Response {
  
  @scala.inline
  def apply[T](body: T, headers: Record[String, String], statusCode: Double): Response[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response[?], T] (val x: Self & Response[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
