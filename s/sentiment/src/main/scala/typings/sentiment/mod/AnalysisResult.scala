package typings.sentiment.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisResult extends js.Object {
  
  var calculation: js.Array[StringDictionary[Double]] = js.native
  
  var comparative: Double = js.native
  
  var negative: js.Array[String] = js.native
  
  var positive: js.Array[String] = js.native
  
  var score: Double = js.native
  
  var tokens: js.Array[String] = js.native
  
  var words: js.Array[String] = js.native
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
  implicit class AnalysisResultOps[Self <: AnalysisResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculationVarargs(value: StringDictionary[Double]*): Self = this.set("calculation", js.Array(value :_*))
    
    @scala.inline
    def setCalculation(value: js.Array[StringDictionary[Double]]): Self = this.set("calculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparative(value: Double): Self = this.set("comparative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeVarargs(value: String*): Self = this.set("negative", js.Array(value :_*))
    
    @scala.inline
    def setNegative(value: js.Array[String]): Self = this.set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveVarargs(value: String*): Self = this.set("positive", js.Array(value :_*))
    
    @scala.inline
    def setPositive(value: js.Array[String]): Self = this.set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: String*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[String]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsVarargs(value: String*): Self = this.set("words", js.Array(value :_*))
    
    @scala.inline
    def setWords(value: js.Array[String]): Self = this.set("words", value.asInstanceOf[js.Any])
  }
}
