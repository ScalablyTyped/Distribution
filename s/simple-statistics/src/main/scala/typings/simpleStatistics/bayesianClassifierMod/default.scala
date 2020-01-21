package typings.simpleStatistics.bayesianClassifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://simplestatistics.org/docs/#bayesianclassifier
  */
@JSImport("simple-statistics/src/bayesian_classifier", JSImport.Default)
@js.native
class default () extends BayesianClassifier {
  /* CompleteClass */
  override var data: Data = js.native
  /* CompleteClass */
  override var totalCount: Double = js.native
  /* CompleteClass */
  override def score(item: Item): OddsSums = js.native
  /* CompleteClass */
  override def train(item: Item, category: String): Unit = js.native
}

