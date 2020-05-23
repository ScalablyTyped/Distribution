package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var isRefined: Boolean
  var label: String
  var value: String
}

object Count {
  @scala.inline
  def apply(count: Double, isRefined: Boolean, label: String, value: String): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

