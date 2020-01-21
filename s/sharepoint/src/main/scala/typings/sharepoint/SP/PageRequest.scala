package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequest")
@js.native
class PageRequest () extends js.Object {
  def add_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit = js.native
  def add_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit = js.native
  def get(): Unit = js.native
  def get_expectedContentType(): String = js.native
  def get_request(): WebRequest = js.native
  def get_url(): String = js.native
  def post(body: String): Unit = js.native
  def remove_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit]): Unit = js.native
  def remove_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit]): Unit = js.native
  def set_expectedContentType(value: String): Unit = js.native
  def set_url(value: String): Unit = js.native
}

/* static members */
@JSGlobal("SP.PageRequest")
@js.native
object PageRequest extends js.Object {
  def doGet(
    url: String,
    expectedContentType: String,
    succeededHandler: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit],
    failedHandler: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit]
  ): Unit = js.native
  def doPost(
    url: String,
    body: String,
    expectedContentType: String,
    succeededHandler: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, Unit],
    failedHandler: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, Unit]
  ): Unit = js.native
}

