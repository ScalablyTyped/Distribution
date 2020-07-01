package typings.sentiment.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalysisResult extends js.Object {
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
}

