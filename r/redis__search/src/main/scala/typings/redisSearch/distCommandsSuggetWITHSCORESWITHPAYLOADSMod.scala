package typings.redisSearch

import typings.redisSearch.distCommandsSuggetMod.SugGetOptions
import typings.redisSearch.distCommandsSuggetWITHSCORESMod.SuggestionWithScores
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsSuggetWITHSCORESWITHPAYLOADSMod {
  
  @JSImport("@redis/search/dist/commands/SUGGET_WITHSCORES_WITHPAYLOADS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/SUGGET_WITHSCORES_WITHPAYLOADS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String, prefix: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, prefix: String, options: SugGetOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): js.Array[SuggestionWithScoresAndPayloads] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[SuggestionWithScoresAndPayloads] | Null]
  inline def transformReply(rawReply: js.Array[String | Null]): js.Array[SuggestionWithScoresAndPayloads] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[js.Array[SuggestionWithScoresAndPayloads] | Null]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.redisSearch.distCommandsSuggetWITHPAYLOADSMod.SuggestionWithPayload because var conflicts: suggestion. Inlined payload */ trait SuggestionWithScoresAndPayloads
    extends StObject
       with SuggestionWithScores {
    
    var payload: String | Null
  }
  object SuggestionWithScoresAndPayloads {
    
    inline def apply(score: Double, suggestion: String): SuggestionWithScoresAndPayloads = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], payload = null)
      __obj.asInstanceOf[SuggestionWithScoresAndPayloads]
    }
    
    extension [Self <: SuggestionWithScoresAndPayloads](x: Self) {
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    }
  }
}
