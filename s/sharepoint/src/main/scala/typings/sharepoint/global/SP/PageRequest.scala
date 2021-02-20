package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.PageRequest")
@js.native
class PageRequest ()
  extends typings.sharepoint.SP.PageRequest
object PageRequest {
  
  /* static member */
  @JSGlobal("SP.PageRequest.doGet")
  @js.native
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
  
  /* static member */
  @JSGlobal("SP.PageRequest.doPost")
  @js.native
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
