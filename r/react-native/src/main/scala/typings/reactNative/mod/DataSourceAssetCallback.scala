package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceAssetCallback extends js.Object {
  var getRowData: js.UndefOr[
    js.Function3[/* dataBlob */ js.Any, /* sectionID */ Double | String, /* rowID */ Double | String, _]
  ] = js.native
  var getSectionHeaderData: js.UndefOr[js.Function2[/* dataBlob */ js.Any, /* sectionID */ Double | String, _]] = js.native
  var rowHasChanged: js.UndefOr[js.Function2[/* r1 */ js.Any, /* r2 */ js.Any, Boolean]] = js.native
  var sectionHeaderHasChanged: js.UndefOr[js.Function2[/* h1 */ js.Any, /* h2 */ js.Any, Boolean]] = js.native
}

object DataSourceAssetCallback {
  @scala.inline
  def apply(): DataSourceAssetCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceAssetCallback]
  }
  @scala.inline
  implicit class DataSourceAssetCallbackOps[Self <: DataSourceAssetCallback] (val x: Self) extends AnyVal {
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
    def setGetRowData(value: (/* dataBlob */ js.Any, /* sectionID */ Double | String, /* rowID */ Double | String) => _): Self = this.set("getRowData", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetRowData: Self = this.set("getRowData", js.undefined)
    @scala.inline
    def setGetSectionHeaderData(value: (/* dataBlob */ js.Any, /* sectionID */ Double | String) => _): Self = this.set("getSectionHeaderData", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetSectionHeaderData: Self = this.set("getSectionHeaderData", js.undefined)
    @scala.inline
    def setRowHasChanged(value: (/* r1 */ js.Any, /* r2 */ js.Any) => Boolean): Self = this.set("rowHasChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowHasChanged: Self = this.set("rowHasChanged", js.undefined)
    @scala.inline
    def setSectionHeaderHasChanged(value: (/* h1 */ js.Any, /* h2 */ js.Any) => Boolean): Self = this.set("sectionHeaderHasChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSectionHeaderHasChanged: Self = this.set("sectionHeaderHasChanged", js.undefined)
  }
  
}

