package typings.rotDashJs.libMapFeaturesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureConstructor extends js.Object {
  def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: FeatureOptions): Feature
}

object FeatureConstructor {
  @scala.inline
  def apply(createRandomAt: (Double, Double, Double, Double, FeatureOptions) => Feature): FeatureConstructor = {
    val __obj = js.Dynamic.literal(createRandomAt = js.Any.fromFunction5(createRandomAt))
  
    __obj.asInstanceOf[FeatureConstructor]
  }
}

