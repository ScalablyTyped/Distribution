package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizationPipelineStages extends StObject {
  
  def LOWCASE(args: SplitTokenizerArgs): js.Promise[SplitTokenizerArgs]
  @JSName("LOWCASE")
  var LOWCASE_Original: TokenizerStage
  
  def NGRAMS(args: SplitTokenizerArgs): js.Promise[SplitTokenizerArgs]
  @JSName("NGRAMS")
  var NGRAMS_Original: TokenizerStage
  
  def REPLACE(args: SplitTokenizerArgs): js.Promise[SplitTokenizerArgs]
  @JSName("REPLACE")
  var REPLACE_Original: TokenizerStage
  
  def SCORE_TERM_FREQUENCY(args: SplitTokenizerArgs): js.Promise[SplitTokenizerArgs]
  @JSName("SCORE_TERM_FREQUENCY")
  var SCORE_TERM_FREQUENCY_Original: TokenizerStage
  
  def SKIP(args: SplitTokenizerArgs): js.Promise[SplitTokenizerArgs]
  @JSName("SKIP")
  var SKIP_Original: TokenizerStage
  
  def SPLIT(args: TokenizerArgs): js.Promise[SplitTokenizerArgs]
  @JSName("SPLIT")
  var SPLIT_Original: SplitTokenizerStage
  
  def STOPWORDS(args: SplitTokenizerArgs): js.Promise[SplitTokenizerArgs]
  @JSName("STOPWORDS")
  var STOPWORDS_Original: TokenizerStage
}
object TokenizationPipelineStages {
  
  inline def apply(
    LOWCASE: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs],
    NGRAMS: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs],
    REPLACE: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs],
    SCORE_TERM_FREQUENCY: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs],
    SKIP: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs],
    SPLIT: /* args */ TokenizerArgs => js.Promise[SplitTokenizerArgs],
    STOPWORDS: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs]
  ): TokenizationPipelineStages = {
    val __obj = js.Dynamic.literal(LOWCASE = js.Any.fromFunction1(LOWCASE), NGRAMS = js.Any.fromFunction1(NGRAMS), REPLACE = js.Any.fromFunction1(REPLACE), SCORE_TERM_FREQUENCY = js.Any.fromFunction1(SCORE_TERM_FREQUENCY), SKIP = js.Any.fromFunction1(SKIP), SPLIT = js.Any.fromFunction1(SPLIT), STOPWORDS = js.Any.fromFunction1(STOPWORDS))
    __obj.asInstanceOf[TokenizationPipelineStages]
  }
  
  extension [Self <: TokenizationPipelineStages](x: Self) {
    
    inline def setLOWCASE(value: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs]): Self = StObject.set(x, "LOWCASE", js.Any.fromFunction1(value))
    
    inline def setNGRAMS(value: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs]): Self = StObject.set(x, "NGRAMS", js.Any.fromFunction1(value))
    
    inline def setREPLACE(value: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs]): Self = StObject.set(x, "REPLACE", js.Any.fromFunction1(value))
    
    inline def setSCORE_TERM_FREQUENCY(value: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs]): Self = StObject.set(x, "SCORE_TERM_FREQUENCY", js.Any.fromFunction1(value))
    
    inline def setSKIP(value: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs]): Self = StObject.set(x, "SKIP", js.Any.fromFunction1(value))
    
    inline def setSPLIT(value: /* args */ TokenizerArgs => js.Promise[SplitTokenizerArgs]): Self = StObject.set(x, "SPLIT", js.Any.fromFunction1(value))
    
    inline def setSTOPWORDS(value: /* args */ SplitTokenizerArgs => js.Promise[SplitTokenizerArgs]): Self = StObject.set(x, "STOPWORDS", js.Any.fromFunction1(value))
  }
}
