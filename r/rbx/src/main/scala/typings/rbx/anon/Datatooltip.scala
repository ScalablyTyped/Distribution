package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datatooltip extends js.Object {
  var className: js.UndefOr[String] = js.native
  var `data-badge`: js.UndefOr[String | Double] = js.native
  var `data-tooltip`: js.UndefOr[String | Double] = js.native
}

object Datatooltip {
  @scala.inline
  def apply(): Datatooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datatooltip]
  }
  @scala.inline
  implicit class DatatooltipOps[Self <: Datatooltip] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def `setData-badge`(value: String | Double): Self = this.set("data-badge", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteData-badge`: Self = this.set("data-badge", js.undefined)
    @scala.inline
    def `setData-tooltip`(value: String | Double): Self = this.set("data-tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteData-tooltip`: Self = this.set("data-tooltip", js.undefined)
  }
  
}

