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

