package typings.reduxFirstRouter.anon

import typings.reduxFirstRouter.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotFoundPath extends js.Object {
  var notFoundPath: js.UndefOr[String] = js.native
  var query: js.UndefOr[Query] = js.native
  var search: js.UndefOr[String] = js.native
}

object NotFoundPath {
  @scala.inline
  def apply(): NotFoundPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotFoundPath]
  }
  @scala.inline
  implicit class NotFoundPathOps[Self <: NotFoundPath] (val x: Self) extends AnyVal {
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
    def setNotFoundPath(value: String): Self = this.set("notFoundPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundPath: Self = this.set("notFoundPath", js.undefined)
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
  
}

