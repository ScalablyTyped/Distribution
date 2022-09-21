package typings.redisSearch

import typings.redisSearch.aggregateMod.AggregateOptions
import typings.redisSearch.aggregateMod.AggregateRawReply
import typings.redisSearch.commandsMod.ProfileOptions
import typings.redisSearch.commandsMod.ProfileRawReply
import typings.redisSearch.commandsMod.ProfileReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileAGGREGATEMod {
  
  @JSImport("@redis/search/dist/commands/PROFILE_AGGREGATE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/PROFILE_AGGREGATE", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(index: String, query: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(index: String, query: String, options: ProfileOptions & AggregateOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: ProfileAggeregateRawReply): ProfileReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ProfileReply]
  
  type ProfileAggeregateRawReply = ProfileRawReply[AggregateRawReply]
}
