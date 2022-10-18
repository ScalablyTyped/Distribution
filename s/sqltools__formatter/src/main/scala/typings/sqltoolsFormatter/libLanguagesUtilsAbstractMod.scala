package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.libCoreTypesMod.Config
import typings.sqltoolsFormatter.libCoreTypesMod.Token
import typings.sqltoolsFormatter.libCoreTypesMod.TokenizerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguagesUtilsAbstractMod {
  
  /* note: abstract class */ @JSImport("@sqltools/formatter/lib/languages/utils/abstract", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AbstractFormatter {
    def this(cfg: Config) = this()
    
    /* CompleteClass */
    var cfg: Config = js.native
    
    /* CompleteClass */
    override def format(query: String): String = js.native
    
    /* CompleteClass */
    override def getTokenizerConfig(): TokenizerConfig = js.native
    
    /* CompleteClass */
    override def tokenize(query: String): js.Array[Token] = js.native
    
    /* CompleteClass */
    override def tokenizer(): typings.sqltoolsFormatter.libCoreTokenizerMod.default = js.native
  }
  
  trait AbstractFormatter extends StObject {
    
    var cfg: Config
    
    def format(query: String): String
    
    def getTokenizerConfig(): TokenizerConfig
    
    /* protected */ var tokenOverride: js.UndefOr[js.Function2[/* token */ Token, /* previousToken */ js.UndefOr[Token], Token]] = js.undefined
    
    def tokenize(query: String): js.Array[Token]
    
    def tokenizer(): typings.sqltoolsFormatter.libCoreTokenizerMod.default
  }
  object AbstractFormatter {
    
    inline def apply(
      cfg: Config,
      format: String => String,
      getTokenizerConfig: () => TokenizerConfig,
      tokenize: String => js.Array[Token],
      tokenizer: () => typings.sqltoolsFormatter.libCoreTokenizerMod.default
    ): AbstractFormatter = {
      val __obj = js.Dynamic.literal(cfg = cfg.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), getTokenizerConfig = js.Any.fromFunction0(getTokenizerConfig), tokenize = js.Any.fromFunction1(tokenize), tokenizer = js.Any.fromFunction0(tokenizer))
      __obj.asInstanceOf[AbstractFormatter]
    }
    
    extension [Self <: AbstractFormatter](x: Self) {
      
      inline def setCfg(value: Config): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setGetTokenizerConfig(value: () => TokenizerConfig): Self = StObject.set(x, "getTokenizerConfig", js.Any.fromFunction0(value))
      
      inline def setTokenOverride(value: (/* token */ Token, /* previousToken */ js.UndefOr[Token]) => Token): Self = StObject.set(x, "tokenOverride", js.Any.fromFunction2(value))
      
      inline def setTokenOverrideUndefined: Self = StObject.set(x, "tokenOverride", js.undefined)
      
      inline def setTokenize(value: String => js.Array[Token]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
      
      inline def setTokenizer(value: () => typings.sqltoolsFormatter.libCoreTokenizerMod.default): Self = StObject.set(x, "tokenizer", js.Any.fromFunction0(value))
    }
  }
}
