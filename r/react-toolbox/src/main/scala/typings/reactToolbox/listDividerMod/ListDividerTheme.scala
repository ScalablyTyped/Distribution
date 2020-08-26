package typings.reactToolbox.listDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDividerTheme extends js.Object {
  /**
    * Added to the root element.
    */
  var divider: js.UndefOr[String] = js.native
  /**
    * Added to root element if inset is true.
    */
  var inset: js.UndefOr[String] = js.native
}

object ListDividerTheme {
  @scala.inline
  def apply(): ListDividerTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDividerTheme]
  }
  @scala.inline
  implicit class ListDividerThemeOps[Self <: ListDividerTheme] (val x: Self) extends AnyVal {
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
    def setDivider(value: String): Self = this.set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    @scala.inline
    def setInset(value: String): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
  }
  
}

