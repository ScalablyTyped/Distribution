package typings.redisSearch

import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasupdateMod {
  
  @JSImport("@redis/search/dist/commands/ALIASUPDATE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(name: String, index: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(name.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
