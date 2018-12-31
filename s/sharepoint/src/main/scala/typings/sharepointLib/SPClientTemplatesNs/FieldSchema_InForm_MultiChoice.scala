package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchema_InForm_MultiChoice extends FieldSchema_InForm {
  /** Indicates wherever fill-in choice is allowed */
  var FillInChoice: scala.Boolean
  /** List of choices for this field. */
  var MultiChoices: js.Array[java.lang.String]
}

