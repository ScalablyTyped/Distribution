package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchema_InForm_Choice extends FieldSchema_InForm {
  /** List of choices for this field. */
  var Choices: js.Array[java.lang.String]
  /** Display format for the choice field */
  var FormatType: ChoiceFormatType
}

