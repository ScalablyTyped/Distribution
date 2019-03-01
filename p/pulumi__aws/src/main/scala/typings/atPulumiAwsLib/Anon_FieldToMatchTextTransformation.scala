package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldToMatchTextTransformation extends js.Object {
  var fieldToMatch: Anon_DataType
  var textTransformation: java.lang.String
}

object Anon_FieldToMatchTextTransformation {
  @scala.inline
  def apply(fieldToMatch: Anon_DataType, textTransformation: java.lang.String): Anon_FieldToMatchTextTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldToMatch")(fieldToMatch)
    __obj.updateDynamic("textTransformation")(textTransformation)
    __obj.asInstanceOf[Anon_FieldToMatchTextTransformation]
  }
}

