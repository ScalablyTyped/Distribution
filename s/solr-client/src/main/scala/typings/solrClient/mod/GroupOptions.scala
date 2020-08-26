package typings.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupOptions extends js.Object {
  var cache: js.UndefOr[Double] = js.native
  var field: js.UndefOr[String | js.Array[String]] = js.native
  var format: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var main: js.UndefOr[Boolean] = js.native
  var ngroups: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var on: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[String] = js.native
  var truncate: js.UndefOr[Boolean] = js.native
}

object GroupOptions {
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  @scala.inline
  implicit class GroupOptionsOps[Self <: GroupOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: Double): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setFieldVarargs(value: String*): Self = this.set("field", js.Array(value :_*))
    @scala.inline
    def setField(value: String | js.Array[String]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMain(value: Boolean): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    @scala.inline
    def setNgroups(value: Boolean): Self = this.set("ngroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNgroups: Self = this.set("ngroups", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOn(value: Boolean): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTruncate(value: Boolean): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
  }
  
}

