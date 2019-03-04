package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValueString extends js.Object {
  var `type`: java.lang.String
  var value: java.lang.String
}

object Anon_TypeValueString {
  @scala.inline
  def apply(`type`: java.lang.String, value: java.lang.String): Anon_TypeValueString = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeValueString]
  }
}

