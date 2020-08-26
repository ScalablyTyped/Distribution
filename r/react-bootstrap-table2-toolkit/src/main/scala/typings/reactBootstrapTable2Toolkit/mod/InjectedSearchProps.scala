package typings.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedSearchProps extends js.Object {
  var searchText: String = js.native
  def onClear(): Unit = js.native
  def onSearch(`val`: String): Unit = js.native
}

object InjectedSearchProps {
  @scala.inline
  def apply(onClear: () => Unit, onSearch: String => Unit, searchText: String): InjectedSearchProps = {
    val __obj = js.Dynamic.literal(onClear = js.Any.fromFunction0(onClear), onSearch = js.Any.fromFunction1(onSearch), searchText = searchText.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedSearchProps]
  }
  @scala.inline
  implicit class InjectedSearchPropsOps[Self <: InjectedSearchProps] (val x: Self) extends AnyVal {
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
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    @scala.inline
    def setOnSearch(value: String => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
  }
  
}

