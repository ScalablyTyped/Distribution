package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceAssetCallback extends js.Object {
  var getRowData: js.UndefOr[
    js.Function3[/* dataBlob */ js.Any, /* sectionID */ Double | String, /* rowID */ Double | String, _]
  ] = js.undefined
  var getSectionHeaderData: js.UndefOr[js.Function2[/* dataBlob */ js.Any, /* sectionID */ Double | String, _]] = js.undefined
  var rowHasChanged: js.UndefOr[js.Function2[/* r1 */ js.Any, /* r2 */ js.Any, Boolean]] = js.undefined
  var sectionHeaderHasChanged: js.UndefOr[js.Function2[/* h1 */ js.Any, /* h2 */ js.Any, Boolean]] = js.undefined
}

object DataSourceAssetCallback {
  @scala.inline
  def apply(
    getRowData: (/* dataBlob */ js.Any, /* sectionID */ Double | String, /* rowID */ Double | String) => _ = null,
    getSectionHeaderData: (/* dataBlob */ js.Any, /* sectionID */ Double | String) => _ = null,
    rowHasChanged: (/* r1 */ js.Any, /* r2 */ js.Any) => Boolean = null,
    sectionHeaderHasChanged: (/* h1 */ js.Any, /* h2 */ js.Any) => Boolean = null
  ): DataSourceAssetCallback = {
    val __obj = js.Dynamic.literal()
    if (getRowData != null) __obj.updateDynamic("getRowData")(js.Any.fromFunction3(getRowData))
    if (getSectionHeaderData != null) __obj.updateDynamic("getSectionHeaderData")(js.Any.fromFunction2(getSectionHeaderData))
    if (rowHasChanged != null) __obj.updateDynamic("rowHasChanged")(js.Any.fromFunction2(rowHasChanged))
    if (sectionHeaderHasChanged != null) __obj.updateDynamic("sectionHeaderHasChanged")(js.Any.fromFunction2(sectionHeaderHasChanged))
    __obj.asInstanceOf[DataSourceAssetCallback]
  }
}

