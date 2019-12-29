package typings.simpleDashStatistics.srcPerceptronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-statistics/src/perceptron", JSImport.Default)
@js.native
class default () extends PerceptronModel {
  /* CompleteClass */
  override var bias: Double = js.native
  /* CompleteClass */
  override var weights: js.Array[Double] = js.native
  /* CompleteClass */
  override def predict(features: js.Array[Double]): Double = js.native
  /* CompleteClass */
  override def train(features: js.Array[Double], label: Double): PerceptronModel = js.native
}

