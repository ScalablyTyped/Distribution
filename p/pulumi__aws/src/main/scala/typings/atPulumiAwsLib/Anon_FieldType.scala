package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldType extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_FieldType {
  @scala.inline
  def apply(`type`: java.lang.String, field: java.lang.String = null): Anon_FieldType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[Anon_FieldType]
  }
}

