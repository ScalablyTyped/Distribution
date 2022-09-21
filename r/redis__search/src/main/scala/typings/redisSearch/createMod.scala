package typings.redisSearch

import typings.redisSearch.commandsMod.PropertyName
import typings.redisSearch.commandsMod.RediSearchSchema
import typings.redisSearch.commandsMod.RedisSearchLanguages
import typings.redisSearch.redisSearchBooleans.`true`
import typings.redisSearch.redisSearchStrings.HASH
import typings.redisSearch.redisSearchStrings.JSON
import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMod {
  
  @JSImport("@redis/search/dist/commands/CREATE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(index: String, schema: RediSearchSchema): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(index: String, schema: RediSearchSchema, options: CreateOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait CreateOptions extends StObject {
    
    var FILTER: js.UndefOr[String] = js.undefined
    
    var LANGUAGE: js.UndefOr[RedisSearchLanguages] = js.undefined
    
    var LANGUAGE_FIELD: js.UndefOr[PropertyName] = js.undefined
    
    var MAXTEXTFIELDS: js.UndefOr[`true`] = js.undefined
    
    var NOFIELDS: js.UndefOr[`true`] = js.undefined
    
    var NOFREQS: js.UndefOr[`true`] = js.undefined
    
    var NOHL: js.UndefOr[`true`] = js.undefined
    
    var NOOFFSETS: js.UndefOr[`true`] = js.undefined
    
    var ON: js.UndefOr[HASH | JSON] = js.undefined
    
    var PREFIX: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var SCORE: js.UndefOr[Double] = js.undefined
    
    var SCORE_FIELD: js.UndefOr[PropertyName] = js.undefined
    
    var SKIPINITIALSCAN: js.UndefOr[`true`] = js.undefined
    
    var STOPWORDS: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var TEMPORARY: js.UndefOr[Double] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    extension [Self <: CreateOptions](x: Self) {
      
      inline def setFILTER(value: String): Self = StObject.set(x, "FILTER", value.asInstanceOf[js.Any])
      
      inline def setFILTERUndefined: Self = StObject.set(x, "FILTER", js.undefined)
      
      inline def setLANGUAGE(value: RedisSearchLanguages): Self = StObject.set(x, "LANGUAGE", value.asInstanceOf[js.Any])
      
      inline def setLANGUAGEUndefined: Self = StObject.set(x, "LANGUAGE", js.undefined)
      
      inline def setLANGUAGE_FIELD(value: PropertyName): Self = StObject.set(x, "LANGUAGE_FIELD", value.asInstanceOf[js.Any])
      
      inline def setLANGUAGE_FIELDUndefined: Self = StObject.set(x, "LANGUAGE_FIELD", js.undefined)
      
      inline def setMAXTEXTFIELDS(value: `true`): Self = StObject.set(x, "MAXTEXTFIELDS", value.asInstanceOf[js.Any])
      
      inline def setMAXTEXTFIELDSUndefined: Self = StObject.set(x, "MAXTEXTFIELDS", js.undefined)
      
      inline def setNOFIELDS(value: `true`): Self = StObject.set(x, "NOFIELDS", value.asInstanceOf[js.Any])
      
      inline def setNOFIELDSUndefined: Self = StObject.set(x, "NOFIELDS", js.undefined)
      
      inline def setNOFREQS(value: `true`): Self = StObject.set(x, "NOFREQS", value.asInstanceOf[js.Any])
      
      inline def setNOFREQSUndefined: Self = StObject.set(x, "NOFREQS", js.undefined)
      
      inline def setNOHL(value: `true`): Self = StObject.set(x, "NOHL", value.asInstanceOf[js.Any])
      
      inline def setNOHLUndefined: Self = StObject.set(x, "NOHL", js.undefined)
      
      inline def setNOOFFSETS(value: `true`): Self = StObject.set(x, "NOOFFSETS", value.asInstanceOf[js.Any])
      
      inline def setNOOFFSETSUndefined: Self = StObject.set(x, "NOOFFSETS", js.undefined)
      
      inline def setON(value: HASH | JSON): Self = StObject.set(x, "ON", value.asInstanceOf[js.Any])
      
      inline def setONUndefined: Self = StObject.set(x, "ON", js.undefined)
      
      inline def setPREFIX(value: String | js.Array[String]): Self = StObject.set(x, "PREFIX", value.asInstanceOf[js.Any])
      
      inline def setPREFIXUndefined: Self = StObject.set(x, "PREFIX", js.undefined)
      
      inline def setPREFIXVarargs(value: String*): Self = StObject.set(x, "PREFIX", js.Array(value*))
      
      inline def setSCORE(value: Double): Self = StObject.set(x, "SCORE", value.asInstanceOf[js.Any])
      
      inline def setSCOREUndefined: Self = StObject.set(x, "SCORE", js.undefined)
      
      inline def setSCORE_FIELD(value: PropertyName): Self = StObject.set(x, "SCORE_FIELD", value.asInstanceOf[js.Any])
      
      inline def setSCORE_FIELDUndefined: Self = StObject.set(x, "SCORE_FIELD", js.undefined)
      
      inline def setSKIPINITIALSCAN(value: `true`): Self = StObject.set(x, "SKIPINITIALSCAN", value.asInstanceOf[js.Any])
      
      inline def setSKIPINITIALSCANUndefined: Self = StObject.set(x, "SKIPINITIALSCAN", js.undefined)
      
      inline def setSTOPWORDS(value: String | js.Array[String]): Self = StObject.set(x, "STOPWORDS", value.asInstanceOf[js.Any])
      
      inline def setSTOPWORDSUndefined: Self = StObject.set(x, "STOPWORDS", js.undefined)
      
      inline def setSTOPWORDSVarargs(value: String*): Self = StObject.set(x, "STOPWORDS", js.Array(value*))
      
      inline def setTEMPORARY(value: Double): Self = StObject.set(x, "TEMPORARY", value.asInstanceOf[js.Any])
      
      inline def setTEMPORARYUndefined: Self = StObject.set(x, "TEMPORARY", js.undefined)
    }
  }
}
