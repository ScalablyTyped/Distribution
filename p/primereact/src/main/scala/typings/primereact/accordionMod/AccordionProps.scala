package typings.primereact.accordionMod

import typings.primereact.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionProps extends js.Object {
  var activeIndex: js.UndefOr[js.Any] = js.native
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onTabChange: js.UndefOr[js.Function1[/* e */ Index, Unit]] = js.native
  var onTabClose: js.UndefOr[js.Function1[/* e */ Index, Unit]] = js.native
  var onTabOpen: js.UndefOr[js.Function1[/* e */ Index, Unit]] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object AccordionProps {
  @scala.inline
  def apply(): AccordionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionProps]
  }
  @scala.inline
  implicit class AccordionPropsOps[Self <: AccordionProps] (val x: Self) extends AnyVal {
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
    def setActiveIndex(value: js.Any): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnTabChange(value: /* e */ Index => Unit): Self = this.set("onTabChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTabChange: Self = this.set("onTabChange", js.undefined)
    @scala.inline
    def setOnTabClose(value: /* e */ Index => Unit): Self = this.set("onTabClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTabClose: Self = this.set("onTabClose", js.undefined)
    @scala.inline
    def setOnTabOpen(value: /* e */ Index => Unit): Self = this.set("onTabOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTabOpen: Self = this.set("onTabOpen", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

