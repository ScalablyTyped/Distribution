package typings.reactSelect.containersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicatorsState extends js.Object {
  /** Whether the text should be rendered right to left. */
  var isRtl: Boolean = js.native
}

object IndicatorsState {
  @scala.inline
  def apply(isRtl: Boolean): IndicatorsState = {
    val __obj = js.Dynamic.literal(isRtl = isRtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicatorsState]
  }
  @scala.inline
  implicit class IndicatorsStateOps[Self <: IndicatorsState] (val x: Self) extends AnyVal {
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
    def setIsRtl(value: Boolean): Self = this.set("isRtl", value.asInstanceOf[js.Any])
  }
  
}

