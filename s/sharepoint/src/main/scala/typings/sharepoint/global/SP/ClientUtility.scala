package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientUtility")
@js.native
class ClientUtility ()
  extends StObject
     with typings.sharepoint.SP.ClientUtility
object ClientUtility {
  
  @JSGlobal("SP.ClientUtility")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getOrCreateObjectPathForConstructor(context: typings.sharepoint.SP.ClientRuntimeContext, typeId: String, args: js.Array[js.Any]): typings.sharepoint.SP.ObjectPath = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateObjectPathForConstructor")(context.asInstanceOf[js.Any], typeId.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ObjectPath]
  
  /* static member */
  inline def urlPathEncodeForXmlHttpRequest(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlPathEncodeForXmlHttpRequest")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
