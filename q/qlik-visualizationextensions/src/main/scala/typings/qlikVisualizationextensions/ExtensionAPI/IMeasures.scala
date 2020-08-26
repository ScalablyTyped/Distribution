package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.measures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMeasures extends js.Object {
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var uses: measures = js.native
}

object IMeasures {
  @scala.inline
  def apply(uses: measures): IMeasures = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeasures]
  }
  @scala.inline
  implicit class IMeasuresOps[Self <: IMeasures] (val x: Self) extends AnyVal {
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
    def setUses(value: measures): Self = this.set("uses", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

