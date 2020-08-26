package typings.rotJs.featuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureConstructor extends js.Object {
  def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: FeatureOptions): Feature = js.native
}

object FeatureConstructor {
  @scala.inline
  def apply(createRandomAt: (Double, Double, Double, Double, FeatureOptions) => Feature): FeatureConstructor = {
    val __obj = js.Dynamic.literal(createRandomAt = js.Any.fromFunction5(createRandomAt))
    __obj.asInstanceOf[FeatureConstructor]
  }
  @scala.inline
  implicit class FeatureConstructorOps[Self <: FeatureConstructor] (val x: Self) extends AnyVal {
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
    def setCreateRandomAt(value: (Double, Double, Double, Double, FeatureOptions) => Feature): Self = this.set("createRandomAt", js.Any.fromFunction5(value))
  }
  
}

