package typings.sentiment

import org.scalablytyped.runtime.StringDictionary
import typings.sentiment.anon.Apply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sentiment", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Sentiment {
    def this(options: SentimentOptions) = this()
  }
  
  trait AnalysisOptions extends StObject {
    
    var extras: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
  }
  object AnalysisOptions {
    
    @scala.inline
    def apply(): AnalysisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalysisOptions]
    }
    
    @scala.inline
    implicit class AnalysisOptionsMutableBuilder[Self <: AnalysisOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtras(value: StringDictionary[Double]): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  trait AnalysisResult extends StObject {
    
    var calculation: js.Array[StringDictionary[Double]]
    
    var comparative: Double
    
    var negative: js.Array[String]
    
    var positive: js.Array[String]
    
    var score: Double
    
    var tokens: js.Array[String]
    
    var words: js.Array[String]
  }
  object AnalysisResult {
    
    @scala.inline
    def apply(
      calculation: js.Array[StringDictionary[Double]],
      comparative: Double,
      negative: js.Array[String],
      positive: js.Array[String],
      score: Double,
      tokens: js.Array[String],
      words: js.Array[String]
    ): AnalysisResult = {
      val __obj = js.Dynamic.literal(calculation = calculation.asInstanceOf[js.Any], comparative = comparative.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalysisResult]
    }
    
    @scala.inline
    implicit class AnalysisResultMutableBuilder[Self <: AnalysisResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculation(value: js.Array[StringDictionary[Double]]): Self = StObject.set(x, "calculation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalculationVarargs(value: StringDictionary[Double]*): Self = StObject.set(x, "calculation", js.Array(value :_*))
      
      @scala.inline
      def setComparative(value: Double): Self = StObject.set(x, "comparative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegative(value: js.Array[String]): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeVarargs(value: String*): Self = StObject.set(x, "negative", js.Array(value :_*))
      
      @scala.inline
      def setPositive(value: js.Array[String]): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveVarargs(value: String*): Self = StObject.set(x, "positive", js.Array(value :_*))
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: js.Array[String]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensVarargs(value: String*): Self = StObject.set(x, "tokens", js.Array(value :_*))
      
      @scala.inline
      def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
  
  trait LanguageModule extends StObject {
    
    var labels: StringDictionary[Double]
    
    var scoringStrategy: js.UndefOr[Apply] = js.undefined
  }
  object LanguageModule {
    
    @scala.inline
    def apply(labels: StringDictionary[Double]): LanguageModule = {
      val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageModule]
    }
    
    @scala.inline
    implicit class LanguageModuleMutableBuilder[Self <: LanguageModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabels(value: StringDictionary[Double]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoringStrategy(value: Apply): Self = StObject.set(x, "scoringStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoringStrategyUndefined: Self = StObject.set(x, "scoringStrategy", js.undefined)
    }
  }
  
  @js.native
  trait Sentiment extends StObject {
    
    def analyze(phrase: String): AnalysisResult = js.native
    def analyze(
      phrase: String,
      options: Unit,
      callback: js.Function2[/* err */ String, /* result */ AnalysisResult, Unit]
    ): AnalysisResult = js.native
    def analyze(phrase: String, options: AnalysisOptions): AnalysisResult = js.native
    def analyze(
      phrase: String,
      options: AnalysisOptions,
      callback: js.Function2[/* err */ String, /* result */ AnalysisResult, Unit]
    ): AnalysisResult = js.native
    
    def registerLanguage(languageCode: String, language: LanguageModule): Unit = js.native
  }
  
  // No options supported currently
  // tslint:disable-next-line no-empty-interface
  trait SentimentOptions extends StObject
}
