package typings.slonik.slonikMod

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
    val __obj = js.Dynamic.literal(columnNumber = columnNumber, lineNumber = lineNumber)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    __obj.asInstanceOf[CallSiteType]
  }
}

