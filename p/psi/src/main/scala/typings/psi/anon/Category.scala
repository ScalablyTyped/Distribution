package typings.psi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  var category: String = js.native
  var distributions: js.Array[Max] = js.native
  var percentile: Double = js.native
}

object Category {
  @scala.inline
  def apply(category: String, distributions: js.Array[Max], percentile: Double): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], percentile = percentile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistributionsVarargs(value: Max*): Self = this.set("distributions", js.Array(value :_*))
    @scala.inline
    def setDistributions(value: js.Array[Max]): Self = this.set("distributions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentile(value: Double): Self = this.set("percentile", value.asInstanceOf[js.Any])
  }
  
}

