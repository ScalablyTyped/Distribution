package typings.reactBootstrapTable.anon

import typings.react.mod.ReactElement
import typings.reactBootstrapTable.mod.SizePerPageDropDown
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageList extends js.Object {
  /**
    * The default list of page change buttons.
    */
  var pageList: HTMLUListElement = js.native
  /**
    * Default sizePerPageDropdown component.
    */
  var sizePerPageDropDown: SizePerPageDropDown = js.native
  /**
    * Text/element to display when displaying the total number of rows.
    */
  var totalText: String | ReactElement = js.native
}

object PageList {
  @scala.inline
  def apply(
    pageList: HTMLUListElement,
    sizePerPageDropDown: SizePerPageDropDown,
    totalText: String | ReactElement
  ): PageList = {
    val __obj = js.Dynamic.literal(pageList = pageList.asInstanceOf[js.Any], sizePerPageDropDown = sizePerPageDropDown.asInstanceOf[js.Any], totalText = totalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageList]
  }
  @scala.inline
  implicit class PageListOps[Self <: PageList] (val x: Self) extends AnyVal {
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
    def setPageList(value: HTMLUListElement): Self = this.set("pageList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizePerPageDropDown(value: SizePerPageDropDown): Self = this.set("sizePerPageDropDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalText(value: String | ReactElement): Self = this.set("totalText", value.asInstanceOf[js.Any])
  }
  
}

