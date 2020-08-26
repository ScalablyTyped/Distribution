package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequest")
@js.native
class PageRequest ()
  extends typings.sharepoint.SP.PageRequest

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

