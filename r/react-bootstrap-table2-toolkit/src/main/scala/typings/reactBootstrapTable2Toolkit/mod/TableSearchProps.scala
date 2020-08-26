package typings.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableSearchProps[T /* <: js.Object */] extends js.Object {
  var customMatchFunc: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Boolean]] = js.native
  var defaultSearch: js.UndefOr[String] = js.native
  var onColumnMatch: js.UndefOr[js.Function1[/* props */ SearchMatchProps[T], Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var searchFormatted: js.UndefOr[Boolean] = js.native
}

object TableSearchProps {
  @scala.inline
  def apply[/* <: js.Object */ T](): TableSearchProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSearchProps[T]]
  }
  @scala.inline
  implicit class TableSearchPropsOps[Self <: TableSearchProps[_], /* <: js.Object */ T] (val x: Self with TableSearchProps[T]) extends AnyVal {
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
    def setCustomMatchFunc(value: /* props */ SearchMatchProps[T] => Boolean): Self = this.set("customMatchFunc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomMatchFunc: Self = this.set("customMatchFunc", js.undefined)
    @scala.inline
    def setDefaultSearch(value: String): Self = this.set("defaultSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSearch: Self = this.set("defaultSearch", js.undefined)
    @scala.inline
    def setOnColumnMatch(value: /* props */ SearchMatchProps[T] => Unit): Self = this.set("onColumnMatch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnMatch: Self = this.set("onColumnMatch", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSearchFormatted(value: Boolean): Self = this.set("searchFormatted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchFormatted: Self = this.set("searchFormatted", js.undefined)
  }
  
}

