package typings.rcNotification.noticeMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var `data-testid`: js.UndefOr[String] = js.native
}

object DivProps {
  @scala.inline
  def apply(): DivProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivProps]
  }
  @scala.inline
  implicit class DivPropsOps[Self <: DivProps] (val x: Self) extends AnyVal {
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
    def `setData-testid`(value: String): Self = this.set("data-testid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteData-testid`: Self = this.set("data-testid", js.undefined)
  }
  
}

