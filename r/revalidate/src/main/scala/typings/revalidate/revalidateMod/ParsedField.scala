package typings.revalidate.revalidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedField extends js.Object {
  var baseName: String
  var fullName: String
  var isArray: Boolean
}

object ParsedField {
  @scala.inline
  def apply(baseName: String, fullName: String, isArray: Boolean): ParsedField = {
    val __obj = js.Dynamic.literal(baseName = baseName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedField]
  }
}

