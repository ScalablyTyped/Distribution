package typings.semanticUiReact.accordionAccordionMod

import typings.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictAccordionProps extends StrictAccordionAccordionProps {
  /** Format to take up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  /** Format for dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Adds some basic styling to accordion panels. */
  var styled: js.UndefOr[Boolean] = js.native
}

object StrictAccordionProps {
  @scala.inline
  def apply(): StrictAccordionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictAccordionProps]
  }
  @scala.inline
  implicit class StrictAccordionPropsOps[Self <: StrictAccordionProps] (val x: Self) extends AnyVal {
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
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setStyled(value: Boolean): Self = this.set("styled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyled: Self = this.set("styled", js.undefined)
  }
  
}

