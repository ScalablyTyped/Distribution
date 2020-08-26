package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, 'total'> */
@js.native
trait PickImpltotalTotal extends js.Object {
  var total: String = js.native
}

object PickImpltotalTotal {
  @scala.inline
  def apply(total: String): PickImpltotalTotal = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltotalTotal]
  }
  @scala.inline
  implicit class PickImpltotalTotalOps[Self <: PickImpltotalTotal] (val x: Self) extends AnyVal {
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
    def setTotal(value: String): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

