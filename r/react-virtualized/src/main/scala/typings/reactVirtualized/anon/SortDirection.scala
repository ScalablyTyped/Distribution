package typings.reactVirtualized.anon

import typings.reactVirtualized.esTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortDirection extends js.Object {
  var sortDirection: js.UndefOr[SortDirectionType] = js.native
}

object SortDirection {
  @scala.inline
  def apply(): SortDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortDirection]
  }
  @scala.inline
  implicit class SortDirectionOps[Self <: SortDirection] (val x: Self) extends AnyVal {
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
    def setSortDirection(value: SortDirectionType): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
  }
  
}

