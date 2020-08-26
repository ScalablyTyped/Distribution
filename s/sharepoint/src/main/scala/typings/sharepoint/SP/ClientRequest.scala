package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientRequest extends js.Object {
  def add_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit = js.native
  def add_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit = js.native
  def get_navigateWhenServerRedirect(): Boolean = js.native
  def get_webRequest(): WebRequest = js.native
  def remove_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit = js.native
  def remove_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit = js.native
  def set_navigateWhenServerRedirect(value: Boolean): Unit = js.native
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
  implicit class ClientRequestOps[Self <: ClientRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit] => Unit): Self = this.set("add_requestFailed", js.Any.fromFunction1(value))
    @scala.inline
    def setAdd_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Unit): Self = this.set("add_requestSucceeded", js.Any.fromFunction1(value))
    @scala.inline
    def setGet_navigateWhenServerRedirect(value: () => Boolean): Self = this.set("get_navigateWhenServerRedirect", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_webRequest(value: () => WebRequest): Self = this.set("get_webRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit] => Unit): Self = this.set("remove_requestFailed", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit] => Unit): Self = this.set("remove_requestSucceeded", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_navigateWhenServerRedirect(value: Boolean => Unit): Self = this.set("set_navigateWhenServerRedirect", js.Any.fromFunction1(value))
  }
  
}

