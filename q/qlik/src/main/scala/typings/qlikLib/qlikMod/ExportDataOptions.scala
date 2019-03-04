package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDataOptions extends js.Object {
  var download: scala.Boolean
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var format: qlikLib.qlikLibStrings.OOXML | qlikLib.qlikLibStrings.CSV_C | qlikLib.qlikLibStrings.CSV_T
  var state: qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.P
}

object ExportDataOptions {
  @scala.inline
  def apply(
    download: scala.Boolean,
    format: qlikLib.qlikLibStrings.OOXML | qlikLib.qlikLibStrings.CSV_C | qlikLib.qlikLibStrings.CSV_T,
    state: qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.P,
    filename: java.lang.String = null
  ): ExportDataOptions = {
    val __obj = js.Dynamic.literal(download = download, format = format.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[ExportDataOptions]
  }
}

