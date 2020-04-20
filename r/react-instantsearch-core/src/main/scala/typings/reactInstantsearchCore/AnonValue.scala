package typings.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var count: Double
  var isRefined: Boolean
  var label: String
  var value: js.Array[String]
}

object AnonValue {
  @scala.inline
  def apply(count: Double, isRefined: Boolean, label: String, value: js.Array[String]): AnonValue = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

