package typings.reactToolbox.listListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTheme extends js.Object {
  /**
    * Used for the root element of the list.
    */
  var list: js.UndefOr[String] = js.native
}

object ListTheme {
  @scala.inline
  def apply(): ListTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTheme]
  }
  @scala.inline
  implicit class ListThemeOps[Self <: ListTheme] (val x: Self) extends AnyVal {
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
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
  }
  
}

