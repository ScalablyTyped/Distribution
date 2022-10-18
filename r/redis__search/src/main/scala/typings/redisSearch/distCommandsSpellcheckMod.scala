package typings.redisSearch

import typings.redisSearch.anon.Suggestions
import typings.redisSearch.redisSearchStrings.EXCLUDE
import typings.redisSearch.redisSearchStrings.INCLUDE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsSpellcheckMod {
  
  @JSImport("@redis/search/dist/commands/SPELLCHECK", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(index: String, query: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(index: String, query: String, options: SpellCheckOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(rawReply: SpellCheckRawReply): SpellCheckReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[SpellCheckReply]
  
  trait SpellCheckOptions extends StObject {
    
    var DIALECT: js.UndefOr[Double] = js.undefined
    
    var DISTANCE: js.UndefOr[Double] = js.undefined
    
    var TERMS: js.UndefOr[SpellCheckTerms | js.Array[SpellCheckTerms]] = js.undefined
  }
  object SpellCheckOptions {
    
    inline def apply(): SpellCheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpellCheckOptions]
    }
    
    extension [Self <: SpellCheckOptions](x: Self) {
      
      inline def setDIALECT(value: Double): Self = StObject.set(x, "DIALECT", value.asInstanceOf[js.Any])
      
      inline def setDIALECTUndefined: Self = StObject.set(x, "DIALECT", js.undefined)
      
      inline def setDISTANCE(value: Double): Self = StObject.set(x, "DISTANCE", value.asInstanceOf[js.Any])
      
      inline def setDISTANCEUndefined: Self = StObject.set(x, "DISTANCE", js.undefined)
      
      inline def setTERMS(value: SpellCheckTerms | js.Array[SpellCheckTerms]): Self = StObject.set(x, "TERMS", value.asInstanceOf[js.Any])
      
      inline def setTERMSUndefined: Self = StObject.set(x, "TERMS", js.undefined)
      
      inline def setTERMSVarargs(value: SpellCheckTerms*): Self = StObject.set(x, "TERMS", js.Array(value*))
    }
  }
  
  type SpellCheckRawReply = js.Array[
    js.Tuple3[
      /* _ */ String, 
      /* term */ String, 
      /* suggestions */ js.Array[js.Tuple2[/* score */ String, /* suggestion */ String]]
    ]
  ]
  
  type SpellCheckReply = js.Array[Suggestions]
  
  trait SpellCheckTerms extends StObject {
    
    var dictionary: String
    
    var mode: INCLUDE | EXCLUDE
  }
  object SpellCheckTerms {
    
    inline def apply(dictionary: String, mode: INCLUDE | EXCLUDE): SpellCheckTerms = {
      val __obj = js.Dynamic.literal(dictionary = dictionary.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpellCheckTerms]
    }
    
    extension [Self <: SpellCheckTerms](x: Self) {
      
      inline def setDictionary(value: String): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      inline def setMode(value: INCLUDE | EXCLUDE): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
