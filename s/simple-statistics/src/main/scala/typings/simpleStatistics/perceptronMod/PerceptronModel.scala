package typings.simpleStatistics.perceptronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerceptronModel extends js.Object {
  var bias: Double
  var weights: js.Array[Double]
  def predict(features: js.Array[Double]): Double
  def train(features: js.Array[Double], label: Double): PerceptronModel
}

object PerceptronModel {
  @scala.inline
  def apply(
    bias: Double,
    predict: js.Array[Double] => Double,
    train: (js.Array[Double], Double) => PerceptronModel,
    weights: js.Array[Double]
  ): PerceptronModel = {
    val __obj = js.Dynamic.literal(bias = bias.asInstanceOf[js.Any], predict = js.Any.fromFunction1(predict), train = js.Any.fromFunction2(train), weights = weights.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PerceptronModel]
  }
}

