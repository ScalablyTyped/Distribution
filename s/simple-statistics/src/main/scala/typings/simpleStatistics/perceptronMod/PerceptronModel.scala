package typings.simpleStatistics.perceptronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerceptronModel extends js.Object {
  var bias: Double = js.native
  var weights: js.Array[Double] = js.native
  def predict(features: js.Array[Double]): Double = js.native
  def train(features: js.Array[Double], label: Double): PerceptronModel = js.native
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
  @scala.inline
  implicit class PerceptronModelOps[Self <: PerceptronModel] (val x: Self) extends AnyVal {
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
    def setBias(value: Double): Self = this.set("bias", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredict(value: js.Array[Double] => Double): Self = this.set("predict", js.Any.fromFunction1(value))
    @scala.inline
    def setTrain(value: (js.Array[Double], Double) => PerceptronModel): Self = this.set("train", js.Any.fromFunction2(value))
    @scala.inline
    def setWeightsVarargs(value: Double*): Self = this.set("weights", js.Array(value :_*))
    @scala.inline
    def setWeights(value: js.Array[Double]): Self = this.set("weights", value.asInstanceOf[js.Any])
  }
  
}

