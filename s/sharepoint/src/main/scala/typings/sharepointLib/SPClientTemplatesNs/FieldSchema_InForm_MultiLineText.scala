package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchema_InForm_MultiLineText extends FieldSchema_InForm {
  /** A boolean value that specifies whether hyperlinks can be used in this fields. */
  var AllowHyperlink: scala.Boolean
  /** Changes are appended to the existing text. */
  var AppendOnly: scala.Boolean
  /** Number of lines configured to display */
  var NumberOfLines: scala.Double
  /** Specifies whether rich text formatting can be used in the field */
  var RichText: scala.Boolean
  /** Rich text mode for the field */
  var RichTextMode: RichTextMode
  /** WebPartAdderId for the ScriptEditorWebPart */
  var ScriptEditorAdderId: java.lang.String
}

