package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValueString extends js.Object {
  var `type`: String
  var value: String
}

object Anon_TypeValueString {
  @scala.inline
  def apply(`type`: String, value: String): Anon_TypeValueString = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeValueString]
  }
}

