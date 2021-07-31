package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequest extends StObject {
  
  def add_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit
  
  def add_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit
  
  def get_navigateWhenServerRedirect(): Boolean
  
  def get_webRequest(): WebRequest
  
  def remove_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit
  
  def remove_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit
  
  def set_navigateWhenServerRedirect(value: Boolean): Unit
}
object ClientRequest {
  
  @scala.inline
  def apply(
    add_requestFailed: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit] => Unit,
    add_requestSucceeded: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Unit,
    get_navigateWhenServerRedirect: () => Boolean,
    get_webRequest: () => WebRequest,
    remove_requestFailed: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit] => Unit,
    remove_requestSucceeded: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Unit,
    set_navigateWhenServerRedirect: Boolean => Unit
  ): ClientRequest = {
    val __obj = js.Dynamic.literal(add_requestFailed = js.Any.fromFunction1(add_requestFailed), add_requestSucceeded = js.Any.fromFunction1(add_requestSucceeded), get_navigateWhenServerRedirect = js.Any.fromFunction0(get_navigateWhenServerRedirect), get_webRequest = js.Any.fromFunction0(get_webRequest), remove_requestFailed = js.Any.fromFunction1(remove_requestFailed), remove_requestSucceeded = js.Any.fromFunction1(remove_requestSucceeded), set_navigateWhenServerRedirect = js.Any.fromFunction1(set_navigateWhenServerRedirect))
    __obj.asInstanceOf[ClientRequest]
  }
  
  @scala.inline
  implicit class ClientRequestMutableBuilder[Self <: ClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit] => Unit): Self = StObject.set(x, "add_requestFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Unit): Self = StObject.set(x, "add_requestSucceeded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_navigateWhenServerRedirect(value: () => Boolean): Self = StObject.set(x, "get_navigateWhenServerRedirect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_webRequest(value: () => WebRequest): Self = StObject.set(x, "get_webRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit] => Unit): Self = StObject.set(x, "remove_requestFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Unit): Self = StObject.set(x, "remove_requestSucceeded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_navigateWhenServerRedirect(value: Boolean => Unit): Self = StObject.set(x, "set_navigateWhenServerRedirect", js.Any.fromFunction1(value))
  }
}
