package typings.storybookComponents.sectionRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionRowProps extends js.Object {
  var section: String = js.native
}

object SectionRowProps {
  @scala.inline
  def apply(section: String): SectionRowProps = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionRowProps]
  }
  @scala.inline
  implicit class SectionRowPropsOps[Self <: SectionRowProps] (val x: Self) extends AnyVal {
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
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
  }
  
}

