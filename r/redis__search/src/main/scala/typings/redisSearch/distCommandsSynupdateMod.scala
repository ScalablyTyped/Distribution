package typings.redisSearch

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.redisSearchBooleans.`true`
import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsSynupdateMod {
  
  @JSImport("@redis/search/dist/commands/SYNUPDATE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(index: String, groupId: String, terms: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any], terms.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(index: String, groupId: String, terms: String, options: SynUpdateOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any], terms.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(index: String, groupId: String, terms: js.Array[String]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any], terms.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(index: String, groupId: String, terms: js.Array[String], options: SynUpdateOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any], terms.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait SynUpdateOptions extends StObject {
    
    var SKIPINITIALSCAN: js.UndefOr[`true`] = js.undefined
  }
  object SynUpdateOptions {
    
    inline def apply(): SynUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SynUpdateOptions]
    }
    
    extension [Self <: SynUpdateOptions](x: Self) {
      
      inline def setSKIPINITIALSCAN(value: `true`): Self = StObject.set(x, "SKIPINITIALSCAN", value.asInstanceOf[js.Any])
      
      inline def setSKIPINITIALSCANUndefined: Self = StObject.set(x, "SKIPINITIALSCAN", js.undefined)
    }
  }
}
