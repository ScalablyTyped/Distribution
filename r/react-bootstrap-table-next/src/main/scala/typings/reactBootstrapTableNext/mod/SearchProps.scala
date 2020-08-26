package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProps[T] extends js.Object {
  var defaultSearch: js.UndefOr[String] = js.native
  /* custom search method, return true if matched and false if not */
  var onColumnMatch: js.UndefOr[js.Function1[/* searchProps */ Column[T], Boolean]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var searchText: js.UndefOr[String] = js.native
}

object SearchProps {
  @scala.inline
  def apply[T](): SearchProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProps[T]]
  }
  @scala.inline
  implicit class SearchPropsOps[Self <: SearchProps[_], T] (val x: Self with SearchProps[T]) extends AnyVal {
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
    def setDefaultSearch(value: String): Self = this.set("defaultSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSearch: Self = this.set("defaultSearch", js.undefined)
    @scala.inline
    def setOnColumnMatch(value: /* searchProps */ Column[T] => Boolean): Self = this.set("onColumnMatch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnColumnMatch: Self = this.set("onColumnMatch", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
  }
  
}

