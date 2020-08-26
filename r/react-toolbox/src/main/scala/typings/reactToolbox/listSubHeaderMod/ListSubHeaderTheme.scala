package typings.reactToolbox.listSubHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubHeaderTheme extends js.Object {
  /**
    * Used as a wrapper class for the subheader element.
    */
  var subheader: js.UndefOr[String] = js.native
}

object ListSubHeaderTheme {
  @scala.inline
  def apply(): ListSubHeaderTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubHeaderTheme]
  }
  @scala.inline
  implicit class ListSubHeaderThemeOps[Self <: ListSubHeaderTheme] (val x: Self) extends AnyVal {
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
    def setSubheader(value: String): Self = this.set("subheader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubheader: Self = this.set("subheader", js.undefined)
  }
  
}

