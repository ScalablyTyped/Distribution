package typings.reactMdUtils.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions[T] extends BaseSearchOptions[T] {
  /**
    * Boolean if all the whitespace should be ignored in the query string and for
    * each item.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the query string and each item should have the leading and
    * trailing spaces removed.
    */
  var trim: js.UndefOr[Boolean] = js.native
}

object SearchOptions {
  @scala.inline
  def apply[T](): SearchOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions[T]]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions[_], T] (val x: Self with SearchOptions[T]) extends AnyVal {
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
    def setIgnoreWhitespace(value: Boolean): Self = this.set("ignoreWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreWhitespace: Self = this.set("ignoreWhitespace", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}

