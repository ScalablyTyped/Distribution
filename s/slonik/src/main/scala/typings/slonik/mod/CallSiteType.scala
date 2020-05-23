package typings.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSiteType extends js.Object {
  var columnNumber: Double
  var fileName: String | Null
  var lineNumber: Double
}

object CallSiteType {
  @scala.inline
  def apply(columnNumber: Double, lineNumber: Double, fileName: String = null): CallSiteType = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallSiteType]
  }
}

