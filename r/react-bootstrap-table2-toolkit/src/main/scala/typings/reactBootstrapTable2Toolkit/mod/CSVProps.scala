package typings.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVProps extends js.Object {
  /**
    * default is text/plain;charset=utf-8
    */
  var blobType: js.UndefOr[String] = js.undefined
  var exportAll: js.UndefOr[Boolean] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var ignoreHeader: js.UndefOr[Boolean] = js.undefined
  var noAutoBOM: js.UndefOr[Boolean] = js.undefined
  var onlyExportFiltered: js.UndefOr[Boolean] = js.undefined
  var onlyExportSelection: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object CSVProps {
  @scala.inline
  def apply(
    blobType: String = null,
    exportAll: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    ignoreHeader: js.UndefOr[Boolean] = js.undefined,
    noAutoBOM: js.UndefOr[Boolean] = js.undefined,
    onlyExportFiltered: js.UndefOr[Boolean] = js.undefined,
    onlyExportSelection: js.UndefOr[Boolean] = js.undefined,
    separator: String = null
  ): CSVProps = {
    val __obj = js.Dynamic.literal()
    if (blobType != null) __obj.updateDynamic("blobType")(blobType.asInstanceOf[js.Any])
    if (!js.isUndefined(exportAll)) __obj.updateDynamic("exportAll")(exportAll.get.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHeader)) __obj.updateDynamic("ignoreHeader")(ignoreHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noAutoBOM)) __obj.updateDynamic("noAutoBOM")(noAutoBOM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyExportFiltered)) __obj.updateDynamic("onlyExportFiltered")(onlyExportFiltered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyExportSelection)) __obj.updateDynamic("onlyExportSelection")(onlyExportSelection.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVProps]
  }
}

