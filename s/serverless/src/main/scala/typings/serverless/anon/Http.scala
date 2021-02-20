package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http[T /* <: js.Object */] extends StObject {
  
  var http: T | String = js.native
}
object Http {
  
  @scala.inline
  def apply[T /* <: js.Object */](http: T | String): Http[T] = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http[T]]
  }
  
  @scala.inline
  implicit class HttpMutableBuilder[Self <: Http[_], T /* <: js.Object */] (val x: Self with Http[T]) extends AnyVal {
    
    @scala.inline
    def setHttp(value: T | String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
  }
}
