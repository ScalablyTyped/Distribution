package typings.redisSearch

import typings.redisSearch.distCommandsSuggetMod.SugGetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsSuggetWITHPAYLOADSMod {
  
  @JSImport("@redis/search/dist/commands/SUGGET_WITHPAYLOADS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/SUGGET_WITHPAYLOADS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String, prefix: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, prefix: String, options: SugGetOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): js.Array[SuggestionWithPayload] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[SuggestionWithPayload] | Null]
  inline def transformReply(rawReply: js.Array[String | Null]): js.Array[SuggestionWithPayload] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[js.Array[SuggestionWithPayload] | Null]
  
  trait SuggestionWithPayload extends StObject {
    
    var payload: String | Null
    
    var suggestion: String
  }
  object SuggestionWithPayload {
    
    inline def apply(suggestion: String): SuggestionWithPayload = {
      val __obj = js.Dynamic.literal(suggestion = suggestion.asInstanceOf[js.Any], payload = null)
      __obj.asInstanceOf[SuggestionWithPayload]
    }
    
    extension [Self <: SuggestionWithPayload](x: Self) {
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadNull: Self = StObject.set(x, "payload", null)
      
      inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    }
  }
}
