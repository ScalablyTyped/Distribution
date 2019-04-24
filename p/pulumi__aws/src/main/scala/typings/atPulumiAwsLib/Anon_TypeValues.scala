package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValues extends js.Object {
  var `type`: java.lang.String
  var values: js.Array[java.lang.String]
}

object Anon_TypeValues {
  @scala.inline
  def apply(`type`: java.lang.String, values: js.Array[java.lang.String]): Anon_TypeValues = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeValues]
  }
}

