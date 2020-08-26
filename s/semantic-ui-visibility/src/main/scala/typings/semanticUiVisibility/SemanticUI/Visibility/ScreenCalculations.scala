package typings.semanticUiVisibility.SemanticUI.Visibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenCalculations extends js.Object {
  var bottom: Double = js.native
  var top: Double = js.native
}

object ScreenCalculations {
  @scala.inline
  def apply(bottom: Double, top: Double): ScreenCalculations = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenCalculations]
  }
  @scala.inline
  implicit class ScreenCalculationsOps[Self <: ScreenCalculations] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

