package typings.sqlFormatter

import typings.sqlFormatter.tokenMod.Token
import typings.sqlFormatter.tokenizerOptionsMod.ParamTypes
import typings.sqlFormatter.tokenizerOptionsMod.TokenizerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizerMod {
  
  @JSImport("sql-formatter/lib/src/lexer/Tokenizer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Tokenizer {
    def this(cfg: TokenizerOptions) = this()
    
    /* private */ /* CompleteClass */
    var buildParamRules: Any = js.native
    
    /* private */ /* CompleteClass */
    var buildRulesAfterParams: Any = js.native
    
    /* private */ /* CompleteClass */
    var buildRulesBeforeParams: Any = js.native
    
    /* private */ /* CompleteClass */
    var cfg: Any = js.native
    
    /* private */ /* CompleteClass */
    var rulesAfterParams: Any = js.native
    
    /* private */ /* CompleteClass */
    var rulesBeforeParams: Any = js.native
    
    /* CompleteClass */
    override def tokenize(input: String, paramTypesOverrides: ParamTypes): js.Array[Token] = js.native
    
    /* private */ /* CompleteClass */
    var validRules: Any = js.native
  }
  
  trait Tokenizer extends StObject {
    
    /* private */ var buildParamRules: Any
    
    /* private */ var buildRulesAfterParams: Any
    
    /* private */ var buildRulesBeforeParams: Any
    
    /* private */ var cfg: Any
    
    /* private */ var rulesAfterParams: Any
    
    /* private */ var rulesBeforeParams: Any
    
    def tokenize(input: String, paramTypesOverrides: ParamTypes): js.Array[Token]
    
    /* private */ var validRules: Any
  }
  object Tokenizer {
    
    inline def apply(
      buildParamRules: Any,
      buildRulesAfterParams: Any,
      buildRulesBeforeParams: Any,
      cfg: Any,
      rulesAfterParams: Any,
      rulesBeforeParams: Any,
      tokenize: (String, ParamTypes) => js.Array[Token],
      validRules: Any
    ): Tokenizer = {
      val __obj = js.Dynamic.literal(buildParamRules = buildParamRules.asInstanceOf[js.Any], buildRulesAfterParams = buildRulesAfterParams.asInstanceOf[js.Any], buildRulesBeforeParams = buildRulesBeforeParams.asInstanceOf[js.Any], cfg = cfg.asInstanceOf[js.Any], rulesAfterParams = rulesAfterParams.asInstanceOf[js.Any], rulesBeforeParams = rulesBeforeParams.asInstanceOf[js.Any], tokenize = js.Any.fromFunction2(tokenize), validRules = validRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tokenizer]
    }
    
    extension [Self <: Tokenizer](x: Self) {
      
      inline def setBuildParamRules(value: Any): Self = StObject.set(x, "buildParamRules", value.asInstanceOf[js.Any])
      
      inline def setBuildRulesAfterParams(value: Any): Self = StObject.set(x, "buildRulesAfterParams", value.asInstanceOf[js.Any])
      
      inline def setBuildRulesBeforeParams(value: Any): Self = StObject.set(x, "buildRulesBeforeParams", value.asInstanceOf[js.Any])
      
      inline def setCfg(value: Any): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setRulesAfterParams(value: Any): Self = StObject.set(x, "rulesAfterParams", value.asInstanceOf[js.Any])
      
      inline def setRulesBeforeParams(value: Any): Self = StObject.set(x, "rulesBeforeParams", value.asInstanceOf[js.Any])
      
      inline def setTokenize(value: (String, ParamTypes) => js.Array[Token]): Self = StObject.set(x, "tokenize", js.Any.fromFunction2(value))
      
      inline def setValidRules(value: Any): Self = StObject.set(x, "validRules", value.asInstanceOf[js.Any])
    }
  }
}
