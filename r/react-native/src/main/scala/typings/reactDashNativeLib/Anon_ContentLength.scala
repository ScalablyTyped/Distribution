package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentLength extends js.Object {
  var contentLength: scala.Double
  var renderedRows: scala.Double
  var totalRows: scala.Double
  var visibleRows: scala.Double
}

object Anon_ContentLength {
  @scala.inline
  def apply(
    contentLength: scala.Double,
    renderedRows: scala.Double,
    totalRows: scala.Double,
    visibleRows: scala.Double
  ): Anon_ContentLength = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentLength")(contentLength)
    __obj.updateDynamic("renderedRows")(renderedRows)
    __obj.updateDynamic("totalRows")(totalRows)
    __obj.updateDynamic("visibleRows")(visibleRows)
    __obj.asInstanceOf[Anon_ContentLength]
  }
}

