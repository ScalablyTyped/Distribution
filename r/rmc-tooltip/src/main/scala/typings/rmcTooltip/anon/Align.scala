package typings.rmcTooltip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Align extends js.Object {
  var arrowContent: Null = js.native
  var destroyTooltipOnHide: Boolean = js.native
  var placement: String = js.native
  var prefixCls: String = js.native
}

object Align {
  @scala.inline
  def apply(arrowContent: Null, destroyTooltipOnHide: Boolean, placement: String, prefixCls: String): Align = {
    val __obj = js.Dynamic.literal(arrowContent = arrowContent.asInstanceOf[js.Any], destroyTooltipOnHide = destroyTooltipOnHide.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  @scala.inline
  implicit class AlignOps[Self <: Align] (val x: Self) extends AnyVal {
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
    def setArrowContent(value: Null): Self = this.set("arrowContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroyTooltipOnHide(value: Boolean): Self = this.set("destroyTooltipOnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

