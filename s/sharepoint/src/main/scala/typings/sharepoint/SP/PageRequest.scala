package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRequest extends StObject {
  
  def add_failed(value: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit
  
  def add_succeeded(value: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit
  
  def get(): Unit
  
  def get_expectedContentType(): String
  
  def get_request(): WebRequest
  
  def get_url(): String
  
  def post(body: String): Unit
  
  def remove_failed(value: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit
  
  def remove_succeeded(value: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit
  
  def set_expectedContentType(value: String): Unit
  
  def set_url(value: String): Unit
}
object PageRequest {
  
  inline def apply(
    add_failed: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit,
    add_succeeded: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit,
    get: () => Unit,
    get_expectedContentType: () => String,
    get_request: () => WebRequest,
    get_url: () => String,
    post: String => Unit,
    remove_failed: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit,
    remove_succeeded: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit,
    set_expectedContentType: String => Unit,
    set_url: String => Unit
  ): PageRequest = {
    val __obj = js.Dynamic.literal(add_failed = js.Any.fromFunction1(add_failed), add_succeeded = js.Any.fromFunction1(add_succeeded), get = js.Any.fromFunction0(get), get_expectedContentType = js.Any.fromFunction0(get_expectedContentType), get_request = js.Any.fromFunction0(get_request), get_url = js.Any.fromFunction0(get_url), post = js.Any.fromFunction1(post), remove_failed = js.Any.fromFunction1(remove_failed), remove_succeeded = js.Any.fromFunction1(remove_succeeded), set_expectedContentType = js.Any.fromFunction1(set_expectedContentType), set_url = js.Any.fromFunction1(set_url))
    __obj.asInstanceOf[PageRequest]
  }
  
  extension [Self <: PageRequest](x: Self) {
    
    inline def setAdd_failed(value: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit): Self = StObject.set(x, "add_failed", js.Any.fromFunction1(value))
    
    inline def setAdd_succeeded(value: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit): Self = StObject.set(x, "add_succeeded", js.Any.fromFunction1(value))
    
    inline def setGet(value: () => Unit): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setGet_expectedContentType(value: () => String): Self = StObject.set(x, "get_expectedContentType", js.Any.fromFunction0(value))
    
    inline def setGet_request(value: () => WebRequest): Self = StObject.set(x, "get_request", js.Any.fromFunction0(value))
    
    inline def setGet_url(value: () => String): Self = StObject.set(x, "get_url", js.Any.fromFunction0(value))
    
    inline def setPost(value: String => Unit): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
    
    inline def setRemove_failed(value: js.Function2[/* sender */ Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit): Self = StObject.set(x, "remove_failed", js.Any.fromFunction1(value))
    
    inline def setRemove_succeeded(value: js.Function2[/* sender */ Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit): Self = StObject.set(x, "remove_succeeded", js.Any.fromFunction1(value))
    
    inline def setSet_expectedContentType(value: String => Unit): Self = StObject.set(x, "set_expectedContentType", js.Any.fromFunction1(value))
    
    inline def setSet_url(value: String => Unit): Self = StObject.set(x, "set_url", js.Any.fromFunction1(value))
  }
}
