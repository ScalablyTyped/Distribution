package typings.simpleStatistics.bayesianClassifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://simplestatistics.org/docs/#bayesianclassifier
  */
trait BayesianClassifier extends js.Object {
  var data: Data
  var totalCount: Double
  def score(item: Item): OddsSums
  def train(item: Item, category: String): Unit
}

object BayesianClassifier {
  @scala.inline
  def apply(data: Data, score: Item => OddsSums, totalCount: Double, train: (Item, String) => Unit): BayesianClassifier = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], score = js.Any.fromFunction1(score), totalCount = totalCount.asInstanceOf[js.Any], train = js.Any.fromFunction2(train))
  
    __obj.asInstanceOf[BayesianClassifier]
  }
}

