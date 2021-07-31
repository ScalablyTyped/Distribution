package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.WebProxy")
@js.native
class WebProxy ()
  extends StObject
     with typings.sharepoint.SP.WebProxy
object WebProxy {
  
  @JSGlobal("SP.WebProxy")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def invoke(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    requestInfo: typings.sharepoint.SP.WebRequestInfo
  ): typings.sharepoint.SP.WebResponseInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(context.asInstanceOf[js.Any], requestInfo.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.WebResponseInfo]
}
