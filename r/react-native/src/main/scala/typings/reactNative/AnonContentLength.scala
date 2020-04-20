package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentLength extends js.Object {
  var contentLength: Double
  var renderedRows: Double
  var totalRows: Double
  var visibleRows: Double
}

object AnonContentLength {
  @scala.inline
  def apply(contentLength: Double, renderedRows: Double, totalRows: Double, visibleRows: Double): AnonContentLength = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], renderedRows = renderedRows.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any], visibleRows = visibleRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentLength]
  }
}

