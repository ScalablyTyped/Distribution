package typings.redisSearch

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.anon.FIELDS
import typings.redisSearch.anon.From
import typings.redisSearch.anon.TAGS
import typings.redisSearch.distCommandsMod.Params
import typings.redisSearch.distCommandsMod.RedisSearchLanguages
import typings.redisSearch.distCommandsMod.SearchReply
import typings.redisSearch.distCommandsMod.SortByProperty
import typings.redisSearch.redisSearchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsSearchMod {
  
  @JSImport("@redis/search/dist/commands/SEARCH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/SEARCH", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/search/dist/commands/SEARCH", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(index: String, query: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(index: String, query: String, options: SearchOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: SearchRawReply): SearchReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[SearchReply]
  
  trait SearchOptions extends StObject {
    
    var DIALECT: js.UndefOr[Double] = js.undefined
    
    var EXPANDER: js.UndefOr[String] = js.undefined
    
    var HIGHLIGHT: js.UndefOr[`true` | TAGS] = js.undefined
    
    var INFIELDS: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var INKEYS: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var INORDER: js.UndefOr[`true`] = js.undefined
    
    var LANGUAGE: js.UndefOr[RedisSearchLanguages] = js.undefined
    
    var LIMIT: js.UndefOr[From] = js.undefined
    
    var NOSTOPWORDS: js.UndefOr[`true`] = js.undefined
    
    var PARAMS: js.UndefOr[Params] = js.undefined
    
    var RETURN: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var SCORER: js.UndefOr[String] = js.undefined
    
    var SLOP: js.UndefOr[Double] = js.undefined
    
    var SORTBY: js.UndefOr[SortByProperty] = js.undefined
    
    var SUMMARIZE: js.UndefOr[`true` | FIELDS] = js.undefined
    
    var VERBATIM: js.UndefOr[`true`] = js.undefined
    
    var WITHSORTKEYS: js.UndefOr[`true`] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      inline def setDIALECT(value: Double): Self = StObject.set(x, "DIALECT", value.asInstanceOf[js.Any])
      
      inline def setDIALECTUndefined: Self = StObject.set(x, "DIALECT", js.undefined)
      
      inline def setEXPANDER(value: String): Self = StObject.set(x, "EXPANDER", value.asInstanceOf[js.Any])
      
      inline def setEXPANDERUndefined: Self = StObject.set(x, "EXPANDER", js.undefined)
      
      inline def setHIGHLIGHT(value: `true` | TAGS): Self = StObject.set(x, "HIGHLIGHT", value.asInstanceOf[js.Any])
      
      inline def setHIGHLIGHTUndefined: Self = StObject.set(x, "HIGHLIGHT", js.undefined)
      
      inline def setINFIELDS(value: String | js.Array[String]): Self = StObject.set(x, "INFIELDS", value.asInstanceOf[js.Any])
      
      inline def setINFIELDSUndefined: Self = StObject.set(x, "INFIELDS", js.undefined)
      
      inline def setINFIELDSVarargs(value: String*): Self = StObject.set(x, "INFIELDS", js.Array(value*))
      
      inline def setINKEYS(value: String | js.Array[String]): Self = StObject.set(x, "INKEYS", value.asInstanceOf[js.Any])
      
      inline def setINKEYSUndefined: Self = StObject.set(x, "INKEYS", js.undefined)
      
      inline def setINKEYSVarargs(value: String*): Self = StObject.set(x, "INKEYS", js.Array(value*))
      
      inline def setINORDER(value: `true`): Self = StObject.set(x, "INORDER", value.asInstanceOf[js.Any])
      
      inline def setINORDERUndefined: Self = StObject.set(x, "INORDER", js.undefined)
      
      inline def setLANGUAGE(value: RedisSearchLanguages): Self = StObject.set(x, "LANGUAGE", value.asInstanceOf[js.Any])
      
      inline def setLANGUAGEUndefined: Self = StObject.set(x, "LANGUAGE", js.undefined)
      
      inline def setLIMIT(value: From): Self = StObject.set(x, "LIMIT", value.asInstanceOf[js.Any])
      
      inline def setLIMITUndefined: Self = StObject.set(x, "LIMIT", js.undefined)
      
      inline def setNOSTOPWORDS(value: `true`): Self = StObject.set(x, "NOSTOPWORDS", value.asInstanceOf[js.Any])
      
      inline def setNOSTOPWORDSUndefined: Self = StObject.set(x, "NOSTOPWORDS", js.undefined)
      
      inline def setPARAMS(value: Params): Self = StObject.set(x, "PARAMS", value.asInstanceOf[js.Any])
      
      inline def setPARAMSUndefined: Self = StObject.set(x, "PARAMS", js.undefined)
      
      inline def setRETURN(value: String | js.Array[String]): Self = StObject.set(x, "RETURN", value.asInstanceOf[js.Any])
      
      inline def setRETURNUndefined: Self = StObject.set(x, "RETURN", js.undefined)
      
      inline def setRETURNVarargs(value: String*): Self = StObject.set(x, "RETURN", js.Array(value*))
      
      inline def setSCORER(value: String): Self = StObject.set(x, "SCORER", value.asInstanceOf[js.Any])
      
      inline def setSCORERUndefined: Self = StObject.set(x, "SCORER", js.undefined)
      
      inline def setSLOP(value: Double): Self = StObject.set(x, "SLOP", value.asInstanceOf[js.Any])
      
      inline def setSLOPUndefined: Self = StObject.set(x, "SLOP", js.undefined)
      
      inline def setSORTBY(value: SortByProperty): Self = StObject.set(x, "SORTBY", value.asInstanceOf[js.Any])
      
      inline def setSORTBYUndefined: Self = StObject.set(x, "SORTBY", js.undefined)
      
      inline def setSUMMARIZE(value: `true` | FIELDS): Self = StObject.set(x, "SUMMARIZE", value.asInstanceOf[js.Any])
      
      inline def setSUMMARIZEUndefined: Self = StObject.set(x, "SUMMARIZE", js.undefined)
      
      inline def setVERBATIM(value: `true`): Self = StObject.set(x, "VERBATIM", value.asInstanceOf[js.Any])
      
      inline def setVERBATIMUndefined: Self = StObject.set(x, "VERBATIM", js.undefined)
      
      inline def setWITHSORTKEYS(value: `true`): Self = StObject.set(x, "WITHSORTKEYS", value.asInstanceOf[js.Any])
      
      inline def setWITHSORTKEYSUndefined: Self = StObject.set(x, "WITHSORTKEYS", js.undefined)
    }
  }
  
  type SearchRawReply = js.Array[Any]
}
