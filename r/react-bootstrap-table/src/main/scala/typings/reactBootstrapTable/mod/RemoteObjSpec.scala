package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteObjSpec extends js.Object {
  /**
    * If set, cell edits will be handled remotely
    */
  var cellEdit: js.UndefOr[Boolean] = js.undefined
  /**
    * If set deletion will be handled remotely
    */
  var dropRow: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, exporting CSV will be handled remotely
    */
  var exportCSV: js.UndefOr[Boolean] = js.undefined
  /**
    * If set filters will be handled remotely
    */
  var filter: js.UndefOr[Boolean] = js.undefined
  /**
    * If set insertions will be handled remotely
    */
  var insertRow: js.UndefOr[Boolean] = js.undefined
  /**
    * If set pagination will be handled remotely
    */
  var pagination: js.UndefOr[Boolean] = js.undefined
  /**
    * If set search will be handled remotely
    */
  var search: js.UndefOr[Boolean] = js.undefined
  /**
    * If set sorting will be handled remotely
    */
  var sort: js.UndefOr[Boolean] = js.undefined
}

object RemoteObjSpec {
  @scala.inline
  def apply(
    cellEdit: js.UndefOr[Boolean] = js.undefined,
    dropRow: js.UndefOr[Boolean] = js.undefined,
    exportCSV: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    insertRow: js.UndefOr[Boolean] = js.undefined,
    pagination: js.UndefOr[Boolean] = js.undefined,
    search: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined
  ): RemoteObjSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellEdit)) __obj.updateDynamic("cellEdit")(cellEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropRow)) __obj.updateDynamic("dropRow")(dropRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exportCSV)) __obj.updateDynamic("exportCSV")(exportCSV.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertRow)) __obj.updateDynamic("insertRow")(insertRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteObjSpec]
  }
}

