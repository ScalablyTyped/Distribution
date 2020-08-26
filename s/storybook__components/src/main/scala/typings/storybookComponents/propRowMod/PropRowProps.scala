package typings.storybookComponents.propRowMod

import typings.storybookComponents.propDefMod.PropDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropRowProps extends js.Object {
  var row: PropDef = js.native
}

object PropRowProps {
  @scala.inline
  def apply(row: PropDef): PropRowProps = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropRowProps]
  }
  @scala.inline
  implicit class PropRowPropsOps[Self <: PropRowProps] (val x: Self) extends AnyVal {
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
    def setRow(value: PropDef): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

