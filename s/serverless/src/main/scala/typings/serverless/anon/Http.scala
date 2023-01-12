package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Http[T /* <: js.Object */] extends StObject {
  
  var http: T | String
}
object Http {
  
  inline def apply[T /* <: js.Object */](http: T | String): Http[T] = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Http[?], T /* <: js.Object */] (val x: Self & Http[T]) extends AnyVal {
    
    inline def setHttp(value: T | String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
  }
}
