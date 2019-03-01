package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSiteType extends js.Object {
  var columnNumber: scala.Double
  var fileName: java.lang.String | scala.Null
  var lineNumber: scala.Double
}

object CallSiteType {
  @scala.inline
  def apply(columnNumber: scala.Double, lineNumber: scala.Double, fileName: java.lang.String = null): CallSiteType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnNumber")(columnNumber)
    __obj.updateDynamic("lineNumber")(lineNumber)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    __obj.asInstanceOf[CallSiteType]
  }
}

