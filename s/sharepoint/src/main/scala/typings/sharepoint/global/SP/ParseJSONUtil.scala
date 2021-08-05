package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ParseJSONUtil")
@js.native
class ParseJSONUtil ()
  extends StObject
     with typings.sharepoint.SP.ParseJSONUtil
object ParseJSONUtil {
  
  @JSGlobal("SP.ParseJSONUtil")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def parseObjectFromJsonString(json: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseObjectFromJsonString")(json.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  inline def validateJson(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateJson")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
