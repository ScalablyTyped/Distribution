package typings.reactDnd.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndOptions[Props] extends js.Object {
  var arePropsEqual: js.UndefOr[js.Function2[/* first */ Props, /* second */ Props, Boolean]] = js.native
}

object DndOptions {
  @scala.inline
  def apply[Props](): DndOptions[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DndOptions[Props]]
  }
  @scala.inline
  implicit class DndOptionsOps[Self <: DndOptions[_], Props] (val x: Self with DndOptions[Props]) extends AnyVal {
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
    def setArePropsEqual(value: (/* first */ Props, /* second */ Props) => Boolean): Self = this.set("arePropsEqual", js.Any.fromFunction2(value))
    @scala.inline
    def deleteArePropsEqual: Self = this.set("arePropsEqual", js.undefined)
  }
  
}

