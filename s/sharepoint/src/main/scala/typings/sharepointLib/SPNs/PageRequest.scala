package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequest")
@js.native
class PageRequest () extends js.Object {
  def add_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, scala.Unit]): scala.Unit = js.native
  def add_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, scala.Unit]): scala.Unit = js.native
  def get(): scala.Unit = js.native
  def get_expectedContentType(): java.lang.String = js.native
  def get_request(): microsoftDashAjaxLib.SysNs.NetNs.WebRequest = js.native
  def get_url(): java.lang.String = js.native
  def post(body: java.lang.String): scala.Unit = js.native
  def remove_failed(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestFailedEventArgs, scala.Unit]): scala.Unit = js.native
  def remove_succeeded(value: js.Function2[/* sender */ js.Any, /* args */ PageRequestSucceededEventArgs, scala.Unit]): scala.Unit = js.native
  def set_expectedContentType(value: java.lang.String): scala.Unit = js.native
  def set_url(value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("SP.PageRequest")
@js.native
object PageRequest extends js.Object {
  def doGet(
    url: java.lang.String,
    expectedContentType: java.lang.String,
    succeededHandler: js.Function2[
      /* sender */ js.Any, 
      /* args */ sharepointLib.SPNs.PageRequestSucceededEventArgs, 
      scala.Unit
    ],
    failedHandler: js.Function2[
      /* sender */ js.Any, 
      /* args */ sharepointLib.SPNs.PageRequestFailedEventArgs, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def doPost(
    url: java.lang.String,
    body: java.lang.String,
    expectedContentType: java.lang.String,
    succeededHandler: js.Function2[
      /* sender */ js.Any, 
      /* args */ sharepointLib.SPNs.PageRequestSucceededEventArgs, 
      scala.Unit
    ],
    failedHandler: js.Function2[
      /* sender */ js.Any, 
      /* args */ sharepointLib.SPNs.PageRequestFailedEventArgs, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

