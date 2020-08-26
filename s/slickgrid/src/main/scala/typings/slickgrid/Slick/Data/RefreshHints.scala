package typings.slickgrid.Slick.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshHints extends js.Object {
  var ignoreDiffsAfter: js.UndefOr[Boolean] = js.native
  var ignoreDiffsBefore: js.UndefOr[Boolean] = js.native
  var isFilterExpanding: js.UndefOr[Boolean] = js.native
  var isFilterNarrowing: js.UndefOr[Boolean] = js.native
  var isFilterUnchanged: js.UndefOr[Boolean] = js.native
}

object RefreshHints {
  @scala.inline
  def apply(): RefreshHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshHints]
  }
  @scala.inline
  implicit class RefreshHintsOps[Self <: RefreshHints] (val x: Self) extends AnyVal {
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
    def setIgnoreDiffsAfter(value: Boolean): Self = this.set("ignoreDiffsAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreDiffsAfter: Self = this.set("ignoreDiffsAfter", js.undefined)
    @scala.inline
    def setIgnoreDiffsBefore(value: Boolean): Self = this.set("ignoreDiffsBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreDiffsBefore: Self = this.set("ignoreDiffsBefore", js.undefined)
    @scala.inline
    def setIsFilterExpanding(value: Boolean): Self = this.set("isFilterExpanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFilterExpanding: Self = this.set("isFilterExpanding", js.undefined)
    @scala.inline
    def setIsFilterNarrowing(value: Boolean): Self = this.set("isFilterNarrowing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFilterNarrowing: Self = this.set("isFilterNarrowing", js.undefined)
    @scala.inline
    def setIsFilterUnchanged(value: Boolean): Self = this.set("isFilterUnchanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFilterUnchanged: Self = this.set("isFilterUnchanged", js.undefined)
  }
  
}

