package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'total'> */
@js.native
trait PickImpltotal extends js.Object {
  var total: `false` | Double = js.native
}

object PickImpltotal {
  @scala.inline
  def apply(total: `false` | Double): PickImpltotal = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltotal]
  }
  @scala.inline
  implicit class PickImpltotalOps[Self <: PickImpltotal] (val x: Self) extends AnyVal {
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
    def setTotal(value: `false` | Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

