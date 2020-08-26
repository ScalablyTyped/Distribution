package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, 'min'> */
@js.native
trait PickImplmin extends js.Object {
  var min: Double = js.native
}

object PickImplmin {
  @scala.inline
  def apply(min: Double): PickImplmin = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmin]
  }
  @scala.inline
  implicit class PickImplminOps[Self <: PickImplmin] (val x: Self) extends AnyVal {
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
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
  }
  
}

