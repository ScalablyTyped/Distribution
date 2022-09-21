package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.Net.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.PageRequest")
@js.native
open class PageRequest ()
  extends StObject
     with typings.sharepoint.SP.PageRequest {
  
  /* CompleteClass */
  override def add_failed(
    value: js.Function2[/* sender */ Any, /* args */ typings.sharepoint.SP.PageRequestFailedEventArgs, Unit]
  ): Unit = js.native
  
  /* CompleteClass */
  override def add_succeeded(
    value: js.Function2[
      /* sender */ Any, 
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
    value: js.Function2[/* sender */ Any, /* args */ typings.sharepoint.SP.PageRequestFailedEventArgs, Unit]
  ): Unit = js.native
  
  /* CompleteClass */
  override def remove_succeeded(
    value: js.Function2[
      /* sender */ Any, 
      /* args */ typings.sharepoint.SP.PageRequestSucceededEventArgs, 
      Unit
    ]
  ): Unit = js.native
  
  /* CompleteClass */
  override def set_expectedContentType(value: String): Unit = js.native
  
  /* CompleteClass */
  override def set_url(value: String): Unit = js.native
}
object PageRequest {
  
  @JSGlobal("SP.PageRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def doGet(
    url: String,
    expectedContentType: String,
    succeededHandler: js.Function2[
      /* sender */ Any, 
      /* args */ typings.sharepoint.SP.PageRequestSucceededEventArgs, 
      Unit
    ],
    failedHandler: js.Function2[/* sender */ Any, /* args */ typings.sharepoint.SP.PageRequestFailedEventArgs, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doGet")(url.asInstanceOf[js.Any], expectedContentType.asInstanceOf[js.Any], succeededHandler.asInstanceOf[js.Any], failedHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def doPost(
    url: String,
    body: String,
    expectedContentType: String,
    succeededHandler: js.Function2[
      /* sender */ Any, 
      /* args */ typings.sharepoint.SP.PageRequestSucceededEventArgs, 
      Unit
    ],
    failedHandler: js.Function2[/* sender */ Any, /* args */ typings.sharepoint.SP.PageRequestFailedEventArgs, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doPost")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], expectedContentType.asInstanceOf[js.Any], succeededHandler.asInstanceOf[js.Any], failedHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
