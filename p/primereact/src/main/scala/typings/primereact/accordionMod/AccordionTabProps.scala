package typings.primereact.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionTabProps extends js.Object {
  var contentClassName: js.UndefOr[String] = js.native
  var contentStyle: js.UndefOr[js.Object] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var headerClassName: js.UndefOr[String] = js.native
  var headerStyle: js.UndefOr[js.Object] = js.native
}

object AccordionTabProps {
  @scala.inline
  def apply(): AccordionTabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionTabProps]
  }
  @scala.inline
  implicit class AccordionTabPropsOps[Self <: AccordionTabProps] (val x: Self) extends AnyVal {
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
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setContentStyle(value: js.Object): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    @scala.inline
    def setHeaderStyle(value: js.Object): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
  }
  
}

