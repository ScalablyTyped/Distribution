package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRequest extends js.Object {
  def add_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit
  def add_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit
  def get(): Unit
  def get_expectedContentType(): String
  def get_request(): WebRequest
  def get_url(): String
  def post(body: String): Unit
  def remove_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit
  def remove_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit
  def set_expectedContentType(value: String): Unit
  def set_url(value: String): Unit
}

object PageRequest {
  @scala.inline
  def apply(
    add_failed: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit,
    add_succeeded: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit,
    get: () => Unit,
    get_expectedContentType: () => String,
    get_request: () => WebRequest,
    get_url: () => String,
    post: String => Unit,
    remove_failed: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit] => Unit,
    remove_succeeded: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit] => Unit,
    set_expectedContentType: String => Unit,
    set_url: String => Unit
  ): PageRequest = {
    val __obj = js.Dynamic.literal(add_failed = js.Any.fromFunction1(add_failed), add_succeeded = js.Any.fromFunction1(add_succeeded), get = js.Any.fromFunction0(get), get_expectedContentType = js.Any.fromFunction0(get_expectedContentType), get_request = js.Any.fromFunction0(get_request), get_url = js.Any.fromFunction0(get_url), post = js.Any.fromFunction1(post), remove_failed = js.Any.fromFunction1(remove_failed), remove_succeeded = js.Any.fromFunction1(remove_succeeded), set_expectedContentType = js.Any.fromFunction1(set_expectedContentType), set_url = js.Any.fromFunction1(set_url))
    __obj.asInstanceOf[PageRequest]
  }
}

