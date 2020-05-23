package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequest")
@js.native
class PageRequest ()
  extends typings.sharepoint.SP.PageRequest {
  /* CompleteClass */
  override def add_failed(
    value: js.Function2[
      /* sender */ js.Any, 
      /* args */ typings.sharepoint.SP.PageRequestFailedEventArgs, 
      Unit
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def add_succeeded(
    value: js.Function2[
      /* sender */ js.Any, 
      /* args */ typings.sharepoint.SP.PageRequestSucceededEventArgs, 
      Unit
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def get(): Unit = js.native
  /* CompleteClass */
  override def get_expectedContentType(): String = js.native
  /* CompleteClass */
  override def get_request(): WebRequest = js.native
  /* CompleteClass */
  override def get_url(): String = js.native
  /* CompleteClass */
  override def post(body: String): Unit = js.native
  /* CompleteClass */
  override def remove_failed(
    value: js.Function2[
      /* sender */ js.Any, 
      /* args */ typings.sharepoint.SP.PageRequestFailedEventArgs, 
      Unit
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def remove_succeeded(
    value: js.Function2[
      /* sender */ js.Any, 
      /* args */ typings.sharepoint.SP.PageRequestSucceededEventArgs, 
      Unit
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def set_expectedContentType(value: String): Unit = js.native
  /* CompleteClass */
  override def set_url(value: String): Unit = js.native
}

/* static members */
@JSGlobal("SP.PageRequest")
@js.native
object PageRequest extends js.Object {
  def doGet(
    url: String,
    expectedContentType: String,
    succeededHandler: js.Function2[
      /* sender */ js.Any, 
      /* args */ typings.sharepoint.SP.PageRequestSucceededEventArgs, 
      Unit
    ],
    failedHandler: js.Function2[
      /* sender */ js.Any, 
      /* args */ typings.sharepoint.SP.PageRequestFailedEventArgs, 
      Unit
    ]
  ): Unit = js.native
  def doPost(
    url: String,
    body: String,
    expectedContentType: String,
    succeededHandler: js.Function2[
      /* sender */ js.Any, 
      /* args */ typings.sharepoint.SP.PageRequestSucceededEventArgs, 
      Unit
    ],
    failedHandler: js.Function2[
      /* sender */ js.Any, 
      /* args */ typings.sharepoint.SP.PageRequestFailedEventArgs, 
      Unit
    ]
  ): Unit = js.native
}

