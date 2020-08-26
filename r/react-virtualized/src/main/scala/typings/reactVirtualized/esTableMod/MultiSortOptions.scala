package typings.reactVirtualized.esTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSortOptions extends js.Object {
  var defaultSortBy: js.UndefOr[js.Array[String]] = js.native
  var defaultSortDirection: js.UndefOr[SortDirectionMap] = js.native
}

object MultiSortOptions {
  @scala.inline
  def apply(): MultiSortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSortOptions]
  }
  @scala.inline
  implicit class MultiSortOptionsOps[Self <: MultiSortOptions] (val x: Self) extends AnyVal {
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
    def setDefaultSortByVarargs(value: String*): Self = this.set("defaultSortBy", js.Array(value :_*))
    @scala.inline
    def setDefaultSortBy(value: js.Array[String]): Self = this.set("defaultSortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortBy: Self = this.set("defaultSortBy", js.undefined)
    @scala.inline
    def setDefaultSortDirection(value: SortDirectionMap): Self = this.set("defaultSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortDirection: Self = this.set("defaultSortDirection", js.undefined)
  }
  
}

