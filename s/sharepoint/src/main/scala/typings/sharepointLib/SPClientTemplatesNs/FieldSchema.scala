package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSchema extends js.Object {
  /** Specifies if the field can be edited while list view is in the Grid mode */
  var AllowGridEditing: scala.Boolean
  /** String representation of the field type, e.g. "Lookup". Same as SPField.TypeAsString */
  var FieldType: java.lang.String
  /** Internal name of the field */
  var Name: java.lang.String
  /** For OOTB fields, returns the type of field. For "UserMulti" returns "User", for "LookupMulti" returns "Lookup".
    For custom field types, returns base type of the field. */
  var Type: java.lang.String
}

