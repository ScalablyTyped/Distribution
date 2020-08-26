package typings.select2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var page: js.UndefOr[Double] = js.native
  var term: js.UndefOr[String] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
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
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
  }
  
}

