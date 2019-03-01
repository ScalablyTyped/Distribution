package typings
package revalidateLib.revalidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedField extends js.Object {
  var baseName: java.lang.String
  var fullName: java.lang.String
  var isArray: scala.Boolean
}

object ParsedField {
  @scala.inline
  def apply(baseName: java.lang.String, fullName: java.lang.String, isArray: scala.Boolean): ParsedField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseName")(baseName)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("isArray")(isArray)
    __obj.asInstanceOf[ParsedField]
  }
}

