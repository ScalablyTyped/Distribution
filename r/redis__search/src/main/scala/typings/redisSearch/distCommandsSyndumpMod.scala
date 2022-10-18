package typings.redisSearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsSyndumpMod {
  
  @JSImport("@redis/search/dist/commands/SYNDUMP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(index: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[String]]
}
